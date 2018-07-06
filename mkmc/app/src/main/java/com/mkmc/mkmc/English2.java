package com.mkmc.mkmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class English2 extends AppCompatActivity {

    private ImageButton buttonEnglish2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english2);

        //cross icon
        buttonEnglish2 = (ImageButton) findViewById(R.id.crossEnglish2);
        buttonEnglish2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, English3.class);
        startActivity(intent);
    }

    public void triggerSin(View view){
        ImageView image = (ImageView) findViewById(R.id.devilEnglish);
        image.setImageResource(R.drawable.sineng);

    }
}
