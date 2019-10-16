package com.hyp.entity;

import java.io.Serializable;

public class UserBusinessFlow implements Serializable {
	private static final long serialVersionUID = 1L;
	private String business_id;
	private String business_type;
	private String user_id;
	private String create_time;
	private String create_by;
	private String create_user_name;
	private String description;
	private String status;
	private String source_detail_id;
	private String org_id;
	private String org_name;
	private String user_name;
	private String identity_code;
	private String mobile;
	private String witness_type; 
	private String getTime;

	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(String business_id) {
		this.business_id = business_id;
	}

	public String getBusiness_type() {
		return business_type;
	}

	public void setBusiness_type(String business_type) {
		this.business_type = business_type;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public String getCreate_user_name() {
		return create_user_name;
	}

	public void setCreate_user_name(String create_user_name) {
		this.create_user_name = create_user_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSource_detail_id() {
		return source_detail_id;
	}

	public void setSource_detail_id(String source_detail_id) {
		this.source_detail_id = source_detail_id;
	}

	public String getOrg_id() {
		return org_id;
	}

	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}

	public String getOrg_name() {
		return org_name;
	}

	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getIdentity_code() {
		return identity_code;
	}

	public void setIdentity_code(String identity_code) {
		this.identity_code = identity_code;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWitness_type() {
		return witness_type;
	}

	public void setWitness_type(String witness_type) {
		this.witness_type = witness_type;
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
		return "UserBusinessFlow{" +
				"business_id='" + business_id + '\'' +
				", business_type='" + business_type + '\'' +
				", user_id='" + user_id + '\'' +
				", create_time='" + create_time + '\'' +
				", create_by='" + create_by + '\'' +
				", create_user_name='" + create_user_name + '\'' +
				", description='" + description + '\'' +
				", status='" + status + '\'' +
				", source_detail_id='" + source_detail_id + '\'' +
				", org_id='" + org_id + '\'' +
				", org_name='" + org_name + '\'' +
				", user_name='" + user_name + '\'' +
				", identity_code='" + identity_code + '\'' +
				", mobile='" + mobile + '\'' +
				", witness_type='" + witness_type + '\'' +
				", getTime='" + getTime + '\'' +
				", topic_par=" + topic_par +
				", par_offset=" + par_offset +
				", payload_length=" + payload_length +
				'}';
	}
}
