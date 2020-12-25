package ru.netology.domain;

public class DislikesInfo {
    private int count; // количество дизлайков
    private boolean canDislike; // может ли пользователь ставить дизлайки под постом

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanDislike() {
        return canDislike;
    }

    public void setCanDislike(boolean canDislike) {
        this.canDislike = canDislike;
    }
}
