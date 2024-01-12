package com.example.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyCustomAdapter extends ArrayAdapter<String> {

    String[] brand_name, launched_year;
    int[] logos;
    Activity context;

    public MyCustomAdapter(Activity context1, String[] brand_name, String[] launched_year, int[] logos) {
        super(context1, R.layout.mylistitem);
        this.brand_name = brand_name;
        this.launched_year = launched_year;
        this.logos = logos;
        this.context = context1;
    }

    @Override
    public int getCount() {
        return brand_name.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylistitem,null,true);

        CircleImageView circleImageView = rowView.findViewById(R.id.pimage);
        TextView name = rowView.findViewById(R.id.pname);
        TextView year = rowView.findViewById(R.id.pyear);

        circleImageView.setImageResource(logos[position]);
        name.setText(brand_name[position]);
        year.setText(launched_year[position]);

        return rowView;
    }
}
