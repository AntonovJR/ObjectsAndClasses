import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {

    public static class Article {
        private String getTitle() {
            return title;
        }

        private String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        String title;
        String content;
        String author;


        @Override
        public String toString() {
            return String.format("%s - %s: %s%n", this.title, this.content, this.author);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            Article article = new Article();
            article.setTitle(tokens[0]);
            article.setContent(tokens[1]);
            article.setAuthor(tokens[2]);


            articles.add(article);
        }
        String command = scanner.nextLine();
        if (command.equals("title")) {
            articles.sort(Comparator.comparing(Article::getTitle));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("content")) {
            articles.sort(Comparator.comparing(Article::getContent));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(Article::getAuthor));
            System.out.print(articles.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}