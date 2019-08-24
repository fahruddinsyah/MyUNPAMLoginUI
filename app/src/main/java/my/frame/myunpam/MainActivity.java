package my.frame.myunpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    Animation app_splash;
    View app_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash;

        app_logo = findViewById(R.id.app_logo);

        app_logo.startAnimation(app_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotostarted = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(gotostarted);
                finish();
            }
        }, 2000);

    }
}
