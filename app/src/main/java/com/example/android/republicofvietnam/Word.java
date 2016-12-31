package com.example.android.republicofvietnam;

/**
 * Created by ThienVu on 11/16/16.
 */

public class Word {
    //text field
    private int mDescription;

    //text title
    private int mTitle;

    //Show that image is provied or not
    private static final int NO_IMAGE_PROVIED = -1;

    //Picture
    private int mImage = NO_IMAGE_PROVIED;

    /**
     * Constructor of the Word class here with image
     */
    public Word(int title, int description, int image) {
        mTitle = title;
        mDescription = description;
        mImage = image;
    }

    /**
     * Constructor without image
     */

    public Word(int title, int description) {
        mTitle = title;
        mDescription = description;
    }

    /**
     * get Title
     */
    public int getmTitle() {
        return mTitle;
    }

    /**
     * get description
     */
    public int getmDescription() {
        return mDescription;
    }

    /**
     * get image
     */
    public int getmImage() {
        return mImage;
    }

    //check if have image or not
    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIED;
    }
}
