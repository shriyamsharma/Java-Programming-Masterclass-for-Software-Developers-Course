package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        System.out.println(viralAdvertisement(5));
    }

    public static int viralAdvertisement(int n){

        int people = 5;
        int cumulative = 0;
        while (n>0){
            int liked = people /2;
            cumulative = cumulative+liked;
            people = liked * 3;
            n--;
        }
        return cumulative;

    }
}
