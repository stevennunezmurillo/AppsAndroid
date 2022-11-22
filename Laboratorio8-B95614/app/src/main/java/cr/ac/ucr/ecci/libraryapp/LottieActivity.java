package cr.ac.ucr.ecci.libraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class LottieActivity extends AppCompatActivity {
    LottieAnimationView thumb_up;
    LottieAnimationView thumb_down;
    LottieAnimationView toggle;
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        thumb_up = findViewById(R.id.lav_thumbUp);
        thumb_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thumb_down.setProgress(0);
                thumb_down.pauseAnimation();
                thumb_up.playAnimation();
            }
        });
        thumb_down = findViewById(R.id.lav_thumbDown);
        thumb_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thumb_up.setProgress(0);
                thumb_up.pauseAnimation();
                thumb_down.playAnimation();
            }
        });
        toggle = findViewById(R.id.lav_toggle);
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeState();
            }
        });
    }
    private void changeState() {
        if (flag == 0) {
            toggle.setMinAndMaxProgress(0f, 0.43f);
            toggle.playAnimation();
            flag = 1;
        } else {
            toggle.setMinAndMaxProgress(0.5f, 1f);
            toggle.playAnimation();
            flag = 0;
        }
    }
}