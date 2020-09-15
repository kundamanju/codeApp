package com.codeGama.codegamatest.ModelClass;

public class ClsVideosCategoryModel {
    Integer image;
    String videoID;

    public ClsVideosCategoryModel(Integer num) {
        this.image = num;

    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }
}
