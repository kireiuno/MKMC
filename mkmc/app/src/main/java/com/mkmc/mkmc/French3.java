package com.mkmc.mkmc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class French3 extends AppCompatActivity {

    private ImageButton buttonFrench3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french3);

        //cross icon
        buttonFrench3 = (ImageButton) findViewById(R.id.crossFrench3);
        buttonFrench3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, French4.class);
        startActivity(intent);
    }
}
