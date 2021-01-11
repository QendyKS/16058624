package com.example.mobilecomputingapp1;

import java.util.Random;
import android.os.Bundle;
import android.view.View;   //for view

import android.widget.ImageView;  //for linking the imageView object
import android.view.MotionEvent;   //for drag and touch event
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.TranslateAnimation;
import android.view.animation.ScaleAnimation;

import android.annotation.SuppressLint;

public class MainActivity extends AppCompatActivity {

    TextView Questions;
    String QuestionsPhrase;
    ScaleAnimation Scale;
    TranslateAnimation Trans;

    int FirstNumber, SecondNumber, Answer;
    ImageView Star1, Star2;
    ImageView Plate1, Apple1, Apple2, Apple3, Apple4, Apple5, Apple6, Apple7, Apple8, Apple9;
    Button Button, Number0, Number1, Number2, Number3, Number4, Number5, Number6, Number7, Number8, Number9;

    private final View.OnTouchListener HandleTouch = new View.OnTouchListener() {

        float dX, dY;
        @Override
        public boolean onTouch(View view, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
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

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Plate1 = findViewById(R.id.Plate1);
        Plate1.setOnTouchListener(HandleTouch);

        ImageView Apple1 = findViewById(R.id.Apple1);
        Apple1.setOnTouchListener(HandleTouch);

        ImageView Apple2 = findViewById(R.id.Apple2);
        Apple2.setOnTouchListener(HandleTouch);

        ImageView Apple3 = findViewById(R.id.Apple3);
        Apple3.setOnTouchListener(HandleTouch);

        ImageView Apple4 = findViewById(R.id.Apple4);
        Apple4.setOnTouchListener(HandleTouch);

        ImageView Apple5 = findViewById(R.id.Apple5);
        Apple5.setOnTouchListener(HandleTouch);

        ImageView Apple6 = findViewById(R.id.Apple6);
        Apple6.setOnTouchListener(HandleTouch);

        ImageView Apple7 = findViewById(R.id.Apple7);
        Apple7.setOnTouchListener(HandleTouch);

        ImageView Apple8 = findViewById(R.id.Apple8);
        Apple8.setOnTouchListener(HandleTouch);

        ImageView Apple9 = findViewById(R.id.Apple9);
        Apple9.setOnTouchListener(HandleTouch);

        Number0 = findViewById(R.id.Number0);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);
        Number3 = findViewById(R.id.Number3);
        Number4 = findViewById(R.id.Number4);
        Number5 = findViewById(R.id.Number5);
        Number6 = findViewById(R.id.Number6);
        Number7 = findViewById(R.id.Number7);
        Number8 = findViewById(R.id.Number8);
        Number9 = findViewById(R.id.Number9);

        Button = findViewById(R.id.Button);
        Questions = findViewById(R.id.Question);
        Questions.setText("");

        Star1 = findViewById(R.id.Star1);
        Scale = new ScaleAnimation(0, 2, 4, 2);
        Scale.setDuration(1800);
        Star1.startAnimation(Scale);

        Star2 = findViewById(R.id.Star2);
        Trans = new TranslateAnimation(0, 200, 0, 100);
        Trans.setDuration(1300);
        Star2.startAnimation(Trans);
    }

    public void buttonStartClicked(View view) {

        Random rand = new Random();
        FirstNumber = rand.nextInt(4) + 1;
        SecondNumber = rand.nextInt(4) + 1;
        this.QuestionsPhrase = (FirstNumber) + "+" + (SecondNumber) + "=";
        Questions = (TextView) findViewById(R.id.Question);
        Questions.setText(QuestionsPhrase);
        this.Answer = this.FirstNumber + this.SecondNumber;


    }

    @SuppressLint("SetText")
    public void Button0Pressed(View v) {
        Number0 = findViewById(R.id.Number0);
        int Button0Value = 0;
        if (Answer == Button0Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button1Pressed(View v) {
        Number1 = findViewById(R.id.Number1);
        int Button1Value = 1;
        if (Answer == Button1Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button2Pressed(View v) {
        Number2 = findViewById(R.id.Number2);
        int Button2Value = 2;
        if (Answer == Button2Value) {
            Questions.setText("CORRECT");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);
        }
    }

    @SuppressLint("SetText")
    public void Button3Pressed(View v) {
        Number3 = findViewById(R.id.Number3);
        int Button3Value = 3;
        if (Answer == Button3Value) {
            Questions.setText("CORRECT");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);
        }
    }

    @SuppressLint("SetText")
    public void Button4Pressed(View v) {
        Number4 = findViewById(R.id.Number4);
        int Button4Value = 4;
        if (Answer == Button4Value) {
            Questions.setText("CORRECT");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button5Pressed(View v) {
        Number5 = findViewById(R.id.Number5);
        int Button5Value = 5;
        if (Answer == Button5Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button6Pressed(View v) {
        Number6 = findViewById(R.id.Number0);
        int Button0Value = 6;
        if (Answer == Button0Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button7Pressed(View v) {
        Number7 = findViewById(R.id.Number7);
        int Button7Value = 7;
        if (Answer == Button7Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button8Pressed(View v) {
        Number8 = findViewById(R.id.Number8);
        int Button8Value = 8;
        if (Answer == Button8Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);

        }
    }

    @SuppressLint("SetText")
    public void Button9Pressed(View v) {
        Number9 = findViewById(R.id.Number9);
        int Button9Value = 9;
        if (Answer == Button9Value) {
            Questions.setText("CORRECT!");

            Button.setVisibility(View.VISIBLE);
        } else {

            Questions.setText("RESTART NOW!");
            Questions.postDelayed(() -> {
                Questions.setText(QuestionsPhrase);

            }, 2500);
        }
    }
}










