package com.example.anmol.classproject6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SigninActivity extends AppCompatActivity
{
    EditText et1,et2;
    TextView tv1,tv2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        et1 = (EditText)findViewById(R.id.edit1);
        et2 = (EditText)findViewById(R.id.edit2);
        tv1 = (TextView)findViewById(R.id.text1);
        tv2 = (TextView)findViewById(R.id.text2);
        b1 = (Button)findViewById(R.id.button1);
    }

    public void login(View view)
    {
        Toast.makeText(SigninActivity.this,"Datas hav been inserted",Toast.LENGTH_LONG).show();
    }
}
