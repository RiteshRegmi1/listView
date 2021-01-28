package com.blogspot.riteshcodejava.listpracticetwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list_item = findViewById(R.id.list_item);


        ArrayList<MyModels> list = new ArrayList<>();
        list.add(new MyModels("Ram"));
        list.add(new MyModels("Shayam"));
        list.add(new MyModels("Ram"));
        list.add(new MyModels("Ram"));
        list.add(new MyModels("Ram"));
        list.add(new MyModels("Ram"));
        list.add(new MyModels("Ram"));
        list.add(new MyModels("Ram"));

        MyAdapters adapters  = new MyAdapters(this,list);
        list_item.setAdapter(adapters);

    }
}