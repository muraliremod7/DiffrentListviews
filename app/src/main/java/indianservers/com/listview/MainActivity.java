package indianservers.com.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button stringarray,array,arraylist,sqlite,customlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringarray = (Button)findViewById(R.id.stringarray);
        stringarray.setOnClickListener(this);
        array = (Button)findViewById(R.id.array);
        array.setOnClickListener(this);
        arraylist = (Button)findViewById(R.id.arraylist);
        arraylist.setOnClickListener(this);
        sqlite = (Button)findViewById(R.id.sqlite);
        sqlite.setOnClickListener(this);
        customlistview = (Button)findViewById(R.id.customlistview);
        customlistview.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.stringarray:
                Intent stringarray = new Intent(MainActivity.this, ListViewActivity.class);
                stringarray.putExtra("listview","StringArray");
                startActivity(stringarray);
                break;
            case R.id.array:
                Intent array = new Intent(MainActivity.this, ListViewActivity.class);
                array.putExtra("listview","Array");
                startActivity(array);
                break;
            case R.id.arraylist:
                Intent arraylist = new Intent(MainActivity.this, ListViewActivity.class);
                arraylist.putExtra("listview","ArrayList");
                startActivity(arraylist);
                break;
            case R.id.sqlite:
                Intent sqlite = new Intent(MainActivity.this, SqliteActivity.class);
                startActivity(sqlite);
                break;
            case R.id.customlistview:
                Intent customlistview = new Intent(MainActivity.this, ListViewActivity.class);
                customlistview.putExtra("listview","customlistview");
                startActivity(customlistview);
                break;

        }
    }
}
