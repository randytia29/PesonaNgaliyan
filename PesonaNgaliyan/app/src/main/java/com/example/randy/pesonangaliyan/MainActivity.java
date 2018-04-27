package com.example.randy.pesonangaliyan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout bambankerep, bringin, tambakaji, wonosari, kalipancur, podorejo, purwoyoso, gondoriyo, ngaliyan, wates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bambankerep = (LinearLayout) findViewById(R.id.bambankerep);
        bringin = (LinearLayout) findViewById(R.id.bringin);
        tambakaji = (LinearLayout) findViewById(R.id.tambakaji);
        wonosari = (LinearLayout) findViewById(R.id.wonosari);
        kalipancur = (LinearLayout) findViewById(R.id.kalipancur);
        podorejo = (LinearLayout) findViewById(R.id.podorejo);
        purwoyoso = (LinearLayout) findViewById(R.id.purwoyoso);
        gondoriyo = (LinearLayout) findViewById(R.id.gondoriyo);
        ngaliyan = (LinearLayout) findViewById(R.id.ngaliyan);
        wates = (LinearLayout) findViewById(R.id.wates);

        bambankerep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBambankerep = new Intent(MainActivity.this, BambankerepActivity.class);
                startActivity(intentBambankerep);
                finish();
            }
        });

        bringin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBringin = new Intent(MainActivity.this, BringinActivity.class);
                startActivity(intentBringin);
                finish();
            }
        });

        tambakaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTambakaji = new Intent(MainActivity.this, TambakajiActivity.class);
                startActivity(intentTambakaji);
                finish();
            }
        });

        wonosari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWonosari = new Intent(MainActivity.this, WonosariActivity.class);
                startActivity(intentWonosari);
                finish();
            }
        });

        kalipancur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentKalipancur = new Intent(MainActivity.this, KalipancurActivity.class);
                startActivity(intentKalipancur);
                finish();
            }
        });

        podorejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPodorejo = new Intent(MainActivity.this, PodorejoActivity.class);
                startActivity(intentPodorejo);
                finish();
            }
        });

        purwoyoso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPurwoyoso = new Intent(MainActivity.this, PurwoyosoActivity.class);
                startActivity(intentPurwoyoso);
                finish();
            }
        });

        gondoriyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGondoriyo = new Intent(MainActivity.this, GondoriyoActivity.class);
                startActivity(intentGondoriyo);
                finish();
            }
        });

        ngaliyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentNgaliyan = new Intent(MainActivity.this, NgaliyanActivity.class);
                startActivity(intentNgaliyan);
                finish();
            }
        });

        wates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentWates = new Intent(MainActivity.this, WatesActivity.class);
                startActivity(intentWates);
                finish();
            }
        });
    }
}
