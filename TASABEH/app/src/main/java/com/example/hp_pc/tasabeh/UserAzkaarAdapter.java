package com.example.hp_pc.tasabeh;

import android.content.Context;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP-PC on 7/21/2017.
 */

public class UserAzkaarAdapter extends ArrayAdapter<UserAzkaar> {
Context mcontext ;
    int mresource ;
    public UserAzkaarAdapter( Context context,  int resource,  ArrayList<UserAzkaar> UserAzkaars) {
        super(context, 0, UserAzkaars);
        mcontext = context;
        mresource = resource;
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {


    convertView = LayoutInflater.from(mcontext).inflate(mresource, parent, false);

        UserAzkaar currentAzkaar = getItem(position);



        return convertView;
    }
}
