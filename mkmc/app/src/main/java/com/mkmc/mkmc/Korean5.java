package com.mkmc.mkmc;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Korean5 extends AppCompatActivity {

    private ImageButton z;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean5);

        z = (ImageButton) findViewById(R.id.cross3);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, Korean6.class);
        startActivity(intent);
    }

    public void newImage(View view){
        image = findViewById(R.id.heart);
        image.setImageResource(R.drawable.john316);
    }
}
