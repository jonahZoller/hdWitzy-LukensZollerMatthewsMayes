package com.example.hdwitzys.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hdwitzys.R;
import com.example.hdwitzys.ui.checkout.CheckoutActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MenuFragment extends Fragment {

    private Button combos, sandwich, specialties, hotdogs, desserts, salads, back, back2, back3, back4, back5, back6, toCheckout;
    private ScrollView scroll, comboSV, sandwichSV, specialtySV, hotdogSV, dessertSV, saladSV;
    private CheckBox c1, c2, c3, c4, c5, c6, c7, s1, s2, s3 ,s4, s5, sp1, sp2, sp3, h1, h2, h3, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, isplit, ix2, ix3, pint, quart, shake, sa1, sa2, sa3, sa4, sa5;
    private TextView OrderTXT;
    //all of the letters correspond to where the checkboxes are held
    // c = combos | s = sandwiches | sp = specialties | h = hotdogs | i = icecream | sa = salads
    //isplit - banana split | ix[num] = num of scoops for ice cream | pints and quarts are self explanatory


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MenuViewModel galleryViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        //binding = FragmentMenuBinding.inflate(inflater, container, false);
        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

//        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//        ArrayList<String> comboList = new ArrayList<String>();
//        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//        ArrayList<String> sandwichList = new ArrayList<String>();
//        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//        ArrayList<String> specialList = new ArrayList<String>();
//        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//        ArrayList<String> hotdogList = new ArrayList<String>();
//        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//        ArrayList<String> dessertList = new ArrayList<String>();
//        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
//        ArrayList<String> saladList = new ArrayList<String>();

        ArrayList<String> userOrder = new ArrayList<String>();
        ArrayList<CheckBox> checkBoxes = new ArrayList<CheckBox>();
        ArrayList<String> foodList = new ArrayList<String>();

        //textview
        OrderTXT = rootView.findViewById(R.id.OrderTXT);

        //scroll views (these separate the categories by food)
        scroll = rootView.findViewById(R.id.sv1);
        comboSV = rootView.findViewById(R.id.sv2);
        sandwichSV = rootView.findViewById(R.id.sv3);
        specialtySV = rootView.findViewById(R.id.sv4);
        hotdogSV = rootView.findViewById(R.id.sv5);
        dessertSV = rootView.findViewById(R.id.sv6);
        saladSV = rootView.findViewById(R.id.sv7);


        //buttons
        toCheckout = rootView.findViewById(R.id.toCheckoutBTN);

        back = rootView.findViewById(R.id.btnBack);
        back2 = rootView.findViewById(R.id.btnBack2);
        back3 = rootView.findViewById(R.id.btnBack3);
        back4 = rootView.findViewById(R.id.btnBack4);
        back5 = rootView.findViewById(R.id.btnBack5);
        back6 = rootView.findViewById(R.id.btnBack6);

        sandwich = rootView.findViewById(R.id.sandwichBTN);
        combos = rootView.findViewById(R.id.comboBTN);
        specialties = rootView.findViewById(R.id.specialtiesBTN);
        hotdogs = rootView.findViewById(R.id.hotdogsBTN);
        desserts = rootView.findViewById(R.id.dessertBTN);
        salads = rootView.findViewById(R.id.saladBTN);

        //setting the scroll view back to visible
        scroll.setVisibility(View.VISIBLE);
        comboSV.setVisibility(View.GONE);
        sandwichSV.setVisibility(View.GONE);
        specialtySV.setVisibility(View.GONE);
        hotdogSV.setVisibility(View.GONE);
        dessertSV.setVisibility(View.GONE);
        saladSV.setVisibility(View.GONE);
        //setting combo visible

        c1 = rootView.findViewById(R.id.cbCombo1);
        c2 = rootView.findViewById(R.id.cbCombo2);
        c3 = rootView.findViewById(R.id.cbCombo3);
        c4 = rootView.findViewById(R.id.cbCombo4);
        c5 = rootView.findViewById(R.id.cbCombo5);
        c6 = rootView.findViewById(R.id.cbCombo6);
        c7 = rootView.findViewById(R.id.cbCombo7);

        s1 = rootView.findViewById(R.id.cbSandwich1);
        s2 = rootView.findViewById(R.id.cbSandwich2);
        s3 = rootView.findViewById(R.id.cbSandwich3);
        s4 = rootView.findViewById(R.id.cbSandwich4);
        s5 = rootView.findViewById(R.id.cbSandwich5);

        sp1 = rootView.findViewById(R.id.cbSpecialty1);
        sp2 = rootView.findViewById(R.id.cbSpecialty2);
        sp3 = rootView.findViewById(R.id.cbSpecialty3);

        h1 = rootView.findViewById(R.id.cbHotdog1);
        h2 = rootView.findViewById(R.id.cbHotdog2);
        h3 = rootView.findViewById(R.id.cbHotdog3);

        i1 = rootView.findViewById(R.id.cbDessert1);
        i2 = rootView.findViewById(R.id.cbDessert2);
        i3 = rootView.findViewById(R.id.cbDessert3);
        i4 = rootView.findViewById(R.id.cbDessert4);
        i5 = rootView.findViewById(R.id.cbDessert5);
        i6 = rootView.findViewById(R.id.cbDessert6);
        i7 = rootView.findViewById(R.id.cbDessert7);
        i8 = rootView.findViewById(R.id.cbDessert8);
        i9 = rootView.findViewById(R.id.cbDessert9);
        i10 = rootView.findViewById(R.id.cbDessert10);
        isplit = rootView.findViewById(R.id.cbSplit);
        ix2 = rootView.findViewById(R.id.cbDouble);
        ix3 = rootView.findViewById(R.id.cbTriple);
        quart = rootView.findViewById(R.id.cbQuart);
        pint = rootView.findViewById(R.id.cbPint);
        shake = rootView.findViewById(R.id.cbShake);

        sa1 = rootView.findViewById(R.id.cbSalad1);
        sa2 = rootView.findViewById(R.id.cbSalad2);
        sa3 = rootView.findViewById(R.id.cbSalad3);
        sa4 = rootView.findViewById(R.id.cbSalad4);
        sa5 = rootView.findViewById(R.id.cbSalad5);




        checkBoxes.add(c1);
        checkBoxes.add(c2);
        checkBoxes.add(c3);
        checkBoxes.add(c4);
        checkBoxes.add(c5);
        checkBoxes.add(c6);
        checkBoxes.add(c7);
        checkBoxes.add(s1);
        checkBoxes.add(s2);
        checkBoxes.add(s3);
        checkBoxes.add(s4);
        checkBoxes.add(s5);
        checkBoxes.add(sp1);
        checkBoxes.add(sp2);
        checkBoxes.add(sp3);
        checkBoxes.add(h1);
        checkBoxes.add(h2);
        checkBoxes.add(h3);
        checkBoxes.add(i1);
        checkBoxes.add(i2);
        checkBoxes.add(i3);
        checkBoxes.add(i4);
        checkBoxes.add(i5);
        checkBoxes.add(i6);
        checkBoxes.add(i7);
        checkBoxes.add(i8);
        checkBoxes.add(i9);
        checkBoxes.add(i10);
        checkBoxes.add(isplit);
        checkBoxes.add(ix2);
        checkBoxes.add(ix3);
        checkBoxes.add(quart);
        checkBoxes.add(pint);
        checkBoxes.add(shake);
        checkBoxes.add(sa1);
        checkBoxes.add(sa2);
        checkBoxes.add(sa3);
        checkBoxes.add(sa4);
        checkBoxes.add(sa5);



        //contains all of the foods, minus additions and sizing that reside in array lists --- Ben
        //region arrayList adding statements
        //adding statements for the arrayLists
        //adding stuff to combos list
        foodList.add("Combo #1");
        foodList.add("Combo #2");
        foodList.add("Combo #3");
        foodList.add("Combo #4");
        foodList.add("Ritz Combo Basket");
        foodList.add("Cool Deal");
        foodList.add("Itzy Ritzy for Kids");
        //adding stuff to the sandwich arraylist
        foodList.add("Burger");
        foodList.add("Double Ritz");
        foodList.add("Fish Sandwich");
        foodList.add("Chicken Grill");
        foodList.add("World's Best PB&J");
        //specialties list
        foodList.add("World's Best PB&J");
        foodList.add("Shoestring Fries");
        foodList.add("Steamed Vegetables");
        //hotdog list
        foodList.add("All-American Hot Dog");
        foodList.add("Coney Dog");
        foodList.add("Coney Dog with Cheese");
        //desserts
        foodList.add("Vanilla Bean");
        foodList.add("Chocolate Fudge");
        foodList.add("Mint Chip");
        foodList.add("Orange Sherbet");
        foodList.add("Raspberry Sorbet");
        foodList.add("Cookie Dough");
        foodList.add("Strawberry");
        foodList.add("Butter Pecan");
        foodList.add("Caramel Praline");
        foodList.add("Black Forest Cherry");
        //salads list
        foodList.add("Choice Garden Salad");
        foodList.add("Deluxe Garden Salad");
        foodList.add("Side Salad");
        foodList.add("Taco Salad");
        foodList.add("Chicken Salad");
        //endregion


        sandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sandwichSV.setVisibility(View.VISIBLE);
                scroll.setVisibility(View.GONE);
            }
        });

        combos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comboSV.setVisibility(View.VISIBLE);
                scroll.setVisibility(View.GONE);
            }
        });

        specialties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                specialtySV.setVisibility(View.VISIBLE);
                scroll.setVisibility(View.GONE);
            }
        });

        hotdogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hotdogSV.setVisibility(View.VISIBLE);
                scroll.setVisibility(View.GONE);
            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dessertSV.setVisibility(View.VISIBLE);
                scroll.setVisibility(View.GONE);
            }
        });

        salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saladSV.setVisibility(View.VISIBLE);
                scroll.setVisibility(View.GONE);
            }
        });


        //back buttons to return to the menus
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comboSV.setVisibility(View.GONE);
                scroll.setVisibility(View.VISIBLE);

                userOrder.clear();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if(checkBoxes.get(i).isChecked()){
                        String newFood = foodList.get(i);
                        userOrder.add(newFood);
                    }
                }
                String writeToText = "";
                for (int i = 0; i < userOrder.size(); i++) {
                    writeToText += userOrder.get(i) + " ";
                }
                OrderTXT.setText(writeToText);

            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sandwichSV.setVisibility(View.GONE);
                scroll.setVisibility(View.VISIBLE);

                userOrder.clear();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if(checkBoxes.get(i).isChecked()){
                        String newFood = foodList.get(i);
                        userOrder.add(newFood);
                    }
                }
                String writeToText = "";
                for (int i = 0; i < userOrder.size(); i++) {
                    writeToText += userOrder.get(i) + " ";
                }
                OrderTXT.setText(writeToText);
            }
        });

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                specialtySV.setVisibility(View.GONE);
                scroll.setVisibility(View.VISIBLE);

                userOrder.clear();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if(checkBoxes.get(i).isChecked()){
                        String newFood = foodList.get(i);
                        userOrder.add(newFood);
                    }
                }
                String writeToText = "";
                for (int i = 0; i < userOrder.size(); i++) {
                    writeToText += userOrder.get(i) + " ";
                }
                OrderTXT.setText(writeToText);
            }
        });

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hotdogSV.setVisibility(View.GONE);
                scroll.setVisibility(View.VISIBLE);

                userOrder.clear();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if(checkBoxes.get(i).isChecked()){
                        String newFood = foodList.get(i);
                        userOrder.add(newFood);
                    }
                }
                String writeToText = "";
                for (int i = 0; i < userOrder.size(); i++) {
                    writeToText += userOrder.get(i) + " ";
                }
                OrderTXT.setText(writeToText);
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dessertSV.setVisibility(View.GONE);
                scroll.setVisibility(View.VISIBLE);

                userOrder.clear();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if(checkBoxes.get(i).isChecked()){
                        String newFood = foodList.get(i);
                        userOrder.add(newFood);
                    }
                }
                String writeToText = "";
                for (int i = 0; i < userOrder.size(); i++) {
                    writeToText += userOrder.get(i) + " ";
                }
                OrderTXT.setText(writeToText);
            }
        });

        back6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saladSV.setVisibility(View.GONE);
                scroll.setVisibility(View.VISIBLE);

                userOrder.clear();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if(checkBoxes.get(i).isChecked()){
                        String newFood = foodList.get(i);
                        userOrder.add(newFood);
                    }
                }
                String writeToText = "";
                for (int i = 0; i < userOrder.size(); i++) {
                    writeToText += userOrder.get(i) + " ";
                }
                OrderTXT.setText(writeToText);
            }
        });

        toCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), CheckoutActivity.class);

                i.putStringArrayListExtra("userOrder",userOrder);

                startActivity(i);
            }
        });

        //stuff at the bottom, idk what these do though. --- Ben
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        com.example.hdwitzys.databinding.FragmentMenuBinding binding = null;
    }
}