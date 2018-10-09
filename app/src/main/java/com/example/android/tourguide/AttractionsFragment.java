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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.morocco_list, container, false);

        //Create a list of cities
        ArrayList<Morocco> site = new ArrayList<>();

        site.add(new Morocco(R.string.site_ben_haddou, R.string.city_ozt, R.drawable.site_ben_haddou));
        site.add(new Morocco(R.string.site_caves, R.string.city_tangier, R.drawable.site_cave));
        site.add(new Morocco(R.string.site_exotic, R.string.city_bouknadel, R.drawable.site_exotic));
        site.add(new Morocco(R.string.site_hassan_tower, R.string.city_rabat, R.drawable.site_hassan));
        site.add(new Morocco(R.string.site_majorelle, R.string.city_kech, R.drawable.site_majorelle));
        site.add(new Morocco(R.string.site_ourika, R.string.city_kech, R.drawable.site_ourika));
        site.add(new Morocco(R.string.site_portuguese, R.string.city_jdida, R.drawable.site_portuguese));
        site.add(new Morocco(R.string.site_tanning, R.string.city_fes, R.drawable.site_tanning));
        site.add(new Morocco(R.string.site_taourirt, R.string.city_ozt, R.drawable.site_taourirt));
        site.add(new Morocco(R.string.site_todgha, R.string.city_ozt, R.drawable.site_todgha));
        site.add(new Morocco(R.string.site_toubkal, R.string.city_kech, R.drawable.site_toubkal));
        site.add(new Morocco(R.string.site_volubulis, R.string.city_meknes, R.drawable.site_volubilis));

        MoroccoAdapter adapter = new MoroccoAdapter(getActivity(), site);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

