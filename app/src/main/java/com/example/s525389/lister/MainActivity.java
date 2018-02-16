package com.example.s525389.lister;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> drinks = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drinks.add("Pepsi");
        drinks.add("Coke");
        drinks.add("Water");
        prices.add(1.99);
        prices.add(0.99);
        prices.add(2.99);

        ListAdapter drinksource = new ArrayAdapter<String>(this, R.layout.our_listview, R.id.theName, drinks) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View v = super.getView(position, convertView, parent);
                ImageView imageView = v.findViewById(R.id.theImage);
                imageView.setImageResource(R.drawable.coke);
                return v;
            }


        };
        ListView drinkLV = findViewById(R.id.drinkLV);
        drinkLV.setAdapter(drinksource);


        //nista

        drinkLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.d("Click", "Click happened");
                Toast.makeText(getApplicationContext(), "Clicked =1 " + position, Toast.LENGTH_SHORT).show();

            }
        });

    }
}



