package com.pandaclouds.android.testproj4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
//    HeroInfoControl heroLuna;
    PCStackerText heroTiny;
    PCStackerText heroKael;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);


      LinearLayout baseView = findViewById(R.id.base);


//       heroLuna = (HeroInfoControl)findViewById(R.id.heroLuna);
//        heroLuna.setHeroIcon(getResources().getDrawable(R.drawable.luna));
//        heroLuna.setHeroName("Hello World!, Wazzzzzzzaaaappp");
////
////
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
////
//                TextView hero = new TextView(this);
//
//                ViewGroup gt= new HeroInfoControl(this);
       PCStackerText heroLuna = new PCStackerText(this);
               heroLuna.setText("Hello World!, Wazzzzzzzaaaappp");

               baseView.addView(heroLuna);

        PCStackerText heroSomething = new PCStackerText(this);
        heroSomething.setText("Wazzzzzzzaaaappp Agggggggaaaaaiiin");

        baseView.addView(heroSomething);


        // heroLuna = (HeroInfoControl)findViewById(R.id.heroLuna);



//
    }
}
