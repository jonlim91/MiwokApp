package com.example.android.miwok;

import android.media.Image;

/**
 * Word class for Miwok and translated words
 */

public class Word {
    /** Default translation for the word **/
    private String mDefaultTranslation;

    /** Miwok translation for the word **/
    private String mMiwokTranslation;

    /** Resource ID for the image representation of the word **/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructs a new Word object with initial values for the Miwok and translated words
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Constructor that initializes the resource image ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int resourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = resourceID;
    }

    /**
     * Return the default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Return the Miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * Return the image representation of the word
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Return whether
     */
    public boolean hasValidImage(){
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }

}
