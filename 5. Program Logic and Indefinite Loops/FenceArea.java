import java.util.*;
public class FenceArea{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int leastx = input.nextInt();
        int maxy = input.nextInt();
        int maxx = input.nextInt();
        int leasty = input.nextInt();
        for (int i = 1; i < n; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();

        }
        System.out.println(2*(maxx - leastx)+2*(maxy - leasty));
    }

}

