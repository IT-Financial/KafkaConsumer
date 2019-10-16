package com.hyp.entity;

import java.io.Serializable;

public class OptBankAccInterface implements Serializable {
	/**
	 * 期权
	 */
	private static final long serialVersionUID = 1L;
	private String occur_branch;
	private String bank_code;
	private String bank_acc_no;
	private String new_bank_acc_no;
	private String bank_cust_no;
	private String cust_no;
	private String cust_type;
	private String request_type;
	private String bank_serial_no;
	private String sh_holder_acc_no;
	private String sz_holder_acc_no;
	private String name;
	private String all_name;
	private int cert_type;
	private String id_no;
	private String phone;
	private String addr;
	private String postcode;
	private String new_open_flag;
	private String return_code;
	private String return_info;
	private String digital_signature;
	private String pager;
	private String entrust_method;
	private String repair_flag;
	private String branch_code;
	private String email;
	private String email_flag;
	private String mobile;
	private String bank_emp_code;
	private String bank_query_pwd;
	private String bank_draw_pwd;
	private String bank_acc_flag;
	private String new_bank_acc_flag;
	private String currency_type;
	private String send_flag;
	private String branch_serial_no;
	private String emp_code;
	private String bank_entrust;
	private String serial_no;
	private String pwd;
	private String deal_flag;
	private String request_date;
	private String request_time;
	private String source_type;
	private String fund_acc_no;
	private String bank_joint;
	private String fund_serial_no;
	private String return_date;
	private String return_time;
	private String spare1;
	private String spare2;
	private String spare3;
	private String spare4;
	private String com_handle;
	private String check_emp;
	private String userid;
	private int    user_data;
	private String GetTime;
	
