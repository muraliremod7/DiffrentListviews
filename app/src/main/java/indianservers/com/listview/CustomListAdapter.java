package indianservers.com.listview;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private String[] versions = {"Cupcake","Donut","Eclairs","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwitch","Jellybean","Kitkat","Lollipop"};
    private int[] images = {R.drawable.cupcake,R.drawable.donut,R.drawable.eclairs,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecream,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop};
    public CustomListAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = View.inflate(context,R.layout.custom_listsinglerow,null);
        ImageView imageView = (ImageView)view1.findViewById(R.id.image_single);
        TextView textView = (TextView)view1.findViewById(R.id.single_text);
//        if (i % 2 == 1) {
//            view1.setBackgroundColor(Color.parseColor("#FFB6B546"));
//        } else {
//            view1.setBackgroundColor(Color.parseColor("#FFCCCB4C"));
//        }
        imageView.setImageResource(images[i]);
        textView.setText(versions[i]);
        return view1;
    }
}
