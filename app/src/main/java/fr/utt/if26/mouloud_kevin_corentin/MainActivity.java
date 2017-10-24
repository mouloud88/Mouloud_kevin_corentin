package fr.utt.if26.mouloud_kevin_corentin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.Toast;
import android.content.Context;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.add_module:
                addModule();
                return true;
            case R.id.del_module:
                delModule();
                return true;
            case R.id.list_module:
                listModule();
                return true;
            case R.id.list_sigle:
                listSigle();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addModule() {
     Context context = getApplicationContext();
     int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux ajouter un module";
        Toast toast = Toast.makeText(context, text, duration);
     toast.show();
   }
    private void delModule() {
     Context context = getApplicationContext();
     int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux supprimer un module";
        Toast toast = Toast.makeText(context, text, duration);
     toast.show();
   }
    private void listModule() {
     Context context = getApplicationContext();
     int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux lister un module";
        Toast toast = Toast.makeText(context, text, duration);
     toast.show();
   }
   private void listSigle() {
     Context context = getApplicationContext();
     int duration = Toast.LENGTH_SHORT;
       CharSequence text = "Je veux lister les sigles";
       Toast toast = Toast.makeText(context, text, duration);
     toast.show();
       Intent intent = new Intent(this, ModuleSigleListActivity.class);
       MainActivity.this.startActivity(intent);

   }

}
