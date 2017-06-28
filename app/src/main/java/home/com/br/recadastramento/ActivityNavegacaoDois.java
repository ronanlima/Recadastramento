package home.com.br.recadastramento;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.EditText;

/**
 * Created by Admin on 27/06/2017.
 */

public class ActivityNavegacaoDois extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegacao_dois);
        editText = (EditText) findViewById(R.id.edit);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        getIntent().putExtra("nome", editText.getText().toString());
        super.finish();
    }
}
