import java.util.Arrays;

public class DetenuPrenom {

    public static void main(String[] args){
        System.out.println("--- Dans la prison---");
        Arrays.stream(new Personne[]{
                new Personne("Kévin"),
                new Personne("Camille"),
                new Personne("Antoine", MathUtils.randomNumber(MathUtils.isInt(args[0]).orElse(10), MathUtils.isInt(args[1]).orElse(20))),
                new Personne("Alexandre"),
                new Personne("Lorenzo")
        }).forEach(System.out::println);
    }
}


