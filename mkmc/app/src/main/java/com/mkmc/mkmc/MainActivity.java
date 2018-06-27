package com.mkmc.mkmc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


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
            Intent intent = new Intent(this, Korean2.class);
            startActivity(intent);
        }



}
