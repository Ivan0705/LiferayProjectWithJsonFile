package model;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private List<Post> postList = new ArrayList<>();

    public Items() {
    }

    public Items(List<Post> postList) {
        this.postList = postList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @Override
    public String toString() {
        return "Items{" +
                "postList=" + postList +
                '}';
    }
}
