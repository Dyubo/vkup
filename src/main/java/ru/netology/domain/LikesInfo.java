package ru.netology.domain;

public class LikesInfo {
    private int count; //количество лайков
    private boolean canLike;// может ли пользователь ставить лайки под постом
    private boolean canPublish; // может ли пользователь сделать репост понравившейся записи



    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
