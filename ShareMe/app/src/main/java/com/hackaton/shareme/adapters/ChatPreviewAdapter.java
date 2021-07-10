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

public class ChatPreviewAdapter extends RecyclerView.Adapter<ChatPreviewAdapter.Viewholder> {

    private Context context;
    private ArrayList<ChatPreviewModel> nearbyPersonModelArrayList;
    private OnItemListener mOnItemListener;

    // Constructor
    public ChatPreviewAdapter(Context context, ArrayList<ChatPreviewModel> nearbyPersonModelArrayList,OnItemListener listener) {
        this.context = context;
        this.nearbyPersonModelArrayList = nearbyPersonModelArrayList;
        this.mOnItemListener=listener;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view,mOnItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        ChatPreviewModel model = nearbyPersonModelArrayList.get(position);
        holder.courseNameTV.setText(model.getPerson());
        holder.courseRatingTV.setText(model.getLast_msg());
    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return nearbyPersonModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public static class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView courseNameTV, courseRatingTV;
        OnItemListener onItemListener;

        public Viewholder(@NonNull View itemView, OnItemListener Listener) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseRatingTV = itemView.findViewById(R.id.idTVCourseRating);
            onItemListener=Listener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onItemListener.onItemClick(getAdapterPosition());

        }
    }
    public interface OnItemListener{
        void onItemClick(int position);
    }
}