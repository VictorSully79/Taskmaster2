package com.example.taskmaster2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.amplifyframework.api.graphql.model.ModelMutation;
import com.amplifyframework.api.graphql.model.ModelQuery;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.datastore.generated.model.Task;

import java.util.ArrayList;
import java.util.List;

public class AddTask extends AppCompatActivity {
List<Task> totalTask = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        Amplify.API.query(
                ModelQuery.list(Task.class),
                success -> {
                    Log.i("trying to add task", "added task: ");
                    for(Task t: success.getData()){
                        totalTask.add(t);
                    }
                },
                error -> {
                    Log.i("trying to add task", "onCreate: create failed on line 34 ");
                }
        );
        Button addTaskButton = findViewById(R.id.confirmAddTaskButton);
        addTaskButton.setOnClickListener(v -> {
            String title = ((EditText)findViewById(R.id.editTaskTitle)).getText().toString();
            String description = ((EditText)findViewById(R.id.editDescription)).getText().toString();
            Log.i("=================", "onCreate: clicked add task button");
            Task task = Task.builder()
                    .name(title)
                    .description(description)
                    .build();

            Amplify.API.mutate(
                    ModelMutation.create(task),
                    success ->{
                        Log.i("trying to add task", "onCreate: added task");
                    },
                    error ->{
                        Log.i("trying to add task", "onCreate: create failed ");
                    }
            );
            Intent intent = new Intent(AddTask.this, MainActivity.class);
            AddTask.this.startActivity(intent);
            startActivity(intent);
        });
    }
}