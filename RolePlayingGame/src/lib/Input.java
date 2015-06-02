package lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	/**
	 * �R���\�[�����當������͂���
	 * 
	 * @return ���͂��������i�P�����j
	 */
	public static char getChar() {
		return getChar("char");
	}

	public static char getChar(String s) {

		char c = 0;
		String str = getStr(s);
		if(str==null)	return 0;
		try {
			c = str.charAt(0);

		} catch (Exception e) {
			c = 0;
		}
		return c;
	}

	/**
	 * �R���\�[������byte����͂���
	 * 
	 * @return ���͂���byte
	 */
	public static byte getByte() {
		return getByte("byte");
	}

	public static byte getByte(String s) {

		byte b = 0;
		String str = getStr(s);
		if(str==null)	return 0;
		try {
			b = Byte.parseByte(str);

		} catch (Exception e) {
			b = 0;
		}
		return b;

	}

	/**
	 * �R���\�[������short��������͂���
	 * 
	 * @return ���͂�������
	 */
	public static short getShort() {
		return getShort("short");
	}

	public static short getShort(String s) {

		short n = 0;
		String str = getStr(s);
		if(str==null)	return 0;
		try {
			n = Short.parseShort(str);

		} catch (Exception e) {
			n = 0;
		}
		return n;

	}

	/**
	 * �R���\�[�����琮������͂���
	 * 
	 * @return ���͂�������
	 */
	public static int getInt() {
		return getInt("int");
	}

	public static int getInt(String s) {

		int n = 0;
		String str = getStr(s);
		if(str==null)	return 0;
		try {
			n = Integer.parseInt(str);

		} catch (Exception e) {
			n = 0;
		}
		return n;

	}

	/**
	 * �R���\�[������long��������͂���
	 * 
	 * @return ���͂�������
	 */
	public static long getLong() {
		return getLong("long");
	}

	public static long getLong(String s) {

		long n = 0;
		String str = getStr(s);
		if(str==null)	return 0L;
		try {
			n = Long.parseLong(str);

		} catch (Exception e) {
			n = 0;
		}
		return n;

	}

	/**
	 * �R���\�[������Double����͂���
	 * 
	 * @return ���͂�������
	 */
	public static double getDouble() {
		return getDouble("double");
	}

	public static double getDouble(String s) {

		double x = 0;
		String str = getStr(s);
		if(str==null)	return 0.0;
		try {
			x = Double.parseDouble(str);

		} catch (Exception e) {
			x = 0.0;
		}
		return x;

	}

	/**
	 * �R���\�[������Float����͂���
	 * 
	 * @return ���͂�������
	 */
	public static float getFloat() {
		return getFloat("float");
	}

	public static float getFloat(String s) {

		float x = 0f;
		String str = getStr(s);
		if(str==null)	return 0.0f;
		try {
			x = Float.parseFloat(str);

		} catch (Exception e) {
			x = 0.0f;
		}
		return x;

	}

	/**
	 * �R���\�[������boolean����͂���<br/>
	 * true �ȊO�͂��ׂ�false�ƂȂ�
	 * 
	 * @return true �܂��� false�i����l�j
	 */
	public static boolean getBoolean() {
		return getBoolean("boolean");
	}

	public static boolean getBoolean(String s) {

		String str = getStr(s);
		if(str!=null && str.trim().toLowerCase().equals("true")){
			return true;
		}else{
			return	false;
		}
	}

	/**
	 * �R���\�[�����當�������͂���
	 * 
	 * @return ���͂���������
	 */
	public static String getString() {

		return getString("String");
	}

	public static String getString(String s) {

		String str = getStr(s);
		
		if (str == null || str.length() == 0) {
			return null;

		} else {
			return str;
		}
	}

	/**
	 * �R���\�[�����當�������͂���
	 * 
	 * @param s
	 * @return
	 */
	public static String getStr(String s) {

		String str = null;
		guide(s);
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		} catch (IOException e) {
			return null;
		}
		return str;

	}

	public static void guide(String s) {

		System.out.print("[" + s + "]>");
		System.out.flush();
	}
}
