package com.example.dbm0204.assignment124;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    final Context context;
    private static Toolbar toolbar;
    private static TextView text_name;
    private static TextView text_number;
    private static Button dialog_save;
    private static Button dialog_cancel;
    final Dialog dialog;

    MainActivity(){
        context=this;
        dialog= new Dialog(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolBar();
        text_name =(TextView)dialog.findViewById(R.id.name);
        text_number=(TextView)dialog.findViewById(R.id.number);
        dialog_save = (Button) dialog.findViewById(R.id.dailog_save);
        dialog_cancel= (Button) dialog.findViewById(R.id.dialog_cancel);

    }
    public void initToolBar(){
        toolbar =(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle(null);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(),"Clicking the Toolbar",Toast.LENGTH_LONG).show();
                    }
                }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.ADD:
                Toast.makeText(getApplicationContext(),"ADD Selected",Toast.LENGTH_LONG).show();
                dialog.setContentView(R.layout.custom_dialog);
                /**
                 * TODO:Try to implement DatePicker
                 */
                dialog_save.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(),"Save Selected",Toast.LENGTH_LONG).show();
                        //TODO: Implement Logic to add to List
                    }
                });
                dialog_cancel.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        Toast.makeText(getApplicationContext(),"Cancel Selected",Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}