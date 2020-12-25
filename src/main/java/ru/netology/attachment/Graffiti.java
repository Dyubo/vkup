package ru.netology.attachment;

public class Graffiti {
    private int graffitiId;//идентификатор граффити
    private int ownerId;//идентификатор автора граффити
    String photo130;//URL изображения для предпросмотра

    public int getGraffitiId() {
        return graffitiId;
    }

    public void setGraffitiId(int graffitiId) {
        this.graffitiId = graffitiId;
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

    public String getPhoto604() {
        return photo604;
    }

    public void setPhoto604(String photo604) {
        this.photo604 = photo604;
    }

    String photo604;//URL полноразмерного изображения

}
