package Learn.advanced;

import static java.lang.Math.cos;
import static java.lang.System.out;
public class LearnMainImportStatic {
    public static void main(String[] args)  {
        double result = cos(2*Math.PI) + Math.sin(3*Math.PI); // для удаления Math с sin и PI
        // надо писать для то-же import static java.lang.Math.sin;
        //System.out.println(result); // Если убрать import static java.lang.System.out;
        out.println(result);
    }
}
