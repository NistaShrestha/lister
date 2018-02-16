package com.example.s525389.lister;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s525389 on 2/13/2018.
 */

public class DrinkArrayAdapter<String> extends ArrayAdapter<String> {
    public DrinkArrayAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<String> objects) {


        super(context, resource, textViewResourceId, objects);
        prices.add(1.99);
        prices.add(0.99);
        prices.add(2.99);

    }

    ArrayList<Double> prices = new ArrayList<>();

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        TextView priceTV = v.findViewById(android.R.id.text2);
        priceTV.setText(prices.get(position) + "$");
        return v;
    }
}
