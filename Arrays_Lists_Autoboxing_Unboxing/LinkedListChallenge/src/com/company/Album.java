package com.company;

import java.util.ArrayList;

public class Album {
    ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        songs = new ArrayList<Song>();
        this.name = name;
    }

    public boolean addSongToAlbum(Song song) {
        songs.add(song);
        return true;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
