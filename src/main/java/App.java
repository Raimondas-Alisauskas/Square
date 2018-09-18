import java.util.List;

import App.Point;
import App.Input;
import App.SquareCalc;

public class App {

    public static void main (String[] args){
        App app = new App();
        Input input = new Input();
        int numbOfSquares = app.calculateSquares(input.points);
        System.out.println("Number of squares: " + numbOfSquares);
    }

    /**
     * @return number of squares formatted by points.
     */
    public int calculateSquares(List<Point> points) {

        int numbOfSquares = 0;
        SquareCalc squareCalc = new SquareCalc();

        Point pointA;
        Point pointB;
        Point pointC;

        for (int a = 0; a < points.size(); a++) {

            for (int b = a + 1; b < points.size(); b++) {

                int numbOfPointsInSq1 = 0;
                int numbOfPointsInSq2 = 0;

                for (int c = b + 1; c < points.size(); c++) {

                    pointA = points.get(a);
                    pointB = points.get(b);
                    pointC = points.get(c);

                    if (squareCalc.pointIsInSquare1(pointA, pointB, pointC)) {
                        numbOfPointsInSq1++;
                    }
                    if (squareCalc.pointIsInSquare2(pointA, pointB, pointC)) {
                        numbOfPointsInSq2++;
                    }
                }

                if (numbOfPointsInSq1 == 2) {
                    numbOfSquares++;
                }
                if (numbOfPointsInSq2 == 2) {
                    numbOfSquares++;
                }
            }

        }
        return numbOfSquares;
    }

}