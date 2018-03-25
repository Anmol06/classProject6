package com.example.anmol.classproject6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity
{
    RelativeLayout r1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        r1 = (RelativeLayout)findViewById(R.id.r1);
        View vi = findViewById(R.id.r1);
        registerForContextMenu(vi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.m1:
                Toast.makeText(this,"Menu item 1 has been clicked",Toast.LENGTH_LONG).show();
                 break;
            case R.id.m2:
                Toast.makeText(this,"Menu item 2 has been selected",Toast.LENGTH_LONG).show();
                 break;
            case R.id.m3:
                Toast.makeText(this,"Menu item 3 has been clicked",Toast.LENGTH_LONG).show();
                 break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
