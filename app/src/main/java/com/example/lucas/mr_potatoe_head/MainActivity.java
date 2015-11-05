package com.example.lucas.mr_potatoe_head;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // to be used
    private ImageView nose, ears, eyes, brows, stache, mouth, shoes, hat, glasses, arms;
    private CheckBox cNose, cEars, cEyes, cBrows, cStache, cMouth, cShoes, cHat, cGlasses, cArms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // initialise all components
        nose = (ImageView) findViewById(R.id.imageView8);
        ears = (ImageView) findViewById(R.id.imageViewA);
        eyes = (ImageView) findViewById(R.id.imageView2);
        brows = (ImageView) findViewById(R.id.imageView3);
        stache = (ImageView) findViewById(R.id.imageView7);
        mouth = (ImageView) findViewById(R.id.imageView6);
        shoes = (ImageView) findViewById(R.id.imageView5);
        hat = (ImageView) findViewById(R.id.imageViewB);
        glasses = (ImageView) findViewById(R.id.imageView9);
        arms = (ImageView) findViewById(R.id.imageView4);

        cNose = (CheckBox) findViewById(R.id.nose);
        cEars = (CheckBox) findViewById(R.id.ears);
        cEyes = (CheckBox) findViewById(R.id.eyes);
        cBrows = (CheckBox) findViewById(R.id.brows);
        cStache = (CheckBox) findViewById(R.id.moustache);
        cMouth = (CheckBox) findViewById(R.id.mouth);
        cShoes = (CheckBox) findViewById(R.id.shoes);
        cHat = (CheckBox) findViewById(R.id.hat);
        cGlasses = (CheckBox) findViewById(R.id.glass);
        cArms = (CheckBox) findViewById(R.id.arms);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // checks if the nose checkbox is checked and shows/hides
    public void addNose(View view) {
        if (cNose.isChecked()) {
            nose.setVisibility(View.VISIBLE);
        }
        else{
            nose.setVisibility(View.INVISIBLE);
        }
    }

    // looks for check to show/hide
    public void addEars(View view) {
        if (cEars.isChecked()) {
            ears.setVisibility(View.VISIBLE);
        }
        else{
            ears.setVisibility(View.INVISIBLE);
        }
    }

    public void addShoes(View view) {
        if (cShoes.isChecked()) {
            shoes.setVisibility(View.VISIBLE);
        }
        else{
            shoes.setVisibility(View.INVISIBLE);
        }
    }

    public void addStache(View view) {
        if(cStache.isChecked()) {
            stache.setVisibility(View.VISIBLE);
        }
        else{
            stache.setVisibility(View.INVISIBLE);
        }
    }

    public void addEyes(View view) {
        if (cEyes.isChecked()) {
            eyes.setVisibility(View.VISIBLE);
        }
        else{
            eyes.setVisibility(View.INVISIBLE);
        }
    }

    public void addGlasses(View view) {
        if (cGlasses.isChecked()) {
            glasses.setVisibility(View.VISIBLE);
        }
        else{
            glasses.setVisibility(View.INVISIBLE);
        }
    }

    public void addHat(View view) {
        if(cHat.isChecked()) {
            hat.setVisibility(View.VISIBLE);
        }
        else{
            hat.setVisibility(View.INVISIBLE);
        }
    }

    public void addMouth(View view) {
        if (cMouth.isChecked()) {
            mouth.setVisibility(View.VISIBLE);
        }
        else {
            mouth.setVisibility(View.INVISIBLE);
        }
    }

    public void addBrows(View view) {
        if (cBrows.isChecked()) {
            brows.setVisibility(View.VISIBLE);
        }
        else{
            brows.setVisibility(View.INVISIBLE);
        }
    }

    public void addArms(View view) {
        if (cArms.isChecked()) {
            arms.setVisibility(View.VISIBLE);
        }
        else{
            arms.setVisibility(View.INVISIBLE);
        }
    }
}
