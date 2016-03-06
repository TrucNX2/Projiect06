package com.example.hathanhhoai.instalo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by HaThanhHoai on 07/12/2015.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    int logoTime = 0;
                    while (logoTime < 2000) {
                        sleep(200);
                        logoTime = logoTime + 100;
                    }
                    startActivity(new Intent(Splash.this, InstaloMainActivity.class));

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}
