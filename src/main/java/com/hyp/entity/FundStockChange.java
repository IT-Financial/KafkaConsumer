package com.hyp.entity;

import java.io.Serializable;

public class FundStockChange implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String occur_date;
	private int clr_ctrl;
	private String serial_no;
	private String occur_time;
	private String occur_branch;
	private String branch_code;
	private String cust_no;
	private String currency_type;
	private String fund_acc_no;
	private String cust_name;
	private String market_code;
	private String holder_acc_no;
	private String sec_code;
	private double sec_chg;
	private double sec_net_chg;
	private double sec_bal;
	private double fund_chg;
	private double fund_bal;
	private String business_code;
	private String bank_code;
	private String bank_acc_no;
	private String bank_acc_name;
	private String op_emp;
	private String double_check_emp;
	private String sec_short_name;
	private double done_amt;
	private String join_serial_no;
	private String entrust_method;
	private String room_no;
	private String cust_type;
	private String stat_type;
	private String change_type;
	private String join_date;
	private String join_cust_no;
	private String bill_no;
	private String note;
	private String interest_date;
	private String intend_in_acc_date;
	private String in_acc_date;
	private String in_acc_flag;
	private String relative_date;
	private String cancel_flag;
	private String double_check_flag;
	private String check_date;
	private String in_out;
	private String deliver_emp;
	private String deliver_date;
	private String deliver_flag;
	private double interest_accu;
	private double fine_accu;
	private String sec_in_out;
	private String seat_no;
	private String sec_type;
	private String external_no;
	private String r_date;
	private String deliver_method;
	private String GetTime;
	
	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getOccur_date() {
		return occur_date;
	}

	public void setOccur_date(String occur_date) {
		this.occur_date = occur_date;
	}

	public int getClr_ctrl() {
		return clr_ctrl;
	}

	public void setClr_ctrl(int clr_ctrl) {
		this.clr_ctrl = clr_ctrl;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public String getOccur_time() {
		return occur_time;
	}

	public void setOccur_time(String occur_time) {
		this.occur_time = occur_time;
	}

	public String getOccur_branch() {
		return occur_branch;
	}

	public void setOccur_branch(String occur_branch) {
		this.occur_branch = occur_branch;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCurrency_type() {
		return currency_type;
	}

	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}

	public String getFund_acc_no() {
		return fund_acc_no;
	}

	public void setFund_acc_no(String fund_acc_no) {
		this.fund_acc_no = fund_acc_no;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getMarket_code() {
		return market_code;
	}

	public void setMarket_code(String market_code) {
		this.market_code = market_code;
	}

	public String getHolder_acc_no() {
		return holder_acc_no;
	}

	public void setHolder_acc_no(String holder_acc_no) {
		this.holder_acc_no = holder_acc_no;
	}

	public String getSec_code() {
		return sec_code;
	}

	public void setSec_code(String sec_code) {
		this.sec_code = sec_code;
	}

	public double getSec_chg() {
		return sec_chg;
	}

	public void setSec_chg(double sec_chg) {
		this.sec_chg = sec_chg;
	}

	public double getSec_net_chg() {
		return sec_net_chg;
	}

	public void setSec_net_chg(double sec_net_chg) {
		this.sec_net_chg = sec_net_chg;
	}

	public double getSec_bal() {
		return sec_bal;
	}

	public void setSec_bal(double sec_bal) {
		this.sec_bal = sec_bal;
	}

	public double getFund_chg() {
		return fund_chg;
	}

	public void setFund_chg(double fund_chg) {
		this.fund_chg = fund_chg;
	}

	public double getFund_bal() {
		return fund_bal;
	}

	public void setFund_bal(double fund_bal) {
		this.fund_bal = fund_bal;
	}

	public String getBusiness_code() {
		return business_code;
	}

	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_acc_no() {
		return bank_acc_no;
	}

	public void setBank_acc_no(String bank_acc_no) {
		this.bank_acc_no = bank_acc_no;
	}

	public String getBank_acc_name() {
		return bank_acc_name;
	}

	public void setBank_acc_name(String bank_acc_name) {
		this.bank_acc_name = bank_acc_name;
	}

	public String getOp_emp() {
		return op_emp;
	}

	public void setOp_emp(String op_emp) {
		this.op_emp = op_emp;
	}

	public String getDouble_check_emp() {
		return double_check_emp;
	}

	public void setDouble_check_emp(String double_check_emp) {
		this.double_check_emp = double_check_emp;
	}

	public String getSec_short_name() {
		return sec_short_name;
	}

	public void setSec_short_name(String sec_short_name) {
		this.sec_short_name = sec_short_name;
	}

	public double getDone_amt() {
		return done_amt;
	}

	public void setDone_amt(double done_amt) {
		this.done_amt = done_amt;
	}

	public String getJoin_serial_no() {
		return join_serial_no;
	}

	public void setJoin_serial_no(String join_serial_no) {
		this.join_serial_no = join_serial_no;
	}

	public String getEntrust_method() {
		return entrust_method;
	}

	public void setEntrust_method(String entrust_method) {
		this.entrust_method = entrust_method;
	}

	public String getRoom_no() {
		return room_no;
	}

	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getStat_type() {
		return stat_type;
	}

	public void setStat_type(String stat_type) {
		this.stat_type = stat_type;
	}

	public String getChange_type() {
		return change_type;
	}

	public void setChange_type(String change_type) {
		this.change_type = change_type;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getJoin_cust_no() {
		return join_cust_no;
	}

	public void setJoin_cust_no(String join_cust_no) {
		this.join_cust_no = join_cust_no;
	}

	public String getBill_no() {
		return bill_no;
	}

	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getInterest_date() {
		return interest_date;
	}

	public void setInterest_date(String interest_date) {
		this.interest_date = interest_date;
	}

	public String getIntend_in_acc_date() {
		return intend_in_acc_date;
	}

	public void setIntend_in_acc_date(String intend_in_acc_date) {
		this.intend_in_acc_date = intend_in_acc_date;
	}

	public String getIn_acc_date() {
		return in_acc_date;
	}

	public void setIn_acc_date(String in_acc_date) {
		this.in_acc_date = in_acc_date;
	}

	public String getIn_acc_flag() {
		return in_acc_flag;
	}

	public void setIn_acc_flag(String in_acc_flag) {
		this.in_acc_flag = in_acc_flag;
	}

	public String getRelative_date() {
		return relative_date;
	}

	public void setRelative_date(String relative_date) {
		this.relative_date = relative_date;
	}

	public String getCancel_flag() {
		return cancel_flag;
	}

	public void setCancel_flag(String cancel_flag) {
		this.cancel_flag = cancel_flag;
	}

	public String getDouble_check_flag() {
		return double_check_flag;
	}

	public void setDouble_check_flag(String double_check_flag) {
		this.double_check_flag = double_check_flag;
	}

	public String getCheck_date() {
		return check_date;
	}

	public void setCheck_date(String check_date) {
		this.check_date = check_date;
	}

	public String getIn_out() {
		return in_out;
	}

	public void setIn_out(String in_out) {
		this.in_out = in_out;
	}

	public String getDeliver_emp() {
		return deliver_emp;
	}

	public void setDeliver_emp(String deliver_emp) {
		this.deliver_emp = deliver_emp;
	}

	public String getDeliver_date() {
		return deliver_date;
	}

	public void setDeliver_date(String deliver_date) {
		this.deliver_date = deliver_date;
	}

	public String getDeliver_flag() {
		return deliver_flag;
	}

	public void setDeliver_flag(String deliver_flag) {
		this.deliver_flag = deliver_flag;
	}

	public double getInterest_accu() {
		return interest_accu;
	}

	public void setInterest_accu(double interest_accu) {
		this.interest_accu = interest_accu;
	}

	public double getFine_accu() {
		return fine_accu;
	}

	public void setFine_accu(double fine_accu) {
		this.fine_accu = fine_accu;
	}

	public String getSec_in_out() {
		return sec_in_out;
	}

	public void setSec_in_out(String sec_in_out) {
		this.sec_in_out = sec_in_out;
	}

	public String getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}

	public String getSec_type() {
		return sec_type;
	}

	public void setSec_type(String sec_type) {
		this.sec_type = sec_type;
	}

	public String getExternal_no() {
		return external_no;
	}

	public void setExternal_no(String external_no) {
		this.external_no = external_no;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getDeliver_method() {
		return deliver_method;
	}

	public void setDeliver_method(String deliver_method) {
		this.deliver_method = deliver_method;
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
		return "FundStockChange [occur_date=" + occur_date + ", clr_ctrl=" + clr_ctrl + ", serial_no=" + serial_no
				+ ", occur_time=" + occur_time + ", occur_branch=" + occur_branch + ", branch_code=" + branch_code
				+ ", cust_no=" + cust_no + ", currency_type=" + currency_type + ", fund_acc_no=" + fund_acc_no
				+ ", cust_name=" + cust_name + ", market_code=" + market_code + ", holder_acc_no=" + holder_acc_no
				+ ", sec_code=" + sec_code + ", sec_chg=" + sec_chg + ", sec_net_chg=" + sec_net_chg + ", sec_bal="
				+ sec_bal + ", fund_chg=" + fund_chg + ", fund_bal=" + fund_bal + ", business_code=" + business_code
				+ ", bank_code=" + bank_code + ", bank_acc_no=" + bank_acc_no + ", bank_acc_name=" + bank_acc_name
				+ ", op_emp=" + op_emp + ", double_check_emp=" + double_check_emp + ", sec_short_name=" + sec_short_name
				+ ", done_amt=" + done_amt + ", join_serial_no=" + join_serial_no + ", entrust_method=" + entrust_method
				+ ", room_no=" + room_no + ", cust_type=" + cust_type + ", stat_type=" + stat_type + ", change_type="
				+ change_type + ", join_date=" + join_date + ", join_cust_no=" + join_cust_no + ", bill_no=" + bill_no
				+ ", note=" + note + ", interest_date=" + interest_date + ", intend_in_acc_date=" + intend_in_acc_date
				+ ", in_acc_date=" + in_acc_date + ", in_acc_flag=" + in_acc_flag + ", relative_date=" + relative_date
				+ ", cancel_flag=" + cancel_flag + ", double_check_flag=" + double_check_flag + ", check_date="
				+ check_date + ", in_out=" + in_out + ", deliver_emp=" + deliver_emp + ", deliver_date=" + deliver_date
				+ ", deliver_flag=" + deliver_flag + ", interest_accu=" + interest_accu + ", fine_accu=" + fine_accu
				+ ", sec_in_out=" + sec_in_out + ", seat_no=" + seat_no + ", sec_type=" + sec_type + ", external_no="
				+ external_no + ", r_date=" + r_date + ", deliver_method=" + deliver_method + ", GetTime=" + GetTime
				+ ", topic_par=" + topic_par + ", par_offset=" + par_offset + ", payload_length=" + payload_length
				+ "]";
	}

}
