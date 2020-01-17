package com.example.appudaraz.modal;

public class CollectionModal {

    private String collection_id;

    public String getCollection_id() {
        return collection_id;
    }

    public void setCollection_id(String collection_id) {
        this.collection_id = collection_id;
    }

    public String getC_title() {
        return c_title;
    }

    public void setC_title(String c_title) {
        this.c_title = c_title;
    }

    public String getC_intro() {
        return c_intro;
    }

    public void setC_intro(String c_intro) {
        this.c_intro = c_intro;
    }

    public String getImage() {
        return image;
    }

    private String c_title;
    private String c_intro;
    private String image;
    private String background;



    public void setImage(String image) {
        this.image = image;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }


}