package main.java.ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private int ownerId;
    private int createdBy;
    private int fromId;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int postType;
    private  int signerId;
    private boolean isFavorite;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAdAds;
    private int postponedId;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
    private GeoInfo geoInfo;

}
//getter+setter;