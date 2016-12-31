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
public class SaigonFragment extends Fragment {

    public SaigonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //set initial ArrayList for saigon
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.saigon_title1, R.string.saigon_des1, R.drawable.saigon1));
        words.add(new Word(R.string.saigon_title2, R.string.saigon_des2, R.drawable.saigon2));
        words.add(new Word(R.string.saigon_title3, R.string.saigon_des3, R.drawable.saigon3));
        words.add(new Word(R.string.saigon_title4, R.string.saigon_des4, R.drawable.saigon4));
        words.add(new Word(R.string.saigon_title5, R.string.saigon_des5, R.drawable.saigon5));
        words.add(new Word(R.string.saigon_title6, R.string.saigon_des6, R.drawable.saigon6));
        words.add(new Word(R.string.saigon_title7, R.string.saigon_des7, R.drawable.saigon7));

        //set Adapter for ArrayList
        WordAdapter showSaigon = new WordAdapter(getActivity(), words, R.color.category_saigon);

        //finding ListView
        ListView saigonList = (ListView) rootView.findViewById(R.id.list);
        //set Adapter to show on the screen
        saigonList.setAdapter(showSaigon);

        return rootView;
    }

}
