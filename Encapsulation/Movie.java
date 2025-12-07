package Encapsulation;
//  Write a Java program to create a class called Movie with private instance variables title, director, and duration. Provide public getter and setter methods to access and modify these variables. Add a method called getMovieDetails() that returns a formatted string containing the movie details.

import java.util.*;

public class Movie {
    
    private String title;
    private String director;
    private String duration;

    public void setDetails(String title , String director , String duration){
        this.title = title ;
        this.director = director ;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public String getDuration(){
        return duration;
    }

    public static void main(String[] rounak) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Movie> movies = new ArrayList<>();
        loop:
        while(true){
            System.out.print("Choose A to add movies in the list and V to view the movie and B to go back : ");
            char ch1 = sc.next().charAt(0);
            char ch = Character.toUpperCase(ch1);
            switch(ch){
                case 'A':
                    System.out.print("Enter the movie title : ");
                    String title = sc.nextLine();sc.nextLine();

                    System.out.print("Enter the director of the movie : ");
                    String director = sc.nextLine();

                    System.out.print("Enter the duration of the movie : ");
                    String duration = sc.nextLine();

                    Movie m = new Movie();
                    m.setDetails(title , director , duration);
                    movies.add(m);
                    break;
                case 'V':
                    if(movies.size()==0){
                        System.out.println("Add movies to the list");
                        break; 
                    }
                    System.out.println("Enter the title of the movie : ");
                    String t = sc.nextLine();sc.nextLine();
                    boolean found= false;
                    for(Movie m1 : movies){
                        if(m1.getTitle().equals(t)){
                            System.out.println("Movie title : " + m1.getTitle());
                            System.out.println("Director : " + m1.getDirector());
                            System.out.println("Duration : " + m1.getDuration());
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Movie not found");
                    break;
                case 'B':
                    break loop;

                default: 
                System.out.println("Invalid input");
            }

        }
        sc.close();
        
    }
}
