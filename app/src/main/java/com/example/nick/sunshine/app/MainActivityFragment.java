package com.example.nick.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] fakeData = {
                "Today - Sunny - 88 / 63",
                "Tommorow - Foggy - 70 / 46",
                "Weds - Cloudy - 80 / 68",
                "Thurs - Rainy - 72 / 63",
                "Fri - Foggy - 72 / 56",
                "Sat - Sunny - 79 / 60",
                "Sun - Rainy - 88 / 63"
        };
        List<String> weekForecast = new ArrayList<>(Arrays.asList(fakeData));

        ArrayAdapter<String> weatherData = new ArrayAdapter<>(
                getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(weatherData);

        return rootView;
    }
}
