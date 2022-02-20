import java.util.*;
public class movieMagic {
    int year;
    float rating;
    String title;
    movieMagic()
    {
        year = 0;
        rating = 0.0f;
         title = " "; 
    }
    void accept()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year of release");
        year = in.nextInt();
        System.out.println("Enter the title of the movie");
        title = in.next();
        System.out.println("Enter the rating of the movie");
        rating = in.nextFloat();
    }
    void display()
    {
        System.out.println("The year of Movie release is " + year);
        System.out.println("The movie title is " + title);
        if(rating < 2.0)
        {
            System.out.println("This is a flop movie");
        }
        else if(rating >= 2.1 && rating <= 3.4)
        {
            System.out.println("This is a semihit movie");
        } 
        else if(rating >= 3.5 && rating <= 4.5)
        {
            System.out.println("This is a Hit movie");
        }
        else if(rating >= 4.6 && rating <= 5.0)
        {
            System.out.println("This is a Superhit movie");
        } 
    }
    public static void main(String args[])
    {
        movieMagic ps = new movieMagic();
        ps.accept();
        ps.display();
    }
}
