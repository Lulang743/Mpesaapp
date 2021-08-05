package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    TextView phone,name,balance;
    Button viewDetails,detail2,logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        phone=(TextView)findViewById(R.id.phone);
        name=(TextView)findViewById(R.id.name);
        balance=(TextView)findViewById(R.id.balance);
        detail2=(Button)findViewById(R.id.detail2);

        logout = (Button) findViewById(R.id.logout);

        Intent s = getIntent();
        String PHONE = s.getStringExtra("PHONE");
        String NAME = s.getStringExtra("NAME");

        name.setText(NAME);
        phone.setText(PHONE);

        detail2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(profile.this,sendmoney.class);
                startActivity(i);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}