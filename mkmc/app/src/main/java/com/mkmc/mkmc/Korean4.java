package com.mkmc.mkmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Korean4 extends AppCompatActivity {
    private ImageButton y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean4);


        y = (ImageButton) findViewById(R.id.cross2);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, Korean5.class);
        startActivity(intent);
    }
}
