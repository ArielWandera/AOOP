package movie;

public class MovieItem {
    private  String title;
    private  String author;

    public MovieItem(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

     void printDetails(){
        System.out.println("Title:" + title );
        System.out.println("Author:" + author );

    }
}
