import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
public class MarkdownParseTest {

    @Test
    public void addition() {
        System.out.println("additional");
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinks() {
        
        try {
            Path fileName = Path.of("test-file.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("https://something.com, some-thing.html");
            assertEquals(actual.toString(), links.toString());
            System.out.println("try");
        }
        catch (Exception e) {
            System.out.println("catch");
        }
        
    }
    @Test
    public void getLinks2() {
        
        try {
            Path fileName = Path.of("test-file8.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("a link on the first line");
            assertEquals(actual.toString(), links.toString());
            System.out.println("try2");
        }
        catch (Exception e) {
            System.out.println("catch2");
        }
        
    }
    @Test
    public void getLinksForSnippet1() throws IOException{
        Path fileName = Path.of("/Users/austin/Downloads/markdown-parser-main 2/labReport4Snippet1.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("url.com");
            actual.add("`google.com");
            actual.add("google.com");
            actual.add("ucsd.edu");
            assertEquals(actual.toString(), links.toString());
    }
    @Test
    public void getLinksForSnippet2() throws IOException{
        Path fileName = Path.of("/Users/austin/Downloads/markdown-parser-main 2/labReport4Snippet2.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("a.com");
            actual.add("a.com(())");
            actual.add("example.com");
            assertEquals(actual.toString(), links.toString());
    }
    @Test
    public void getLinksForSnippet3() throws IOException{
        Path fileName = Path.of("/Users/austin/Downloads/markdown-parser-main 2/labReport4Snippet3.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("https://www.twitter.com ");
            actual.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
            actual.add("github.com");
            actual.add("https://cse.ucsd.edu/");
            assertEquals(actual.toString(), links.toString());
    }
    @Test
    public void getLinksForSnippet1Review() throws IOException{
        Path fileName = Path.of("/Users/austin/Downloads/markdown-parser-main 2/labReport4Snippet1.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParseReview.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("url.com");
            actual.add("`google.com");
            actual.add("google.com");
            actual.add("ucsd.edu");
            assertEquals(actual.toString(), links.toString());
    }
    @Test
    public void getLinksForSnippet2Review() throws IOException{
        Path fileName = Path.of("/Users/austin/Downloads/markdown-parser-main 2/labReport4Snippet2.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParseReview.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("a.com");
            actual.add("a.com(())");
            actual.add("example.com");
            assertEquals(actual.toString(), links.toString());
    }
    @Test
    public void getLinksForSnippet3Review() throws IOException{
        Path fileName = Path.of("/Users/austin/Downloads/markdown-parser-main 2/labReport4Snippet3.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParseReview.getLinks(content);
            ArrayList<String> actual = new ArrayList<>();
            actual.add("https://www.twitter.com ");
            actual.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
            actual.add("github.com");
            actual.add("https://cse.ucsd.edu/");
            assertEquals(actual.toString(), links.toString());
    }
}