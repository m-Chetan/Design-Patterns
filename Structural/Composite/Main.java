package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        movieDirectory.add(new File("Avengers"));

        Directory comedyMovieDirectory = new Directory("Comedy");
        comedyMovieDirectory.add(new File("Hera Pheri"));
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();


    }
}
