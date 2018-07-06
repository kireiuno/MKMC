package com.mkmc.mkmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class French2 extends AppCompatActivity {

    private ImageButton buttonFrench2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french2);

        //cross icon
        buttonFrench2 = (ImageButton) findViewById(R.id.crossFrench2);
        buttonFrench2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, French3.class);
        startActivity(intent);
    }

    public void triggerSin(View view){
        ImageView image = (ImageView) findViewById(R.id.devilFrench);
        image.setImageResource(R.drawable.sinfrench);
    }

}
