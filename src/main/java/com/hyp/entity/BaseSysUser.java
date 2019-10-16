package com.hyp.entity;

import java.io.Serializable;

public class BaseSysUser implements Serializable {
	private static final long serialVersionUID = 1L;
	private String emp_id; 
	private String emp_no; 
	private String emp_name; 
	private String mobile; 
	private String org_id; 
	private String role_id; 
	private String user_org_id; 
	private String last_login_time; 
	private String password; 
	private String phone; 
	private String mail; 
	private String qq; 
	private String status; 
	private String gender; 
	private String salt; 
	private String cert_no; 
	private String last_quit_time; 
	private String login_mark; 
	private String auto_verify_status; 	
	private String getTime;

	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getUser_org_id() {
		return user_org_id;
	}

	public void setUser_org_id(String user_org_id) {
		this.user_org_id = user_org_id;
	}

	public String getLast_login_time() {
		return last_login_time;
	}

	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getCert_no() {
		return cert_no;
	}

	public void setCert_no(String cert_no) {
		this.cert_no = cert_no;
	}

	public String getLast_quit_time() {
		return last_quit_time;
	}

	public void setLast_quit_time(String last_quit_time) {
		this.last_quit_time = last_quit_time;
	}

	public String getLogin_mark() {
		return login_mark;
	}

	public void setLogin_mark(String login_mark) {
		this.login_mark = login_mark;
	}

	public String getAuto_verify_status() {
		return auto_verify_status;
	}

	public void setAuto_verify_status(String auto_verify_status) {
		this.auto_verify_status = auto_verify_status;
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
		return "BaseSysUser{" +
				"emp_id='" + emp_id + '\'' +
				", emp_no='" + emp_no + '\'' +
				", emp_name='" + emp_name + '\'' +
				", mobile='" + mobile + '\'' +
				", org_id='" + org_id + '\'' +
				", role_id='" + role_id + '\'' +
				", user_org_id='" + user_org_id + '\'' +
				", last_login_time='" + last_login_time + '\'' +
				", password='" + password + '\'' +
				", phone='" + phone + '\'' +
				", mail='" + mail + '\'' +
				", qq='" + qq + '\'' +
				", status='" + status + '\'' +
				", gender='" + gender + '\'' +
				", salt='" + salt + '\'' +
				", cert_no='" + cert_no + '\'' +
				", last_quit_time='" + last_quit_time + '\'' +
				", login_mark='" + login_mark + '\'' +
				", auto_verify_status='" + auto_verify_status + '\'' +
				", getTime='" + getTime + '\'' +
				", topic_par=" + topic_par +
				", par_offset=" + par_offset +
				", payload_length=" + payload_length +
				'}';
	}
}
