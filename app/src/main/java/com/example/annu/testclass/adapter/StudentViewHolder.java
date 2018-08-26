package com.example.annu.testclass.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.annu.testclass.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView txtName,txtPhone,txtAddress,txtCourse,txtBranch;
    ImageButton btnDelete;
    public StudentViewHolder(@NonNull View itemView) {
        super( itemView );
        txtName=itemView.findViewById(R.id.txtName );
        txtAddress=itemView.findViewById( R.id.txtAddress );
        txtPhone=itemView.findViewById(R.id.txtPhone );
        txtCourse=itemView.findViewById(R.id.txtCourse );
        txtBranch=itemView.findViewById(R.id.txtBranch );
        btnDelete=itemView.findViewById( R.id.btnDelete );

    }
}
