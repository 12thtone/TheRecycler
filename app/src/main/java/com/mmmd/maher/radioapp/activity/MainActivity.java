package com.mmmd.maher.radioapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.mmmd.maher.radioapp.R;
import com.mmmd.maher.radioapp.fragments.DetailsFragment;
import com.mmmd.maher.radioapp.fragments.MainFragment;
import com.mmmd.maher.radioapp.model.Station;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        FragmentManager fm = getSupportFragmentManager();
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.container_main);

        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("what", "ever");
            fm.beginTransaction().add(R.id.container_main, mainFragment).commit();
        }
    }

    public void loadDetailsScreen(Station selectedStation) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new DetailsFragment()).addToBackStack(null).commit();
    }

}
