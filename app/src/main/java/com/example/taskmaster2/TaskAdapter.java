package com.example.taskmaster2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amplifyframework.datastore.generated.model.Task;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    List<Task> tasks;
    public TaskViewHolder.OnClickable onClickable;
    public TaskAdapter(List<Task> tasks, TaskViewHolder.OnClickable onClickable){
        this.tasks = tasks;
        this.onClickable = onClickable;
    }

    @NonNull
    @NotNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View fragment = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_tasks, parent, false); //create fragment tasks layout resource
        TaskViewHolder viewHolder = new TaskViewHolder(fragment);
        viewHolder.itemView.setOnClickListener(v -> onClickable.handleClickOnTask(viewHolder));
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull TaskViewHolder holder, int position) {
        holder.task = tasks.get(position);
        String title = holder.task.getName();
        ((TextView) holder.itemView.findViewById(R.id.taskFragmentTitle)).setText(title); //create fragment
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder {
        public Task task;

        public TaskViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
        public interface OnClickable{
            void handleClickOnTask(TaskViewHolder viewHolder);
        }
    }
}
