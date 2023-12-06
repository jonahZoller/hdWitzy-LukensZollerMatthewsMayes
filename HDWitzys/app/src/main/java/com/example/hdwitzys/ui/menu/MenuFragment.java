package com.example.hdwitzys.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hdwitzys.R;
import com.example.hdwitzys.databinding.FragmentMenuBinding;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;

    private Button combos, sandwich, specialties, hotdogs, desserts, salads, back, back2, back3, back4, back5;
    private ScrollView scroll, comboSV, sandwichSV, specialtySV, hotdogSV, dessertSV, saladSV;
    private CheckBox c1, c2, c3, c4, c5, c6, c7, s1, s2, s3 ,s4, s5, sp1, sp2, sp3, h1, h2, h3, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, isplit, ix2, ix3, pint, quart, shake;
    //all of the letters correspond to where the checkboxes are held
    // c = combos | s = sandwiches | sp = specialties | h = hotdogs | i = icecream | sa = salads
    //isplit 


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MenuViewModel galleryViewModel = new ViewModelProvider(this).get(MenuViewModel.class);
        //binding = FragmentMenuBinding.inflate(inflater, container, false);
        View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<String> comboList = new ArrayList<String>();
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<String> sandwichList = new ArrayList<String>();
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<String> specialList = new ArrayList<String>();
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<String> hotdogList = new ArrayList<String>();
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<String> dessertList = new ArrayList<String>();
        @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
        ArrayList<String> saladList = new ArrayList<String>();

        //scroll views (these separate the categories by food)
        scroll = rootView.findViewById(R.id.sv1);
        comboSV = rootView.findViewById(R.id.sv2);
        sandwichSV = rootView.findViewById(R.id.sv3);
        specialtySV = rootView.findViewById(R.id.sv4);
        hotdogSV = rootView.findViewById(R.id.sv5);
        dessertSV = rootView.findViewById(R.id.sv6);


        //buttons
        back = rootView.findViewById(R.id.btnBack);
        back2 = rootView.findViewById(R.id.btnBack2);
        back3 = rootView.findViewById(R.id.btnBack3);
        back4 = rootView.findViewById(R.id.btnBack4);
        back5 = rootView.findViewById(R.id.btnBack5);

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
        //setting combo visible


        //contains all of the foods, minus additions and sizing that reside in array lists --- Ben
        //region arrayList adding statements
        //adding statements for the arrayLists
        //adding stuff to the sandwich arraylist
        sandwichList.add("Hamburger");
        sandwichList.add("Cheeseburger");
        sandwichList.add("Double Ritz");
        sandwichList.add("Fish Sandwich");
        sandwichList.add("Chicken Grill");
        sandwichList.add("World's Best PB&J");
        //adding stuff to combos list
        comboList.add("Combo #1");
        comboList.add("Combo #2");
        comboList.add("Combo #3");
        comboList.add("Combo #4");
        comboList.add("Ritz Combo Basket");
        comboList.add("Cool Deal");
        comboList.add("Itzy Ritzy for Kids");
        //hotdog list
        hotdogList.add("All-American Hot Dog");
        hotdogList.add("Coney Dog");
        hotdogList.add("Coney Dog with Cheese");
        //specialties list
        specialList.add("World's Best PB&J");
        specialList.add("Shoestring Fries");
        specialList.add("Steamed Vegetables");
        //salads list
        saladList.add("Choice Garden Salad");
        saladList.add("Deluxe Garden Salad");
        saladList.add("Side Salad");
        saladList.add("Taco Salad");
        saladList.add("Chicken Salad");
        //desserts
        dessertList.add("Vanilla Bean");
        dessertList.add("Chocolate Fudge");
        dessertList.add("Mint Chip");
        dessertList.add("Orange Sherbet");
        dessertList.add("Raspberry Sorbet");
        dessertList.add("Cookie Dough");
        dessertList.add("Strawberry");
        dessertList.add("Butter Pecan");
        dessertList.add("Caramel Praline");
        dessertList.add("Black Forest Cherry");
        //endregion


        sandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);
                sandwichSV.setVisibility(View.VISIBLE);
            }
        });

        combos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);
                comboSV.setVisibility(View.VISIBLE);
            }
        });

        specialties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);
                specialtySV.setVisibility(View.VISIBLE);
            }
        });

        hotdogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);
                hotdogSV.setVisibility(View.VISIBLE);
            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);
                dessertSV.setVisibility(View.VISIBLE);
            }
        });

        salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);
                saladSV.setVisibility(View.VISIBLE);
            }
        });


        //back buttons to return to the menus
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.VISIBLE);
                comboSV.setVisibility(View.GONE);
                sandwichSV.setVisibility(View.GONE);
                specialtySV.setVisibility(View.GONE);
                hotdogSV.setVisibility(View.GONE);
                dessertSV.setVisibility(View.VISIBLE);
                saladSV.setVisibility(View.VISIBLE);
            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.VISIBLE);
                comboSV.setVisibility(View.GONE);
                sandwichSV.setVisibility(View.GONE);
                specialtySV.setVisibility(View.GONE);
                hotdogSV.setVisibility(View.GONE);
                dessertSV.setVisibility(View.VISIBLE);
                saladSV.setVisibility(View.VISIBLE);
            }
        });

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.VISIBLE);
                comboSV.setVisibility(View.GONE);
                sandwichSV.setVisibility(View.GONE);
                specialtySV.setVisibility(View.GONE);
                hotdogSV.setVisibility(View.GONE);
                dessertSV.setVisibility(View.VISIBLE);
                saladSV.setVisibility(View.VISIBLE);
            }
        });

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.VISIBLE);
                comboSV.setVisibility(View.GONE);
                sandwichSV.setVisibility(View.GONE);
                specialtySV.setVisibility(View.GONE);
                hotdogSV.setVisibility(View.GONE);
                dessertSV.setVisibility(View.VISIBLE);
                saladSV.setVisibility(View.VISIBLE);
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.VISIBLE);
                comboSV.setVisibility(View.GONE);
                sandwichSV.setVisibility(View.GONE);
                specialtySV.setVisibility(View.GONE);
                hotdogSV.setVisibility(View.GONE);
                dessertSV.setVisibility(View.VISIBLE);
                saladSV.setVisibility(View.VISIBLE);
            }
        });

        //stuff at the bottom, idk what these do though. --- Ben
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}