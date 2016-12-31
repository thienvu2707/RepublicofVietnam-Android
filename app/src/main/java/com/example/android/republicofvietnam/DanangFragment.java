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
public class DanangFragment extends Fragment {
    public DanangFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //set initial ArrayList for
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.danang_title1, R.string.danang_des1, R.drawable.danang1));
        words.add(new Word(R.string.danang_title2, R.string.danang_des2 , R.drawable.danang2));
        words.add(new Word(R.string.danang_title3, R.string.danang_des3, R.drawable.danang3));
        words.add(new Word(R.string.danang_title4, R.string.danang_des4, R.drawable.danang4));
        words.add(new Word(R.string.danang_title5, R.string.danang_des5, R.drawable.danang5));
        words.add(new Word(R.string.danang_title6, R.string.danang_des6, R.drawable.danang6));
        words.add(new Word(R.string.danang_title7, R.string.danang_des7, R.drawable.danang7));

        //set Adapter
        WordAdapter showDaNang = new WordAdapter(getActivity(), words, R.color.category_danang);

        //finding Listview
        ListView findDaNang = (ListView) rootView.findViewById(R.id.list);
        //set Adapter to show on screen
        findDaNang.setAdapter(showDaNang);

        return rootView;
    }

}
