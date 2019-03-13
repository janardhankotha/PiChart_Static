package com.g2evolution.pichart_static;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements OnChartValueSelectedListener {
    PieChart pieChart;
    ArrayList<Entry> yvaluesgender;
    PieDataSet dataSetgender;
    ArrayList<String> xValsgender;
    PieData datagender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChart = (PieChart) findViewById(R.id.piechart);
        PieChart piechart2 = (PieChart) findViewById(R.id.piechart2);
        PieChart piechart3 = (PieChart) findViewById(R.id.piechart3);
        PieChart piechart4 = (PieChart) findViewById(R.id.piechart4);


        yvaluesgender = new ArrayList<Entry>();
        xValsgender = new ArrayList<String>();
        TextView textsubmit = (TextView) findViewById(R.id.textsubmit);
        textsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  setmetyhod();
            }
        });

        pieChart.setUsePercentValues(true);
        piechart2.setUsePercentValues(true);
        piechart3.setUsePercentValues(true);
        piechart4.setUsePercentValues(true);


        ArrayList<Entry> yvaluesgender = new ArrayList<Entry>();
        yvaluesgender.add(new Entry(250f, 0));
        yvaluesgender.add(new Entry(250f, 1));
        yvaluesgender.add(new Entry(520f, 3));
        yvaluesgender.add(new Entry(730f, 4));

        PieDataSet dataSetgender = new PieDataSet(yvaluesgender, "");


        ArrayList<String> xValsgender = new ArrayList<String>();

        xValsgender.add("18-30");
        xValsgender.add("30-45");
        xValsgender.add("45-60");
        xValsgender.add("60+");

        PieData datagender = new PieData(xValsgender, dataSetgender);

        // In percentage Term
        datagender.setValueFormatter(new PercentFormatter());
// Default value
//data.setValueFormatter(new DefaultValueFormatter(0));

        pieChart.setData(datagender);
        piechart2.setData(datagender);
        piechart3.setData(datagender);
        piechart4.setData(datagender);
        dataSetgender.setColors(ColorTemplate.VORDIPLOM_COLORS);

        dataSetgender.setColors(ColorTemplate.JOYFUL_COLORS);

        dataSetgender.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSetgender.setColors(ColorTemplate.LIBERTY_COLORS);

        dataSetgender.setColors(ColorTemplate.PASTEL_COLORS);

        pieChart.setDescription("");
        piechart2.setDescription("");
        piechart3.setDescription("");
        piechart4.setDescription("");


//Disable Hole in the Pie Chart
        pieChart.setDrawHoleEnabled(false);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(8f);
        pieChart.setHoleRadius(3f);

        piechart2.setDrawHoleEnabled(false);
        piechart2.setDrawHoleEnabled(true);
        piechart2.setTransparentCircleRadius(8f);
        piechart2.setHoleRadius(3f);

        piechart3.setDrawHoleEnabled(false);
        piechart3.setDrawHoleEnabled(true);
        piechart3.setTransparentCircleRadius(8f);
        piechart3.setHoleRadius(3f);

        piechart4.setDrawHoleEnabled(false);
        piechart4.setDrawHoleEnabled(true);
        piechart4.setTransparentCircleRadius(8f);
        piechart4.setHoleRadius(3f);

        datagender.setValueTextSize(8f);
        datagender.setValueTextColor(Color.WHITE);


    }

    private void setmetyhod() {
        Log.e("testing","clicking");


        dataSetgender.setColors(ColorTemplate.VORDIPLOM_COLORS);

        dataSetgender.setColors(ColorTemplate.JOYFUL_COLORS);

        dataSetgender.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSetgender.setColors(ColorTemplate.LIBERTY_COLORS);

        dataSetgender.setColors(ColorTemplate.PASTEL_COLORS);

        pieChart.setDescription("");

//Disable Hole in the Pie Chart
        pieChart.setDrawHoleEnabled(false);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(8f);
        pieChart.setHoleRadius(3f);


        datagender.setValueTextSize(8f);
        datagender.setValueTextColor(Color.WHITE);
    }

    @Override
    public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {

        if (e == null)
            return;
        Log.i("VAL SELECTED",
                "Value: " + e.getVal() + ", xIndex: " + e.getXIndex()
                        + ", DataSet index: " + dataSetIndex);
    }

    @Override
    public void onNothingSelected() {
        Log.i("PieChart", "nothing selected");
    }
}
