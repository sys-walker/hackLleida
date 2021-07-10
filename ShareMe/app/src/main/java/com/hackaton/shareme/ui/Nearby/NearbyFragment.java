package com.hackaton.shareme.ui.Nearby;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hackaton.shareme.adapters.NearbyPeopleAdapter;
import com.hackaton.shareme.adapters.NearbyPersonModel;
import com.hackaton.shareme.R;
import com.hackaton.shareme.databinding.FragmentNearbyBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class NearbyFragment extends Fragment {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<NearbyPersonModel> nearbyPersonModelArrayList;


    private FragmentNearbyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentNearbyBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        courseRV = view.findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        nearbyPersonModelArrayList = new ArrayList<>();
        nearbyPersonModelArrayList.add(new NearbyPersonModel("John Doe", 8));
        nearbyPersonModelArrayList.add(new NearbyPersonModel("Erick Doe", 3));
        nearbyPersonModelArrayList.add(new NearbyPersonModel("Jane Doe", 10));
        nearbyPersonModelArrayList.add(new NearbyPersonModel("Albert Doe", 5));
        nearbyPersonModelArrayList.add(new NearbyPersonModel("Katherine Doe", 8));
        nearbyPersonModelArrayList.add(new NearbyPersonModel("ELisabeth Doe", 8));
        nearbyPersonModelArrayList.add(new NearbyPersonModel("Hector Doe", 7));

        // we are initializing our adapter class and passing our arraylist to it.
        NearbyPeopleAdapter nearbyPeopleAdapter = new NearbyPeopleAdapter(getActivity(), nearbyPersonModelArrayList);

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