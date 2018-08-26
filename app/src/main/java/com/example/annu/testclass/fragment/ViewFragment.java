package com.example.annu.testclass.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.annu.testclass.DB.Student;
import com.example.annu.testclass.DB.StudentHelper;
import com.example.annu.testclass.R;
import com.example.annu.testclass.adapter.StudentListAdapter;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ViewFragment extends Fragment {
    RecyclerView rvUsers;


    public ViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_view, container, false);
        rvUsers=view.findViewById( R.id.rvUsers );
        rvUsers.setLayoutManager( new LinearLayoutManager( getActivity() ) );//
        StudentHelper dbhelper=new StudentHelper( getActivity() );//
        List<Student> students=dbhelper.getAllStudent();//
        StudentListAdapter adapter=new StudentListAdapter(students ,dbhelper );
        rvUsers.setAdapter( adapter );
        // Inflate the layout for this fragment
        return view;
    }

}
