package Models;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album album1 = new Album(1, "artist1", "name1", 1990, 20.1, "Rock");
        Album album2 = new Album(2, "artist2", "name12", 1995, 15.3, "Rock");
        Album album3 = new Album(3, "artist4", "name2", 1989, 18.4, "Pop");

        Author author1 = new Author(1, "First1", "Last1");
        Author author2 = new Author(2, "First2", "Last2");
        Author author3 = new Author(3, "First3", "Last3");

        Quote quote1 = new Quote(1, "this is a quote", author1);
        Quote quote2 = new Quote(2, "this is a quote2", author2);
        Quote quote3 = new Quote(3, "this is a quote3", author3);
        Quote quote4 = new Quote(4, "this is a another quote", author1);

        System.out.println(album1.getArtist() + " " + album1.getName() + " " + album1.getReleaseDate() + " " + album1.getSales() + " " + album1.getGenre());
        System.out.println(album2.getArtist() + " " + album2.getName() + " " + album2.getReleaseDate() + " " + album2.getSales() + " " + album2.getGenre());
        System.out.println(album3.getArtist() + " " + album3.getName() + " " + album3.getReleaseDate() + " " + album3.getSales() + " " + album3.getGenre());

        System.out.println(author1.getFirstName() + " " + author1.getLastName());
        System.out.println(author2.getFirstName() + " " + author2.getLastName());
        System.out.println(author3.getFirstName() + " " + author3.getLastName());

        System.out.println(quote1.getAuthor().getFirstName() + " " + quote1.getAuthor().getLastName() + " " + quote1.getContent());
        System.out.println(quote2.getAuthor().getFirstName() + " " + quote2.getAuthor().getLastName() + " " + quote2.getContent());
        System.out.println(quote3.getAuthor().getFirstName() + " " + quote3.getAuthor().getLastName() + " " + quote3.getContent());
        System.out.println(quote4.getAuthor().getFirstName() + " " + quote4.getAuthor().getLastName() + " " + quote4.getContent());

        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        System.out.println();

        for(Quote quote : quotes){
            System.out.println(quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName() + " " + quote.getContent());
        }


    }
}
