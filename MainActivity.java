package com.example.mobilecomputingapp1;

import java.util.Random;

import android.icu.number.Scale;
import android.os.Bundle;
import android.view.View;   //for view
import android.content.Intent;

import android.view.animation.RotateAnimation;
import android.widget.ImageView;  //for linking the imageView object
import android.view.MotionEvent;   //for drag and touch event
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.TranslateAnimation;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.RotateAnimation;

import android.annotation.SuppressLint;


public class MainActivity extends AppCompatActivity {

    Vibrator vibrator;
    TextView Questions;
    AlphaAnimation alpha;
    ScaleAnimation scale;
    String questionsPhrase;
    RotateAnimation rotate;
    TranslateAnimation trans;







    public void correct(){

        Button replayB = (Button) findViewById(R.id.Replay);
        replayB.setVisibility(View.VISIBLE);
        View greenBG = (View) findViewById(R.id.CorrectPage);
        greenBG.setVisibility(View.VISIBLE);
        ImageView s1 = findViewById(R.id.Star1);
        s1.setVisibility(View.VISIBLE);
        ImageView s2 = findViewById(R.id.Star2);
        s2.setVisibility(View.VISIBLE);
        View text = (View) findViewById(R.id.Congratulations);
        text.setVisibility(View.VISIBLE);
        ImageView thumb = findViewById(R.id.ThumbsUP);
        thumb.setVisibility(View.VISIBLE);


        Button btn0 = (Button) findViewById(R.id.Number0);
        btn0.setVisibility(View.INVISIBLE);

        Button btn1 = (Button) findViewById(R.id.Number1);
        btn1.setVisibility(View.INVISIBLE);

        Button btn2 = (Button) findViewById(R.id.Number2);
        btn2.setVisibility(View.INVISIBLE);

        Button btn3 = (Button) findViewById(R.id.Number3);
        btn3.setVisibility(View.INVISIBLE);

        Button btn4 = (Button) findViewById(R.id.Number4);
        btn4.setVisibility(View.INVISIBLE);

        Button btn5 = (Button) findViewById(R.id.Number5);
        btn5.setVisibility(View.INVISIBLE);

        Button btn6 = (Button) findViewById(R.id.Number6);
        btn6.setVisibility(View.INVISIBLE);

        Button btn7 = (Button) findViewById(R.id.Number7);
        btn7.setVisibility(View.INVISIBLE);

        Button btn8 = (Button) findViewById(R.id.Number8);
        btn8.setVisibility(View.INVISIBLE);

        Button btn9 = (Button) findViewById(R.id.Number9);
        btn9.setVisibility(View.INVISIBLE);

        View redBG = (View) findViewById(R.id.WrongScreen);

        redBG.setVisibility(View.INVISIBLE);
        Button rtBTN = findViewById(R.id.retry);
        rtBTN.setVisibility(View.INVISIBLE);

        ImageView apple1 = findViewById(R.id.Apple1);
        apple1.setVisibility(View.INVISIBLE);

        ImageView apple2 = findViewById(R.id.Apple2);
        apple2.setVisibility(View.INVISIBLE);

        ImageView apple3 = findViewById(R.id.Apple3);
        apple3.setVisibility(View.INVISIBLE);

        ImageView apple4 = findViewById(R.id.Apple4);
        apple4.setVisibility(View.INVISIBLE);

        ImageView apple5 = findViewById(R.id.Apple5);
        apple5.setVisibility(View.INVISIBLE);

        ImageView apple6 = findViewById(R.id.Apple6);
        apple6.setVisibility(View.INVISIBLE);

        ImageView apple7 = findViewById(R.id.Apple7);
        apple7.setVisibility(View.INVISIBLE);

        ImageView apple8 = findViewById(R.id.Apple8);
        apple8.setVisibility(View.INVISIBLE);

        ImageView apple9 = findViewById(R.id.Apple9);
        apple9.setVisibility(View.INVISIBLE);

        ImageView plate = findViewById(R.id.Plate1);
        plate.setVisibility(View.INVISIBLE);

        AlphaAnimation alpha;
        alpha = new AlphaAnimation(0, 1);
        alpha.setDuration(1000);
        alpha.setRepeatCount(Animation.INFINITE);
        greenBG.startAnimation(alpha);

        RotateAnimation rotate;
        RotateAnimation rotate2;
        rotate = new RotateAnimation(0,1080);
        rotate2 = new RotateAnimation(360,0);
        rotate.setDuration(7000);
        rotate2.setDuration(2000);
        rotate.setRepeatCount(Animation.INFINITE);
        rotate2.setRepeatCount(Animation.INFINITE);
        s1.startAnimation(rotate);
        s2.startAnimation(rotate2);

        ScaleAnimation scale;
        scale = new ScaleAnimation(0,1,0,1);
        scale.setDuration(5000);
        thumb.startAnimation(scale);

    }

    public void replyOnClick(View v ) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void retryOnClick(View v)  {
        Button pressed = (Button)v;

        if (pressed != findViewById(R.id.Retry)) {
            AlphaAnimation alpha;
            alpha = new AlphaAnimation(1,0);
            alpha.setDuration(500);
            pressed.startAnimation(alpha);
            pressed.setVisibility(View.INVISIBLE);
        }else{
            View redBG = (View) findViewById(R.id.WrongPage);
            redBG.setVisibility(View.INVISIBLE);
            Button rtBTN = findViewById(R.id.Retry);
            rtBTN.setVisibility(View.INVISIBLE);
        }

    }

    public void ButtonOnClick(View v) {
        Button pressed = (Button)v;
        int answer = Integer.parseInt (pressed.getText().toString());

        if (answer == sum) {
            correct();
            questions(sum);

        }else{

            retryOnClick(pressed);
            View redBG = (View) findViewById(R.id.WrongPage);
            redBG.setVisibility(View.VISIBLE);
            Button rtBTN = findViewById(R.id.Retry);
            rtBTN.setVisibility(View.VISIBLE);

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

