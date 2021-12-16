package com.almi.nuevosintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.imageButton).setOnClickListener(e->{

            //WHATSAPP
            String sValue = "+34685503623";
            String sData = "smsto: " + sValue;

            //GOOGLE MAPS
            //String sValue = "//www.google.com/maps/place/Sevilla";
            //String sData = "https:" + sValue;

            //ABRIR PAGINAS WEB
            //String sValue = "//instituto.medac.es/login";
            //String sData = "https:" + sValue;

            //ENVIAR CORREO
            //String sValue = "user@gmail.com";
           //String sData = "mailto:" + sValue;


            //String sValue = "+34685503623";
            //String sData = "tel: " + sValue;

           //Intent intent = new Intent(Intent.ACTION_SENDTO);
            //ACTION_DIAL marcar sin llamar
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(sData));
            intent.setPackage("com.whatsapp");

            startActivity(intent);
        });
    }
}