class Planets {
    public static void main(String[] args) {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };
        insertSort(planets);
    }

    public static void insertSort(String[] planets) {
        for (int top = 1; top < planets.length; top++) {
            String item = planets[top];
            int i = top - 1;

            while (i >= 0 && planets[i].compareTo(item) > 0) {
                planets[i + 1] = planets[i];
                i = i - 1;
            }

            planets[i + 1] = item;
            printArray(planets);
        }
    }

    private static void printArray(String[] array) {
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
            if (k < array.length - 1) {
                System.out.println(" ");
            }
        }
        System.out.println();
    }
}