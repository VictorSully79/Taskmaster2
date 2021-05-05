package com.example.taskmaster2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor preferenceEditor = preferences.edit();

        findViewById(R.id.userSaveButton).setOnClickListener(v -> {
            String username = ((TextView) findViewById(R.id.inputNameSettings)).getText().toString();
            preferenceEditor.putString("username", username);
            preferenceEditor.apply();

            Intent goToMainActivity = new Intent(Settings.this, MainActivity.class);
            Settings.this.startActivity(goToMainActivity);
            startActivity(goToMainActivity);
        });
    }
}