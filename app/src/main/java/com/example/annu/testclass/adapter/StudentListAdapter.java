package com.example.annu.testclass.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annu.testclass.DB.Student;
import com.example.annu.testclass.DB.StudentHelper;
import com.example.annu.testclass.R;

import java.util.List;

public class StudentListAdapter extends RecyclerView.Adapter<StudentViewHolder>{
    List<Student> students;
    StudentHelper dbhelper;
    public  StudentListAdapter(List<Student> Students, StudentHelper dbhelper){ //constructor
        this.students =Students;
        this.dbhelper=dbhelper;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate( R.layout.studentlist,viewGroup,false  );
        return new StudentViewHolder( view );    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        final Student student=students.get( i );
        studentViewHolder .txtName.setText( "Name :"+ student.getName() );
        studentViewHolder .txtAddress.setText( "Address :"+ student.getAddress() );
        studentViewHolder .txtPhone.setText( "Phone :"+ student.getPhone() );
        studentViewHolder .txtCourse.setText( "Course :"+ student.getCourse() );
        studentViewHolder .txtBranch.setText( "Branch :"+ student.getBranch() );
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

}

