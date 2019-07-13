package com.example.challenge_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openAboutPage(View view) {
        Intent intents = new Intent(this,Acl_page.class);
        startActivity(intents);
    }

    public void openProfile(View view) {
        Intent intent = new Intent(this,MyProfile.class);
        startActivity(intent);
    }
}
