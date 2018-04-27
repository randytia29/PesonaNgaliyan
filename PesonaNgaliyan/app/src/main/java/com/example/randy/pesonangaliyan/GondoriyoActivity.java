package com.example.randy.pesonangaliyan;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.randy.pesonangaliyan.Bringin.BringinKuliner;
import com.example.randy.pesonangaliyan.Bringin.BringinProfil;
import com.example.randy.pesonangaliyan.Bringin.BringinTematik;
import com.example.randy.pesonangaliyan.Bringin.BringinWisata;
import com.example.randy.pesonangaliyan.Gondoriyo.GondoriyoKuliner;
import com.example.randy.pesonangaliyan.Gondoriyo.GondoriyoProfil;
import com.example.randy.pesonangaliyan.Gondoriyo.GondoriyoTematik;
import com.example.randy.pesonangaliyan.Gondoriyo.GondoriyoWisata;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class GondoriyoActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gondoriyo);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottomBarItemOne) {
                    GondoriyoProfil f = new GondoriyoProfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemTwo) {
                    GondoriyoWisata f = new GondoriyoWisata();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemThree) {
                    GondoriyoKuliner f = new GondoriyoKuliner();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemFour) {
                    GondoriyoTematik f = new GondoriyoTematik();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(int menuItemId) {

            }
        });

        mBottomBar.mapColorForTab(0, "#F44336");
        mBottomBar.mapColorForTab(1, "#9C27B0");
        mBottomBar.mapColorForTab(2, "#2196F3");
        mBottomBar.mapColorForTab(3, "#009688");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(GondoriyoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
