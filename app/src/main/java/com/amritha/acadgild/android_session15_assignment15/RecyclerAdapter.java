package com.amritha.acadgild.android_session15_assignment15;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Amritha on 3/26/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    //creating Arrays of String Different Android Versions

    private String[] item = {
            "Alpha",
            "Beta",
            "CupCake",
            "Donut",
            "Eclair",
            "Froyo",
            "Gingerbread",
            "Honeycomb",
            "Ice Cream Sandwich",
            "Jellybean",
            "KitKat",
            "Lollipop",
            "Marshmallow",
            "Nougat",
            "Oreo"
    };

    //creating new class ViewHolder extends RecyclerView

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTitle;//initializing TextView

        public ViewHolder(View itemView) {
            super(itemView);

            itemTitle = itemView.findViewById(R.id.item_title);//finding id from card_layout

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //inflating the cardLayout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);//creating instance of ViewHolder

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        viewHolder.itemTitle.setText(item[position]);//Getting position for items and setting to Textview

    }

    @Override
    public int getItemCount() {
        return item.length;
    }//counting Array length


}
