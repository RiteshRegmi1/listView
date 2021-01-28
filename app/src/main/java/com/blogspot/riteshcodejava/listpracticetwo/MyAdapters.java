package com.blogspot.riteshcodejava.listpracticetwo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.blogspot.riteshcodejava.listpracticetwo.Ram.RamActivity;
import com.blogspot.riteshcodejava.listpracticetwo.Shyam.ShyamActivity;

import java.util.ArrayList;

public class MyAdapters extends ArrayAdapter<MyModels> {


    Context context;
    public MyAdapters(@NonNull Context context,  ArrayList<MyModels> list) {
        super(context,0, list);
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        if (view == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            view = inflater.inflate(R.layout.costume_layout,parent,false);

        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(context, RamActivity.class);
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(context, ShyamActivity.class);
                        context.startActivity(intent1);
                }
            }
        });
        MyModels models  = getItem(position);
        TextView name = view.findViewById(R.id.nameTextView);
        name.setText(models.getName());

        return view;
    }
}
