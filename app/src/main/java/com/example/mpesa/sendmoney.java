package com.example.mpesa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sendmoney extends AppCompatActivity {
    EditText amount;
    TextView currentAmount;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendmoney);

        amount=(EditText)findViewById(R.id.amount);
        currentAmount=(TextView) findViewById(R.id.currentAmount);
        send=(Button)findViewById(R.id.send);
        EditText nom=findViewById(R.id.phone);
        Button logout=findViewById(R.id.logout);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1=Integer.parseInt(amount.getText().toString());
                int balance=100;
                int result=balance-number1;

                if(result<0)
                {
                    amount.setError("Invalid amount!");
                    nom.setText("");
                    amount.setText("");
                }
                else
                {
                    currentAmount.setText(String.valueOf(result));
                    Toast.makeText(sendmoney.this, "Successfully transfered!...M"+number1+".00", Toast.LENGTH_LONG).show();
                    nom.setText("");
                    amount.setText("");
                }
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(sendmoney.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}