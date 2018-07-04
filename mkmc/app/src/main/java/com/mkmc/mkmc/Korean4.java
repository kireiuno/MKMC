package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

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

        TextView j = findViewById(R.id.jesusCross);
        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/pasta.ttf");

        j.setTypeface(textFont);
    }

    public void openActivity(){
        Intent intent = new Intent(this, Korean6.class);
        startActivity(intent);
    }
}
