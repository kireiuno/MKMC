package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Korean1 extends AppCompatActivity {

    private ImageButton activityMover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean1);


        TextView k1 = findViewById(R.id.god1);
        TextView k1h = findViewById(R.id.human1);
        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/헤움파스타142.ttf");
        k1.setTypeface(textFont);
        k1h.setTypeface(textFont);

        activityMover = (ImageButton) findViewById(R.id.k1button);
        activityMover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, Korean3.class );
        startActivity(intent);
    }
}
