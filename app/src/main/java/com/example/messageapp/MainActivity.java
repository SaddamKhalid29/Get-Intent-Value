package com.example.messageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Creating References
        EditText textMessage=findViewById(R.id.textMessage);
        Button btnSend = findViewById(R.id.sendBtn);
        Button btnMove=findViewById(R.id.moveActivity);
        EditText txtMessage=findViewById(R.id.txtMsg);

        //To see the activity life cycle
        Log.i("SecA","I am in onCreate Method!");


        //Spinner like a dropdown
        Spinner spnMonth=findViewById(R.id.spnMonth);
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,months);
        spnMonth.setAdapter(adapter);
       // List<ToDoItem> toDoItems=new ArrayList<>();

        //File Handling
        //Writing data to file

       // WriteDataToFile(toDoItems);


        //Send button  implicit intent
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent sendIntent=new Intent();
               sendIntent.setAction(Intent.ACTION_SEND);
               sendIntent.setType("text/plain");
               sendIntent.putExtra(Intent.EXTRA_TEXT,textMessage.getText().toString());
               startActivity(sendIntent);

            }
        });

        //Passing value to another activity --->Explicit Intent Example Implementation

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PictureActivity.class);
                intent.putExtra("Email","19011519-029@uog.edu.pk");
                intent.putExtra("Name","Saddam Khalid");
                startActivity(intent);
            }
        });

    }

//    private void WriteDataToFile(List<ToDoItem> toDoItems) {
//
//        File sdcard= Environment.getExternalStorageDirectory();
//        File dir=new File(sdcard.getAbsolutePath()+ "/SecA/");
//        dir.mkdir();
//        File file=new File(dir,"sample.txt");
//        FileOutputStream os=null;
//        try{
//            os=new FileOutputStream(file);
//            os.write(textMessage.getText().toString().getBytes());
//            os.close();
//
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//
//    }


    //Methods for lifecycle

    //Stat method to check life cycle
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("SecA","I am in onStart Method!");
    }

    //Stop method of life cycle
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("SecA","I am in onStop Method!");
    }

    //Restart method of activity life cycle
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("SecA","I am in onRestart Method!");

    }

    //OnPause method of activity life cycle
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("SecA","I am in onPause Method!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("SecA","I am in onResume Method!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("SecA","I am in onDestroy Method");
    }


}