package com.example.annagueyte.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oc.rss.fake.FakeNews;
import java.util.List;

/**
 * Created by annagueyte on 05/11/2016.
 */


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final List<FakeNews> list;

    public MyAdapter(List<FakeNews> list) {
        this.list = list;
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    //cette fonction permet de créer les viewHolder
    //et par la même indiquer la vue à inflater (à partir des layout xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_cell, parent, false);
        return new MyViewHolder(view);
    }

    //c'est ici que nous allons remplir notre cellule avec le texte/image de chaque FakeNews
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    }

