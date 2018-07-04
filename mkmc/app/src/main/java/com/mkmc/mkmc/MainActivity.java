package com.mkmc.mkmc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    //initializes the variables for the button choices
    private Button french;
    private Button english;
    private Button korean;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //initialize for french
        french = (Button) findViewById(R.id.french);
        french.setOnClickListener(new View.OnClickListener() {
            @Override
            //tells the compiler that this will override the method of the superclass
            public void onClick(View v){
                openFrench2();

            }
        });

        //initialize for english

        english = (Button) findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener(){
           @Override

           public void onClick(View view){
               openEnglish2();
           }
        });

        korean = (Button) findViewById(R.id.korean);
        korean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View x){
                openKorean2();
            }

        });

        ImageView globe = (ImageView) findViewById(R.id.globe);

        RotateAnimation animate = new RotateAnimation(0.0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        //rotate relative to self position in the middle

        animate.setInterpolator(new LinearInterpolator());
        animate.setRepeatCount(Animation.INFINITE);
        animate.setDuration(10000); //in milliseconds

        globe.startAnimation(animate);

        }



        //opens new activity for transition aka going from the language choices towards the actual function of the app
        public void openFrench2(){
            Intent intent = new Intent(this, French2.class );
            startActivity(intent);
        }

        //opens new activity for starting in english

        public void openEnglish2(){
            Intent intent = new Intent(this, English2.class);
            startActivity(intent);
        }

        public void openKorean2(){
            Intent intent = new Intent(this, Korean3.class);
            startActivity(intent);
        }



}
