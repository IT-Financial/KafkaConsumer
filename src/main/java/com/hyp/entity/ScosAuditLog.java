package com.hyp.entity;

import java.io.Serializable;

public class ScosAuditLog implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id; 
	private String change_date; 
	private String change_emp; 
	private String create_date; 
	private String create_emp; 
	private String enable_flag; 
	private String audit_emp; 
	private String audit_log; 
	private String audit_result; 
	private String audit_state_id; 
	private String audit_task_id; 
	private String audit_time; 
	private String sys_code; 
	private String accept_serial_no; 
	private String audit_serial_no; 
	private String audit_type; 
	private String audit_emp_name; 
	private String audit_branch_code; 
	private String emp_mac; 
	private String audit_emp_postion; 
	private String getTime;

	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChange_date() {
		return change_date;
	}

	public void setChange_date(String change_date) {
		this.change_date = change_date;
	}

	public String getChange_emp() {
		return change_emp;
	}

	public void setChange_emp(String change_emp) {
		this.change_emp = change_emp;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getCreate_emp() {
		return create_emp;
	}

	public void setCreate_emp(String create_emp) {
		this.create_emp = create_emp;
	}

	public String getEnable_flag() {
		return enable_flag;
	}

	public void setEnable_flag(String enable_flag) {
		this.enable_flag = enable_flag;
	}

	public String getAudit_emp() {
		return audit_emp;
	}

	public void setAudit_emp(String audit_emp) {
		this.audit_emp = audit_emp;
	}

	public String getAudit_log() {
		return audit_log;
	}

	public void setAudit_log(String audit_log) {
		this.audit_log = audit_log;
	}

	public String getAudit_result() {
		return audit_result;
	}

	public void setAudit_result(String audit_result) {
		this.audit_result = audit_result;
	}

	public String getAudit_state_id() {
		return audit_state_id;
	}

	public void setAudit_state_id(String audit_state_id) {
		this.audit_state_id = audit_state_id;
	}

	public String getAudit_task_id() {
		return audit_task_id;
	}

	public void setAudit_task_id(String audit_task_id) {
		this.audit_task_id = audit_task_id;
	}

	public String getAudit_time() {
		return audit_time;
	}

	public void setAudit_time(String audit_time) {
		this.audit_time = audit_time;
	}

	public String getSys_code() {
		return sys_code;
	}

	public void setSys_code(String sys_code) {
		this.sys_code = sys_code;
	}

	public String getAccept_serial_no() {
		return accept_serial_no;
	}

	public void setAccept_serial_no(String accept_serial_no) {
		this.accept_serial_no = accept_serial_no;
	}

	public String getAudit_serial_no() {
		return audit_serial_no;
	}

	public void setAudit_serial_no(String audit_serial_no) {
		this.audit_serial_no = audit_serial_no;
	}

	public String getAudit_type() {
		return audit_type;
	}

	public void setAudit_type(String audit_type) {
		this.audit_type = audit_type;
	}

	public String getAudit_emp_name() {
		return audit_emp_name;
	}

	public void setAudit_emp_name(String audit_emp_name) {
		this.audit_emp_name = audit_emp_name;
	}

	public String getAudit_branch_code() {
		return audit_branch_code;
	}

	public void setAudit_branch_code(String audit_branch_code) {
		this.audit_branch_code = audit_branch_code;
	}

	public String getEmp_mac() {
		return emp_mac;
	}

	public void setEmp_mac(String emp_mac) {
		this.emp_mac = emp_mac;
	}

	public String getAudit_emp_postion() {
		return audit_emp_postion;
	}

	public void setAudit_emp_postion(String audit_emp_postion) {
		this.audit_emp_postion = audit_emp_postion;
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
		return "ScosAuditLog{" +
				"id='" + id + '\'' +
				", change_date='" + change_date + '\'' +
				", change_emp='" + change_emp + '\'' +
				", create_date='" + create_date + '\'' +
				", create_emp='" + create_emp + '\'' +
				", enable_flag='" + enable_flag + '\'' +
				", audit_emp='" + audit_emp + '\'' +
				", audit_log='" + audit_log + '\'' +
				", audit_result='" + audit_result + '\'' +
				", audit_state_id='" + audit_state_id + '\'' +
				", audit_task_id='" + audit_task_id + '\'' +
				", audit_time='" + audit_time + '\'' +
				", sys_code='" + sys_code + '\'' +
				", accept_serial_no='" + accept_serial_no + '\'' +
				", audit_serial_no='" + audit_serial_no + '\'' +
				", audit_type='" + audit_type + '\'' +
				", audit_emp_name='" + audit_emp_name + '\'' +
				", audit_branch_code='" + audit_branch_code + '\'' +
				", emp_mac='" + emp_mac + '\'' +
				", audit_emp_postion='" + audit_emp_postion + '\'' +
				", getTime='" + getTime + '\'' +
				", topic_par=" + topic_par +
				", par_offset=" + par_offset +
				", payload_length=" + payload_length +
				'}';
	}
}
