package dimyoux.engine.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
/**
 * A buffer tool class
 */
public class Buffer {
	//source http://www.commentcamarche.net/contents/java/javatype.php3
	/**
	 * Char's size
	 */
	static public final int CHAR_SIZE = 2;
	/**
	 * Byte's size
	 */
	static public final int BYTE_SIZE = 1;
	/**
	 * Short's size
	 */
	static public final int SHORT_SIZE = 2;
	/**
	 * Int's size
	 */
	static public final int INT_SIZE = 4;
	/**
	 * Long's size
	 */
	static public final int LONG_SIZE = 8;
	/**
	 * Float's size
	 */
	static public final int FLOAT_SIZE = 4;
	/**
	 * Double's size
	 */
	static public final int DOUBLE_SIZE = 8;
	/**
	 * Boolean's size
	 */
	static public final int BOOLEAN_SIZE = 1;
	/**
	 * Creates a DoubleBuffer
	 * @param size Size of the DoubleBuffer
	 * @return DoubleBuffer
	 */
	public static DoubleBuffer createDoubleBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(DOUBLE_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		DoubleBuffer dBuffer = buffer.asDoubleBuffer();
		return dBuffer;
	}
	/**
	 * Converts a double[] to a DoubleBuffer
	 * @param values double[]
	 * @return DoubleBuffer
	 */
	public static DoubleBuffer toDoubleBuffer(double ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		DoubleBuffer dBuffer = createDoubleBuffer(len);
		dBuffer.put(values);
		dBuffer.position(0);
		return dBuffer;
	}
	/**
	 * Creates a LongBuffer
	 * @param size Size of the LongBuffer
	 * @return LongBuffer
	 */
	public static LongBuffer createLongBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(LONG_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		LongBuffer lBuffer = buffer.asLongBuffer();
		return lBuffer;
	}
	/**
	 * Converts a long[] to a LongBuffer
	 * @param values long[]
	 * @return LongBuffer
	 */
	public static LongBuffer toLongBuffer(long ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		LongBuffer lBuffer = createLongBuffer(len);
		lBuffer.put(values);
		lBuffer.position(0);
		return lBuffer;
	}
	/**
	 * Creates a IntBuffer
	 * @param size Size of the IntBuffer
	 * @return IntBuffer
	 */
	public static IntBuffer createIntBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(INT_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		IntBuffer iBuffer = buffer.asIntBuffer();
		return iBuffer;
	}
	/**
	 * Converts a int[] to a IntBuffer
	 * @param values int[]
	 * @return IntBuffer
	 */
	public static IntBuffer toIntBuffer(int ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		IntBuffer iBuffer = createIntBuffer(len);
		iBuffer.put(values);
		iBuffer.position(0);
		return iBuffer;
	}
	/**
	 * Creates a ShortBuffer
	 * @param size Size of the ShortBuffer
	 * @return ShortBuffer
	 */
	public static ShortBuffer createShortBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(SHORT_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		ShortBuffer sBuffer = buffer.asShortBuffer();
		return sBuffer;
	}
	/**
	 * Converts a short[] to a ShortBuffer
	 * @param values short[]
	 * @return ShortBuffer
	 */
	public static ShortBuffer toShortBuffer(short ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		ShortBuffer sBuffer = createShortBuffer(len);
		sBuffer.put(values);
		sBuffer.position(0);
		return sBuffer;
	}
	/**
	 * Creates a ByteBuffer
	 * @param size Size of the ByteBuffer
	 * @return ByteBuffer
	 */
	public static ByteBuffer createByteBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(BYTE_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		return buffer;
	}
	/**
	 * Converts a byte[] to a ByteBuffer
	 * @param values byte[]
	 * @return ByteBuffer
	 */
	public static ByteBuffer toByteBuffer(byte ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		ByteBuffer buffer = createByteBuffer(len);
		buffer.put(values);
		return buffer;
	}
	/**
	 * Creates a CharBuffer
	 * @param size Size of the CharBuffer
	 * @return CharBuffer
	 */
	public static CharBuffer createCharBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(CHAR_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		CharBuffer cBuffer = buffer.asCharBuffer();
		return cBuffer;
	}
	/**
	 * Converts a char[] to a CharBuffer
	 * @param values char[]
	 * @return CharBuffer
	 */
	public static CharBuffer toCharBuffer(char ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		CharBuffer cBuffer = createCharBuffer(len);
		cBuffer.put(values);
		cBuffer.position(0);
		return cBuffer;
	}

