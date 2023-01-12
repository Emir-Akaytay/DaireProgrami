import java.util.Scanner;
public class DaireProgrami {
    public static void main(String[] args) {

        /** TayTayTay54 */

        double numberPie=3.14,r,a,alan,cevre;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Yazınız: ");
        r = input.nextDouble();
        System.out.print("Dairenin Merkez Açı Ölçüşünü Yazınız: ");
        a = input.nextDouble();

        alan = (numberPie*(r*r)*a)/360;
        System.out.print("Dairenizin Alanı: "+alan);
    }
}
