package com.example.annu.testclass.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class StudentHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "student.sqlite";  //made constant
    private static final int DB_VERSION = 1;
    private static final String TABLE = "student";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String PHONE = "phone";
    private static final String COURSE = "course";
    private static final String BRANCH = "branch";

    public StudentHelper(Context context) {
        super( context, DB_NAME, null, DB_VERSION );
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = " create table " + TABLE
                +  "  ( " + ID + " integer primary key autoincrement , "
                + NAME + " text ,  " + ADDRESS  + " text , " + PHONE + " text , " + COURSE
                + BRANCH + ")";
        Log.e( " DBQuery " , "==========" + query );
        sqLiteDatabase.execSQL( query );
    }
    public boolean addStudent(Student student) {//database get
        SQLiteDatabase db = getWritableDatabase( );
        ContentValues values = new ContentValues( );
        values.put( NAME, student.getName( ) );
        values.put( ADDRESS, student.getAddress( ) );
        values.put( PHONE, student.getPhone( ) );
        values.put( COURSE, student.getCourse( ) );
        values.put( BRANCH, student.getBranch( ) );
        long no = db.insert( TABLE, null, values );
        if (no == 0) {
            return false;
        } else {
            return true;
        }
    }
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>( );
        SQLiteDatabase db = getReadableDatabase( );

        String query = "select * from " + TABLE;
        Cursor cursor = db.rawQuery( query, null );
        while (cursor.moveToNext( )) {
            int id = cursor.getInt( cursor.getColumnIndex( ID ) );
            String name = cursor.getString( cursor.getColumnIndex( NAME ) );
            String address = cursor.getString( cursor.getColumnIndex( ADDRESS ) );
            String phone = cursor.getString( cursor.getColumnIndex( PHONE ) );
            String course = cursor.getString( cursor.getColumnIndex( COURSE ) );
            String branch = cursor.getString( cursor.getColumnIndex( BRANCH ) );
            Student student = new Student(name,address,phone,course,branch );
            student.setId(id);
            students.add(student);
        }
        if (cursor != null && !cursor.isClosed( )) {
            cursor.close( );
        }
        db.close();
        return students;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
