package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Korean1 extends AppCompatActivity {

    private ImageButton activityMoverKorean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean1);


        TextView koreangod1 = findViewById(R.id.godkorean1);
        TextView koreanhuman1 = findViewById(R.id.humankorean1);
        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/pasta.ttf");
        koreangod1.setTypeface(textFont);
        koreanhuman1.setTypeface(textFont);

        activityMoverKorean = (ImageButton) findViewById(R.id.k1button);
        activityMoverKorean.setOnClickListener(new View.OnClickListener() {
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
