package com.example.jayeshp.graphicsdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyLayout(this));
    }

}

class MyLayout extends View
{

    public MyLayout(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.WHITE);
        Paint p=new Paint();
        p.setColor(Color.RED);
        canvas.drawCircle(100,100,50,p);

       Path path=new Path();
        p.setTextSize(120);
        p.setColor(Color.GREEN);
        path.addArc(new RectF(100,100,200,300),200,260);
        canvas.drawTextOnPath("jayesh",path,0,0,p);


    }
}