package ch23;
import ch21.Book;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥1", "조정래"));
        library.add(new Book("태백산맥1", "조정래"));

        for (int i = 0; i < library.size(); i++){
            library.get(i).showInfo();
        }
    }
}
