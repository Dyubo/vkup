package ru.netology.attachment;

public class Note {
    private int noteId;//идентификатор заметки
    private int ownerId;//идентификатор владельца заметки
    String title;//заголовок заметки
    String text;//текст заметки
    private int date;//дата создания заметки
    private int comments;//количество комментариев
    private int readComments;//количество прочитанных комментариев

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getReadComments() {
        return readComments;
    }

    public void setReadComments(int readComments) {
        this.readComments = readComments;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }

    String viewUrl;//URL страницы для отображения заметки
}
