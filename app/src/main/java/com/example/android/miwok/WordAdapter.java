package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import static android.R.attr.name;
import static com.example.android.miwok.R.id.imageRepresentation;
import static com.example.android.miwok.R.id.miwok_text_view;

/**
 * Created by Jonathan on 6/10/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mItemBackgroundColor;

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@link Word} object located at this position in the list
        Word word = getItem(position);

        //Find the TextView in the list_item.xml layout with the ID miwok_text_view
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Get the miwok translation from the current Word object and set this text on the miwok text view
        miwokTranslation.setText(word.getMiwokTranslation());

        //Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Get the default translation from the current Word object and set this text on the default text view
        defaultTranslation.setText(word.getDefaultTranslation());

        //set the background color of the ListView container
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mItemBackgroundColor);
        textContainer.setBackgroundColor(color);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        /*ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);*/
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        /*iconView.setImageResource(currentAndroidFlavor.getImageResourceId());*/

        ImageView imageRepresentation = (ImageView) listItemView.findViewById(R.id.imageRepresentation);

        if(word.hasValidImage()){
            imageRepresentation.setImageResource(word.getImageResourceId());
            imageRepresentation.setVisibility(View.VISIBLE);
        }
        else{
            imageRepresentation.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView [TODO])
        // so that it can be shown in the ListView
        return listItemView;
    }

    WordAdapter(Context context, ArrayList<Word> words){
        super(context, 0, words);
    }

    WordAdapter(Context context, ArrayList<Word> words, int color){
        super(context, 0, words);
        mItemBackgroundColor = color;
    }
}
