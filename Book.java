package JavaGuruHomeWorks;

public class Book {
    private String author, title;
    private int pages, year;
    public Book(String authorC, String titleC, int yearC, int pagesC){
    author=authorC;
    title=titleC;
    year=yearC;
    pages=pagesC;
    }
    public Book(){
    }
 //   @Override
    public boolean equals(Book aBook){
        if ((this.getPages()==aBook.getPages())&& (this.getYear()==aBook.getYear())
                && (this.getAuthor().equalsIgnoreCase(aBook.getAuthor()))
                && (this.getTitle().equalsIgnoreCase(aBook.getTitle()))){ return true;}
        else {return false;}
    }
    @Override
    public String toString(){
        return this.getAuthor()+" "+this.getTitle()+" "+this.getYear()+" "+this.getPages();
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
