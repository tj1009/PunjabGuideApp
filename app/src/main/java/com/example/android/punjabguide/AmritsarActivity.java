package com.example.android.punjabguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AmritsarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        final ArrayList<Place> amritsarSites = new ArrayList<Place>();

        amritsarSites.add(new Place(R.string.goldenTemple,R.string.temple_add,R.string.temple_desc,R.drawable.golden_temple));
        amritsarSites.add(new Place(R.string.jallianwalaBagh,R.string.bagh_add,R.string.bagh_desc,R.drawable.jallianwala_bagh));
        amritsarSites.add(new Place(R.string.wagahBorder,R.string.wagah_add,R.string.wagah_desc,R.drawable.wagah_border));
        amritsarSites.add(new Place(R.string.guruMahal,R.string.mahal_add,R.string.mahal_desc,R.drawable.guru_ke_mahal));

        PlacesAdapter adapter = new PlacesAdapter(this, amritsarSites);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);


    }
}
