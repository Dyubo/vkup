package ru.netology.attachment;

public class Doc {
    private int docId;//идентификатор документа
    private int ownerId;//идентификатор пользователя, загрузившего документ
    String title;//название документа
    private int size;//размер документа в байтах
    private int ext;//расширение документа
    String url;//адрес документа, по которому его можно загрузить
    private int date;//дата добавления в формате

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getExt() {
        return ext;
    }

    public void setExt(int ext) {
        this.ext = ext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int type;//тип документа

}
