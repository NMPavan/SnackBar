package com.manikyapavan.snackbar;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Snackbar snackbar;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=(FloatingActionButton)findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar=Snackbar.make(view,"message sent",Snackbar.LENGTH_INDEFINITE);
                snackbar.setDuration(5000);
                snackbar.setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //whenever i click ok button snackbar will be cancelled
                        snackbar.dismiss();

                    }
                });
                snackbar.show();
            }
        });
       // view=findViewById(R.id.activity_main);
       // Snackbar.make(view,"Hello snackbar",Snackbar.LENGTH_SHORT).show();
        //snackbar=Snackbar.make(view,"Hello snackbar",Snackbar.LENGTH_INDEFINITE);
        //snackbar.setDuration(3000);
        //snackbar.show();
       // snackbar.dismiss();
    }
}
