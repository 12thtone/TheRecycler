package com.mmmd.maher.radioapp.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mmmd.maher.radioapp.R;
import com.mmmd.maher.radioapp.model.Station;

/**
 * Created by maher on 6/30/16.
 */
public class StationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mainImage;
    private TextView titleTextView;
    public StationViewHolder(View itemView) {

        super(itemView);

        this.mainImage = (ImageView)itemView.findViewById(R.id.main_image);
        this.titleTextView = (TextView)itemView.findViewById(R.id.main_text);
    }

    public void updateUI(Station station) {
        String uri = station.getImgUri();
        int resource = mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);

        titleTextView.setText(station.getStationTitle());
    }
}
