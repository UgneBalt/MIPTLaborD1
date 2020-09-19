package org.ugne.helloworld;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mygtukas1;
    private Button mygtukas2;
    private TextView tekstas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mygtukas1 = findViewById(R.id.mygtukas1);
        mygtukas2 = findViewById(R.id.mygtukas2);
        tekstas1 = findViewById(R.id.tekstas1);

        mygtukas1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tekstas1.setText("Hello world");
            }
        });

        mygtukas2.setOnClickListener(new View.OnClickListener(){

            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                tekstas1.setTextColor(Color.parseColor("#76eec6"));
            }
        });
    }
}