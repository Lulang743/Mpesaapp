package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        EditText phone=(EditText)findViewById(R.id.phone);
        EditText pin=(EditText)findViewById(R.id.pin);
        Button login=(Button)findViewById(R.id.login);




        //FirebaseAuth tAuth = FirebaseAuth.getInstance();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phoneNumber= phone.getText().toString();
                String Pin= pin.getText().toString();


                Intent i = new Intent(login.this,profile.class);

                Intent t = getIntent();

                String PHONE = t.getStringExtra("PHONE");
                String PIN = t.getStringExtra("PIN");
                String NAME = t.getStringExtra("NAME");

                if(phoneNumber.equals(PHONE) && Pin.equals(PIN))
                {
                    Toast.makeText(login.this, "Login Successful!", Toast.LENGTH_LONG).show();
                    i.putExtra("PHONE",phoneNumber);
                    i.putExtra("NAME",NAME);

                    startActivity(i);
                }
                else
                {
                    Toast.makeText(login.this, "Error, check credentials!", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}