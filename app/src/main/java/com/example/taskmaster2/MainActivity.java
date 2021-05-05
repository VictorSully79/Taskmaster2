package com.example.taskmaster2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String logTag = "victorSully79.main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor preferenceEditor = preferences.edit();

        String username = preferences.getString("username", null);
        if(username != null){
            ((TextView) findViewById(R.id.myTasksHomeTextView)).setText(username + "'s  tasks");
        }
        // Steps to get button to click
        // Get by ID
        // Add event Listener
        // attach a callback
        // do stuff in the call back
        Button allTasksButton = findViewById(R.id.allTasksButton);
        Button addTaskButton = findViewById(R.id.addTaskButton);
        Button settingsButton = findViewById(R.id.settingsButton);
        addTaskButton.setOnClickListener(view -> {
            Intent goToAddTaskView = new Intent(MainActivity.this, AddTask.class);
            // Class coming from and class going too

            startActivity(goToAddTaskView);
        });

        allTasksButton.setOnClickListener(view -> {
            Intent goToAllTasksView = new Intent(MainActivity.this, MyTasks.class);

            startActivity(goToAllTasksView);
        });

        settingsButton.setOnClickListener(view -> {
            Intent goToSettingsView = new Intent(MainActivity.this, Settings.class );

            startActivity(goToSettingsView);
        });


    }
}






