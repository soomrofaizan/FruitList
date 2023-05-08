package com.example.fruitlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {
    private List<Fruits> fruitList;

    public FruitAdapter(List<Fruits> fruitList) {
        this.fruitList = fruitList;
    }

    @Override
    public FruitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fruit_item, parent, false);
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FruitViewHolder holder, int position) {
        Fruits fruit = fruitList.get(position);
        holder.fruitName.setText("Name: " + fruit.getName());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }

    public static class FruitViewHolder extends RecyclerView.ViewHolder {
        public TextView fruitName;

        public FruitViewHolder(View itemView) {
            super(itemView);
            fruitName = itemView.findViewById(R.id.fruit_name);
        }
    }
}
