package com.example.mobilecomputingapp1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.view.View;   //for view
import android.widget.ImageView;  //for linking the imageView object
import android.view.MotionEvent;   //for drag and touch event
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int left = rand.nextInt( 6);
    int right = rand.nextInt( 5);
    int sum = left + right;

    public void questions (int total) {
        int nom = total;

        if (nom==sum){
            TextView myTextView;
            myTextView = findViewById(R.id.Question);
            myTextView.setText(""+left+"+"+right+"="+nom);
        }

else {

        TextView myTextView;
        myTextView = findViewById(R.id.Question);
        myTextView.setText(""+left+"+"+right+"=?");
        }
    }



    private View.OnTouchListener handleTouch = new View.OnTouchListener() {
        float dX, dY;
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    ;
                    dX = view.getX() - event.getRawX();
                    dY = view.getY() - event.getRawY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    view.animate()
                            .x(event.getRawX() + dX)
                            .y(event.getRawY() + dY)
                            .setDuration(0)
                            .start();
                    break;
                default:
                    return false;

            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    questions(-1);

        ImageView Apple1 = (ImageView) findViewById(R.id.Apple1);
        Apple1.setOnTouchListener(handleTouch);
        ImageView Apple2 = (ImageView) findViewById(R.id.Apple2);
        Apple2.setOnTouchListener(handleTouch);
        ImageView Apple3 = (ImageView) findViewById(R.id.Apple3);
        Apple3.setOnTouchListener(handleTouch);
        ImageView Apple4 = (ImageView) findViewById(R.id.Apple4);
        Apple4.setOnTouchListener(handleTouch);
        ImageView Apple5 = (ImageView) findViewById(R.id.Apple5);
        Apple5.setOnTouchListener(handleTouch);
        ImageView Apple6 = (ImageView) findViewById(R.id.Apple6);
        Apple6.setOnTouchListener(handleTouch);
        ImageView Apple7 = (ImageView) findViewById(R.id.Apple7);
        Apple7.setOnTouchListener(handleTouch);
        ImageView Apple8 = (ImageView) findViewById(R.id.Apple8);
        Apple8.setOnTouchListener(handleTouch);
        ImageView Apple9 = (ImageView) findViewById(R.id.Apple9);
        Apple9.setOnTouchListener(handleTouch);
    }
}

