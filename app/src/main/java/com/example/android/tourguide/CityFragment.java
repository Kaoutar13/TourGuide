package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {

    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.morocco_list, container, false);

        //Create a list of cities
        ArrayList<Morocco> city = new ArrayList<>();

        city.add(new Morocco(R.string.city_chawn, R.drawable.city_chawn));
        city.add(new Morocco(R.string.city_dakhla, R.drawable.city_dakhla));
        city.add(new Morocco(R.string.city_essaouira, R.drawable.city_essaouira));
        city.add(new Morocco(R.string.city_fes, R.drawable.city_fes));
        city.add(new Morocco(R.string.city_houssaima, R.drawable.city_hoceima));
        city.add(new Morocco(R.string.city_kech, R.drawable.city_kech));
        city.add(new Morocco(R.string.city_meknes, R.drawable.city_meknes));
        city.add(new Morocco(R.string.city_ozt, R.drawable.city_ozt));
        city.add(new Morocco(R.string.city_rabat, R.drawable.city_rabat));
        city.add(new Morocco(R.string.city_safi, R.drawable.city_safi));
        city.add(new Morocco(R.string.city_tangier, R.drawable.city_tangier));
        city.add(new Morocco(R.string.city_zagoura, R.drawable.city_zagoura));

        MoroccoAdapter adapter = new MoroccoAdapter(getActivity(), city);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
