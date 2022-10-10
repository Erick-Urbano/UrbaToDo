package com.example.urbatodo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void facebook (View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(i);
    }
    public void twitter (View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"));
        startActivity(i);
    }
    public void instagram (View view){
        Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(i);
    }


}