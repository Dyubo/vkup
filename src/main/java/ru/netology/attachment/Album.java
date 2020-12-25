package ru.netology.attachment;

public class Album {
    private int albumId;//идентификатор альбома
    private int thumbs;//обложка альбома
    private int ownerId;//идентификатор владельца альбома
    String title;//название альбома
    String description;//описание альбома
    private int created;//дата создания альбома
    private int update;//дата последнего обновления альбома

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getThumbs() {
        return thumbs;
    }

    public void setThumbs(int thumbs) {
        this.thumbs = thumbs;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getUpdate() {
        return update;
    }

    public void setUpdate(int update) {
        this.update = update;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int size;//количество фотографий в альбоме
}
