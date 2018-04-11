package com.example.android.myapplicationrecyclerview.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.android.myapplicationrecyclerview.R;

/**
 * Created by ASUS on 4/10/2018.
 */

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.ViewHolder> {

    ViewHolder viewHolder;
    Context context;

    public CarsAdapter(Context context){
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contentView = inflater.inflate(R.layout.cars_item,parent,false);

        viewHolder = new ViewHolder(contentView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        TextView tvName = holder.tvName;
        CardView cardView = holder.cvItems;

        switch(position){
            case 0:{
                tvName.setText(context.getString(R.string.item1));
                break;
            }
            case 1:{
                tvName.setText(context.getString(R.string.item2));
                break;
            }
            case 2:{
                tvName.setText(context.getString(R.string.item3));
                break;
            }
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        CardView cvItems;

        public ViewHolder(View itemView){
            super(itemView);

            tvName = (TextView) itemView.findViewById(R.id.tvName);
            cvItems = (CardView) itemView.findViewById(R.id.cvItems);
        }

    }
}
