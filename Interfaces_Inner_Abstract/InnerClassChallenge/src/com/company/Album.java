package com.company;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playlist) {
        Song checkedSong = this.songList.findSong(trackNumber);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, List<Song> playlist) {
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }

    public boolean addSong(String title, double duration) {
        return this.songList.addSong(new Song(title, duration));
    }

    private class SongList {
        private List<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for(Song checkSong: this.songs) {
                if(checkSong.getTitle().equals(title)) {
                    return checkSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if((index >=0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }

        public List<Song> getSongs() {
            return songs;
        }
    }
}
