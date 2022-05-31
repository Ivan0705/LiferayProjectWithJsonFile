package test;

import com.google.gson.Gson;
import gsonParcer.GsonParserPost;
import model.Items;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class SimpleTest {
    public static void main(String[] args) {
        GsonParserPost gsonParserPost = new GsonParserPost();
        Items items = gsonParserPost.parse();
        String str1 = items.toString();
        System.out.println(str1);

        Gson gson = new Gson();
        String str2 = gson.toJson(items);
        System.out.println(str2);
    }

    @org.junit.jupiter.api.Test
    void fromJson() throws IOException {
        String strItems1 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Ivan\\IdeaProjects\\LiferayProjectWithJsonFile\\modules\\PostPortletFromJson\\src\\main\\resources\\post.json")), StandardCharsets.UTF_8);
        String strItems2 = new String(Files.readAllBytes(Paths.get("C:\\Users\\Ivan\\IdeaProjects\\LiferayProjectWithJsonFile\\modules\\PostPortletFromJson\\src\\main\\resources\\post.json")), StandardCharsets.UTF_8);

        assertEquals(strItems1, strItems2);
    }
}
