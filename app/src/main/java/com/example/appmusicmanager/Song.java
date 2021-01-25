package com.example.appmusicmanager;


public class Song {

    private String Title;
    private int File;

    public Song(String title, int file){
        Title = title;
        File = file;
    }

    public String getTitle(){
        return (Title);
    }

    public void setTitle(String Tille){
        this.Title = Tille;
    }

    public int getFile(){
        return (File);
    }

    public void setFile(int File){
        this.File = File;
    }
}
