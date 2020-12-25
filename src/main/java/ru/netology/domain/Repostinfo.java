package ru.netology.domain;

public class Repostinfo {
    private int count; // количество репостов
    private boolean canRepostUser; // может ли пользователь делать репост, поста

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanRepostUser() {
        return canRepostUser;
    }

    public void setCanRepostUser(boolean canRepostUser) {
        this.canRepostUser = canRepostUser;
    }
}
