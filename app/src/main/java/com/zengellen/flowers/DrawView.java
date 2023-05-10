package com.zengellen.flowers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class DrawView extends View {
    //paints
    private Paint lavender = new Paint();
    private Paint yellow = new Paint();
    private Paint pink = new Paint();
    private Paint skyblue = new Paint();
    private Paint grassgreen = new Paint();
    private Paint white = new Paint();
    private Paint blue = new Paint();
    private Paint black = new Paint();

    //other
    private Rect sky = new Rect(0,0,2000,1000);
    private Rect grass = new Rect(0,1000,2000,2000);
    //    public Rect rect = new Rect(100,100,100,150);
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    private int x=0,x2=50,x3=100,dX=4;

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //colors
        lavender.setColor(Color.rgb(177,140,217));
        yellow.setColor(Color.rgb(255,232,90));
        pink.setColor(Color.rgb(255,192,203));
        skyblue.setColor(Color.rgb(115,215,255));
        grassgreen.setColor(Color.rgb(60,140,63));
        white.setColor(Color.rgb(255,255,255));
        blue.setColor(Color.rgb(135,125,255));
        black.setColor(Color.rgb(0,0,0));

        //background
        canvas.drawRect(sky,skyblue);
        canvas.drawRect(grass,grassgreen);
        canvas.drawCircle(800,280,100f,yellow);

        //cloud
        canvas.drawCircle(50,400,120f,white);
        canvas.drawCircle(150,390,110f,white);
        canvas.drawCircle(250,410,100f,white);
        canvas.drawCircle(350,400,70f,white);

        //bird

        canvas.drawLine(x,500,x2,515,black);
        canvas.drawLine(x2,515,x3,500,black);

        //flower
        canvas.drawCircle(500,1400,40f,lavender);
        canvas.drawCircle(450,1440,40f,lavender);
        canvas.drawCircle(470,1500,40f,lavender);
        canvas.drawCircle(530,1500,40f,lavender);
        canvas.drawCircle(550,1440,40f,lavender);
        canvas.drawCircle(500,1455,30f,yellow);

        //flower
        canvas.drawCircle(200,1600,30f,pink);
        canvas.drawCircle(160,1630,30f,pink);
        canvas.drawCircle(175,1675,30f,pink);
        canvas.drawCircle(225,1675,30f,pink);
        canvas.drawCircle(240,1630,30f,pink);
        canvas.drawCircle(200,1640,25f,yellow);

        //flower
        canvas.drawCircle(800,1600,35f,blue);
        canvas.drawCircle(760,1630,35f,blue);
        canvas.drawCircle(775,1675,35f,blue);
        canvas.drawCircle(825,1675,35f,blue);
        canvas.drawCircle(840,1630,35f,blue);
        canvas.drawCircle(800,1640,25f,yellow);

        x+=dX;
        x2+=dX;
        x3+=dX;
        x%=getWidth();
        x2%=getWidth();
        x3%=getWidth();
        invalidate();

    }
    public int getdX(){
        return dX;
    }
    public void setdX(int dX){
        this.dX=dX;
    }
}