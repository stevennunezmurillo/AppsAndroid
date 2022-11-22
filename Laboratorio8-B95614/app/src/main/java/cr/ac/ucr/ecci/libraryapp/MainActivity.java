package cr.ac.ucr.ecci.libraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Invoca el activity de Lottie
    public void activityLottie(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LottieActivity.class);
        startActivity(intent);
    }

    public void activityHoloGraph(View view)
    {
        Intent intent = new Intent(getApplicationContext(), HoloGraphActivity.class);
        startActivity(intent);
    }
}