package com.example.android.punjabguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JalandharActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        final ArrayList<Place> jalandharSites = new ArrayList<Place>();

        jalandharSites.add(new Place(R.string.tulsiMandir, R.string.mandir_add, R.string.mandir_desc, R.drawable.tulsi_mandir));
        jalandharSites.add(new Place(R.string.church, R.string.church_add, R.string.church_desc, R.drawable.st_mary_church));
        jalandharSites.add(new Place(R.string.scienceCity, R.string.science_add, R.string.sciene_desc, R.drawable.science_city));
        jalandharSites.add(new Place(R.string.shivMandir, R.string.shivM_add, R.string.shivM_desc, R.drawable.shiv_mandir));

        PlacesAdapter adapter = new PlacesAdapter(this, jalandharSites);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
