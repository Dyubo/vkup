package ru.netology.attachment;

public class Page {
    private int pageId;//идентификатор вики-страницы
    private int groupId;//идентификатор группы, которой принадлежит вики-страница

    public int getPageId() {
        return pageId;
    }

    public void setPageId(int pageId) {
        this.pageId = pageId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;//название вики-страницы
}
