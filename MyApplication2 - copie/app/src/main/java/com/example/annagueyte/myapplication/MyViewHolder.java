package com.example.annagueyte.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.oc.rss.fake.FakeNews;


/**
 * Created by annagueyte on 05/11/2016.
 */

public /*static*/ class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final TextView title;
    private FakeNews fakenews;


    //itemView est la vue correspondante à 1 cellule

    public MyViewHolder(View itemView) {
        super(itemView);

        //c'est ici que l'on fait nos findView

        title = (TextView) itemView.findViewById(R.id.title);

        itemView.setOnClickListener(this);
    }

    public void bind(FakeNews news) {
        fakenews = news;
        title.setText(news.title);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), ArticleActivity.class);
        intent.putExtra(ArticleActivity.article_title, fakenews.title);
        intent.putExtra(ArticleActivity.htmlcontent, fakenews.htmlContent);
        view.getContext().startActivity(intent);
    }
}


