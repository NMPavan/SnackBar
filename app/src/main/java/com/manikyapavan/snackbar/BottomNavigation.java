package com.manikyapavan.snackbar;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView bottomNavigationView;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        bottomNavigationView=findViewById(R.id.bottom_id);
        txt=findViewById(R.id.text_id);
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        switch (id){
            case R.id.item1_id:
                txt.setText(getResources().getText(R.string.Recents));
                return true;
                //Intent i=new Intent(this,MainActivity.class);
                // startActivity(i);
            case R.id.item2_id:
                txt.setText(getResources().getText(R.string.favorites));
                return true;




                /*Intent i1=new Intent(this,MainActivity.class);
                startActivity(i1);*/

            case R.id.item3_id:
                txt.setText(getResources().getText(R.string.near_by));
                return true;

                /*Intent i3=new Intent(this,MainActivity.class);
                startActivity(i3);*/

        }

        return false;
    }
}
