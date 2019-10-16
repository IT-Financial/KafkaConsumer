package com.hyp.entity;

import java.io.Serializable;

/*
   fund_detail 
*/
public class FundDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serial_no;
	private String cust_no;
	private String bank_acc;
	private String app_flag;
	private String app_acc;
	private String txdate;
	private String txtime;
	private String tx_code;
	private double amt;
	private String currency;
	private String status;
	private String serial_no_app;
	private byte send_flag;
	private String serial_no_bank;
	private String serial_no_bank_front;
	private byte fund_kind;
	private String depu_bank;
	private String bank_area;
	private String oper_bank;
	private String trade_date;
	private String remark;
	private String tx_channel;
	private String bank_code;
	private String bank_acc_secu;
	private String GetTime;
	
	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
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

	public String getTx_code() {
		return tx_code;
	}

	public void setTx_code(String tx_code) {
		this.tx_code = tx_code;
	}

	

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSerial_no_app() {
		return serial_no_app;
	}

	public void setSerial_no_app(String serial_no_app) {
		this.serial_no_app = serial_no_app;
	}

	public byte getSend_flag() {
		return send_flag;
	}

	public void setSend_flag(byte send_flag) {
		this.send_flag = send_flag;
	}

	public String getSerial_no_bank() {
		return serial_no_bank;
	}

	public void setSerial_no_bank(String serial_no_bank) {
		this.serial_no_bank = serial_no_bank;
	}

	public String getSerial_no_bank_front() {
		return serial_no_bank_front;
	}

	public void setSerial_no_bank_front(String serial_no_bank_front) {
		this.serial_no_bank_front = serial_no_bank_front;
	}

	public byte getFund_kind() {
		return fund_kind;
	}

	public void setFund_kind(byte fund_kind) {
		this.fund_kind = fund_kind;
	}

	public String getDepu_bank() {
		return depu_bank;
	}

	public void setDepu_bank(String depu_bank) {
		this.depu_bank = depu_bank;
	}

	public String getBank_area() {
		return bank_area;
	}

	public void setBank_area(String bank_area) {
		this.bank_area = bank_area;
	}

	public String getOper_bank() {
		return oper_bank;
	}

	public void setOper_bank(String oper_bank) {
		this.oper_bank = oper_bank;
	}

	public String getTrade_date() {
		return trade_date;
	}

	public void setTrade_date(String trade_date) {
		this.trade_date = trade_date;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTx_channel() {
		return tx_channel;
	}

	public void setTx_channel(String tx_channel) {
		this.tx_channel = tx_channel;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_acc_secu() {
		return bank_acc_secu;
	}

	public void setBank_acc_secu(String bank_acc_secu) {
		this.bank_acc_secu = bank_acc_secu;
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
		return "FundDetail [serial_no=" + serial_no + ", cust_no=" + cust_no + ", bank_acc=" + bank_acc + ", app_flag="
				+ app_flag + ", app_acc=" + app_acc + ", txdate=" + txdate + ", txtime=" + txtime + ", tx_code="
				+ tx_code + ", amt=" + amt + ", currency=" + currency + ", status=" + status + ", serial_no_app="
				+ serial_no_app + ", send_flag=" + send_flag + ", serial_no_bank=" + serial_no_bank
				+ ", serial_no_bank_front=" + serial_no_bank_front + ", fund_kind=" + fund_kind + ", depu_bank="
				+ depu_bank + ", bank_area=" + bank_area + ", oper_bank=" + oper_bank + ", trade_date=" + trade_date
				+ ", remark=" + remark + ", tx_channel=" + tx_channel + ", bank_code=" + bank_code + ", bank_acc_secu="
				+ bank_acc_secu + ", GetTime=" + GetTime + ", topic_par=" + topic_par + ", par_offset=" + par_offset
				+ ", payload_length=" + payload_length + "]";
	}

}