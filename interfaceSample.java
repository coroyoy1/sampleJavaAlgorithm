import java.util.Date;

abstract interface Book{
    void setNameOfTheBook(String bookName);
    void setBookAuthor(String author);
    void setBookReleaseDate(String date);
    void setNumberOfPages(int numberOfPages);

    String getNameOfTheBook();
    String getBookAuthor();
    String getBookReleaseDate();
    int getNumberOfPages();
}

class BookName implements Book{

    private String bookName;
    private String author;
    private String bookReleaseDate;
    private int numberOfPages;

    @Override
    public void setNameOfTheBook(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void setBookAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setBookReleaseDate(String bookReleaseDate) {
        this.bookReleaseDate = bookReleaseDate;
    }

    @Override
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String getNameOfTheBook() {
        return bookName;
    }

    @Override
    public String getBookAuthor() {
        return author;
    }

    @Override
    public String getBookReleaseDate() {
        return bookReleaseDate;
    }

    @Override
    public int getNumberOfPages() {
        return numberOfPages;
    }
}

public class interfaceSample {

    Date currentDate = new Date();
    private String[] listOfBookName;
    private String[] listOFAuthor;
    private String[] listOfDate;
    private int[] listOfPages;

    interfaceSample(){
        listOfBookName = new String[]{"U.S Policy and Crime", "Century in Russia", "Babushka in Moscow"};
        listOFAuthor = new String[]{"John Spencer", "Joseph Faski", "Dmitri Yondu"};
        listOfDate = new String[]{"1/2/21", "3/4/21", "8/4/21"};
        listOfPages = new int[]{20, 30, 50};
    }

    public static void main(String[] args) {
        BookName bname = new BookName();
        interfaceSample iSample = new interfaceSample();
        
        if(iSample.listOFAuthor.length != iSample.listOfDate.length 
        && iSample.listOFAuthor.length != iSample.listOfPages.length
        && iSample.listOfBookName.length != iSample.listOFAuthor.length){
            System.out.println("Invalid");
            return;
        }

        int length = iSample.listOfBookName.length;

        for(int list = 0; list < length; list++){
            System.out.println();
            bname.setNameOfTheBook(iSample.listOfBookName[list]);
            System.out.println("Name of the Book: " +bname.getNameOfTheBook());

            bname.setBookAuthor(iSample.listOFAuthor[list]);
            System.out.println("Author: " +bname.getBookAuthor());

            bname.setBookReleaseDate(iSample.listOfDate[list]);
            System.out.println("Release Date: " +bname.getBookReleaseDate());

            bname.setNumberOfPages(iSample.listOfPages[list]);
            System.out.println("Total Pages: " +bname.getNumberOfPages());
        }
    }
}
