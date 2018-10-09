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
public class CraftFragment extends Fragment {

    public CraftFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.morocco_list, container, false);

        //Create a list of cities
        ArrayList<Morocco> craft = new ArrayList<>();
        craft.add(new Morocco(R.string.craft_argan, R.drawable.craft_argan));
        craft.add(new Morocco(R.string.craft_babouche, R.drawable.craft_babouche));
        craft.add(new Morocco(R.string.craft_bags, R.drawable.craft_bags));
        craft.add(new Morocco(R.string.craft_basket, R.drawable.craft_basket));
        craft.add(new Morocco(R.string.craft_dried_goods, R.drawable.craft_goods));
        craft.add(new Morocco(R.string.craft_lantern, R.drawable.craft_lantern));
        craft.add(new Morocco(R.string.craft_pottery, R.drawable.craft_pottery));
        craft.add(new Morocco(R.string.craft_rugs, R.drawable.craft_rugs));
        craft.add(new Morocco(R.string.craft_soap, R.drawable.craft_soap));
        craft.add(new Morocco(R.string.craft_spices, R.drawable.craft_spices));
        craft.add(new Morocco(R.string.craft_wood, R.drawable.craft_wood));
        craft.add(new Morocco(R.string.craft_zellige, R.drawable.craft_zellige));

        MoroccoAdapter adapter = new MoroccoAdapter(getActivity(), craft);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}

