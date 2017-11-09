package com.example.android.mymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        final ArrayList<Music> music = new ArrayList<Music>();

        music.add(new Music("Atif Aslam"));
        music.add(new Music("Gippy Grewal"));
        music.add(new Music("Charlie Puth"));
        music.add(new Music("Pav Dharia"));

        MusicAdapter album = new MusicAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(album);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent intent1 = new Intent(ArtistsActivity.this, HoorSongActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(ArtistsActivity.this, CarNachdiSongActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(ArtistsActivity.this, AttentionSongActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(ArtistsActivity.this, NajaSongActivity.class);
                        startActivity(intent4);
                        break;
                }
            }
        });

        TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArtistsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
