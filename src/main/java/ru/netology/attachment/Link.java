package ru.netology.attachment;

public class Link {
    String url;//URL ссылки
    String title;//заголовок ссылки
    String caption;//подпись ссылки
    String description;//описание ссылки
    String previewPage;//идентификатор вики-страницы с контентом для предпросмотра содержимого страницы
    String previewUrl;//URL страницы с контентом для предпросмотра содержимого страницы
    Photo photo;
    Product product;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreviewPage() {
        return previewPage;
    }

    public void setPreviewPage(String previewPage) {
        this.previewPage = previewPage;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Buttom getButtom() {
        return buttom;
    }

    public void setButtom(Buttom buttom) {
        this.buttom = buttom;
    }

    Buttom buttom;


}
