package com.cuncisboss.githuborganization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvGreeting;
    private Button btnGoodbye;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvGreeting = findViewById(R.id.tv_greeting);
        btnGoodbye = findViewById(R.id.btn_goodbye);

        btnGoodbye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvGreeting.setText("Goodbye World!");

            }
        });
    }
}
