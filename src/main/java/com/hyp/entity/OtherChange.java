package com.hyp.entity;

import java.io.Serializable;

public class OtherChange implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String branch_code;
	private String occur_date;
	private String serial_no;
	private int    ksorder;
	private String occur_time;
	private String emp_code;
	private String double_check_emp;
	private String cust_no;
	private String business_code;
	private String change_type;
	private String last_value;
	private String this_value;
	private String op_object;
	private String type;
	private String check_date;
	private String r_date;
	private String note;
	private String occur_branch;
	private String op_source;
	private String GetTime;

	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getOccur_date() {
		return occur_date;
	}

	public void setOccur_date(String occur_date) {
		this.occur_date = occur_date;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public int getKsorder() {
		return ksorder;
	}

	public void setKsorder(int ksorder) {
		this.ksorder = ksorder;
	}

	public String getOccur_time() {
		return occur_time;
	}

	public void setOccur_time(String occur_time) {
		this.occur_time = occur_time;
	}

	public String getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}

	public String getDouble_check_emp() {
		return double_check_emp;
	}

	public void setDouble_check_emp(String double_check_emp) {
		this.double_check_emp = double_check_emp;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getBusiness_code() {
		return business_code;
	}

	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}

	public String getChange_type() {
		return change_type;
	}

	public void setChange_type(String change_type) {
		this.change_type = change_type;
	}

	public String getLast_value() {
		return last_value;
	}

	public void setLast_value(String last_value) {
		this.last_value = last_value;
	}

	public String getThis_value() {
		return this_value;
	}

	public void setThis_value(String this_value) {
		this.this_value = this_value;
	}

	public String getOp_object() {
		return op_object;
	}

	public void setOp_object(String op_object) {
		this.op_object = op_object;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCheck_date() {
		return check_date;
	}

	public void setCheck_date(String check_date) {
		this.check_date = check_date;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getOccur_branch() {
		return occur_branch;
	}

	public void setOccur_branch(String occur_branch) {
		this.occur_branch = occur_branch;
	}

	public String getOp_source() {
		return op_source;
	}

	public void setOp_source(String op_source) {
		this.op_source = op_source;
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
		return "OtherChange [branch_code=" + branch_code + ", occur_date=" + occur_date + ", serial_no=" + serial_no
				+ ", ksorder=" + ksorder + ", occur_time=" + occur_time + ", emp_code=" + emp_code
				+ ", double_check_emp=" + double_check_emp + ", cust_no=" + cust_no + ", business_code=" + business_code
				+ ", change_type=" + change_type + ", last_value=" + last_value + ", this_value=" + this_value
				+ ", op_object=" + op_object + ", type=" + type + ", check_date=" + check_date + ", r_date=" + r_date
				+ ", note=" + note + ", occur_branch=" + occur_branch + ", op_source=" + op_source + ", GetTime="
				+ GetTime + ", topic_par=" + topic_par + ", par_offset=" + par_offset + ", payload_length="
				+ payload_length + "]";
	}

}
