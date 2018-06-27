package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class Korean2 extends AppCompatActivity {

    private ImageButton activityMover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean2);

        //Cross icon transitioner
        activityMover = (ImageButton) findViewById(R.id.cross);
        activityMover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });


        //sets font
        TextView textOne = findViewById(R.id.textOne);
        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/koreanFont.ttf");
        textOne.setTypeface(textFont);
    }

    public void openActivity(){
        Intent intent = new Intent(this, Korean3.class );
        startActivity(intent);
    }
}
