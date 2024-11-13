package com.example.ra04d_bundleserializable1_12131131;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnmcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        findviews();
    }
    private void findviews(){
        btnmcu =findViewById(R.id.btnmcu);
        btnmcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                Bundle bundle = new Bundle();
                InfoObject infoObj = new InfoObject();
                infoObj.lon = 121.5193627440279277;
                infoObj.lat = 25.062876665363273;
                bundle.putSerializable("infoObj",infoObj);
                
                bundle.putString ("name",btnmcu.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
                
            }
        });
            
            
        }
                

    }
