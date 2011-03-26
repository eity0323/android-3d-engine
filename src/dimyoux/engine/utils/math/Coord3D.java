package dimyoux.engine.utils.math;
/**
 * Coord3D
 */
public class Coord3D {

	/**
	 * X
	 */
	public float x;
	/**
	 * Y
	 */
	public float y;
	/**
	 * Z
	 */
	public float z;
	/**
	 * Constructor
	 */
	public Coord3D()
	{
		
	}
	/**
	 * Constructor
	 * @param x X 
	 * @param y Y
	 * @param z Z
	 */
	public Coord3D(float x, float y, float z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	/**
	 * Constructor
	 * @param x X
	 * @param y Y
	 * @param z Z
	 */
	public Coord3D(String x, String y, String z)
	{
		this.x = Float.parseFloat(x);
		this.y = Float.parseFloat(y);
		this.z = Float.parseFloat(z);
	}
	/**
	 * Constructor
	 * @param coord3D Syntax : "x y z"
	 */
	public Coord3D(String coord3D)
	{
		String[]coords = coord3D.split(" ");
		this.x = Float.parseFloat(coords[0]);
		this.y = Float.parseFloat(coords[1]);
		this.z = Float.parseFloat(coords[2]);
	}
}
