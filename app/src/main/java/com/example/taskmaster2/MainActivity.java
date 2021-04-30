package com.example.taskmaster2;

import androidx.appcompat.app.AppCompatActivity;

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

       Button addTaskButton = findViewById(R.id.addTaskButton);
       addTaskButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Log.i(logTag, "This is a log, addTaskButton has been clicked");


              // ((TextView) findViewById(R.id.myTasksHomeTextView)).setText("My Tasks");
           }
       });
    }
}