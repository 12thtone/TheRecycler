package com.mmmd.maher.radioapp.services;

import com.mmmd.maher.radioapp.model.Station;

import java.util.ArrayList;

/**
 * Created by maher on 6/30/16.
 */
public class DataService {
    private static DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {
        // Manage stations downloaded form internet

        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Road Music)", "flightplanmusic"));
        list.add(new Station("Bike Tunes (Hog Tunes)", "bicyclemusic"));
        list.add(new Station("Kid Music (Children Tunes)", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();

        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();

        return list;
    }
}
