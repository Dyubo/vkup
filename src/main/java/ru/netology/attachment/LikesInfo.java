package ru.netology.attachment;

public class LikesInfo {
    private int count;//Количество лайков

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikesInfo() {
        return userLikesInfo;
    }

    public void setUserLikesInfo(boolean userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }

    private boolean userLikesInfo;//Добавлено ли видео в список <<Мне нравится>> текущего пользователя
}
