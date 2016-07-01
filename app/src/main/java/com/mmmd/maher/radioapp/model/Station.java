package com.mmmd.maher.radioapp.model;

/**
 * Created by maher on 6/30/16.
 */
public class Station {

    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }


    public String getStationTitle() {

        return stationTitle;
    }

    public String getImgUri() {

        return DRAWABLE + imgUri;
    }

}
