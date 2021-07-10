package com.hackaton.shareme.ui.searchnearby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hackaton.shareme.R;
import com.hackaton.shareme.adapters.ItemSharedAdapter;
import com.hackaton.shareme.adapters.ItemSharedModel;
import com.hackaton.shareme.adapters.NearbyPeopleAdapter;
import com.hackaton.shareme.adapters.NearbyPersonModel;
import com.hackaton.shareme.databinding.FragmentSearchnearbyBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SearchNearbyFragment extends Fragment {

    private FragmentSearchnearbyBinding binding;
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<ItemSharedModel> ItemSharedModelArrayList;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSearchnearbyBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        courseRV = view.findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        ItemSharedModelArrayList = new ArrayList<>();
        ItemSharedModelArrayList.add(new ItemSharedModel("Escales", "John Doe"));
        ItemSharedModelArrayList.add(new ItemSharedModel("Paelles", "Erick Doe"));
        ItemSharedModelArrayList.add(new ItemSharedModel("Taladre", "Jane Doe"));
        ItemSharedModelArrayList.add(new ItemSharedModel("Tisores de podar", "Albert Doe"));



        // we are initializing our adapter class and passing our arraylist to it.
        ItemSharedAdapter nearbyPeopleAdapter = new ItemSharedAdapter(getActivity(), ItemSharedModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(nearbyPeopleAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}