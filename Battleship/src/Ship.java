/*Class for ships.
Ship(Point origin, boolean isVertical, int length) - this constructor accepts the origin or the ship
    (its lowest, or leftmost point), its length, and its orientation (vertical, or horizontal).
boolean containsPoint(Point p) - Returns true if a Ship covers a point on the board, false if it does not.
boolean collidesWith(Ship s) - Returns true if the receiving ship shares a point with the argument ship. Collides with it, so to speak.
void shotFiredAtPoint(Point p) - This is a verb in the game. When the user enters a coordinate, this method can be called on each ship.
    If the ship contains the point, it should remember that it has been hit at that point. It could do this with a second PointCollection,
    or some other data strategy.
bool isHitAtPoint(Point p) - returns true if shotFiredAtPoint has been called for this point in the ship.
False if it has not, or if the point is not in the ship.
int hitCount() - returns the number of points in the ship that have been hit. When the
hitCount is equal to the length of the ship the ship is considered to be sunk.*/

import java.awt.*;


public class Ship extends Point
{
    boolean isVertical;
    int length;

   public Ship(int x, int y, boolean isVertical, int length){
       super(x,y);
       isVertical=isVertical;
       length=length;

    }
    private boolean containsPoint(Point p){
    boolean result=false;

       return result;
    }

}
