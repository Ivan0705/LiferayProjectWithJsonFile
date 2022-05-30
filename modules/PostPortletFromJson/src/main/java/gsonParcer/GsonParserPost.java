package gsonParcer;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Items;
import model.Post;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class GsonParserPost {
    public Items parse() {
        //"C:\\Users\\Ivan\\IdeaProjects\\LiferayProjectWithJsonFile\\modules\\PostPortletFromJson\\src\\main\\resources\\post.json"
        try (FileReader reader = new FileReader("C:\\Users\\Ivan\\IdeaProjects\\LiferayProjectWithJsonFile\\modules\\PostPortletFromJson\\src\\main\\resources\\post.json")) {
            Type type = new TypeToken<List<Post>>() {
            }.getType();
            List<Post> posts = new Gson().fromJson(reader, type);
            Items items = new Items();
            items.setPostList(posts);
            return items;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }
        return null;
    }

}
