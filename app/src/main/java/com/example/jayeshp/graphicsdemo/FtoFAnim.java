package com.example.jayeshp.graphicsdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FtoFAnim extends AppCompatActivity {
ImageView iv1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fto_fanim);
        iv1=(ImageView)findViewById(R.id.imageView2);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv1.setVisibility(View.VISIBLE);
                iv1.setBackgroundResource(R.drawable.frameanim);
                AnimationDrawable  drawable= (AnimationDrawable) iv1.getBackground();
                if (drawable.isRunning())
                {
                    drawable.stop();
                    b1.setText("start");
                }else {
                    drawable.start();
                    b1.setText("stop");
                }
            }
        });
    }


}
