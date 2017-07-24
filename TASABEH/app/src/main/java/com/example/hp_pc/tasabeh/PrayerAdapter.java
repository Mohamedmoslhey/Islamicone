package com.example.hp_pc.tasabeh;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP-PC on 7/11/2017.
 */

public class PrayerAdapter extends ArrayAdapter<PrayTimeData> {
    private int mColorResourceId;

    public PrayerAdapter(Context context, ArrayList<PrayTimeData> prayds, int colorResourceId){
        super(context  ,0, prayds);
        mColorResourceId = colorResourceId;
    }
    public View getView (int position, View convertView, ViewGroup parent){
        View listItemView = convertView ;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate (R.layout.list_item, parent, false);
        }
       PrayTimeData currentword = getItem(position);
        TextView MeqaatNames= (TextView) listItemView.findViewById(R.id.AzkaarDetail);
       MeqaatNames.setText(currentword.getMeqaatName());



        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView ;
    }
}
