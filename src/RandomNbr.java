import java.util.Random;
public class RandomNbr{
    public static void main(String[] args) {
        Random obj = new Random();
        for (int i = 0; i < 10; i++){
            int nbr = obj.nextInt(1);
            System.out.println("Nombre aléatoire : " + nbr);
        }
    }
}