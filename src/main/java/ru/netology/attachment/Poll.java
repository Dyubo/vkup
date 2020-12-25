package ru.netology.attachment;

public class Poll {
    private int pollId;//идентификатор опроса для получения информации о нем через метод polls.getById.
    private int ownerId;//идентификатор владельца опроса
    private int created;//дата создания
    String question;//текст вопроса
    private int votes;//количество голосов
    private boolean anonymous;//является ли опрос анонимным
    private boolean multiple;//допускает ли опрос выбор нескольких вариантов ответа
    private int andDate;//дата завершения опроса
    private boolean closed;//является ли опрос завершенным
    private boolean isBoard;//прикреплён ли опрос к обсуждению
    private boolean canEdit;//можно ли отредактировать опрос
    private boolean canVote;//можно ли проголосовать в опросе
    private boolean canReport;//можно ли пожаловаться на опрос
    private boolean canShare;//можно ли поделиться опросом
    private int authorId;//идентификатор автора опроса
    Photo photo;

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public int getAndDate() {
        return andDate;
    }

    public void setAndDate(int andDate) {
        this.andDate = andDate;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isBoard() {
        return isBoard;
    }

    public void setBoard(boolean board) {
        isBoard = board;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanVote() {
        return canVote;
    }

    public void setCanVote(boolean canVote) {
        this.canVote = canVote;
    }

    public boolean isCanReport() {
        return canReport;
    }

    public void setCanReport(boolean canReport) {
        this.canReport = canReport;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    Background background;


}
