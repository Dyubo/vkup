package ru.netology.attachment;

public class PostedPhoto {
    private int photoId;//идентификатор фотографии
    private int ownerId;//идентификатор владельца фотографии
    String photo130;//URL изображения для предпросмотра.

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto604l() {
        return photo604l;
    }

    public void setPhoto604l(String photo604l) {
        this.photo604l = photo604l;
    }

    String photo604l;//URL полноразмерного изображения.
}
