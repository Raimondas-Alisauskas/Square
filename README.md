# Square
### Task:
Find number of squares that any four points form on the plane. There won't be identical points.

### App.Point class
An object of App.Point class has pair of numbers (x, y) which are considered as coordinates of point on the
2D plane.
```
class App.Point {
private final Integer x;
private final Integer y;
public App.Point(Integer x, Integer y) {
this.x = x;
this.y = y;
}
public Integer getX() {
return x;
}
public Integer getY() {
return y;
}
}
```
### App.Input example

```
calculateSquares(Arrays.asList(
new App.Point(-1, -1),
new App.Point(0, 1),
new App.Point(1, -2),
new App.Point(2, 0),
new App.Point(3, 2),
new App.Point(4, -1))
);
```
App should return number 2 after such call.



