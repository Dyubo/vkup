package ru.netology.domain;

public class Post {
    String text; // текст поста
    int postId; // айди поста
    int spaceOwnerId; // айди пространства где размещен пост
    int ownerSpaceUserId; // айди владельца, где размешен пост
    int wroteUserId; // айди того кто написал пост
    int date; // когда размещен пост
    boolean canEdit;
    boolean canDelete;
    LikesInfo likesInfo;
    CommentsInfo commentsInfo;
    Repostinfo repostinfo;
    DislikesInfo dislikesInfo;
    ViewsInfo viewsInfo;

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
