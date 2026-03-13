package object_character.encapsulation.exer;

/**
 * 封装性练习2
 *
 * @author Yu
 * @create 2026-03-13 21:48
 */
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Java从入门到放弃");
        book.setAuthor("高斯林");
        book.setPublisher("Java开发者");
        book.setPrice(0);
        book.info();
    }
}

class Book {
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void info() {
        System.out.println("书名：" + bookName);
        System.out.println("作者：" + author);
        System.out.println("价格：" + price);
        System.out.println("出版社：" + publisher);
    }
}
