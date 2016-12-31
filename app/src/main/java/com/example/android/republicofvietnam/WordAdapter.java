package com.example.android.republicofvietnam;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ThienVu on 11/17/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //resource id for the backgroud color
    private int mColorResource;

    /**
     * Constructor of word adapter
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        mColorResource = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //check if the existing View is being used or it will be inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at right position I want it in the list
        Word currentWord = getItem(position);

        //find textview of the Title
        TextView findSaigonTitle = (TextView) listItemView.findViewById(R.id.saigon_city_title);
        //get word for textView
        findSaigonTitle.setText(currentWord.getmTitle());

        //Find the TextView in the list_item
        TextView findSaigonDescription = (TextView) listItemView.findViewById(R.id.saigon_city_description);
        //Get the word out of Word and set it to TextView
        findSaigonDescription.setText(currentWord.getmDescription());

        //find image on ListView
        ImageView findImage = (ImageView) listItemView.findViewById(R.id.all_image);
        //check if the layout has image or not
        if (currentWord.hasImage()) {
            findImage.setImageResource(currentWord.getmImage());
            findImage.setVisibility(View.VISIBLE);
        } else findImage.setVisibility(View.GONE);

        //set the color for the textView of the ListView
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color of that match to the text container
        int color = ContextCompat.getColor(getContext(), mColorResource);
        //set background color
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
