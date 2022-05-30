package printerJsonFiles;

public class PrintJsonFile {
    public static void main(String[] args) {
        String post = "http://jsonplaceholder.typicode.com/posts";
        String path1 = "post1.json";
        WriteJsonFile.printJsonFile(post, path1);
    }
}
