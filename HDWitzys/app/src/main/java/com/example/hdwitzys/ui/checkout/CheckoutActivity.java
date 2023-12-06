package com.example.hdwitzys.ui.checkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hdwitzys.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckoutActivity extends AppCompatActivity {

    private TextView OrderTXT,PriceTXT;
    public Double userPrice = 0.00;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        OrderTXT = findViewById(R.id.userOrder);
        PriceTXT = findViewById(R.id.userTotal);
        ArrayList<String> userOrder = getIntent().getStringArrayListExtra("userOrder");
        ArrayList<String> foodList = getIntent().getStringArrayListExtra("foodList");
        ArrayList<Double> foodPrices = new ArrayList<Double>();


        // combos
        foodPrices.add(10.00);
        foodPrices.add(10.00);
        foodPrices.add(12.00);
        foodPrices.add(9.00);
        foodPrices.add(12.00);
        foodPrices.add(15.00);
        foodPrices.add(13.00);
        // Sandwiches
        foodPrices.add(4.00);
        foodPrices.add(6.00);
        foodPrices.add(3.00);
        foodPrices.add(3.50);
        foodPrices.add(1.50);
        // Specialities
        foodPrices.add(1.50);
        foodPrices.add(1.50);
        foodPrices.add(1.00);
        // Hot dogs
        foodPrices.add(4.00);
        foodPrices.add(4.50);
        foodPrices.add(5.00);
        // desserts
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(2.00);
        foodPrices.add(3.00);
        foodPrices.add(7.00);
        foodPrices.add(10.00);
        foodPrices.add(15.00);
        // salads
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);
        foodPrices.add(4.00);







        for (int i = 0; i < userOrder.size(); i++) {
            for (int j = 0; j < foodPrices.size(); j++) {
                if (userOrder.get(i).equals(foodList.get(j))){
                    userPrice += foodPrices.get(j);
                }
            }
        }

        for (int i = 0; i < userOrder.size(); i++) {

        }

        PriceTXT.setText(Double.toString(userPrice));




        String writeToText = "";
        for (int i = 0; i < userOrder.size(); i++) {
            for (int j = 0; j < foodPrices.size(); j++) {
                if (userOrder.get(i).equals(foodList.get(j))){
                    writeToText += "\n" +userOrder.get(i) + ": " + foodPrices.get(j);
                }
            }

        }

        OrderTXT.setText("Your order: "+writeToText);


    }
}