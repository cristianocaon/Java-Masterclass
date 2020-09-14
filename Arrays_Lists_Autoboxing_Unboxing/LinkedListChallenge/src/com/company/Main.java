package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("song1", 3.5);
        Song song2 = new Song("song2", 4.5);
        Song song3 = new Song("song3", 2.5);
        Song song4 = new Song("song4", 3.0);

        Album album1 = new Album("Album1");
        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);
        album1.addSongToAlbum(song3);
        album1.addSongToAlbum(song4);

        Song song5 = new Song("song5", 3.5);
        Song song6 = new Song("song6", 4.5);
        Song song7 = new Song("song7", 2.5);
        Song song8 = new Song("song8", 3.0);

        Album album2 = new Album("Album2");
        album1.addSongToAlbum(song5);
        album1.addSongToAlbum(song6);
        album1.addSongToAlbum(song7);
        album1.addSongToAlbum(song8);

        Playlist playlist = new Playlist("My Playlist");
        playlist.addAlbum(album1);
        playlist.addAlbum(album2);

        playlist.addSongToPlaylist(song1);
        playlist.addSongToPlaylist(song4);
        playlist.addSongToPlaylist(song8);
        playlist.addSongToPlaylist(song7);

        play(playlist.getPlaylist());
    }

    private static void menu() {
        System.out.println("Available options: \nPress");
        System.out.println("1- Skip to next song");
        System.out.println("2- Go to previous song");
        System.out.println("3- Replay current song");
        System.out.println("4- List songs in Playlist");
        System.out.println("5- Remove current song from Playlist");
        System.out.println("0- Exit");
        System.out.print("Enter: ");

    }

    private static void play(LinkedList<Song> playlist) {

        boolean quit = false;
        boolean goingForward = true;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playlist.listIterator();

        if(playlist.isEmpty()) {
            System.out.println("\nNo songs in playlist.");
            return;
        } else {
            System.out.println("\nNow playing: " + listIterator.next().getTitle());
        }

        while(!quit) {
            menu();
            int choice = scanner.nextInt();
//            scanner.nextLine();

            switch(choice) {
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("\nNow playing: " + listIterator.next().getTitle());
                    } else {
                        System.out.println("\nNow playing: " + listIterator.previous().getTitle());
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("\nNow playing: " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("\nNow playing: " + listIterator.next().getTitle());
                        goingForward = true;
                    }
                    break;
                case 3:
                    if(listIterator.hasPrevious()) {
                        System.out.println("\nPlaying again: " + listIterator.previous().getTitle());
                    }
                    break;
                case 4:
                    System.out.println("\nSongs in playlist: ");
                    for(int i = 0; i < playlist.size(); i++) {
                        System.out.println("Song #" + (i+1) + ": " + playlist.get(i).getTitle());
                    }
                    break;
                case 5:
                    System.out.println("\nRemoving current song");
                    listIterator.remove();
                    break;
                case 0:
                    quit = true;
                    System.out.println("\nExiting...");
                    break;
            }
        }
    }
}
