package org.example;

public class User {
    private String[] favoriteApps;

    public void setFavoriteApps(String[] favoriteApps) {
        this.favoriteApps = favoriteApps;
    }

    public void showApps(){
        for(String s : favoriteApps){
            System.out.println(s);
        }
    }

}
