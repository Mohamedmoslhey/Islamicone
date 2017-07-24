package com.example.hp_pc.tasabeh;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {} interface
 * to handle interaction events.
 * Use the {@link MawqeetElsalaahFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MawqeetElsalaahFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;




    /**
     * This listener gets triggered whenever the audio focus changes
     * (i.e., we gain or lose audio focus because of another app or device).
     */

    public static MawqeetElsalaahFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        MawqeetElsalaahFragment fragment = new MawqeetElsalaahFragment();
        fragment.setArguments(args);
        return fragment;
    }
    public MawqeetElsalaahFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.word_list, container, false);




        final ArrayList<PrayTimeData> prayds = new ArrayList<PrayTimeData>();
       prayds.add(new PrayTimeData("الفجر " ));
        prayds.add(new PrayTimeData("ألظهر "));
        prayds.add(new PrayTimeData("العصر "));
        prayds.add(new PrayTimeData("المغرب "));
        prayds.add(new PrayTimeData("العشاء "));


        // Create link PrayerAdapter has data source is a list of
        // adapter  create list items for each item in the list.
       PrayerAdapter adapter = new PrayerAdapter(getActivity(), prayds, R.color.category_colors);

       /*  ListView with the view ID called list, which is declared in the
         list.xml layout file.*/
        ListView listView = (ListView) rootView.findViewById(R.id.List);


        // ListView use the link WordAdapter created above
        // so link ListView} will display list items for each link Word in the list.
        listView.setAdapter(adapter);


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }
}
