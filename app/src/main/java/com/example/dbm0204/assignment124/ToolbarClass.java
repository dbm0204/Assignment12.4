package com.example.dbm0204.assignment124;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by dbm0204 on 6/24/17.
 */

public class ToolbarClass extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
    }
    public void initToolbar(){
        toolbar =(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(null);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(ToolbarClass.this,"Clicking the toolbar!",Toast.LENGTH_LONG).show();
            }
        });

    }
}
