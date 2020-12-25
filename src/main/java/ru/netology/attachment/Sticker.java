package ru.netology.attachment;

public class Sticker {
    private int productId;//идентификатор набора
    private int sticerId;//идентификатор стикера
    String animationUrl;//URL анимации стикера
    private boolean isAllowed;//информация о том, доступен ли стикер

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSticerId() {
        return sticerId;
    }

    public void setSticerId(int sticerId) {
        this.sticerId = sticerId;
    }

    public String getAnimationUrl() {
        return animationUrl;
    }

    public void setAnimationUrl(String animationUrl) {
        this.animationUrl = animationUrl;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean allowed) {
        isAllowed = allowed;
    }
}
