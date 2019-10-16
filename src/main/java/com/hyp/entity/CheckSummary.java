package com.hyp.entity;

import java.io.Serializable;

public class CheckSummary implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String branch_code;
	private String business_date;
	private String serial_no;
	private String cust_no;
	private String name;
	private String market_code;
	private String holder_acc_no;
	private String sec_code;
	private String sec_short_name;
	private String business_code;
	private String currency_type;
	private double occur_bal;
	private double total_out_bal;
	private double occur_vol;
	private double total_out_vol;
	private String apply_branch;
	private String apply_emp;
	private String apply_date;
	private String apply_time;
	private String apply_note;
	private String first_branch;
	private String first_emp;
	private String first_date;
	private String first_time;
	private String first_result;
	private String first_note;
	private String second_branch;
	private String second_emp;
	private String second_date;
	private String second_time;
	private String second_result;
	private String second_note;
	private String expire_date;
	private String deal_method;
	private String join_date;
	private String join_cust_no;
	private String join_serial_no;
	private String realize_flag;
	private String flow_no;
	private int step_no;
	private int rest_step_num;
	private int detail_num;
	private String exec_emp;
	private String exec_date;
	private String exec_time;
	private String system_no;
	private String third_branch;
	private String third_emp;
	private String third_date;
	private String third_time;
	private String third_result;
	private String third_note;
	private String fourth_branch;
	private String fourth_emp;
	private String fourth_date;
	private String fourth_time;
	private String fourth_result;
	private String fourth_note;
	private String fifth_branch;
	private String fifth_emp;
	private String fifth_date;
	private String fifth_time;
	private String fifth_result;
	private String fifth_note;
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

	public String getBusiness_date() {
		return business_date;
	}

	public void setBusiness_date(String business_date) {
		this.business_date = business_date;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSec_short_name() {
		return sec_short_name;
	}

	public void setSec_short_name(String sec_short_name) {
		this.sec_short_name = sec_short_name;
	}

	public String getBusiness_code() {
		return business_code;
	}

	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}

	public String getCurrency_type() {
		return currency_type;
	}

	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}

	public double getOccur_bal() {
		return occur_bal;
	}

	public void setOccur_bal(double occur_bal) {
		this.occur_bal = occur_bal;
	}

	public double getTotal_out_bal() {
		return total_out_bal;
	}

	public void setTotal_out_bal(double total_out_bal) {
		this.total_out_bal = total_out_bal;
	}

	public double getOccur_vol() {
		return occur_vol;
	}

	public void setOccur_vol(double occur_vol) {
		this.occur_vol = occur_vol;
	}

	public double getTotal_out_vol() {
		return total_out_vol;
	}

	public void setTotal_out_vol(double total_out_vol) {
		this.total_out_vol = total_out_vol;
	}

	public String getApply_branch() {
		return apply_branch;
	}

	public void setApply_branch(String apply_branch) {
		this.apply_branch = apply_branch;
	}

	public String getApply_emp() {
		return apply_emp;
	}

	public void setApply_emp(String apply_emp) {
		this.apply_emp = apply_emp;
	}

	public String getApply_date() {
		return apply_date;
	}

	public void setApply_date(String apply_date) {
		this.apply_date = apply_date;
	}

	public String getApply_time() {
		return apply_time;
	}

	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}

	public String getApply_note() {
		return apply_note;
	}

	public void setApply_note(String apply_note) {
		this.apply_note = apply_note;
	}

	public String getFirst_branch() {
		return first_branch;
	}

	public void setFirst_branch(String first_branch) {
		this.first_branch = first_branch;
	}

	public String getFirst_emp() {
		return first_emp;
	}

	public void setFirst_emp(String first_emp) {
		this.first_emp = first_emp;
	}

	public String getFirst_date() {
		return first_date;
	}

	public void setFirst_date(String first_date) {
		this.first_date = first_date;
	}

	public String getFirst_time() {
		return first_time;
	}

	public void setFirst_time(String first_time) {
		this.first_time = first_time;
	}

	public String getFirst_result() {
		return first_result;
	}

	public void setFirst_result(String first_result) {
		this.first_result = first_result;
	}

	public String getFirst_note() {
		return first_note;
	}

	public void setFirst_note(String first_note) {
		this.first_note = first_note;
	}

	public String getSecond_branch() {
		return second_branch;
	}

	public void setSecond_branch(String second_branch) {
		this.second_branch = second_branch;
	}

	public String getSecond_emp() {
		return second_emp;
	}

	public void setSecond_emp(String second_emp) {
		this.second_emp = second_emp;
	}

	public String getSecond_date() {
		return second_date;
	}

	public void setSecond_date(String second_date) {
		this.second_date = second_date;
	}

	public String getSecond_time() {
		return second_time;
	}

	public void setSecond_time(String second_time) {
		this.second_time = second_time;
	}

	public String getSecond_result() {
		return second_result;
	}

	public void setSecond_result(String second_result) {
		this.second_result = second_result;
	}

	public String getSecond_note() {
		return second_note;
	}

	public void setSecond_note(String second_note) {
		this.second_note = second_note;
	}

	public String getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(String expire_date) {
		this.expire_date = expire_date;
	}

	public String getDeal_method() {
		return deal_method;
	}

	public void setDeal_method(String deal_method) {
		this.deal_method = deal_method;
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

	public String getJoin_serial_no() {
		return join_serial_no;
	}

	public void setJoin_serial_no(String join_serial_no) {
		this.join_serial_no = join_serial_no;
	}

	public String getRealize_flag() {
		return realize_flag;
	}

	public void setRealize_flag(String realize_flag) {
		this.realize_flag = realize_flag;
	}

	public String getFlow_no() {
		return flow_no;
	}

	public void setFlow_no(String flow_no) {
		this.flow_no = flow_no;
	}

	public int getStep_no() {
		return step_no;
	}

	public void setStep_no(int step_no) {
		this.step_no = step_no;
	}

	public int getRest_step_num() {
		return rest_step_num;
	}

	public void setRest_step_num(int rest_step_num) {
		this.rest_step_num = rest_step_num;
	}

	public int getDetail_num() {
		return detail_num;
	}

	public void setDetail_num(int detail_num) {
		this.detail_num = detail_num;
	}

	public String getExec_emp() {
		return exec_emp;
	}

	public void setExec_emp(String exec_emp) {
		this.exec_emp = exec_emp;
	}

	public String getExec_date() {
		return exec_date;
	}

	public void setExec_date(String exec_date) {
		this.exec_date = exec_date;
	}

	public String getExec_time() {
		return exec_time;
	}

	public void setExec_time(String exec_time) {
		this.exec_time = exec_time;
	}

	public String getSystem_no() {
		return system_no;
	}

	public void setSystem_no(String system_no) {
		this.system_no = system_no;
	}

	public String getThird_branch() {
		return third_branch;
	}

	public void setThird_branch(String third_branch) {
		this.third_branch = third_branch;
	}

	public String getThird_emp() {
		return third_emp;
	}

	public void setThird_emp(String third_emp) {
		this.third_emp = third_emp;
	}

	public String getThird_date() {
		return third_date;
	}

	public void setThird_date(String third_date) {
		this.third_date = third_date;
	}

	public String getThird_time() {
		return third_time;
	}

	public void setThird_time(String third_time) {
		this.third_time = third_time;
	}

	public String getThird_result() {
		return third_result;
	}

	public void setThird_result(String third_result) {
		this.third_result = third_result;
	}

	public String getThird_note() {
		return third_note;
	}

	public void setThird_note(String third_note) {
		this.third_note = third_note;
	}

	public String getFourth_branch() {
		return fourth_branch;
	}

	public void setFourth_branch(String fourth_branch) {
		this.fourth_branch = fourth_branch;
	}

	public String getFourth_emp() {
		return fourth_emp;
	}

	public void setFourth_emp(String fourth_emp) {
		this.fourth_emp = fourth_emp;
	}

	public String getFourth_date() {
		return fourth_date;
	}

	public void setFourth_date(String fourth_date) {
		this.fourth_date = fourth_date;
	}

	public String getFourth_time() {
		return fourth_time;
	}

	public void setFourth_time(String fourth_time) {
		this.fourth_time = fourth_time;
	}

	public String getFourth_result() {
		return fourth_result;
	}

	public void setFourth_result(String fourth_result) {
		this.fourth_result = fourth_result;
	}

	public String getFourth_note() {
		return fourth_note;
	}

	public void setFourth_note(String fourth_note) {
		this.fourth_note = fourth_note;
	}

	public String getFifth_branch() {
		return fifth_branch;
	}

	public void setFifth_branch(String fifth_branch) {
		this.fifth_branch = fifth_branch;
	}

	public String getFifth_emp() {
		return fifth_emp;
	}

	public void setFifth_emp(String fifth_emp) {
		this.fifth_emp = fifth_emp;
	}

	public String getFifth_date() {
		return fifth_date;
	}

	public void setFifth_date(String fifth_date) {
		this.fifth_date = fifth_date;
	}

	public String getFifth_time() {
		return fifth_time;
	}

	public void setFifth_time(String fifth_time) {
		this.fifth_time = fifth_time;
	}

	public String getFifth_result() {
		return fifth_result;
	}

	public void setFifth_result(String fifth_result) {
		this.fifth_result = fifth_result;
	}

	public String getFifth_note() {
		return fifth_note;
	}

	public void setFifth_note(String fifth_note) {
		this.fifth_note = fifth_note;
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
		return "CheckSummary [branch_code=" + branch_code + ", business_date=" + business_date + ", serial_no="
				+ serial_no + ", cust_no=" + cust_no + ", name=" + name + ", market_code=" + market_code
				+ ", holder_acc_no=" + holder_acc_no + ", sec_code=" + sec_code + ", sec_short_name=" + sec_short_name
				+ ", business_code=" + business_code + ", currency_type=" + currency_type + ", occur_bal=" + occur_bal
				+ ", total_out_bal=" + total_out_bal + ", occur_vol=" + occur_vol + ", total_out_vol=" + total_out_vol
				+ ", apply_branch=" + apply_branch + ", apply_emp=" + apply_emp + ", apply_date=" + apply_date
				+ ", apply_time=" + apply_time + ", apply_note=" + apply_note + ", first_branch=" + first_branch
				+ ", first_emp=" + first_emp + ", first_date=" + first_date + ", first_time=" + first_time
				+ ", first_result=" + first_result + ", first_note=" + first_note + ", second_branch=" + second_branch
				+ ", second_emp=" + second_emp + ", second_date=" + second_date + ", second_time=" + second_time
				+ ", second_result=" + second_result + ", second_note=" + second_note + ", expire_date=" + expire_date
				+ ", deal_method=" + deal_method + ", join_date=" + join_date + ", join_cust_no=" + join_cust_no
				+ ", join_serial_no=" + join_serial_no + ", realize_flag=" + realize_flag + ", flow_no=" + flow_no
				+ ", step_no=" + step_no + ", rest_step_num=" + rest_step_num + ", detail_num=" + detail_num
				+ ", exec_emp=" + exec_emp + ", exec_date=" + exec_date + ", exec_time=" + exec_time + ", system_no="
				+ system_no + ", third_branch=" + third_branch + ", third_emp=" + third_emp + ", third_date="
				+ third_date + ", third_time=" + third_time + ", third_result=" + third_result + ", third_note="
				+ third_note + ", fourth_branch=" + fourth_branch + ", fourth_emp=" + fourth_emp + ", fourth_date="
				+ fourth_date + ", fourth_time=" + fourth_time + ", fourth_result=" + fourth_result + ", fourth_note="
				+ fourth_note + ", fifth_branch=" + fifth_branch + ", fifth_emp=" + fifth_emp + ", fifth_date="
				+ fifth_date + ", fifth_time=" + fifth_time + ", fifth_result=" + fifth_result + ", fifth_note="
				+ fifth_note + ", GetTime=" + GetTime + ", topic_par=" + topic_par + ", par_offset=" + par_offset
				+ ", payload_length=" + payload_length + "]";
	}

}
