package com.example.a331;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewInputNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewInputNumbers = findViewById(R.id.textViewInputNumbers);

        findViewById(R.id.textViewButton0).setOnClickListener(listener);
        findViewById(R.id.textViewButton1).setOnClickListener(listener);
        findViewById(R.id.textViewButton2).setOnClickListener(listener);
        findViewById(R.id.textViewButton3).setOnClickListener(listener);
        findViewById(R.id.textViewButton4).setOnClickListener(listener);
        findViewById(R.id.textViewButton5).setOnClickListener(listener);
        findViewById(R.id.textViewButton6).setOnClickListener(listener);
        findViewById(R.id.textViewButton7).setOnClickListener(listener);
        findViewById(R.id.textViewButton8).setOnClickListener(listener);
        findViewById(R.id.textViewButton9).setOnClickListener(listener);
        findViewById(R.id.textViewButtonDot).setOnClickListener(listener);

        TextView textViewButtonC = findViewById(R.id.textViewButtonC);
        textViewButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText("");

            }
        });

    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button) v;
            textViewInputNumbers.append(button.getText());
        }
    };
}
