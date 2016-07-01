package com.mmmd.maher.radioapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.mmmd.maher.radioapp.holders.StationViewHolder;
import com.mmmd.maher.radioapp.model.Station;

import java.util.ArrayList;

/**
 * Created by maher on 6/30/16.
 */
public class StationsAdapter extends RecyclerView.Adapter<StationViewHolder> {

    private ArrayList<Station> stations;

    public StationsAdapter(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public void onBindViewHolder(StationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public StationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
}
