public class SolidRhombus {
    public static void Solid_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //STARS
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // System.out.print("*****");
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Solid_Rhombus(10);
    }
}
