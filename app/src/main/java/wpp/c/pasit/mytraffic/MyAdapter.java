package wpp.c.pasit.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by WPP on 12/20/2015.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] title1Strings,title2Strings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] title1Strings, String[] title2Strings, int[] iconInts) {
        this.objContext = objContext;
        this.title1Strings = title1Strings;
        this.title2Strings = title2Strings;
        this.iconInts = iconInts;
    } //Constructor

    @Override
    public int getCount() {
        return title1Strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Open service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, parent, false);

        //For TextView
        TextView Title1TextView = (TextView) objView1.findViewById(R.id.textTitle1);
        Title1TextView.setText(title1Strings[position]);

        TextView title2TextView = (TextView) objView1.findViewById(R.id.textTitle2);
       title2TextView.setText(title2Strings[position]);

        //For Image

        ImageView icoImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        icoImageView.setImageResource(iconInts[position]);


        return objView1;
    }
}   // Main Class

