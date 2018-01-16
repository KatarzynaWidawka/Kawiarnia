package com.example.widaw.kawiarnia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
/**
 * Created by widaw on 16.01.2018.
 */

public class CoffeeAdapter  extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {
    ArrayList<Coffee> coffees = new ArrayList<>();
    CoffeeAdapter(ArrayList<Coffee> coffees) {
        this.coffees = coffees;    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(CoffeeAdapter.ViewHolder holder, int position) {

        holder.setNazwaKawy(coffees.get(position).getNazwaKawy());

    }

    @Override
    public int getItemCount() {
        return coffees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.kawa)
        TextView Kawa;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);}

            public void setNazwaKawy(String NazwaKawy){Kawa.setText(NazwaKawy);}

    }
}
