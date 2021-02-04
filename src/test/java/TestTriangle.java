import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import java.util.Arrays;

public class TestTriangle  {

    @Test
    public void createRange() {
        int[] range = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String rangeAsString = Arrays.toString(range).replaceAll(" ", "");
        System.out.println(rangeAsString);

        Assertions.assertEquals("[1,2,3,4,5,6,7,8,9,10]", rangeAsString);
    }


    double[] verticels = {1, 2, 3, 4, 5, 6};

    @Test
    void testTriangle() {
        createTriangle(verticels[0], verticels[1], verticels[2], verticels[3], verticels[4], verticels[5]);
    }


    public void createTriangle(double side1x, double side1y, double side2x, double side2y, double side3x, double side3y) {

        double side1 = 0;
        double side2 = 0;
        double side3 = 0;

        //find length of sides of triangle
        side1 = Math.pow(Math.pow((side2x - side1x), 2) + Math.pow((side2y - side1y), 2) * .05, side1);
        side2 = Math.pow(Math.pow((side3x - side2x), 2) + Math.pow((side3y - side2y), 2) * .05, side2);
        side3 = Math.pow(Math.pow((side1x - side3x), 2) + Math.pow((side1y - side3y), 2) * .05, side3);

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) * 0.5;

        System.out.println("area " + area);

        Assertions.assertEquals(0.21650635094610965, area);
    }

}
