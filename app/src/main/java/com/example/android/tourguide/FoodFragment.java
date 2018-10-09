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
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.morocco_list, container, false);

        //Create a list of cities
        ArrayList<Morocco> food = new ArrayList<>();
        food.add(new Morocco(R.string.food_bessara, R.drawable.food_bessara));
        food.add(new Morocco(R.string.food_briouat, R.drawable.food_briouat));
        food.add(new Morocco(R.string.food_couscous, R.drawable.food_couscous));
        food.add(new Morocco(R.string.food_harsha, R.drawable.food_harsha));
        food.add(new Morocco(R.string.food_kaab, R.drawable.food_kaab));
        food.add(new Morocco(R.string.food_maakouda, R.drawable.food_maakouda));
        food.add(new Morocco(R.string.food_paella, R.drawable.food_paella));
        food.add(new Morocco(R.string.food_pastilla, R.drawable.food_pastilla));
        food.add(new Morocco(R.string.food_rfissa, R.drawable.food_rfissa));
        food.add(new Morocco(R.string.food_seffa, R.drawable.food_seffa));
        food.add(new Morocco(R.string.food_tajine, R.drawable.food_tajine));
        food.add(new Morocco(R.string.food_tanjia, R.drawable.food_tanjia));

        MoroccoAdapter adapter = new MoroccoAdapter(getActivity(), food);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

