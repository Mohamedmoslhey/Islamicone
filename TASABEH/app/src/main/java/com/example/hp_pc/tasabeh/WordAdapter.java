package com.example.hp_pc.tasabeh;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId){
        super(context  ,0 , words);
        mColorResourceId = colorResourceId;
    }
   public View getView (int position, View convertView, ViewGroup parent){
       View listItemView = convertView ;
       if(listItemView == null){
          listItemView = LayoutInflater.from(getContext()).inflate (R.layout.list_item, parent, false);
       }
Word currentword = getItem(position);
       TextView azkhaarNames = (TextView) listItemView.findViewById(R.id.AzkaarDetail);
       azkhaarNames.setText(currentword.getAzkhaarDetail());


       TextView azkhaarNumbers = (TextView) listItemView.findViewById(R.id.numberOfRead);
      azkhaarNumbers.setText(currentword.getAzkhaarlNumber());
       // Set the theme color for the list item
       View textContainer = listItemView.findViewById(R.id.text_container);
       // Find the color that the resource ID maps to
       int color = ContextCompat.getColor(getContext(), mColorResourceId);
       // Set the background color of the text container View
       textContainer.setBackgroundColor(color);

       return listItemView ;
   }

}
