package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button1;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        public void openActivity2(){
            Intent intent = new Intent(MainActivity.this,Activity2.class);
            startActivity(intent);
        }
    });
            button1 = findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openActivity1();
                }
                public void openActivity1(){
                    Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent1);
                }
            });
}
}