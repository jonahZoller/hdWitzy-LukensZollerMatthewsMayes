package com.example.hdwitzys.ui.locations;

import static java.nio.file.Files.find;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hdwitzys.R;
import com.example.hdwitzys.databinding.FragmentLocationsBinding;

public class LocationsFragment extends Fragment {

    private FragmentLocationsBinding binding;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LocationsViewModel slideshowViewModel =
                new ViewModelProvider(this).get(LocationsViewModel.class);

        binding = FragmentLocationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;

    }

    private void setContentView(WebView myWebView) {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}