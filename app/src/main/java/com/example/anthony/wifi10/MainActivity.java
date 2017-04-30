package com.example.anthony.wifi10;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    WifiManager admini_wifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen= (ImageView) findViewById(R.id.prendido);
        admini_wifi=(WifiManager)this.getSystemService(Context.WIFI_SERVICE);
        setimagenwifi(admini_wifi.isWifiEnabled());
    }

    public void click_imagen(View v){
        setestadowifi();
    }
    public void setimagenwifi(boolean valor){
        if (valor)imagen.setImageResource(R.drawable.wifi);
        else imagen.setImageResource(R.drawable.wifi2);

    }
    public void setestadowifi()
    {
        setimagenwifi(!admini_wifi.isWifiEnabled());
        admini_wifi.setWifiEnabled(!admini_wifi.isWifiEnabled());
    }
}