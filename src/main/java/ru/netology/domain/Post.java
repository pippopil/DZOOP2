package main.java.ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
}
//getter+setter;