package fr.utt.if26.mouloud_kevin_corentin;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import fr.utt.if26.mouloud_kevin_corentin.entities.Cursus;

public class ModuleSigleListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigle_list);
        Cursus cursus =  new Cursus();
        cursus.triParCredit();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cursus.getResumes());
        setListAdapter(adapter);

    }
}
