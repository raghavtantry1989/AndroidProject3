package com.example.tantryr.puneguide;


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
public class TopSightsFragment extends Fragment {


    public TopSightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.general_list_view,container,false);

        final ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight("Sinhagad",
                "Clifftop fortress, memorial & temple",
                "Historic hilltop fort with a memorial for 17th-century emperors, plus a temple to the goddess Kali.",
                R.drawable.sinhagad));

        sights.add(new Sight("Shaniwar Wada",
                "18th-century Peshwa fort with large gate",
                "Peshwa palace fort built in the 1740s, with a main gate big enough to let elephants pass through.",
                R.drawable.shaniwar_wada));

        sights.add(new Sight("Aga Khan Palace",
                "Lankmark palace & infamous Gandhi prison",
                "Palace built in the 19th century by Aga Pkan & the site of Gandhi's 2-yeat imprisonment in 1940s.",
                R.drawable.aga_khan_palace));

        sights.add(new Sight("Raja Dinkar Kelkar Museum",
                "Former personal collection of artifacts",
                "Museum housing one man's varied collection of 20,000+ Indian artifacts ranging from toys to artwork.",
                R.drawable.raja_dinjker_museum));

        sights.add(new Sight("Rajiv Gandhi Zoological Park",
                "Zoo with a snake park, birds & mammals",
                "This large zoo with a lake & greenery has a snake park with many reptiles & an animal rescue center.",
                R.drawable.rajiv_gandhi_zoo));

        sights.add(new Sight("Dagadusheth Ganapati Temple",
                "Hindu temple with large gold Ganesh idol",
                "Hindu temple popular with pilgrims, with marble interiors & 7.5-ft Ganesh idol in gold.",
                R.drawable.dagdushet));

        sights.add(new Sight("Pataleshwar",
                "Small Hindu temple carved out of rock",
                "Dedicated to the Hindu god Shiva, this compact rock-cut cave temple dates to the 8th century.",
                R.drawable.pataleshwar));

        sights.add(new Sight("Parvati Hill",
                "Temple, history, and architecture",
                "Parvati Hill is a hillock in Pune, India. The hillock rises to 2,100 feet above sea level. Atop the hillock is the Parvati Temple, one of the most scenic locations in Pune.",
                R.drawable.parvati_hills));

        sights.add(new Sight("Mulshi Dam",
                "Waterfall and lake",
                "Mulshi is the name of a major dam on the Mula river in India. It is located in the Mulshi taluka administrative division of the Pune district of Maharashtra State.",
                R.drawable.mulshi_dam));

        SightsAdapter adapter = new SightsAdapter(getContext(),sights,R.color.category_sights);
        ListView listView = rootView.findViewById(R.id.general_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }

}
