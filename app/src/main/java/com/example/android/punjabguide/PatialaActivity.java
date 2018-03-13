package com.example.android.punjabguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PatialaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        final ArrayList<Place> patialaSites = new ArrayList<Place>();

        patialaSites.add(new Place(R.string.qilaMubarak,R.string.qila_add,R.string.qila_desc,R.drawable.qila_mubarak));
        patialaSites.add(new Place(R.string.sheeshMahal,R.string.sheeshM_add,R.string.sheeshM_desc,R.drawable.sheesh_mahal));
        patialaSites.add(new Place(R.string.baradariGardens,R.string.baradari_add,R.string.baradari_desc,R.drawable.baradari_garden));
        patialaSites.add(new Place(R.string.kaliMandir,R.string.kaliM_add,R.string.kaliM_desc,R.drawable.kali_mata_mandir));
        patialaSites.add(new Place(R.string.gurudwara,R.string.gurudwara_add,R.string.gurudwara_desc,R.drawable.gurudwara));

        PlacesAdapter adapter = new PlacesAdapter(this, patialaSites);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
