package com.hyp.entity;

import java.io.Serializable;

public class UserAccounts implements Serializable{
	private static final long serialVersionUID = 1L;
	private String account_id; 
	private String user_id; 
	private String invset_type; 
	private String account_type; 
	private String account_name; 
	private String account_no; 
	private String branch_id; 
	private String branch_name; 
	private String validate_flag; 
	private String apply_success_flag; 
	private String start_time; 
	private String end_time; 
	private String error_info; 
	private String attach_flag; 
	private String account_code;
	private String getTime;

	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getAccount_id() {
		return account_id;
	}

	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getInvset_type() {
		return invset_type;
	}

	public void setInvset_type(String invset_type) {
		this.invset_type = invset_type;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_name() {
		return account_name;
	}

	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getValidate_flag() {
		return validate_flag;
	}

	public void setValidate_flag(String validate_flag) {
		this.validate_flag = validate_flag;
	}

	public String getApply_success_flag() {
		return apply_success_flag;
	}

	public void setApply_success_flag(String apply_success_flag) {
		this.apply_success_flag = apply_success_flag;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getError_info() {
		return error_info;
	}

	public void setError_info(String error_info) {
		this.error_info = error_info;
	}

	public String getAttach_flag() {
		return attach_flag;
	}

	public void setAttach_flag(String attach_flag) {
		this.attach_flag = attach_flag;
	}

	public String getAccount_code() {
		return account_code;
	}

	public void setAccount_code(String account_code) {
		this.account_code = account_code;
	}

	public String getGetTime() {
		return getTime;
	}

	public void setGetTime(String getTime) {
		this.getTime = getTime;
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

	@Override
	public String toString() {
		return "UserAccounts{" +
				"account_id='" + account_id + '\'' +
				", user_id='" + user_id + '\'' +
				", invset_type='" + invset_type + '\'' +
				", account_type='" + account_type + '\'' +
				", account_name='" + account_name + '\'' +
				", account_no='" + account_no + '\'' +
				", branch_id='" + branch_id + '\'' +
				", branch_name='" + branch_name + '\'' +
				", validate_flag='" + validate_flag + '\'' +
				", apply_success_flag='" + apply_success_flag + '\'' +
				", start_time='" + start_time + '\'' +
				", end_time='" + end_time + '\'' +
				", error_info='" + error_info + '\'' +
				", attach_flag='" + attach_flag + '\'' +
				", account_code='" + account_code + '\'' +
				", getTime='" + getTime + '\'' +
				", topic_par=" + topic_par +
				", par_offset=" + par_offset +
				", payload_length=" + payload_length +
				'}';
	}
}
