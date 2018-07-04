package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Korean3 extends AppCompatActivity {


    private ImageButton x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean3);


        //font setup
        TextView n = findViewById(R.id.god);
        TextView m = findViewById(R.id.homme);
        TextView o = findViewById(R.id.sin);
        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/pasta.ttf");

        n.setTypeface(textFont);
        m.setTypeface(textFont);

        //cross icon
        x = (ImageButton) findViewById(R.id.cross1);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

    }

    public void openActivity(){
        Intent intent = new Intent(this, Korean4.class);
        startActivity(intent);
    }

}

