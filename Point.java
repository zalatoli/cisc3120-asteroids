package cisc3120.asteroids;

/**
 * 
 * Models a point in 2-D space. I also use <code>Point</code> objects to
 * represent things which aren't quite objects; you can do this, too, although
 * it's not ideal.
 *
 * <p>
 * You may find that you need to modify the code in this class, or add
 * members/methods; feel free, but of course be sure to document. (For example,
 * what if you need to generate a random (x,y) value?)
 * 
 * @author Scott Dexter
 *
 */
class Point implements Cloneable {
	double x, y;

	public Point(double inX, double inY) {
		x = inX;
		y = inY;
	}
	
	/** 
	 * A little bit of magic to make it easy to copy Points.
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Point clone() {
		try {
			return (Point) super.clone();
		} catch (CloneNotSupportedException e) {
			//  Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
