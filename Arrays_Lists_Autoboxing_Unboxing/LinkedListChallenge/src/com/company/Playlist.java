package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    LinkedList<Song> playlist;
    ArrayList<Album> albums;
    private String name;

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedList<Song>();
        this.albums = new ArrayList<Album>();
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public boolean addSongToPlaylist(Song song) {
        if(findSongInAlbum(song)) {
            this.playlist.add(song);
            return true;
        }
        return false;
    }

    public boolean removeSongFromPlaylist(Song song) {
        if(findSongInPlaylist(song)) {
            this.playlist.remove(song);
            return true;
        }
        return false;
    }

    private boolean findSongInPlaylist(Song song) {
        for(int i = 0; i < playlist.size(); i++) {
            if(playlist.get(i).equals(song)) {
                return true;
            }
        }
        return false;
    }

    private boolean findSongInAlbum(Song song) {
        for(int i = 0; i < albums.size(); i++) {
            ArrayList<Song> songsCheck = albums.get(i).getSongs();
            for(int j = 0; j < songsCheck.size(); j++) {
                Song currentSong = songsCheck.get(j);
                if (currentSong == song) {
                    return true;
                }
            }
        }
        return false;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }
}
