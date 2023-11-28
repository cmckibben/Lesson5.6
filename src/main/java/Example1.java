public class Example1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int sum = add(x,y);
        System.out.println("From Main");
        System.out.println("\tsum: "+sum);
        System.out.println("\tx:   "+x);
        System.out.println("\ty:   "+y);
    }
    public static int add(int x, int y) {
        int sum = x + y;
        x = sum;
        y = sum;
        System.out.println("From add(x,y)");
        System.out.println("\tsum: "+sum);
        System.out.println("\tx:   "+x);
        System.out.println("\ty:   "+y);
        return sum;
    }
}
