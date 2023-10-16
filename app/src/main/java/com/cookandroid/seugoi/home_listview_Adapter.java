package com.cookandroid.seugoi;
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class home_listview_Adapter extends BaseAdapter {
//    List<home_items> items = null;
//    Context context;
//
//    public home_listview_Adapter(List<home_items> items, Context context) {
//        this.items = items;
//        this.context = context;
//    }
//
//    @Override
//    public int getCount() {
//        return 0;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view = layoutInflater.inflate(R.layout.home_listview, parent, false);
//
//        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
//        TextView name = view.findViewById(R.id.yourName);
//        TextView title = view.findViewById(R.id.studyName);
//
//        home_items item = items.get(position);
//        name.setText(item.getYourName());
//        title.setText(item.getStudyName());
//
//        return view;
//    }
//}

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class home_listview_Adapter extends ArrayAdapter<home_items> {
    public home_listview_Adapter(Context context, ArrayList<home_items> studyList) {
        super(context, 0, studyList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        home_items studyItem = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.home_listview, parent, false);
        }

        // Lookup view for data population
        TextView studyName = convertView.findViewById(R.id.studyName);

        // Populate the data into the template view using the data object
        if (studyItem != null) {
            studyName.setText(studyItem.getStudyName());
        }

        return convertView;
    }
}