class Planets {
    public static void main(String[] args) {
        String[] list = {"Mercury" , "Venus" , "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"}; 
        
    }

    public static void insertSort(double[] list) {
        for (int top = 1; top < list.length; top++) {
            double item = list[top];
            int i = top;
            while (i > 0 && item < list[i - 1]) {
                list[i] = list[i - 1];
                i--;
            }
            list[i] = item;
        }
    }
}