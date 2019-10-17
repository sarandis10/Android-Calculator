package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button et1,et2,et3,et4,et5,et6,et7,et8,et9,et0,etkatharise;
    Button etison,etkoma,etsin,etmion,etepi,etdia;

    TextView etapotelesma,etpraksi;

    double ar1, ar2;
    boolean sin,mion,epi,dia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et0=findViewById(R.id.et0);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        et5=findViewById(R.id.et5);

        et6=findViewById(R.id.et6);
        et7=findViewById(R.id.et7);
        et8=findViewById(R.id.et8);
        et9=findViewById(R.id.et9);


        etison=findViewById(R.id.etison);
        etkoma=findViewById(R.id.etkoma);
        etsin=findViewById(R.id.etsin);
        etmion=findViewById(R.id.etmion);
        etepi=findViewById(R.id.etepi);
        etkatharise=findViewById(R.id.etkatharise);
        etdia=findViewById(R.id.etdia);

        etapotelesma=findViewById(R.id.etapotelesma);
        etpraksi=findViewById(R.id.etpraksi);

        et0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"0"));
            }
        });

        et1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"1"));
            }
        });

        et2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"2"));
            }
        });

        et3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"3"));
            }
        });

        et4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"4"));
            }
        });

        et5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"5"));
            }
        });

        et6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"6"));
            }
        });

        et7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"7"));
            }
        });

        et8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"8"));
            }
        });

        et9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"9"));
            }
        });

        etkoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText((etpraksi.getText()+"."));
            }
        });

        etison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ar2      =Double.parseDouble(etpraksi.getText()+"");
                 if (sin==true){


                etapotelesma.setText(ar1+ar2+"");
                sin=false;
                }

                if (mion==true){
                    etapotelesma.setText(ar1-ar2+"");
                    mion=false;
                }

                if (epi==true){
                    etapotelesma.setText(ar1*ar2+"");
                    epi=false;
                }
                if (dia==true){
                    etapotelesma.setText(ar1/ar2+"");
                    dia=false;
                }

            }
        });

        etsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                ar1=Double.parseDouble(etpraksi.getText()+"");
                sin=true;
                //etpraksi.setText( ar1+ "+");
                etpraksi.setText(null);
                }
                catch(Exception e){

                }
            }
        });

        etmion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ar1=Double.parseDouble(etpraksi.getText()+"");
                mion=true;
                etpraksi.setText(null);            }
        });

        etepi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    ar1=Double.parseDouble(etpraksi.getText()+"");
                epi=true;
                etpraksi.setText(null);       }
                catch(Exception e){
                    Toast.makeText(MainActivity.this, "press a number 1st!!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        etdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                ar1=Double.parseDouble(etpraksi.getText()+"");
                dia=true;
                etpraksi.setText(null); }
            catch(Exception e){
                Toast.makeText(MainActivity.this, "press a number 1st!!",Toast.LENGTH_SHORT).show();

            }
            }
        });

        etkatharise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpraksi.setText("");
                etapotelesma.setText("");
            }
        });



    }
}
