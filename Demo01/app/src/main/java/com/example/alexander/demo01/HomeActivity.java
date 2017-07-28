package com.example.alexander.demo01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by alexander on 28/07/17.
 */

public class HomeActivity extends AppCompatActivity {
    ImageView btFindItem;
    private final View.OnClickListener btFindItemOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(HomeActivity.this, ItemFindActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        btFindItem = (ImageView) findViewById(R.id.ivFindItem);
        btFindItem.setOnClickListener(btFindItemOnClickListener);
    }
}
