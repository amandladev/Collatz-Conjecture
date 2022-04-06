class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        int inputNumber = scanner.nextInt();
        int anyNumber = inputNumber;
        int whil = inputNumber;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(inputNumber);

        if (anyNumber != 1) {
            while (whil > 0) {
                if (anyNumber % 2 != 0) {
                    result = anyNumber * 3 + 1;
                } else {
                    result = anyNumber / 2;
                }
                numbers.add(result);
                anyNumber = result;
                whil = --result;
            }
        }
        for (int a : numbers) {
            System.out.print(a + " ");
        }

    }
}