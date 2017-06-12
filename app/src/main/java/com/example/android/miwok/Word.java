package com.example.android.miwok;

import android.media.Image;
import android.media.MediaPlayer;

/**
 * Word class for Miwok and translated words
 */

public class Word {
    /** Default translation for the word **/
    private String mDefaultTranslation;

    /** Miwok translation for the word **/
    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Resource ID for the image representation of the word **/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;

    /**
     * Constructs a new Word object with initial values for the Miwok and translated words
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructor that initializes the resource image ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceID;
        mAudioResourceId = audioResourceId;
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
     * Return whether word has a valid image
     */
    public boolean hasValidImage(){
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }

    /**
     * Return the audio file associated with the word
     */
    public int getAudioFile(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
