package ru.netology.attachment;

public class Event {
    private int eventId;//идентификатор встречи
    private int time;//время начала встречи
    private boolean memberStatus;//идёт ли текущий пользователь на встречу
    private boolean isFavorite;//добавлена ли встреча в закладки
    String address;//место проведения встречи
    String text;//текст для отображения сниппета
    String buttonText;//текст на кнопке сниппета

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(boolean memberStatus) {
        this.memberStatus = memberStatus;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public int getFriendsInfo() {
        return FriendsInfo;
    }

    public void setFriendsInfo(int friendsInfo) {
        FriendsInfo = friendsInfo;
    }

    private int FriendsInfo;//список идентификаторов друзей, которые также идут на мероприятие
}
