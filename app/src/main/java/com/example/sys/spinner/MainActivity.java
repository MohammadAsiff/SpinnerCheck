package com.example.sys.spinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Spinner s=findViewById( R.id.spinner );
        String[]countries={"India","Pakistan","kenya","USA","SoudiArabia","China","Srilanka"};
        ArrayAdapter<String>adapter=new ArrayAdapter <String>(this,android.R.layout.simple_spinner_dropdown_item,countries  );
        s.setAdapter( adapter );
        final CheckBox ch=findViewById( R.id.ch1 );
        Button b=findViewById( R.id.but );
        RadioGroup rg=findViewById( R.id.radio );

        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ch.isChecked() == true) {
                    getWindow().getDecorView().setBackgroundColor( Color.parseColor( "#FF0000" ) );
                } else {
                    Toast.makeText( MainActivity.this, "Not Selected", Toast.LENGTH_SHORT ).show();
                    getWindow().getDecorView().setBackgroundColor( Color.parseColor( "#ffffff" ) );
                }
            }
        } );
        rg.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.r1:
                        getWindow().getDecorView().setBackgroundColor( Color.parseColor( "#FF0000" ) );
                        break;
                    case R.id.r2:
                        getWindow().getDecorView().setBackgroundColor( Color.parseColor( "#FFFF00" ) );
                        break;


                }
            }
        } );

    }

    }