	/**
	 * Converts a float[] to aFloatBuffer
	 * @param values float[]
	 * @return FloatBuffer
	 */
	public static FloatBuffer toFloatBuffer(float ...values)
	{
		if(values == null)
		{
			return null;
		}
		int len = values.length;
		FloatBuffer fBuffer = createFloatBuffer(len);
		fBuffer.put(values);
		fBuffer.position(0);
		return fBuffer;
	}
	/**
	 * Creates a FloatBuffer
	 * @param size Size of the FloaBuffer
	 * @return FloatBuffer
	 */
	public static FloatBuffer createFloatBuffer(int size)
	{
		ByteBuffer buffer = ByteBuffer.allocateDirect(FLOAT_SIZE * size);
		buffer.order(ByteOrder.nativeOrder());
		FloatBuffer fBuffer = buffer.asFloatBuffer();
		return fBuffer;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(char value)
	{
		return CHAR_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(byte value)
	{
		return BYTE_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(short value)
	{
		return SHORT_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(int value)
	{
		return INT_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(long value)
	{
		return LONG_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(float value)
	{
		return FLOAT_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(double value)
	{
		return DOUBLE_SIZE;
	}
	/**
	 * Return the size of the value's type
	 * @param value Variable
	 * @return Size of the value's type
	 */
	public static int getSize(boolean value)
	{
		return BOOLEAN_SIZE;
	}
	/**
	 * Serializes a FloatBuffer
	 * @param buffer Floatbuffer
	 * @param out ObjectOutputSteam
	 * @throws IOException
	 */
	public static void serialize(FloatBuffer buffer, ObjectOutputStream out) throws IOException
	{
		if(out != null)
		{
			if(buffer!=null)
			{
				out.writeInt(buffer.capacity());
				for(int i=0; i<buffer.capacity(); i++)
				{
					out.writeFloat(buffer.get(i));
				}
			}else
			{
				out.writeInt(-1);
			}
		}
	}
	/**
	 * Serializes a ShortBuffer
	 * @param buffer ShortBuffer
	 * @param out ObjectOutputSteam
	 * @throws IOException
	 */
	public static void serialize(ShortBuffer buffer, ObjectOutputStream out) throws IOException
	{
		if(out != null)
		{
			if(buffer!=null)
			{
				out.writeInt(buffer.capacity());
				for(int i=0; i<buffer.capacity(); i++)
				{
					out.writeShort(buffer.get(i));
				}
			}else
			{
				out.writeInt(-1);
			}
		}
	}
	/**
	 * Deserializes a FloatBuffer
	 * @param buffer Floatbuffer
	 * @param out ObjectOutputSteam
	 * @throws IOException
	 */
	public static FloatBuffer deserializeFloatBuffer(ObjectInputStream in) throws IOException
	{
		if(in != null)
		{
			int bufferSize = in.readInt();
			if(bufferSize>=0)
			{
				FloatBuffer buffer = Buffer.createFloatBuffer(bufferSize);
				for(int i=0; i<buffer.capacity(); i++)
				{
					buffer.put(in.readFloat());
				}
				buffer.rewind();
				return buffer;
			}
		}
		return null;
	}
	/**
	 * Deserializes a ShortBuffer
	 * @param buffer ShortBuffer
	 * @param out ObjectOutputSteam
	 * @throws IOException
	 */
	public static ShortBuffer deserializeShortBuffer(ObjectInputStream in) throws IOException
	{
		if(in != null)
		{
			int bufferSize = in.readInt();
			if(bufferSize>=0)
			{
				ShortBuffer buffer = Buffer.createShortBuffer(bufferSize);
				for(int i=0; i<buffer.capacity(); i++)
				{
					buffer.put(in.readShort());
				}
				buffer.rewind();
				return buffer;
			}
		}
		return null;
	}
}
