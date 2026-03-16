package Session3.HW6;

import java.util.*;
import java.util.stream.*;

record Post(List<String> tags) {}

public class main {
    public static void main(String[] args) {

        List<Post> posts = List.of(
                new Post(List.of("a", "b")),
                new Post(List.of("c", "d"))
        );

        List<String> allTags = posts.stream()
                .flatMap(post -> post.tags().stream())
                .toList();

        System.out.println(allTags);
    }
}
