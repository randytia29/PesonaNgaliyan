package com.example.randy.pesonangaliyan;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.randy.pesonangaliyan.Tambakaji.TambakajiKuliner;
import com.example.randy.pesonangaliyan.Tambakaji.TambakajiProfil;
import com.example.randy.pesonangaliyan.Tambakaji.TambakajiTematik;
import com.example.randy.pesonangaliyan.Tambakaji.TambakajiWisata;
import com.example.randy.pesonangaliyan.Wates.WatesKuliner;
import com.example.randy.pesonangaliyan.Wates.WatesProfil;
import com.example.randy.pesonangaliyan.Wates.WatesTematik;
import com.example.randy.pesonangaliyan.Wates.WatesWisata;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class WatesActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wates);

        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.bottomBarItemOne) {
                    WatesProfil f = new WatesProfil();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemTwo) {
                    WatesWisata f = new WatesWisata();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemThree) {
                    WatesKuliner f = new WatesKuliner();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.bottomBarItemFour) {
                    WatesTematik f = new WatesTematik();
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
        Intent intent = new Intent(WatesActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
