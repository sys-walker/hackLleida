package com.hackaton.shareme.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hackaton.shareme.R;

import java.util.ArrayList;

public class ItemSharedAdapter extends RecyclerView.Adapter<ItemSharedAdapter.Viewholder> {

    private Context context;
    private ArrayList<ItemSharedModel> nearbyPersonModelArrayList;

    // Constructor
    public ItemSharedAdapter(Context context, ArrayList<ItemSharedModel> nearbyPersonModelArrayList) {
        this.context = context;
        this.nearbyPersonModelArrayList = nearbyPersonModelArrayList;
    }

    @NonNull
    @Override
    public ItemSharedAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemSharedAdapter.Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        ItemSharedModel model = nearbyPersonModelArrayList.get(position);
        holder.courseNameTV.setText(model.getPerson_object());
        holder.courseRatingTV.setText("" + model.getPerson_owner());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return nearbyPersonModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public static class Viewholder extends RecyclerView.ViewHolder {
        private TextView courseNameTV, courseRatingTV;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseRatingTV = itemView.findViewById(R.id.idTVCourseRating);
        }
    }
}