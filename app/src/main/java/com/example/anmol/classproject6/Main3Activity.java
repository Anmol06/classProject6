package com.example.anmol.classproject6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity
{
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
    }

    public void signUp(View view)
    {
        Intent intent = new Intent(Main3Activity.this,SigninActivity.class);
        startActivity(intent);
    }

    public void signIn(View view)
    {
        Intent intent = new Intent(Main3Activity.this,SignupActivity.class);
        startActivity(intent);
    }
}
