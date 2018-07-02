package indianservers.com.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    private String listtype;
    private ArrayAdapter<String> stringArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.listview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        listtype = intent.getStringExtra("listview");

        if(listtype.equals("StringArray")){
            stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,stringArray());
            listView.setAdapter(stringArrayAdapter);
            stringArrayAdapter.notifyDataSetChanged();
        }else if(listtype.equals("Array")){
            stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array());
            listView.setAdapter(stringArrayAdapter);
            stringArrayAdapter.notifyDataSetChanged();
        }else if(listtype.equals("ArrayList")){
            stringArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraylist());
            listView.setAdapter(stringArrayAdapter);
            stringArrayAdapter.notifyDataSetChanged();
        } else if(listtype.equals("customlistview")){
            customlistview();
        }

    }

    private void customlistview() {
        CustomListAdapter customListAdapter = new CustomListAdapter(this);
        listView.setAdapter(customListAdapter);
        customListAdapter.notifyDataSetChanged();
    }

    private ArrayList arraylist() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("C");
        strings.add("C++");
        strings.add("C#");
        strings.add("Angular JS");
        strings.add("Python");
        strings.add("MYSql");
        strings.add("PHP");
        return strings;
    }

    private String[] array() {
        String array[] = {"Aestro","Blender","Cupcake","Donut","Eclairs","Froyo"};
        return array;
    }

    private String[] stringArray() {
        String array[] = getResources().getStringArray(R.array.array);
        return array;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
