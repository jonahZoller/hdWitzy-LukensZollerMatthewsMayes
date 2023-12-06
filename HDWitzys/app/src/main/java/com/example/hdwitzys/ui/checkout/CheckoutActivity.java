package com.example.hdwitzys.ui.checkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hdwitzys.R;

import java.util.ArrayList;

public class CheckoutActivity extends AppCompatActivity {

    private TextView OrderTXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        OrderTXT = findViewById(R.id.userOrder);
        ArrayList<String> userOrder = getIntent().getStringArrayListExtra("userOrder");


        String writeToText = "";
        for (int i = 0; i < userOrder.size(); i++) {
            writeToText += userOrder.get(i) + " ";
        }

        OrderTXT.setText(writeToText);


    }
}