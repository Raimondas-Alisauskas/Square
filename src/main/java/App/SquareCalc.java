package App;

public class SquareCalc {


    /**
     * Line between points a and b makes square edge. Two squares can be drawn from this edge.
     * The method checks is point c belongs to one of the vertex of the first square.
     * @return true if c belongs to the first square vertex.
     */
    public boolean pointIsInSquare1(Point a, Point b, Point c ){

        Point a1;
        Point b1;
        boolean pointIsInSquare1 = false;

        a1 = new Point(a.getX() - (b.getY() - a.getY()), a.getY() + (b.getX() - a.getX()));
        b1 = new Point(b.getX() - (b.getY() - a.getY()), b.getY() + (b.getX() - a.getX()));

        if (pointsAreEqual(c, a1) || pointsAreEqual(c, b1)){
            pointIsInSquare1 = true;
        }
        return pointIsInSquare1;
    }

    /**
     * Line between points a and b makes square edge. Two squares can be drawn from this edge.
     * The method checks is point c belongs to one of the vertex of the second square.
     * @return true if c belongs to the second square vertex.
     */
    public boolean pointIsInSquare2(Point a, Point b, Point c ){

        Point a2;
        Point b2;
        boolean pointIsInSquare2 = false;

        a2 = new Point(a.getX() + (b.getY() - a.getY()), a.getY() - (b.getX() - a.getX()));
        b2 = new Point(b.getX() + (b.getY() - a.getY()), b.getY() - (b.getX() - a.getX()));

        if (pointsAreEqual(c, a2) || pointsAreEqual(c, b2)){
            pointIsInSquare2 = true;
        }
        return pointIsInSquare2;
    }

    /**
     * @return true if points p1 and p2 has the same coordinates.
     */
    private boolean pointsAreEqual (Point p1, Point p2){
        return (p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY()));
    }

}
