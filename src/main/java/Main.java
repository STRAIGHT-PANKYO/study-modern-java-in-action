import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

 class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        long count = Arrays.stream(numbers.split(" "))
                           .map(Integer::parseInt)
                           .filter(Main::isPrime)
                           .count();

        System.out.println(count);
        br.close();
    }

    public static boolean isPrime(int candidate) {
        if (candidate <= 1) {
            return false;
        }

        int candidateRoot = (int) Math.sqrt(candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                        .noneMatch(i -> (candidate % i) == 0);


    }
}
