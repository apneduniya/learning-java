// write a code in java to take the length, breadth and height of the cuboid as input and find the volume and the total surface area.
// volume = length * breadth * height
// total_surface_area = 2 * (length * breadth + breadth * height + length * height)

import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        int length, breadth, height;
        Scanner userScanner = new Scanner(System.in);

        System.out.print("Enter the lenght: ");
        length = userScanner.nextInt();
        System.out.print("Enter the breadth: ");
        breadth = userScanner.nextInt();
        System.out.print("Enter the height: ");
        height = userScanner.nextInt();

        System.out.printf("The volume of the cuboid is %d\n", length * breadth * height);
        System.out.printf("The total surface area is %d\n", 2 * (length * breadth + breadth * height + length * height));

        userScanner.close();
    }
}
