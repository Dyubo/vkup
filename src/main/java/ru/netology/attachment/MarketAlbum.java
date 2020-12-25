package ru.netology.attachment;

public class MarketAlbum {
    private int marketAlbumId;//идентификатор подборки
    private int ownerId;//идентификатор владельца подборки
    String title;//название подборки
    Photo photo;
    private int count;//число товаров в подборке

    public int getMarketAlbumId() {
        return marketAlbumId;
    }

    public void setMarketAlbumId(int marketAlbumId) {
        this.marketAlbumId = marketAlbumId;
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

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }

    private int updateTime;//дата обновления подборки
}
