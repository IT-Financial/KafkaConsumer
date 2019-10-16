package com.hyp.entity;

public class ScosBusinessChoose {
    private static final long serialVersionUID = 1L;
    private String id;
    private String change_date;
    private String change_emp;
    private String create_date;
    private String create_emp;
    private String enable_flag;
    private String avilibale_business;
    private String business_scope;
    private String chosen_business;
    private String done_business;
    private String service_type;
    private String business_accept_id;

    private String GetTime;

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

    public String getAvilibale_business() {
        return avilibale_business;
    }

    public void setAvilibale_business(String avilibale_business) {
        this.avilibale_business = avilibale_business;
    }

    public String getBusiness_scope() {
        return business_scope;
    }

    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }

    public String getChosen_business() {
        return chosen_business;
    }

    public void setChosen_business(String chosen_business) {
        this.chosen_business = chosen_business;
    }

    public String getDone_business() {
        return done_business;
    }

    public void setDone_business(String done_business) {
        this.done_business = done_business;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getBusiness_accept_id() {
        return business_accept_id;
    }

    public void setBusiness_accept_id(String business_accept_id) {
        this.business_accept_id = business_accept_id;
    }

    public String getGetTime() {
        return GetTime;
    }

    public void setGetTime(String getTime) {
        GetTime = getTime;
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
        return "ScosBusinessChoose{" +
                "id='" + id + '\'' +
                ", change_date='" + change_date + '\'' +
                ", change_emp='" + change_emp + '\'' +
                ", create_date='" + create_date + '\'' +
                ", create_emp='" + create_emp + '\'' +
                ", enable_flag='" + enable_flag + '\'' +
                ", avilibale_business='" + avilibale_business + '\'' +
                ", business_scope='" + business_scope + '\'' +
                ", chosen_business='" + chosen_business + '\'' +
                ", done_business='" + done_business + '\'' +
                ", service_type='" + service_type + '\'' +
                ", business_accept_id='" + business_accept_id + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
