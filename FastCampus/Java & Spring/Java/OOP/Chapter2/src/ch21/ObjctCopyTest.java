package ch21;

public class ObjctCopyTest {
    public static void main(String[] args){
        Book[] library = new Book[5];
        Book[] copylibrary = new Book[5];



        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥1", "조정래");
        library[2] = new Book("태백산맥1", "조정래");
        library[3] = new Book("태백산맥1", "조정래");
        library[4] = new Book("태백산맥1", "조정래");


        System.arraycopy(library,0,copylibrary,0,5);

        copylibrary[0] = new Book();
        copylibrary[1] = new Book();
        copylibrary[2] = new Book();
        copylibrary[3] = new Book();
        copylibrary[4] = new Book();

        for(int i = 0; i< library.length; i++){
            copylibrary[i].setAuhtor(library[i].getAuhtor());
            copylibrary[i].setTitle(library[i].getTitle());

        }

        System.out.println("============library===========");
        for(Book book : library){
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("==========copy library========");
        for(Book book : copylibrary){
            System.out.println(book);
            book.showInfo();
        }

        library[0].setAuhtor("박완서");
        library[0].setTitle("나목");

        for(Book book : library){
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("==========copy library========");
        for(Book book : copylibrary){
            System.out.println(book);
            book.showInfo();
        }

    }
}
