package com.example.randy.pesonangaliyan;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.randy.pesonangaliyan.Bambankerep.BambankerepKuliner;
import com.example.randy.pesonangaliyan.Bambankerep.BambankerepProfil;
import com.example.randy.pesonangaliyan.Bambankerep.BambankerepTematik;
import com.example.randy.pesonangaliyan.Bambankerep.BambankerepWisata;
import com.example.randy.pesonangaliyan.Bringin.BringinKuliner;
import com.example.randy.pesonangaliyan.Bringin.BringinProfil;
import com.example.randy.pesonangaliyan.Bringin.BringinTematik;
import com.example.randy.pesonangaliyan.Bringin.BringinWisata;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class BringinActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bringin);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottomBarItemOne) {
                    BringinProfil f = new BringinProfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemTwo) {
                    BringinWisata f = new BringinWisata();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemThree) {
                    BringinKuliner f = new BringinKuliner();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemFour) {
                    BringinTematik f = new BringinTematik();
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
        Intent intent = new Intent(BringinActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
