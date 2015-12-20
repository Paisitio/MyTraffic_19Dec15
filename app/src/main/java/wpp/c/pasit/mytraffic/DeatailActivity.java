package wpp.c.pasit.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeatailActivity extends AppCompatActivity {

    // Explicit
    private TextView headTextView,detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatail);

        //Bind Widget

        bindWidget();

        //Show view
        showView();

    }

    private void showView() {

        //Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        // Show Image
        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        // Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] strDetail = getResources().getStringArray(R.array.detail);

        detailTextView.setText(strDetail[intIndex]);

    } //showView

    private void bindWidget() {

        headTextView = (TextView) findViewById(R.id.textTitle2);
        trafficImageView = (ImageView) findViewById(R.id.imageView);
        detailTextView = (TextView) findViewById(R.id.textView3);


    }
}
