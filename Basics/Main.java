void main() {
    Scanner scanner = new Scanner(System.in);
    IO.println("Enter number: ");

    int num = scanner.nextInt();
    if (num % 2 == 0) {
        IO.println("Ther number is even");
    } else {
        IO.println("The number is odd");
    }
}