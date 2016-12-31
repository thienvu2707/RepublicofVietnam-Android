package com.example.android.republicofvietnam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HalongFragment extends Fragment {

    public HalongFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //initial ArrayList
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.halong_title1, R.string.halong_des1, R.drawable.halong1));
        words.add(new Word(R.string.halong_title2, R.string.halong_des2, R.drawable.halong2));
        words.add(new Word(R.string.halong_title3, R.string.halong_des3, R.drawable.halong3));
        words.add(new Word(R.string.halong_title4, R.string.halong_des4, R.drawable.halong4));
        words.add(new Word(R.string.halong_title5, R.string.halong_des5, R.drawable.halong5));
        words.add(new Word(R.string.halong_title6, R.string.halong_des6, R.drawable.halong6));
        words.add(new Word(R.string.halong_title7, R.string.halong_des7, R.drawable.halong7));

        //set Adapter for ArrayList
        WordAdapter showHalong = new WordAdapter(getActivity(), words, R.color.category_halong);
        // find ListView
        ListView findHalong = (ListView) rootView.findViewById(R.id.list);
        //set Adapter to show on screen
        findHalong.setAdapter(showHalong);

        return rootView;
    }

}
