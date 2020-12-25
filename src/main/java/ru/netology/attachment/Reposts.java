package ru.netology.attachment;

public class Reposts {
    private int count;//Счетчик общего количества репостов
    private int wallCount;//Счетчик репостов на стену
    private int mailCount;//Счетчик репостов в личные сообщения

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWallCount() {
        return wallCount;
    }

    public void setWallCount(int wallCount) {
        this.wallCount = wallCount;
    }

    public int getMailCount() {
        return mailCount;
    }

    public void setMailCount(int mailCount) {
        this.mailCount = mailCount;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    private int userReposted;//Информация о том, сделал ли текущий пользователь репост этого видео

}
