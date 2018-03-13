package com.example.android.punjabguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ChandigarhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        final ArrayList<Place> chandigarhSites = new ArrayList<Place>();

        chandigarhSites.add(new Place(R.string.rockGarden,R.string.rock_add,R.string.rock_desc,R.drawable.rock_garden));
        chandigarhSites.add(new Place(R.string.roseGarden,R.string.rose_add,R.string.rose_desc,R.drawable.rose_garden));
        chandigarhSites.add(new Place(R.string.sector17,R.string.sector_add,R.string.sector_desc,R.drawable.sector_17));
        chandigarhSites.add(new Place(R.string.sukhnaLake,R.string.lake_add,R.string.lake_desc,R.drawable.sukhna_lake));

        PlacesAdapter adapter = new PlacesAdapter(this, chandigarhSites);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);






    }
}
