package ru.netology.domain;

public class CommentsInfo {
    private int count; // количество комментариев под постом
    private boolean canPost; // может ли пользователь, оставлять комментарии под постом

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
