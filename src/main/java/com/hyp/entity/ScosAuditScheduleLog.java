package com.hyp.entity;

import java.io.Serializable;

public class ScosAuditScheduleLog implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id; 
	private String change_date; 
	private String change_emp; 
	private String create_date; 
	private String create_emp; 
	private String enable_flag; 
	private String business_atomic; 
	private String business_code; 
	private String business_type; 
	private String business_result; 
	private String open_msg;   
	private String remark; 
	private String son_ser_no; 
	private String status; 
	private String unique_ser_no; 
	private String sys_code; 
	private String open_source; 
	private String opt_type; 
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

	public String getBusiness_atomic() {
		return business_atomic;
	}

	public void setBusiness_atomic(String business_atomic) {
		this.business_atomic = business_atomic;
	}

	public String getBusiness_code() {
		return business_code;
	}

	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}

	public String getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}

	public String getBusiness_result() {
		return business_result;
	}

	public void setBusiness_result(String business_result) {
		this.business_result = business_result;
	}

	public String getOpen_msg() {
		return open_msg;
	}

	public void setOpen_msg(String open_msg) {
		this.open_msg = open_msg;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSon_ser_no() {
		return son_ser_no;
	}

	public void setSon_ser_no(String son_ser_no) {
		this.son_ser_no = son_ser_no;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnique_ser_no() {
		return unique_ser_no;
	}

	public void setUnique_ser_no(String unique_ser_no) {
		this.unique_ser_no = unique_ser_no;
	}

	public String getSys_code() {
		return sys_code;
	}

	public void setSys_code(String sys_code) {
		this.sys_code = sys_code;
	}

	public String getOpen_source() {
		return open_source;
	}

	public void setOpen_source(String open_source) {
		this.open_source = open_source;
	}

	public String getOpt_type() {
		return opt_type;
	}

	public void setOpt_type(String opt_type) {
		this.opt_type = opt_type;
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
		return "ScosAuditScheduleLog{" +
				"id='" + id + '\'' +
				", change_date='" + change_date + '\'' +
				", change_emp='" + change_emp + '\'' +
				", create_date='" + create_date + '\'' +
				", create_emp='" + create_emp + '\'' +
				", enable_flag='" + enable_flag + '\'' +
				", business_atomic='" + business_atomic + '\'' +
				", business_code='" + business_code + '\'' +
				", business_type='" + business_type + '\'' +
				", business_result='" + business_result + '\'' +
				", open_msg='" + open_msg + '\'' +
				", remark='" + remark + '\'' +
				", son_ser_no='" + son_ser_no + '\'' +
				", status='" + status + '\'' +
				", unique_ser_no='" + unique_ser_no + '\'' +
				", sys_code='" + sys_code + '\'' +
				", open_source='" + open_source + '\'' +
				", opt_type='" + opt_type + '\'' +
				", getTime='" + getTime + '\'' +
				", topic_par=" + topic_par +
				", par_offset=" + par_offset +
				", payload_length=" + payload_length +
				'}';
	}
}
