package com.example.taskmaster2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        // Steps to get button to click
        // Get by ID
        // Add event Listener
        // attach a callback
        // do stuff in the call back
        Button allTasksButton = findViewById(R.id.allTasksButton);
        Button addTaskButton = findViewById(R.id.addTaskButton);

        ((TextView) findViewById(R.id.myTasksHomeTextView)).setText("My Tasks");
        addTaskButton.setOnClickListener(view -> {
            Intent goToAddTaskView = new Intent(MainActivity.this, AddTask.class);
            // Class coming from and class going too

            startActivity(goToAddTaskView);
        });

        allTasksButton.setOnClickListener(view -> {
            Intent goToAllTasksView = new Intent(MainActivity.this, MyTasks.class);

            startActivity(goToAllTasksView);
        });
    }
}






