package ru.netology.domain;

public class Post {
    String text; // текст поста
    int postId; // айди поста
    int spaceOwnerId; // айди пространства где размещен пост
    int ownerSpaceUserId; // айди владельца, где размешен пост
    int wroteUserId; // айди того кто написал пост
    int date; // когда размещен пост
    int createdBy;// идентификатор администратора который опубликовал запись
    int replyOwnerId;//идентификатор владельца записи, в ответ на которую была оставлена текущая
    int replyPostId;//идентификатор записи, в ответ на которую была оставлена текущая
    int friendsOnly;//если запись была создана с опцией «Только для друзей»


    boolean canEdit; //может ли пользователь редактировать пост
    boolean canDelete; //может ли пользователь удалять пост
    boolean canPin;// может ли текущий пользователь закреплять запись
    boolean IsPinned;//информация о том, закреплена ли запись
    LikesInfo likesInfo;
    CommentsInfo commentsInfo;
    Repostinfo repostinfo;
    DislikesInfo dislikesInfo;
    ViewsInfo viewsInfo;
    GeoInfo geoInfo;

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isPinned() {
        return IsPinned;
    }

    public void setPinned(boolean pinned) {
        IsPinned = pinned;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getSpaceOwnerId() {
        return spaceOwnerId;
    }

    public void setSpaceOwnerId(int spaceOwnerId) {
        this.spaceOwnerId = spaceOwnerId;
    }

    public int getOwnerSpaceUserId() {
        return ownerSpaceUserId;
    }

    public void setOwnerSpaceUserId(int ownerSpaceUserId) {
        this.ownerSpaceUserId = ownerSpaceUserId;
    }

    public int getWroteUserId() {
        return wroteUserId;
    }

    public void setWroteUserId(int wroteUserId) {
        this.wroteUserId = wroteUserId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Repostinfo getRepostinfo() {
        return repostinfo;
    }

    public void setRepostinfo(Repostinfo repostinfo) {
        this.repostinfo = repostinfo;
    }

    public DislikesInfo getDislikesInfo() {
        return dislikesInfo;
    }

    public void setDislikesInfo(DislikesInfo dislikesInfo) {
        this.dislikesInfo = dislikesInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}
