package com.example.nhapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.Logo);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        imageView.setAnimation(animation);
        final Intent intent = new Intent(this,Home.class);
        final Thread thread = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally {

                    startActivity(intent);
                    finish();

                }

            }
        };

        thread.start();


    }
}
