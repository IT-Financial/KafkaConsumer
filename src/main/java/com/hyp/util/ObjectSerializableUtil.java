package com.hyp.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

/**
 * @Title: ObjectSerializableUtil.java
 * @Package com.kingstar.securities.bs.scos.modify.util
 * @Description:对象序列化工具类：包含两个静态方法，一个是将对象序列化成字符串，一个是将字符串序列化成对象。
 * @author Qian.Liu
 * @date 2014年10月15日 下午2:58:29
 * @version V1.0
 */
public class ObjectSerializableUtil {
	/**
	 * @Title: Object2String
	 * @Description: 实现了Serializable接口的对象
	 * @param seriaObject
	 * @return序列化之后的字符串,如果发生异常，则返回空字串
	 * @throws Exception
	 * @return String 返回类型
	 * @throws
	 * @author Qian.Liu
	 */
	public static String Object2String(Serializable seriaObject) throws Exception {
		String result = "";
		ByteArrayOutputStream byteArrayOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			byteArrayOutputStream = new ByteArrayOutputStream();
			objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(seriaObject);
			result = byteArrayOutputStream.toString("ISO-8859-1");
		} catch (Exception e) {
			throw e;
		} finally {
			if (objectOutputStream != null) {
				objectOutputStream.close();
			}
			if (byteArrayOutputStream != null) {
				byteArrayOutputStream.close();
			}
		}
		// return result;
		return java.net.URLEncoder.encode(result, "UTF-8");
	}

	/**
	 * @Title: string2Object
	 * @Description: 被序列化之后对象的字符串
	 * @param str
	 * @return反序列化之后得到的对象
	 * @throws UnsupportedEncodingException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @return Object 返回类型
	 * @throws
	 * @author Qian.Liu
	 */
	public static Object string2Object(String str) throws UnsupportedEncodingException, ClassNotFoundException, IOException {
		Object result = null;
		ByteArrayInputStream byteArrayInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			// byteArrayInputStream = new
			// ByteArrayInputStream(str.getBytes("ISO-8859-1"));
			byteArrayInputStream = new ByteArrayInputStream(java.net.URLDecoder.decode(str, "UTF-8").getBytes("ISO-8859-1"));
			objectInputStream = new ObjectInputStream(byteArrayInputStream);
			result = objectInputStream.readObject();
		} catch (UnsupportedEncodingException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		} finally {

		}
		return result;
	}

}
