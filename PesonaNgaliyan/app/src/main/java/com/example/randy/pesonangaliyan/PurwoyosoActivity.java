package com.example.randy.pesonangaliyan;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.randy.pesonangaliyan.Podorejo.PodorejoKuliner;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoProfil;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoTematik;
import com.example.randy.pesonangaliyan.Podorejo.PodorejoWisata;
import com.example.randy.pesonangaliyan.Purwoyoso.PurwoyosoKuliner;
import com.example.randy.pesonangaliyan.Purwoyoso.PurwoyosoProfil;
import com.example.randy.pesonangaliyan.Purwoyoso.PurwoyosoTematik;
import com.example.randy.pesonangaliyan.Purwoyoso.PurwoyosoWisata;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class PurwoyosoActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purwoyoso);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottomBarItemOne) {
                    PurwoyosoProfil f = new PurwoyosoProfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemTwo) {
                    PurwoyosoWisata f = new PurwoyosoWisata();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemThree) {
                    PurwoyosoKuliner f = new PurwoyosoKuliner();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemFour) {
                    PurwoyosoTematik f = new PurwoyosoTematik();
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
        Intent intent = new Intent(PurwoyosoActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
