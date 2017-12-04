package com.example.jayeshp.graphicsdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BitMapAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MYBitmap(this));
    }

    class MYBitmap extends View
    {

        public MYBitmap(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.a);
            Bitmap bitmap1=BitmapFactory.decodeResource(getResources(),R.mipmap.b);

            canvas.drawBitmap(bitmap,0,0,null);
            canvas.drawBitmap(bitmap1,0,120,null);
        }
    }
}
