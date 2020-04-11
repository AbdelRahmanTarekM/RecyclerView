package com.compass.abdelrahmantarek.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    List<Student> students;
    StudentAdapter studentAdapter;
    Button go;
    String TAG = "smores";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go = findViewById(R.id.go_btn);
        go.setOnClickListener(this);

        students = new ArrayList<>();
        students.add(new Student("Mohamed", "3", "1", "General"));
        students.add(new Student("Abdallah", "3", "2", "General"));
        students.add(new Student("Shrouk", "3", "3", "General"));
        students.add(new Student("Aya", "4", "1", "General"));

        //Binding recyclerview
        recyclerView = findViewById(R.id.student_recyclerview);
        // ************ Creating Linear Layout Manager to position items in recycler view ************
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        //initializing our adapter
        studentAdapter = new StudentAdapter(students);
        //Setting the adapter to the recycler view
        recyclerView.setAdapter(studentAdapter);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.go_btn) {
            Intent intent = new Intent(this, Main2Activity.class);
            //putting string into extras and passing it to the new activity
            intent.putExtra(TAG, "value");
            startActivity(intent);
        }
    }
}
