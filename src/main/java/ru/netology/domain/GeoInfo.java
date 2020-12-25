package ru.netology.domain;

public class GeoInfo {
    private int type;//тип места
    private int place;//описание места(если оно добавлено)
    private int coordinates;//координаты места
    private boolean canLeaveAMark;// может ли пользователь оставлять метку

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(int coordinates) {
        this.coordinates = coordinates;
    }

    public boolean isCanLeaveAMark() {
        return canLeaveAMark;
    }

    public void setCanLeaveAMark(boolean canLeaveAMark) {
        this.canLeaveAMark = canLeaveAMark;
    }
}
