package com.admadimurtiwikanagmail.a02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ultah = (Button) findViewById(R.id.ultah);
        Button weding = (Button) findViewById(R.id.weding);
        Button special = (Button) findViewById(R.id.special);

        ultah.setOnClickListener(new View.OnClickListener() {

            public void onClick (View argo) {

                // TODO Auto-generated methot stub

                Intent i = new Intent(getApplicationContext(),layer2ultah.class);
                startActivity(i);

                }

                                 }


        );

        weding.setOnClickListener(new View.OnClickListener() {

                                     public void onClick (View argo) {

                                         // TODO Auto-generated methot stub

                                         Intent i = new Intent(getApplicationContext(),layer3weding.class);
                                         startActivity(i);

                                     }

                                 }


        );

        special.setOnClickListener(new View.OnClickListener() {

                                     public void onClick (View argo) {

                                         // TODO Auto-generated methot stub

                                         Intent i = new Intent(getApplicationContext(),layer4kelulusan.class);
                                         startActivity(i);

                                     }

                                 }


        );
    }


}
