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
public class SapaFragment extends Fragment {

    public SapaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //set initial ArrayList
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.sapa_title1, R.string.sapa_des1, R.drawable.sapa1));
        words.add(new Word(R.string.sapa_title2, R.string.sapa_des2, R.drawable.sapa2));
        words.add(new Word(R.string.sapa_title3, R.string.sapa_des3, R.drawable.sapa3));
        words.add(new Word(R.string.sapa_title4, R.string.sapa_des4, R.drawable.sapa4));
        words.add(new Word(R.string.sapa_title5, R.string.sapa_des5, R.drawable.sapa4_5));
        words.add(new Word(R.string.sapa_title6, R.string.sapa_des6, R.drawable.sapa5));
        words.add(new Word(R.string.sapa_title7, R.string.sapa_des7, R.drawable.sapa6));

        //set Adapter for ArrayList
        WordAdapter showSaPa = new WordAdapter(getActivity(), words, R.color.category_sapa);

        //finding listView
        ListView findSapa = (ListView) rootView.findViewById(R.id.list);
        //set Adapter to show on screen
        findSapa.setAdapter(showSaPa);

        return rootView;
    }
}
