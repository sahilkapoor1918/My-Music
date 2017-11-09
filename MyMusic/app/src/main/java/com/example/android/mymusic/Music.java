package com.example.android.mymusic;


/**
 * Created by SahilKapoor on 01-11-2017.
 */

public class Music {

    private String mArtist;
    private String mSong;

    public Music(String artist, String song) {
        mArtist = artist;
        mSong = song;
    }

    public Music(String artist) {
        mArtist = artist;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getSong() {
        return mSong;
    }

}
