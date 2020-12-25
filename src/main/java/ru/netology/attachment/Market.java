package ru.netology.attachment;

public class Market {
    private int marketId;//идентификатор товара
    private int ownerId;//идентификатор владельца товара
    String title;//название товара
    String description;//текст описания товара
    Price price;
    Dimensions dimensions;
    private int weight;//вес в граммах
    Category category;
    String thumbPhoto;//URL изображения-обложки товара
    private int date;//дата создания товара
    private int availAbility;//статус доступности товара
    private boolean isFavorite;//true, если объект добавлен в закладки у текущего пользователя

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
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

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getThumbPhoto() {
        return thumbPhoto;
    }

    public void setThumbPhoto(String thumbPhoto) {
        this.thumbPhoto = thumbPhoto;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAvailAbility() {
        return availAbility;
    }

    public void setAvailAbility(int availAbility) {
        this.availAbility = availAbility;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    String sku;//артикул товара



}
