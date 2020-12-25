package ru.netology.attachment;

public class Audio {
    private int audioId;//идентификатор аудиозаписи
    private int ownerId;//идентификатор владельца аудиозаписи
    String artist;//исполнитель
    String title;//название композиции
    private int duration;//длительность аудиозаписи в секундах
    String url;//ссылка на mp3
    private int lyricsId;//идентификатор текста аудиозаписи
    private int albumId;//идентификатор альбома, в котором находится аудиозапись
    private int genreId;//идентификатор жанра из списка аудио жанров
    private int date;//дата добавления
    private int noSearch;//если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLyricsId() {
        return lyricsId;
    }

    public void setLyricsId(int lyricsId) {
        this.lyricsId = lyricsId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getNoSearch() {
        return noSearch;
    }

    public void setNoSearch(int noSearch) {
        this.noSearch = noSearch;
    }

    public int getIsHq() {
        return isHq;
    }

    public void setIsHq(int isHq) {
        this.isHq = isHq;
    }

    private int isHq;//если аудио в высоком качестве
}
