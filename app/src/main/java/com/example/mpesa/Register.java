package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText phone1,name1;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        EditText phone1=(EditText)findViewById(R.id.phone);
        EditText name1=(EditText)findViewById(R.id.name);
        EditText pin=(EditText)findViewById(R.id.pin);








        register=(Button)findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String phonenumber= phone1.getText().toString();
                String Name=name1.getText().toString();
                String Pin=pin.getText().toString();
                int Balance = 100;

                if(phone1.length()==0)
                {
                    phone1.setError("phone number is  required");
                }
                else if(name1.length()==0)
                {
                    name1.setError("name is  required");
                }
                else if(pin.length()==0)
                {
                    pin.setError("pin code is required");
                }
                else if(pin.length()<=3||pin.length()>=5)
                {
                    pin.setError("please create valide four digit pin code..");
                }
                else
                {
                    Intent i=new Intent(Register.this,login.class);
                    i.putExtra("PHONE",phonenumber);
                    i.putExtra("NAME",Name);
                    i.putExtra("PIN",Pin);



                    Toast.makeText(Register.this, "Resgistered Successfully!", Toast.LENGTH_LONG).show();

                    startActivity(i);

                }
            }
        });
    }
}