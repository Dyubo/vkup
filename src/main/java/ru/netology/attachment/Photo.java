package ru.netology.attachment;

public class Photo {
    String text;//текст описания фотографии
    private int photoId;//Идентификатор фотографии
    private int albumId;//идентификатор альбома, в котором находиться фотография
    private int ownerId;//идентификатор владельца фотографии
    private int userId;//идентификатор пользователя, загрузившего фотографию
    private int date;//дата добавления
    private int width;//ширина оригинала фотографии в пикселях

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;//высота оригинала фотографии в пикселях
}
