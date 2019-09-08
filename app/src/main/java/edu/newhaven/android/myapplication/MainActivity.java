package edu.newhaven.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "QuizActivity";

    private Button trueButton;
    private Button falseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueButton= findViewById(R.id.true_btn);
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(Tag,"clicked true button");
                Toast.makeText(MainActivity.this, "CORRECT :-) ", Toast.LENGTH_SHORT).show();
            }
        });

        falseButton = findViewById(R.id.false_btn);
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(Tag,"clicked false button");
                Toast.makeText(MainActivity.this, "INCORRECT :-( ", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
