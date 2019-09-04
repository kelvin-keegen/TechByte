package com.kelvin_mobiapps.techbyte;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView mText;
    private TextView mText2;

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mText = (TextView) findViewById(R.id.textView);
        mText2= (TextView) findViewById(R.id.textView2);

        Animation animFadeIn = AnimationUtils.loadAnimation(this,R.anim.fadein);
        mText.startAnimation(animFadeIn);

        Animation animFadeIn2 = AnimationUtils.loadAnimation(this,R.anim.fadein);
        mText2.startAnimation(animFadeIn2);


        new Handler().postDelayed(new Runnable() {



            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent Startmain = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(Startmain);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);



    }
}
