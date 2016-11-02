package com.example.yvtc.yvn110201;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn444;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout5);
        btn444 = (Button) findViewById(R.id.button15);
        btn444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn444.setVisibility(View.INVISIBLE);
            }
        });

//        Button btn = new Button(MainActivity.this);
//        btn.setText("Click!!");
//        Button btn2 = new Button(MainActivity.this);
//        btn2.setText("Click 2222");
//        TextView tv = new TextView(MainActivity.this);
//        tv.setText("Hello World");
//        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
//        layout.addView(btn);
//        layout.addView(btn2);
//        layout.addView(tv);

    }


}
