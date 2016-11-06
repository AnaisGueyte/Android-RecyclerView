package com.example.annagueyte.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.oc.rss.fake.FakeNews;
import com.oc.rss.fake.FakeNewsList;

import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Les news du Gorafi");


        final RecyclerView rv = (RecyclerView) findViewById(R.id.list);

        // Le LinearLayoutManager est l’objet responsable, au sein du
        // RecyclerView, d’afficher les vues verticalement, de haut en bas.

        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        // L’adapter est une classe que vous devez coder vous-mêmes, et qui
        // est responsable du contenu et des vues qui l’affichent. Voici le code de
        // l’adapter utilisé dans la vidéo :

        List<FakeNews> list = FakeNewsList.all;

        rv.setAdapter(new MyAdapter(list));



    }

}
