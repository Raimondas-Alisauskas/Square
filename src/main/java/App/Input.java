package App;

import java.util.Arrays;
import java.util.List;

public class Input {
    public List<Point> points;

    public Input() {
        points = Arrays.asList(
                new Point(-1, -1),
                new Point(0, 1),
                new Point(1, -2),
                new Point(2, 0),
                new Point(3, 2),
                new Point(4, -1)
        );
    }


}
