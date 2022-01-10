package main.java.ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private int owner_Id;
    private int created_by;
    private int from_id;
    private String text;
    private int reply_Owner_Id;
    private int reply_Post_Id;
    private int post_Type;
    private  int signer_Id;
    private boolean is_Favorite;
    private int can_Pin;
    private int can_Delete;
    private int can_edit;
    private int is_Pinned;
    private int marked_Ad_Ads;
    private int postponed_Id;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
    private GeoInfo geoInfo;

}
//getter+setter;