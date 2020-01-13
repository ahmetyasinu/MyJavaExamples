package java21;


///Polimorfizm Örneği Normalde Tek bir Clas içinde Bir çok Class oluşturabimek.
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A Shark eats lots of people:";
    }
}

class Independence extends Movie {
    public Independence() {
        super("Independence Day");

    }
}


class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids Try and Escape a maze";
    }
}

class ForgeTable extends Movie {
    public ForgeTable() {
        super("ForgeTable");
    }
}
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" +
                    "Plot:" + movie.plot() + "\n" );
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number Generated Was" + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Independence();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgeTable();
        }
        return null;

    }
}
