package com.projects.kevinbarassa.stylusdjawards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DiagonalAnimActivity extends AppCompatActivity {

    View layoutTop;
    View layoutBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diagonal_main_simple);

        layoutTop = findViewById(R.id.layoutTop);
        layoutBottom = findViewById(R.id.layoutBottom);
    }
}
