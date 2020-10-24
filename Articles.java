import java.util.Scanner;

public class Articles {
    public static class Article {
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

        public String toStrings() {
            return String.format("%s - %s: %s",title,content,author);
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Article article = new Article();
            String[] input = scanner.nextLine().split(", ");
           article.setTitle(input[0]);
           article.setContent((input[1]));
           article.setAuthor(input[2]);
           int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <n ; i++) {
                input = scanner.nextLine().split(": ");
                switch (input[0]) {
                    case "Edit":
                        article.setContent(input[1]);
                        break;
                    case "ChangeAuthor":
                        article.setAuthor(input[1]);
                        break;
                    case "Rename" :
                        article.setTitle(input[1]);
                        break;
                }

            }

            System.out.println(article.toStrings());




        }
    }
