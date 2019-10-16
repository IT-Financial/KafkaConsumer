package com.hyp.entity;

import java.io.Serializable;

/*
贵金属 ACCOUNTOPERATION
*/
public class AccountOperation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String txdate;
	private String txtime;
	private String bank_acc;
	private String app_flag;
	private String app_acc;
	private String cust_name;
	private String serial_no;
	private String tx_type;
	private String oper;
	private String bank_area;
	private String depu_bank;
	private String tx_channel;
	private String is_active;
	private String trade_date;
	private String GetTime;
	
	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getTxdate() {
		return txdate;
	}

	public void setTxdate(String txdate) {
		this.txdate = txdate;
	}

	public String getTxtime() {
		return txtime;
	}

	public void setTxtime(String txtime) {
		this.txtime = txtime;
	}

	public String getBank_acc() {
		return bank_acc;
	}

	public void setBank_acc(String bank_acc) {
		this.bank_acc = bank_acc;
	}

	public String getApp_flag() {
		return app_flag;
	}

	public void setApp_flag(String app_flag) {
		this.app_flag = app_flag;
	}

	public String getApp_acc() {
		return app_acc;
	}

	public void setApp_acc(String app_acc) {
		this.app_acc = app_acc;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public String getTx_type() {
		return tx_type;
	}

	public void setTx_type(String tx_type) {
		this.tx_type = tx_type;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getBank_area() {
		return bank_area;
	}

	public void setBank_area(String bank_area) {
		this.bank_area = bank_area;
	}

	public String getDepu_bank() {
		return depu_bank;
	}

	public void setDepu_bank(String depu_bank) {
		this.depu_bank = depu_bank;
	}

	public String getTx_channel() {
		return tx_channel;
	}

	public void setTx_channel(String tx_channel) {
		this.tx_channel = tx_channel;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}

	public String getTrade_date() {
		return trade_date;
	}

	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}

	public int getTopic_par() {
		return topic_par;
	}

	public void setTopic_par(int topic_par) {
		this.topic_par = topic_par;
	}

	public long getPar_offset() {
		return par_offset;
	}

	public void setPar_offset(long par_offset) {
		this.par_offset = par_offset;
	}

	public int getPayload_length() {
		return payload_length;
	}

	public void setPayload_length(int payload_length) {
		this.payload_length = payload_length;
	}

	public String getGetTime() {
		return GetTime;
	}

	public void setGetTime(String getTime) {
		GetTime = getTime;
	}

	@Override
	public String toString() {
		return "AccountOperation [txdate=" + txdate + ", txtime=" + txtime + ", bank_acc=" + bank_acc + ", app_flag="
				+ app_flag + ", app_acc=" + app_acc + ", cust_name=" + cust_name + ", serial_no=" + serial_no
				+ ", tx_type=" + tx_type + ", oper=" + oper + ", bank_area=" + bank_area + ", depu_bank=" + depu_bank
				+ ", tx_channel=" + tx_channel + ", is_active=" + is_active + ", trade_date=" + trade_date
				+ ", GetTime=" + GetTime + ", topic_par=" + topic_par + ", par_offset=" + par_offset
				+ ", payload_length=" + payload_length + "]";
	}
	
	
	

}
