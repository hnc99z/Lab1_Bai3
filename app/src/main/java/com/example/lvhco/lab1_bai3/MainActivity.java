package com.example.lvhco.lab1_bai3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edTimKiem;
    private Button btnTimKiem;
    String strTk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTimKiem = (EditText) findViewById(R.id.edTimKiem);
        btnTimKiem = (Button) findViewById(R.id.btnTimKiem);


        Intent intent = new Intent(MainActivity.this,MyService.class);
        intent.putExtra("data","Hello, BABY BABY!!!!");
        btnTimKiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MyService.class);
                strTk = edTimKiem.getText().toString();
                if (strTk.equals("")){
                    Toast.makeText(MainActivity.this, "Khong dc bo trong", Toast.LENGTH_SHORT).show();
                } else {
                    startService(intent);
                    }

                }
        });
    }

}