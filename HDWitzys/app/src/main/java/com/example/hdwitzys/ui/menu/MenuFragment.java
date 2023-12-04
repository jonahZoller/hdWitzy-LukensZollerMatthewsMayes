package com.example.hdwitzys.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hdwitzys.R;
import com.example.hdwitzys.databinding.FragmentMenuBinding;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;

    private Button combos;
    private Button sandwich;
    private Button specialties;
    private Button hotdogs;
    private Button desserts;
    private Button salads;
    private ScrollView scroll;
    private LinearLayout comboTest;


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

        scroll = rootView.findViewById(R.id.sv1);
        comboTest = rootView.findViewById(R.id.ll)

        sandwich = rootView.findViewById(R.id.sandwichBTN);
        combos = rootView.findViewById(R.id.comboBTN);
        specialties = rootView.findViewById(R.id.specialtiesBTN);
        hotdogs = rootView.findViewById(R.id.hotdogsBTN);
        desserts = rootView.findViewById(R.id.dessertBTN);
        salads = rootView.findViewById(R.id.saladBTN);

        //setting the scroll view back to visible
        scroll.setVisibility(View.VISIBLE);
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

            }
        });

        combos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);

            }
        });

        specialties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scroll.setVisibility(View.GONE);

            }
        });

        hotdogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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