package com.example.randy.pesonangaliyan;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.randy.pesonangaliyan.Ngaliyan.NgaliyanKuliner;
import com.example.randy.pesonangaliyan.Ngaliyan.NgaliyanProfil;
import com.example.randy.pesonangaliyan.Ngaliyan.NgaliyanTematik;
import com.example.randy.pesonangaliyan.Ngaliyan.NgaliyanWisata;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoKuliner;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoProfil;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoTematik;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoWisata;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class NgaliyanActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngaliyan);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottomBarItemOne) {
                    NgaliyanProfil f = new NgaliyanProfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemTwo) {
                    NgaliyanWisata f = new NgaliyanWisata();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemThree) {
                    NgaliyanKuliner f = new NgaliyanKuliner();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemFour) {
                    NgaliyanTematik f = new NgaliyanTematik();
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
        Intent intent = new Intent(NgaliyanActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
