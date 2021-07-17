public class Personne {
    private final String nom;
    private final int age;

    public Personne(String nom) {
        this(nom, MathUtils.randomNumber());
    }

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
         return String.format("Nom: %s, Age: %d", nom, age);
//        return "Detenue" +
//                " nom=" + nom + '\'' +
//                ", age=" + age ;
    }
}
