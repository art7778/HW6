public class Book {
    public String name;
    public String author;
    public int year;
    public int rating;
    public String text;

    public Book (String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.rating = 3;
        this.text = "";
    }

    public int up() {
        if (rating < 5) {
            rating++;
            return rating;
        } else {
            return rating;
        }
    }

    public int down() {
        if (rating >0) {
            rating--;
            return rating;
        } else {
            return rating;
        }
    }
    public void append(String moreText) {
        text +=" "+ moreText;
    }
    public String toString() {
        return "Book name:" + name + ", Author:" + author + ", Year:" + year + ", Rating [" + rating + "], Text book [" + text + "]";
    }


}

