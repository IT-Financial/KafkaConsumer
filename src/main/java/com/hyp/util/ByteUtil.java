package com.hyp.util;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

@SuppressWarnings("serial")
public class ByteUtil implements Serializable  {
	
	public static int getInteger(byte[] data, int offset, int length) {
		int r = 0;
		int i;

		if (offset<0) offset=0;
		if (length>4) length=4;
		if (offset+length>data.length) return 0;
		for (i=0;i<length;i++) {
			r += (data[offset+i] & 0xFF)<<(8*i);
		}
		return r;
	}
	
	 
	
	public static long getLong(byte[] data, int offset, int length) {
		long r = 0;
		int i;

		if (offset<0) offset=0;
		if (length>8) length=8;
		if (offset+length>data.length) return 0;
		for (i=0;i<length;i++) {
			r += (data[offset+i] & 0xFFl)<<(8*i);
		}
		return r;
	}
	
	public static String getString(byte[] data, int offset, int length) {
		return getString(data, offset, length, "utf-8");
	}
	
//	public static String getGBKString(byte[] data, int offset, int length) {
//		return getString(data, offset, length, "gbk");
//	}
	
	public static String getString(byte[] data, int offset, int length, String encoding) {
		String r = null;
		int i;
		try {
			for (i=0;i<length;i++) if (data[offset+i]==0) break;
			r = new String(data, offset, i, encoding);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		return r;
	}
	
	public static String getMAC(byte[] data, int offset) {
		return String.format("%02x:%02x:%02x:%02x:%02x:%02x", 0xFF & data[offset], 0xFF & data[offset+1], 0xFF & data[offset+2], 0xFF & data[offset+3], 0xFF & data[offset+4], 0xFF & data[offset+5]);
	}
	
	public static String getIP(byte[] data, int offset) {
		return String.format("%d.%d.%d.%d", 0xFF & data[offset+3], 0xFF & data[offset+2], 0xFF & data[offset+1], 0xFF & data[offset]);
	}
	
	public static String getIP(long ip) {
		String r = "";
		r = String.valueOf(ip % 256);
		ip = ip / 256;
		r = String.valueOf(ip % 256) + "." + r;
		ip = ip / 256;
		r = String.valueOf(ip % 256) + "." + r;
		ip = ip / 256;
		r = String.valueOf(ip % 256) + "." + r;
		return r;
	}
	// 将127.0.0.1形式的IP地址转换成十进制整数，这里没有进行任何错误处理
	public static long ipToLong(String strIp) {
		long[] ip = new long[4];
		// 先找到IP地址字符串中.的位置
		int position1 = strIp.indexOf(".");
		int position2 = strIp.indexOf(".", position1 + 1);
		int position3 = strIp.indexOf(".", position2 + 1);
		// 将每个.之间的字符串转换成整型
		ip[0] = Long.parseLong(strIp.substring(0, position1));
		ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
		ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
		ip[3] = Long.parseLong(strIp.substring(position3 + 1));
		return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
	}

	public static int ipToInt(String strIp) {
		int[] ip = new int[4];
		// 先找到IP地址字符串中.的位置
		int position1 = strIp.indexOf(".");
		int position2 = strIp.indexOf(".", position1 + 1);
		int position3 = strIp.indexOf(".", position2 + 1);
		// 将每个.之间的字符串转换成整型
		ip[0] = Integer.parseInt(strIp.substring(0, position1));
		ip[1] = Integer.parseInt(strIp.substring(position1 + 1, position2));
		ip[2] = Integer.parseInt(strIp.substring(position2 + 1, position3));
		ip[3] = Integer.parseInt(strIp.substring(position3 + 1));
		return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
	}

	// 将十进制整数形式转换成127.0.0.1形式的ip地址
	public static String longToIP(long longIp) {
		StringBuffer sb = new StringBuffer("");
		// 直接右移24位
		sb.append(String.valueOf((longIp >>> 24)));
		sb.append(".");
		// 将高8位置0，然后右移16位
		sb.append(String.valueOf((longIp & 0x00FFFFFF) >>> 16));
		sb.append(".");
		// 将高16位置0，然后右移8位
		sb.append(String.valueOf((longIp & 0x0000FFFF) >>> 8));
		sb.append(".");
		// 将高24位置0
		sb.append(String.valueOf((longIp & 0x000000FF)));
		return sb.toString();
	}

	public static byte[] getMacBytes(String mac) {
		byte[] macBytes = new byte[6];
		String[] strArr = mac.split("-");

		for (int i = 0; i < strArr.length; i++) {
			int value = Integer.parseInt(strArr[i], 16);
			macBytes[i] = (byte) value;
		}
		return macBytes;
	}

	// 将byte数组bRefArr转为一个整数,字节数组的低位是整型的低字节位
	public static int toInt(byte[] bRefArr) {
		if(bRefArr!=null&&bRefArr.length>0)
		return (int)((bRefArr[3]&0xFF)
				|((bRefArr[2]&0xFF)<<8)
				|((bRefArr[1]&0xFF)<<16)
				|((bRefArr[0]&0xFF)<<24));
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		int a = 10;
		byte[] b= intToByte4(a);
		System.out.println(toInt(b));
		
		
		byte[] mac = new byte[6];
		mac[0] = 5;
		mac[1] = -2;
		mac[2] = -10;
		mac[3] = 0;
		mac[4] = -1;
		mac[5] = 35;
		System.out.println(getMAC(mac,0));
		
		byte[] data = new byte[8];
		data[0] = 0;
		data[1] = 0;
		data[2] = 0;
		data[3] = 0;
		data[4] = 1;
		data[5] = 0;
		data[6] = 0;
		data[7] = 0;
		System.out.println(getLong(data,0,8));
		
		byte[] ip = new byte[4];
		ip[0] = -64;
		ip[1] = -88;
		ip[2] = 1;
		ip[3] = 35;
		System.out.println(getIP(ip,0));
		
		long ipl = 3232235811l;
		System.out.println(getIP(ipl));
		
		byte[] str = new byte[16];
		str[0] = 97;
		str[1] = 98;
		str[2] = 99;
		str[3] = 100;
		str[4] = 0;
		System.out.println(getString(str, 0, 16));
		System.out.println(getString(str, 0, 2));
		System.out.println(getString(str, 0, 4));
	}
	
	public static long bytes2long(byte[] bt){
		if(bt!=null&&bt.length>0){
		long temp=0;
		long res=0;
		for (int i = 0; i < 8; i++) {
			res<<=8;
			temp=bt[i]&0xff;
			res|=temp;
		}
		return res;
		}
		else return 0;
	}
	
	public static String byteToString(byte[] bt){
		if(bt!=null&&bt.length>0)
		try {
			return new String(bt,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}else return "";
	}
	
	public static String bytesToHexString(byte[] bt){
		StringBuilder sb=new StringBuilder("");
		if(bt==null||bt.length<=0){
			return null;
		}
		for (int i = 0; i < bt.length; i++) {
			int j=bt[i]&0xff;
			String hj=Integer.toHexString(j);
			if(hj.length()<2){
				sb.append(0);
			}
			sb.append(hj);
		}
		return sb.toString();
	}
	
	public static byte[] intToByte4(int i){
		byte[] targets = new byte[4];
		targets[3] = (byte)(i & 0xFF);
		targets[2] = (byte)(i >> 8 & 0xFF);
		targets[1] = (byte)(i >> 16 & 0xFF);
		targets[0] = (byte)(i >> 24 & 0xFF);
		return targets;
	}
	
	public static byte[] longToBytes(Long l){
		byte[] b = new byte[8];
		b[7] = (byte)(l & 0xffL);
		b[6] = (byte)(l >> 8 & 0xFF);
		b[5] = (byte)(l >> 16 & 0xFF);
		b[4] = (byte)(l >> 24 & 0xFF);
		b[3] = (byte)(l >> 32 & 0xFF);
		b[2] = (byte)(l >> 40 & 0xFF);
		b[1] = (byte)(l >> 48 & 0xFF);
		b[0] = (byte)(l >> 56 & 0xFF);
		return b;
	}

}
