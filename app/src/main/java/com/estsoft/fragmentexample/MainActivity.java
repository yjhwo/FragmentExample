package com.estsoft.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //                                                      Root View
        getSupportFragmentManager().beginTransaction().add( android.R.id.content , new MyFragment()).commit();
    }
}
