package com.example.anmol.classproject6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class SignupActivity extends AppCompatActivity
{
    EditText st_uid,et_upw,et_name;
    RadioGroup rgp;
    ImageView img;
    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        st_uid = (EditText)findViewById(R.id.et_uid);
        et_upw = (EditText)findViewById(R.id.et_upw);
        et_name = (EditText)findViewById(R.id.rt_name);
        img = (ImageView)findViewById(R.id.iv);
        but1 = (Button)findViewById(R.id.btn_signup);

        View v = findViewById(R.id.iv);
        registerForContextMenu(v);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu2,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
