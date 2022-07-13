import models.Author;
import models.Quote;

public class BeanTest {

    public static void main(String[] args) {

        Author SirShrek = new Author(1, "Sir","Shrek");
        Author TonyStark = new Author(2, "Tony", "Stark");

        Quote quote1 = new Quote(1, "Better out than in, I always say.",SirShrek);
        Quote quote2 = new Quote(2, "Doth mother know you weareth her drapes.",TonyStark);




        System.out.println("quote1 = " + quote1.getAuthor().getFirstName());
        System.out.println("quote2 = " + quote2.getContent());

        ArrayList<Quote> quotes = new ArrayList<>();

        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes) {
            String text = quote.getAuthor().getFirstName() + " said: " + quote.getContent();
            System.out.println(text);
        }


    }

}
