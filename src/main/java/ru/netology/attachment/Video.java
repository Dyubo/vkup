package ru.netology.attachment;

public class Video {
    private int videoId;//идентификатор видеозаписи.
    private int ownerId;//идентификатор владельца видеозаписи.
    String title;// название видеозаписи.
    String description;//текст описания видеозаписи.
    private int duration;//длительность ролика в секундах
    private int date;//дата создания видеозаписи
    private int addingDate;//дата добавления видеозаписи пользователем или группой
    private int viewsInfo;//количество просмотров видеозаписи
    private int localViews;//Если видео внешнее, количество просмотров в ВК
    private int commentsInfo;//количество комментариев к видеозаписи
    String playersInfo;//URL страницы с плеером
    String platform;//название платформы (для видеозаписей, добавленных с внешних сайтов)
    private int canEdit;//поле возвращается, если пользователь может редактировать видеозапись
    private boolean canAdd;//Может ли пользователь добавить видеозапись к себе
    private int isPrivate;//поле возвращается, если видеозапись приватная
    String accessKey;//ключ доступа к объекту
    private int processing;//поле возвращается в том случае, если видеоролик находится в процессе обработки
    private boolean isFavorite;//true, если объект добавлен в закладки у текущего пользователя
    private boolean canComment;//Может ли пользователь комментировать видео
    private boolean canUserEdit;//Может ли пользователь редактировать видео
    private boolean canLike;//Может ли пользователь добавить видео в список <<Мне нравится>>
    private boolean canRepost;//Может ли пользователь сделать репост видео
    private boolean canSubscribe;//Может ли пользователь подписаться на автора видео
    private boolean canAddToFaves;//Может ли пользователь добавить видео в избранное
    private boolean attachLink;//Может ли пользователь прикрепить кнопку действия к видео
    private int width;//Ширина видео
    private int height;//Высота видео
    private int userId;//Идентификатор пользователя, загрузившего видео
    private boolean converting;//Конвертируется ли видео
    private boolean added;//Добавлено ли видео в альбомы пользователя
    private boolean isSubscribe;//Подписан ли пользователь на автора видео
    private int repeat;//поле возвращается в том случае, если видео зациклено
    String type;//Тип видеозаписи
    String liveStatus;//Статус прямой трансляции
    private int live;//поле возвращается в том случае, если видеозапись является прямой трансляцией
    private int upcoming;//Поле свидетельствует о том, что трансляция скоро начнётся
    private int spectatorsInfo;//Количество зрителей прямой трансляции
    LikesInfo likesInfo;//
    Reposts reposts;//

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(int addingDate) {
        this.addingDate = addingDate;
    }

    public int getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(int viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public int getLocalViews() {
        return localViews;
    }

    public void setLocalViews(int localViews) {
        this.localViews = localViews;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public String getPlayersInfo() {
        return playersInfo;
    }

    public void setPlayersInfo(String playersInfo) {
        this.playersInfo = playersInfo;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanAdd() {
        return canAdd;
    }

    public void setCanAdd(boolean canAdd) {
        this.canAdd = canAdd;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public int getProcessing() {
        return processing;
    }

    public void setProcessing(int processing) {
        this.processing = processing;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanUserEdit() {
        return canUserEdit;
    }

    public void setCanUserEdit(boolean canUserEdit) {
        this.canUserEdit = canUserEdit;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(boolean canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public boolean isCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(boolean canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public boolean isAttachLink() {
        return attachLink;
    }

    public void setAttachLink(boolean attachLink) {
        this.attachLink = attachLink;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isConverting() {
        return converting;
    }

    public void setConverting(boolean converting) {
        this.converting = converting;
    }

    public boolean isAdded() {
        return added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public boolean isSubscribe() {
        return isSubscribe;
    }

    public void setSubscribe(boolean subscribe) {
        isSubscribe = subscribe;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int upcoming) {
        this.upcoming = upcoming;
    }

    public int getSpectatorsInfo() {
        return spectatorsInfo;
    }

    public void setSpectatorsInfo(int spectatorsInfo) {
        this.spectatorsInfo = spectatorsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }
}
