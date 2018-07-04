package com.mkmc.mkmc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Korean6 extends AppCompatActivity {
    private ImageButton a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean6);


        a = (ImageButton) findViewById(R.id.cross4);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        TextView p = findViewById(R.id.last);
        TextView q = findViewById(R.id.last2);

        Typeface textFont = Typeface.createFromAsset(getAssets(), "fonts/pasta.ttf");
        p.setTypeface(textFont);
        q.setTypeface(textFont);

    }


    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
