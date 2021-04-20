package com.example.testrecyclerview;

import java.util.ArrayList;

public class Donnee {

    private String principal;
    private String auxiliaire;
    private int image;

    public Donnee(String text1, String text2, int image) {
        principal = text1;
        auxiliaire = text2;
        image = image;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getAuxiliaire() {
        return auxiliaire;
    }

    public int getImage(int automne) {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
