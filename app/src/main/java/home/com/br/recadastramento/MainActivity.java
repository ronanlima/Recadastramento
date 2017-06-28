//package home.com.br.recadastramento;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.design.widget.FloatingActionButton;
//import android.util.DisplayMetrics;
//import android.view.View;
//
//import home.com.br.recadastramento.view.PaintView;
//
///**
// * Created by Admin on 15/06/2017.
// */
//
//public class MainActivity extends Activity {
//
//    private PaintView paintView;
//    private FloatingActionButton fabEraser;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        paintView = (PaintView) findViewById(R.id.paintview);
//        fabEraser = (FloatingActionButton) findViewById(R.id.fab_eraser);
//        DisplayMetrics metrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//        paintView.init(metrics);
//
//        fabEraser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                paintView.clear();
//            }
//        });
//    }
//}
