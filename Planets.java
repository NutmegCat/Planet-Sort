class Planets {
    public static void main(String[] args) {
        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };
        System.out.println("Original Array:");
        for (String planet: planets) {
            System.out.print(planet + " ");
        }
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
        }
        System.out.println("\n\nSorted Array");
        for (String planet : planets) {
            System.out.print(planet + " ");
        }
    }
}