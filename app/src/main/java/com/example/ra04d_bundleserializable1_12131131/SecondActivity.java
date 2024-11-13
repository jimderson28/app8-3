package com.example.ra04d_bundleserializable1_12131131;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                InfoObject infoObj = (InfoObject) bundle.getSerializable("infoObj");

                TextView textView = findViewById(R.id.infotextView);
                if (infoObj != null) {
                    textView.setText("lon=" + infoObj.lon + "\nlat=" + infoObj.lat);
                }
            }
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        }
    }

