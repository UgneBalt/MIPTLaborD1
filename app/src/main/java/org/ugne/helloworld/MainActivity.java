package org.ugne.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mygtukas1;
    private TextView tekstas1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mygtukas1 = findViewById(R.id.mygtukas1);
        tekstas1 = findViewById(R.id.tekstas1);

        mygtukas1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tekstas1.setText("Hello world");
            }
        });
    }
}