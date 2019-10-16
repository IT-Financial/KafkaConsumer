package com.hyp.entity;

import java.io.Serializable;

/*
 消费流水表 OLPAY_TRADE_RECORD
*/
public class OlpayTradeRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String record_no;
	private String record_status;
	private String record_source;
	private String cust_no;
	private String cust_bank_code;
	private String trade_code;
	private String create_date;
	private String create_time;
	private String clear_date;
	private String clear_time;
	private String tpo_trade_date;
	private String tpo_trade_time;
	private String tpo_trade_code;
	private String tpo_clear_date;
	private String tpo_clear_time;
	private String tpo_code;
	private double tpo_goods_amount;
	private double tpo_payment_balance;
	private String currency;
	private String tpo_trade_note;
	private String tpo_order_no;
	private String order_status;
	private String branch_code;
	private byte system_status;
	private byte process_type;
	private String operator;
	private String operate_date;
	private String operate_time;
	private String bmp_record_no;
	private String bmp_freeze_date;
	private String tpo_original_order_no;
	private String tpo_original_date;
	private String tpo_original_time;
	private String tpo_merchant_code;
	private String tpo_merchant_name;
	private byte tpo_clear_flag;
	private int system_code;
	private String bmp_clear_flag;
	private byte bmp_export_flag;
	private String bmp_export_result;
	private String cust_login_ip;
	private String cust_login_mac;
	private String trade_channel;
	private String tpo_bank_code;
	private String tpo_bank_acc_no;
	private double trade_fee;
	private double return_amount;
	private double fund_change_amt;
	private int clr_batch;
	private String cash_draw_status;
	private String tpo_merchant_order_no;
	private double tpo_trade_fee;
	private double tpo_proxy_fee;
	private double tpo_clear_amt;
	private String original_trade_date;
	private String original_order_no;
	private String soc_order_no;
	private String outer_inner_flag;
	private String adjust_note;
	private String soc_order_no_old;
	private String bmp_record_no_old;
	private String bmp_flush_date;
	private String ext_order_status;
	private String device_info;
	private String std_cust_no;
	private String map_sys;
	private String posted_date;
	private String posting_date;
	private String rec_trade_fee;
	private String tpo_settle_batch_no;
	private String discount_amt;
	private String GetTime;
	
	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRecord_no() {
		return record_no;
	}

	public void setRecord_no(String record_no) {
		this.record_no = record_no;
	}

	public String getRecord_status() {
		return record_status;
	}

	public void setRecord_status(String record_status) {
		this.record_status = record_status;
	}

	public String getRecord_source() {
		return record_source;
	}

	public void setRecord_source(String record_source) {
		this.record_source = record_source;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_bank_code() {
		return cust_bank_code;
	}

	public void setCust_bank_code(String cust_bank_code) {
		this.cust_bank_code = cust_bank_code;
	}

	public String getTrade_code() {
		return trade_code;
	}

	public void setTrade_code(String trade_code) {
		this.trade_code = trade_code;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getClear_date() {
		return clear_date;
	}

	public void setClear_date(String clear_date) {
		this.clear_date = clear_date;
	}

	public String getClear_time() {
		return clear_time;
	}

	public void setClear_time(String clear_time) {
		this.clear_time = clear_time;
	}

	public String getTpo_trade_date() {
		return tpo_trade_date;
	}

	public void setTpo_trade_date(String tpo_trade_date) {
		this.tpo_trade_date = tpo_trade_date;
	}

	public String getTpo_trade_time() {
		return tpo_trade_time;
	}

	public void setTpo_trade_time(String tpo_trade_time) {
		this.tpo_trade_time = tpo_trade_time;
	}

	public String getTpo_trade_code() {
		return tpo_trade_code;
	}

	public void setTpo_trade_code(String tpo_trade_code) {
		this.tpo_trade_code = tpo_trade_code;
	}

	public String getTpo_clear_date() {
		return tpo_clear_date;
	}

	public void setTpo_clear_date(String tpo_clear_date) {
		this.tpo_clear_date = tpo_clear_date;
	}

	public String getTpo_clear_time() {
		return tpo_clear_time;
	}

	public void setTpo_clear_time(String tpo_clear_time) {
		this.tpo_clear_time = tpo_clear_time;
	}

	public String getTpo_code() {
		return tpo_code;
	}

	public void setTpo_code(String tpo_code) {
		this.tpo_code = tpo_code;
	}

	public double getTpo_goods_amount() {
		return tpo_goods_amount;
	}

	public void setTpo_goods_amount(double tpo_goods_amount) {
		this.tpo_goods_amount = tpo_goods_amount;
	}

	public double getTpo_payment_balance() {
		return tpo_payment_balance;
	}

	public void setTpo_payment_balance(double tpo_payment_balance) {
		this.tpo_payment_balance = tpo_payment_balance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTpo_trade_note() {
		return tpo_trade_note;
	}

	public void setTpo_trade_note(String tpo_trade_note) {
		this.tpo_trade_note = tpo_trade_note;
	}

	public String getTpo_order_no() {
		return tpo_order_no;
	}

	public void setTpo_order_no(String tpo_order_no) {
		this.tpo_order_no = tpo_order_no;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public byte getSystem_status() {
		return system_status;
	}

	public void setSystem_status(byte system_status) {
		this.system_status = system_status;
	}

	public byte getProcess_type() {
		return process_type;
	}

	public void setProcess_type(byte process_type) {
		this.process_type = process_type;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperate_date() {
		return operate_date;
	}

	public void setOperate_date(String operate_date) {
		this.operate_date = operate_date;
	}

	public String getOperate_time() {
		return operate_time;
	}

	public void setOperate_time(String operate_time) {
		this.operate_time = operate_time;
	}

	public String getBmp_record_no() {
		return bmp_record_no;
	}

	public void setBmp_record_no(String bmp_record_no) {
		this.bmp_record_no = bmp_record_no;
	}

	public String getBmp_freeze_date() {
		return bmp_freeze_date;
	}

	public void setBmp_freeze_date(String bmp_freeze_date) {
		this.bmp_freeze_date = bmp_freeze_date;
	}

	public String getTpo_original_order_no() {
		return tpo_original_order_no;
	}

	public void setTpo_original_order_no(String tpo_original_order_no) {
		this.tpo_original_order_no = tpo_original_order_no;
	}

	public String getTpo_original_date() {
		return tpo_original_date;
	}

	public void setTpo_original_date(String tpo_original_date) {
		this.tpo_original_date = tpo_original_date;
	}

	public String getTpo_original_time() {
		return tpo_original_time;
	}

	public void setTpo_original_time(String tpo_original_time) {
		this.tpo_original_time = tpo_original_time;
	}

	public String getTpo_merchant_code() {
		return tpo_merchant_code;
	}

	public void setTpo_merchant_code(String tpo_merchant_code) {
		this.tpo_merchant_code = tpo_merchant_code;
	}

	public String getTpo_merchant_name() {
		return tpo_merchant_name;
	}

	public void setTpo_merchant_name(String tpo_merchant_name) {
		this.tpo_merchant_name = tpo_merchant_name;
	}

	public byte getTpo_clear_flag() {
		return tpo_clear_flag;
	}

	public void setTpo_clear_flag(byte tpo_clear_flag) {
		this.tpo_clear_flag = tpo_clear_flag;
	}

	public int getSystem_code() {
		return system_code;
	}

	public void setSystem_code(int system_code) {
		this.system_code = system_code;
	}

	public String getBmp_clear_flag() {
		return bmp_clear_flag;
	}

	public void setBmp_clear_flag(String bmp_clear_flag) {
		this.bmp_clear_flag = bmp_clear_flag;
	}

	public byte getBmp_export_flag() {
		return bmp_export_flag;
	}

	public void setBmp_export_flag(byte bmp_export_flag) {
		this.bmp_export_flag = bmp_export_flag;
	}

	public String getBmp_export_result() {
		return bmp_export_result;
	}

	public void setBmp_export_result(String bmp_export_result) {
		this.bmp_export_result = bmp_export_result;
	}

	public String getCust_login_ip() {
		return cust_login_ip;
	}

	public void setCust_login_ip(String cust_login_ip) {
		this.cust_login_ip = cust_login_ip;
	}

	public String getCust_login_mac() {
		return cust_login_mac;
	}

	public void setCust_login_mac(String cust_login_mac) {
		this.cust_login_mac = cust_login_mac;
	}

	public String getTrade_channel() {
		return trade_channel;
	}

	public void setTrade_channel(String trade_channel) {
		this.trade_channel = trade_channel;
	}

	public String getTpo_bank_code() {
		return tpo_bank_code;
	}

	public void setTpo_bank_code(String tpo_bank_code) {
		this.tpo_bank_code = tpo_bank_code;
	}

	public String getTpo_bank_acc_no() {
		return tpo_bank_acc_no;
	}

	public void setTpo_bank_acc_no(String tpo_bank_acc_no) {
		this.tpo_bank_acc_no = tpo_bank_acc_no;
	}

	public double getTrade_fee() {
		return trade_fee;
	}

	public void setTrade_fee(double trade_fee) {
		this.trade_fee = trade_fee;
	}

	public double getReturn_amount() {
		return return_amount;
	}

	public void setReturn_amount(double return_amount) {
		this.return_amount = return_amount;
	}

	public double getFund_change_amt() {
		return fund_change_amt;
	}

	public void setFund_change_amt(double fund_change_amt) {
		this.fund_change_amt = fund_change_amt;
	}

	public int getClr_batch() {
		return clr_batch;
	}

	public void setClr_batch(int clr_batch) {
		this.clr_batch = clr_batch;
	}

	public String getCash_draw_status() {
		return cash_draw_status;
	}

	public void setCash_draw_status(String cash_draw_status) {
		this.cash_draw_status = cash_draw_status;
	}

	public String getTpo_merchant_order_no() {
		return tpo_merchant_order_no;
	}

	public void setTpo_merchant_order_no(String tpo_merchant_order_no) {
		this.tpo_merchant_order_no = tpo_merchant_order_no;
	}

	public double getTpo_trade_fee() {
		return tpo_trade_fee;
	}

	public void setTpo_trade_fee(double tpo_trade_fee) {
		this.tpo_trade_fee = tpo_trade_fee;
	}

	public double getTpo_proxy_fee() {
		return tpo_proxy_fee;
	}

	public void setTpo_proxy_fee(double tpo_proxy_fee) {
		this.tpo_proxy_fee = tpo_proxy_fee;
	}

	public double getTpo_clear_amt() {
		return tpo_clear_amt;
	}

	public void setTpo_clear_amt(double tpo_clear_amt) {
		this.tpo_clear_amt = tpo_clear_amt;
	}

	public String getOriginal_trade_date() {
		return original_trade_date;
	}

	public void setOriginal_trade_date(String original_trade_date) {
		this.original_trade_date = original_trade_date;
	}

	public String getOriginal_order_no() {
		return original_order_no;
	}

	public void setOriginal_order_no(String original_order_no) {
		this.original_order_no = original_order_no;
	}

	public String getSoc_order_no() {
		return soc_order_no;
	}

	public void setSoc_order_no(String soc_order_no) {
		this.soc_order_no = soc_order_no;
	}

	public String getOuter_inner_flag() {
		return outer_inner_flag;
	}

	public void setOuter_inner_flag(String outer_inner_flag) {
		this.outer_inner_flag = outer_inner_flag;
	}

	public String getAdjust_note() {
		return adjust_note;
	}

	public void setAdjust_note(String adjust_note) {
		this.adjust_note = adjust_note;
	}

	public String getSoc_order_no_old() {
		return soc_order_no_old;
	}

	public void setSoc_order_no_old(String soc_order_no_old) {
		this.soc_order_no_old = soc_order_no_old;
	}

	public String getBmp_record_no_old() {
		return bmp_record_no_old;
	}

	public void setBmp_record_no_old(String bmp_record_no_old) {
		this.bmp_record_no_old = bmp_record_no_old;
	}

	public String getBmp_flush_date() {
		return bmp_flush_date;
	}

	public void setBmp_flush_date(String bmp_flush_date) {
		this.bmp_flush_date = bmp_flush_date;
	}

	public String getExt_order_status() {
		return ext_order_status;
	}

	public void setExt_order_status(String ext_order_status) {
		this.ext_order_status = ext_order_status;
	}

	public String getDevice_info() {
		return device_info;
	}

	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}

	public String getStd_cust_no() {
		return std_cust_no;
	}

	public void setStd_cust_no(String std_cust_no) {
		this.std_cust_no = std_cust_no;
	}

	public String getMap_sys() {
		return map_sys;
	}

	public void setMap_sys(String map_sys) {
		this.map_sys = map_sys;
	}

	public String getPosted_date() {
		return posted_date;
	}

	public void setPosted_date(String posted_date) {
		this.posted_date = posted_date;
	}

	public String getPosting_date() {
		return posting_date;
	}

	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}

	public String getRec_trade_fee() {
		return rec_trade_fee;
	}

	public void setRec_trade_fee(String rec_trade_fee) {
		this.rec_trade_fee = rec_trade_fee;
	}

	public String getTpo_settle_batch_no() {
		return tpo_settle_batch_no;
	}

	public void setTpo_settle_batch_no(String tpo_settle_batch_no) {
		this.tpo_settle_batch_no = tpo_settle_batch_no;
	}

	public String getDiscount_amt() {
		return discount_amt;
	}

	public void setDiscount_amt(String discount_amt) {
		this.discount_amt = discount_amt;
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
		return "OlpayTradeRecord [id=" + id + ", record_no=" + record_no + ", record_status=" + record_status
				+ ", record_source=" + record_source + ", cust_no=" + cust_no + ", cust_bank_code=" + cust_bank_code
				+ ", trade_code=" + trade_code + ", create_date=" + create_date + ", create_time=" + create_time
				+ ", clear_date=" + clear_date + ", clear_time=" + clear_time + ", tpo_trade_date=" + tpo_trade_date
				+ ", tpo_trade_time=" + tpo_trade_time + ", tpo_trade_code=" + tpo_trade_code + ", tpo_clear_date="
				+ tpo_clear_date + ", tpo_clear_time=" + tpo_clear_time + ", tpo_code=" + tpo_code
				+ ", tpo_goods_amount=" + tpo_goods_amount + ", tpo_payment_balance=" + tpo_payment_balance
				+ ", currency=" + currency + ", tpo_trade_note=" + tpo_trade_note + ", tpo_order_no=" + tpo_order_no
				+ ", order_status=" + order_status + ", branch_code=" + branch_code + ", system_status=" + system_status
				+ ", process_type=" + process_type + ", operator=" + operator + ", operate_date=" + operate_date
				+ ", operate_time=" + operate_time + ", bmp_record_no=" + bmp_record_no + ", bmp_freeze_date="
				+ bmp_freeze_date + ", tpo_original_order_no=" + tpo_original_order_no + ", tpo_original_date="
				+ tpo_original_date + ", tpo_original_time=" + tpo_original_time + ", tpo_merchant_code="
				+ tpo_merchant_code + ", tpo_merchant_name=" + tpo_merchant_name + ", tpo_clear_flag=" + tpo_clear_flag
				+ ", system_code=" + system_code + ", bmp_clear_flag=" + bmp_clear_flag + ", bmp_export_flag="
				+ bmp_export_flag + ", bmp_export_result=" + bmp_export_result + ", cust_login_ip=" + cust_login_ip
				+ ", cust_login_mac=" + cust_login_mac + ", trade_channel=" + trade_channel + ", tpo_bank_code="
				+ tpo_bank_code + ", tpo_bank_acc_no=" + tpo_bank_acc_no + ", trade_fee=" + trade_fee
				+ ", return_amount=" + return_amount + ", fund_change_amt=" + fund_change_amt + ", clr_batch="
				+ clr_batch + ", cash_draw_status=" + cash_draw_status + ", tpo_merchant_order_no="
				+ tpo_merchant_order_no + ", tpo_trade_fee=" + tpo_trade_fee + ", tpo_proxy_fee=" + tpo_proxy_fee
				+ ", tpo_clear_amt=" + tpo_clear_amt + ", original_trade_date=" + original_trade_date
				+ ", original_order_no=" + original_order_no + ", soc_order_no=" + soc_order_no + ", outer_inner_flag="
				+ outer_inner_flag + ", adjust_note=" + adjust_note + ", soc_order_no_old=" + soc_order_no_old
				+ ", bmp_record_no_old=" + bmp_record_no_old + ", bmp_flush_date=" + bmp_flush_date
				+ ", ext_order_status=" + ext_order_status + ", device_info=" + device_info + ", std_cust_no="
				+ std_cust_no + ", map_sys=" + map_sys + ", posted_date=" + posted_date + ", posting_date="
				+ posting_date + ", rec_trade_fee=" + rec_trade_fee + ", tpo_settle_batch_no=" + tpo_settle_batch_no
				+ ", discount_amt=" + discount_amt + ", GetTime=" + GetTime + ", topic_par=" + topic_par
				+ ", par_offset=" + par_offset + ", payload_length=" + payload_length + "]";
	}

}
