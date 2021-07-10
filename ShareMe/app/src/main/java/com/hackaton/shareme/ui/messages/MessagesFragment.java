package com.hackaton.shareme.ui.messages;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hackaton.shareme.R;
import com.hackaton.shareme.adapters.ChatPreviewAdapter;
import com.hackaton.shareme.adapters.ChatPreviewModel;
import com.hackaton.shareme.adapters.NearbyPeopleAdapter;
import com.hackaton.shareme.adapters.NearbyPersonModel;
import com.hackaton.shareme.databinding.FragmentMessagesBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MessagesFragment extends Fragment implements ChatPreviewAdapter.OnItemListener {
    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<ChatPreviewModel> nearbyPersonModelArrayList;


    private FragmentMessagesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentMessagesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        courseRV = view.findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        nearbyPersonModelArrayList = new ArrayList<>();
        nearbyPersonModelArrayList.add(new ChatPreviewModel("John Doe", "Vale guaii quedem així"));

        // we are initializing our adapter class and passing our arraylist to it.
        ChatPreviewAdapter nearbyPeopleAdapter = new ChatPreviewAdapter(getContext(), nearbyPersonModelArrayList,this);

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

    @Override
    public void onItemClick(int position) {
        nearbyPersonModelArrayList.get(position);
        Intent intent = new Intent(getActivity(),ChatExample.class);
        startActivity(intent);

    }
}