	/* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
	private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
	private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
	private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

	public String getOccur_branch() {
		return occur_branch;
	}

	public void setOccur_branch(String occur_branch) {
		this.occur_branch = occur_branch;
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

	public String getNew_bank_acc_no() {
		return new_bank_acc_no;
	}

	public void setNew_bank_acc_no(String new_bank_acc_no) {
		this.new_bank_acc_no = new_bank_acc_no;
	}

	public String getBank_cust_no() {
		return bank_cust_no;
	}

	public void setBank_cust_no(String bank_cust_no) {
		this.bank_cust_no = bank_cust_no;
	}

	public String getCust_no() {
		return cust_no;
	}

	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getRequest_type() {
		return request_type;
	}

	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}

	public String getBank_serial_no() {
		return bank_serial_no;
	}

	public void setBank_serial_no(String bank_serial_no) {
		this.bank_serial_no = bank_serial_no;
	}

	public String getSh_holder_acc_no() {
		return sh_holder_acc_no;
	}

	public void setSh_holder_acc_no(String sh_holder_acc_no) {
		this.sh_holder_acc_no = sh_holder_acc_no;
	}

	public String getSz_holder_acc_no() {
		return sz_holder_acc_no;
	}

	public void setSz_holder_acc_no(String sz_holder_acc_no) {
		this.sz_holder_acc_no = sz_holder_acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAll_name() {
		return all_name;
	}

	public void setAll_name(String all_name) {
		this.all_name = all_name;
	}

	public int getCert_type() {
		return cert_type;
	}

	public void setCert_type(int cert_type) {
		this.cert_type = cert_type;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getNew_open_flag() {
		return new_open_flag;
	}

	public void setNew_open_flag(String new_open_flag) {
		this.new_open_flag = new_open_flag;
	}

	public String getReturn_code() {
		return return_code;
	}

	public void setReturn_code(String return_code) {
		this.return_code = return_code;
	}

	public String getReturn_info() {
		return return_info;
	}

	public void setReturn_info(String return_info) {
		this.return_info = return_info;
	}

	public String getDigital_signature() {
		return digital_signature;
	}

	public void setDigital_signature(String digital_signature) {
		this.digital_signature = digital_signature;
	}

	public String getPager() {
		return pager;
	}

	public void setPager(String pager) {
		this.pager = pager;
	}

	public String getEntrust_method() {
		return entrust_method;
	}

	public void setEntrust_method(String entrust_method) {
		this.entrust_method = entrust_method;
	}

	public String getRepair_flag() {
		return repair_flag;
	}

	public void setRepair_flag(String repair_flag) {
		this.repair_flag = repair_flag;
	}

	public String getBranch_code() {
		return branch_code;
	}

	public void setBranch_code(String branch_code) {
		this.branch_code = branch_code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_flag() {
		return email_flag;
	}

	public void setEmail_flag(String email_flag) {
		this.email_flag = email_flag;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBank_emp_code() {
		return bank_emp_code;
	}

	public void setBank_emp_code(String bank_emp_code) {
		this.bank_emp_code = bank_emp_code;
	}

	public String getBank_query_pwd() {
		return bank_query_pwd;
	}

	public void setBank_query_pwd(String bank_query_pwd) {
		this.bank_query_pwd = bank_query_pwd;
	}

	public String getBank_draw_pwd() {
		return bank_draw_pwd;
	}

	public void setBank_draw_pwd(String bank_draw_pwd) {
		this.bank_draw_pwd = bank_draw_pwd;
	}

	public String getBank_acc_flag() {
		return bank_acc_flag;
	}

	public void setBank_acc_flag(String bank_acc_flag) {
		this.bank_acc_flag = bank_acc_flag;
	}

	public String getNew_bank_acc_flag() {
		return new_bank_acc_flag;
	}

	public void setNew_bank_acc_flag(String new_bank_acc_flag) {
		this.new_bank_acc_flag = new_bank_acc_flag;
	}

	public String getCurrency_type() {
		return currency_type;
	}

	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}

	public String getSend_flag() {
		return send_flag;
	}

	public void setSend_flag(String send_flag) {
		this.send_flag = send_flag;
	}

	public String getBranch_serial_no() {
		return branch_serial_no;
	}

	public void setBranch_serial_no(String branch_serial_no) {
		this.branch_serial_no = branch_serial_no;
	}

	public String getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}

	public String getBank_entrust() {
		return bank_entrust;
	}

	public void setBank_entrust(String bank_entrust) {
		this.bank_entrust = bank_entrust;
	}

	public String getSerial_no() {
		return serial_no;
	}

	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDeal_flag() {
		return deal_flag;
	}

	public void setDeal_flag(String deal_flag) {
		this.deal_flag = deal_flag;
	}

	public String getRequest_date() {
		return request_date;
	}

	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}

	public String getRequest_time() {
		return request_time;
	}

	public void setRequest_time(String request_time) {
		this.request_time = request_time;
	}

	public String getSource_type() {
		return source_type;
	}

	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}

	public String getFund_acc_no() {
		return fund_acc_no;
	}

	public void setFund_acc_no(String fund_acc_no) {
		this.fund_acc_no = fund_acc_no;
	}

	public String getBank_joint() {
		return bank_joint;
	}

	public void setBank_joint(String bank_joint) {
		this.bank_joint = bank_joint;
	}

	public String getFund_serial_no() {
		return fund_serial_no;
	}

	public void setFund_serial_no(String fund_serial_no) {
		this.fund_serial_no = fund_serial_no;
	}

	public String getReturn_date() {
		return return_date;
	}

	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}

	public String getReturn_time() {
		return return_time;
	}

	public void setReturn_time(String return_time) {
		this.return_time = return_time;
	}

	public String getSpare1() {
		return spare1;
	}

	public void setSpare1(String spare1) {
		this.spare1 = spare1;
	}

	public String getSpare2() {
		return spare2;
	}

	public void setSpare2(String spare2) {
		this.spare2 = spare2;
	}

	public String getSpare3() {
		return spare3;
	}

	public void setSpare3(String spare3) {
		this.spare3 = spare3;
	}

	public String getSpare4() {
		return spare4;
	}

	public void setSpare4(String spare4) {
		this.spare4 = spare4;
	}

	public String getCom_handle() {
		return com_handle;
	}

	public void setCom_handle(String com_handle) {
		this.com_handle = com_handle;
	}

	public String getCheck_emp() {
		return check_emp;
	}

	public void setCheck_emp(String check_emp) {
		this.check_emp = check_emp;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getUser_data() {
		return user_data;
	}

	public void setUser_data(int user_data) {
		this.user_data = user_data;
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
		return "OptBankAccInterface [occur_branch=" + occur_branch + ", bank_code=" + bank_code + ", bank_acc_no="
				+ bank_acc_no + ", new_bank_acc_no=" + new_bank_acc_no + ", bank_cust_no=" + bank_cust_no + ", cust_no="
				+ cust_no + ", cust_type=" + cust_type + ", request_type=" + request_type + ", bank_serial_no="
				+ bank_serial_no + ", sh_holder_acc_no=" + sh_holder_acc_no + ", sz_holder_acc_no=" + sz_holder_acc_no
				+ ", name=" + name + ", all_name=" + all_name + ", cert_type=" + cert_type + ", id_no=" + id_no
				+ ", phone=" + phone + ", addr=" + addr + ", postcode=" + postcode + ", new_open_flag=" + new_open_flag
				+ ", return_code=" + return_code + ", return_info=" + return_info + ", digital_signature="
				+ digital_signature + ", pager=" + pager + ", entrust_method=" + entrust_method + ", repair_flag="
				+ repair_flag + ", branch_code=" + branch_code + ", email=" + email + ", email_flag=" + email_flag
				+ ", mobile=" + mobile + ", bank_emp_code=" + bank_emp_code + ", bank_query_pwd=" + bank_query_pwd
				+ ", bank_draw_pwd=" + bank_draw_pwd + ", bank_acc_flag=" + bank_acc_flag + ", new_bank_acc_flag="
				+ new_bank_acc_flag + ", currency_type=" + currency_type + ", send_flag=" + send_flag
				+ ", branch_serial_no=" + branch_serial_no + ", emp_code=" + emp_code + ", bank_entrust=" + bank_entrust
				+ ", serial_no=" + serial_no + ", pwd=" + pwd + ", deal_flag=" + deal_flag + ", request_date="
				+ request_date + ", request_time=" + request_time + ", source_type=" + source_type + ", fund_acc_no="
				+ fund_acc_no + ", bank_joint=" + bank_joint + ", fund_serial_no=" + fund_serial_no + ", return_date="
				+ return_date + ", return_time=" + return_time + ", spare1=" + spare1 + ", spare2=" + spare2
				+ ", spare3=" + spare3 + ", spare4=" + spare4 + ", com_handle=" + com_handle + ", check_emp="
				+ check_emp + ", userid=" + userid + ", user_data=" + user_data + ", GetTime=" + GetTime
				+ ", topic_par=" + topic_par + ", par_offset=" + par_offset + ", payload_length=" + payload_length
				+ "]";
	}

}
