import org.junit.Assert;

import App.Point;
import App.SquareCalc;

public class SquareCalcTest {

        Point a = new Point(-1, -1);
        Point b = new Point(0, 1);
        Point c = new Point(1, -2);
        Point d = new Point(-3, 0);


    @org.junit.Test
    public void pointIsInSquare1() {

        SquareCalc squareCalc = new SquareCalc();
        Assert.assertFalse(squareCalc.pointIsInSquare1(a, b, c));
        Assert.assertTrue(squareCalc.pointIsInSquare1(a, b, d));

    }

    @org.junit.Test
    public void pointIsInSquare2() {

        SquareCalc squareCalc = new SquareCalc();
        Assert.assertTrue(squareCalc.pointIsInSquare2(a, b, c));
        Assert.assertFalse(squareCalc.pointIsInSquare2(a, b, d));
    }
}