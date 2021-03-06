package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Korean7 extends AppCompatActivity {

    private ImageButton korean7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean7);

        korean7 = (ImageButton) findViewById(R.id.k7button);
        korean7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        TextView textView = findViewById(R.id.ktext7);

        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/pasta.ttf");
        textView.setTypeface(textFont);
    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
