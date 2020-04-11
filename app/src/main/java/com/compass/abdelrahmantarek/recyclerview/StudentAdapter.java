package com.compass.abdelrahmantarek.recyclerview;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {

    List<Student> Students;
    String TAG = "smores";


    //Constructor
    public StudentAdapter(List<Student> Students) {
        this.Students = Students;
    }


    //Creates the viewHolder for each item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);
        return new MyViewHolder(view);
    }


    //Binds data to the viewHolder
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Student student = Students.get(position);
        holder.id.setText(student.getId());
        holder.name.setText(student.getName());
        holder.dept.setText(student.getDepartment());
        holder.year.setText(student.getYear());
    }

    //returns the number of items of the list
    @Override
    public int getItemCount() {
        return Students.size();
    }

    //Our viewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView id, name, dept, year;

        public MyViewHolder(View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id_tv);
            name = itemView.findViewById(R.id.student_name_tv);
            dept = itemView.findViewById(R.id.dept_tv);
            year = itemView.findViewById(R.id.year_tv);
        }
    }
}
