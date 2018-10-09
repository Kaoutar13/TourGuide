package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MoroccoAdapter extends ArrayAdapter<Morocco> {

    public MoroccoAdapter(Context context, ArrayList<Morocco> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Morocco currentMorocco = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name.
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        // Get the name currentMorocco object and set this text on
        // the name TextView.
        name.setText(currentMorocco.getNameId());

        // Find the TextView in the list_item.xml layout with the ID city
        TextView city = (TextView) listItemView.findViewById(R.id.city);
        if (currentMorocco.hasCity()) {
            // Get city from the currentMorocco object and set this text on
            // the city TextView.
            city.setText(currentMorocco.getCityId());
            // Make the view visible
            city.setVisibility(View.VISIBLE);
        } else {
            city.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentMorocco.getImageId());

//         // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}

