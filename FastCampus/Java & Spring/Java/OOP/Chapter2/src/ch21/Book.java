package ch21;

public class Book {
    private String title;
    private String auhtor;

    public Book(){}
    public Book(String title, String author){
        this.auhtor = author;
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuhtor() {
        return auhtor;
    }

    public void setAuhtor(String auhtor) {
        this.auhtor = auhtor;
    }

    public void showInfo(){
        System.out.println(title + ", " + auhtor);
    }
}
