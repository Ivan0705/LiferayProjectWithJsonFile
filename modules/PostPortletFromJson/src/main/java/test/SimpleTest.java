package test;

import gsonParcer.GsonParserPost;
import model.Items;

public class SimpleTest {
    public static void main(String[] args) {
        GsonParserPost gsonParserPost = new GsonParserPost();
        Items items = gsonParserPost.parse();
        System.out.println(items);
    }
}
