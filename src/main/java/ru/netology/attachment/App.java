package ru.netology.attachment;

public class App {
    private int appId;//идентификатор приложения
    private int name;//название приложения
    String photo130;//URL изображения для предпросмотра

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
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
