package com.example.annu.testclass.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.annu.testclass.DB.Student;
import com.example.annu.testclass.DB.StudentHelper;
import com.example.annu.testclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ADDFragment extends Fragment {
    Button btnSave;
    EditText edtName,edtAddress,edtPhone,edtCourse,edtBranch;

    public ADDFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        edtName=view.findViewById( R.id.edtName );
        edtAddress=view.findViewById( R.id.edtAddress);
        edtPhone=view.findViewById( R.id.edtPhone);
        edtCourse=view.findViewById(R.id.edtCourse);
        edtBranch=view.findViewById(R.id.edtBranch);
        btnSave=view.findViewById( R.id.btnSave );
        // Inflate the layout for this fragment

        btnSave.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                String name =edtName.getText().toString().trim();
                String address =edtAddress.getText().toString().trim();
                String phone =edtPhone.getText().toString().trim();
                String course =edtCourse.getText().toString().trim();
                String branch =edtBranch.getText().toString().trim();
                Student student=new Student( name,address,phone,course,branch );
                StudentHelper dbhelper=new StudentHelper( getActivity() );
                boolean isAddes= dbhelper.addStudent( student );
                if(isAddes){
                    Toast.makeText( getActivity(),"Recod Added",Toast.LENGTH_SHORT ).show();

                }
            }
        } );
        return view;

    }

}
