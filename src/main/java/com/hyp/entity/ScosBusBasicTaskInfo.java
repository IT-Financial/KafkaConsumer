package com.hyp.entity;

public class ScosBusBasicTaskInfo {
    private String id;
    private String change_date;
    private String change_emp;
    private String create_date;
    private String create_emp;
    private String enable_flag;
    private String open_source;
    private String unique_ser_no;
    private String cust_no;
    private String bus_atomic_no;
    private String open_flag;
    private String business_accept_id;
    private String ignore_codes;
    private String open_date;
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

    public String getOpen_source() {
        return open_source;
    }

    public void setOpen_source(String open_source) {
        this.open_source = open_source;
    }

    public String getUnique_ser_no() {
        return unique_ser_no;
    }

    public void setUnique_ser_no(String unique_ser_no) {
        this.unique_ser_no = unique_ser_no;
    }

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getBus_atomic_no() {
        return bus_atomic_no;
    }

    public void setBus_atomic_no(String bus_atomic_no) {
        this.bus_atomic_no = bus_atomic_no;
    }

    public String getOpen_flag() {
        return open_flag;
    }

    public void setOpen_flag(String open_flag) {
        this.open_flag = open_flag;
    }

    public String getBusiness_accept_id() {
        return business_accept_id;
    }

    public void setBusiness_accept_id(String business_accept_id) {
        this.business_accept_id = business_accept_id;
    }

    public String getIgnore_codes() {
        return ignore_codes;
    }

    public void setIgnore_codes(String ignore_codes) {
        this.ignore_codes = ignore_codes;
    }

    public String getOpen_date() {
        return open_date;
    }

    public void setOpen_date(String open_date) {
        this.open_date = open_date;
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
        return "ScosBusBasicTaskInfo{" +
                "id='" + id + '\'' +
                ", change_date='" + change_date + '\'' +
                ", change_emp='" + change_emp + '\'' +
                ", create_date='" + create_date + '\'' +
                ", create_emp='" + create_emp + '\'' +
                ", enable_flag='" + enable_flag + '\'' +
                ", open_source='" + open_source + '\'' +
                ", unique_ser_no='" + unique_ser_no + '\'' +
                ", cust_no='" + cust_no + '\'' +
                ", bus_atomic_no='" + bus_atomic_no + '\'' +
                ", open_flag='" + open_flag + '\'' +
                ", business_accept_id='" + business_accept_id + '\'' +
                ", ignore_codes='" + ignore_codes + '\'' +
                ", open_date='" + open_date + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
