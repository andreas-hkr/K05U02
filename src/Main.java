public class Main {
    public static void main(String[] args) {
        // Loopa igenom talen 1 till 12 och skriv för varje tal ut
        //   - Talet
        //   - Talet i kvadrat
        //   - Talet i kubik

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + "  " + i*i + "  " + i*i*i);
        }
    }
}