package com.hyp.entity;

public class ScosAuditTask {
    private static final long serialVersionUID = 1L;
    private String id;
    private String change_date;
    private String change_emp;
    private String create_date;
    private String create_emp;
    private String enable_flag;
    private String accept_serial_no;
    private String atomic_no;
    private String match_atomic_no;
    private String audit_status;
    private String cert_no;
    private String cert_type;
    private String curr_flow_node;
    private String cust_no;
    private String cust_type;
    private String lock_emp;
    private String lock_flag;
    private String name;
    private String next_flow_emp;
    private String next_flow_mode;
    private String next_flow_node;
    private String next_flow_post;
    private String type_scope;
    private String business_schedule_id;
    private String process_audit_detail_id;
    private String process_audit_id;
    private String audit_type;
    private String ser_no;
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

    public String getAccept_serial_no() {
        return accept_serial_no;
    }

    public void setAccept_serial_no(String accept_serial_no) {
        this.accept_serial_no = accept_serial_no;
    }

    public String getAtomic_no() {
        return atomic_no;
    }

    public void setAtomic_no(String atomic_no) {
        this.atomic_no = atomic_no;
    }

    public String getMatch_atomic_no() {
        return match_atomic_no;
    }

    public void setMatch_atomic_no(String match_atomic_no) {
        this.match_atomic_no = match_atomic_no;
    }

    public String getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(String audit_status) {
        this.audit_status = audit_status;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCurr_flow_node() {
        return curr_flow_node;
    }

    public void setCurr_flow_node(String curr_flow_node) {
        this.curr_flow_node = curr_flow_node;
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

    public String getLock_emp() {
        return lock_emp;
    }

    public void setLock_emp(String lock_emp) {
        this.lock_emp = lock_emp;
    }

    public String getLock_flag() {
        return lock_flag;
    }

    public void setLock_flag(String lock_flag) {
        this.lock_flag = lock_flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNext_flow_emp() {
        return next_flow_emp;
    }

    public void setNext_flow_emp(String next_flow_emp) {
        this.next_flow_emp = next_flow_emp;
    }

    public String getNext_flow_mode() {
        return next_flow_mode;
    }

    public void setNext_flow_mode(String next_flow_mode) {
        this.next_flow_mode = next_flow_mode;
    }

    public String getNext_flow_node() {
        return next_flow_node;
    }

    public void setNext_flow_node(String next_flow_node) {
        this.next_flow_node = next_flow_node;
    }

    public String getNext_flow_post() {
        return next_flow_post;
    }

    public void setNext_flow_post(String next_flow_post) {
        this.next_flow_post = next_flow_post;
    }

    public String getType_scope() {
        return type_scope;
    }

    public void setType_scope(String type_scope) {
        this.type_scope = type_scope;
    }

    public String getBusiness_schedule_id() {
        return business_schedule_id;
    }

    public void setBusiness_schedule_id(String business_schedule_id) {
        this.business_schedule_id = business_schedule_id;
    }

    public String getProcess_audit_detail_id() {
        return process_audit_detail_id;
    }

    public void setProcess_audit_detail_id(String process_audit_detail_id) {
        this.process_audit_detail_id = process_audit_detail_id;
    }

    public String getProcess_audit_id() {
        return process_audit_id;
    }

    public void setProcess_audit_id(String process_audit_id) {
        this.process_audit_id = process_audit_id;
    }

    public String getAudit_type() {
        return audit_type;
    }

    public void setAudit_type(String audit_type) {
        this.audit_type = audit_type;
    }

    public String getSer_no() {
        return ser_no;
    }

    public void setSer_no(String ser_no) {
        this.ser_no = ser_no;
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
        return "ScosAuditTask{" +
                "id='" + id + '\'' +
                ", change_date='" + change_date + '\'' +
                ", change_emp='" + change_emp + '\'' +
                ", create_date='" + create_date + '\'' +
                ", create_emp='" + create_emp + '\'' +
                ", enable_flag='" + enable_flag + '\'' +
                ", accept_serial_no='" + accept_serial_no + '\'' +
                ", atomic_no='" + atomic_no + '\'' +
                ", match_atomic_no='" + match_atomic_no + '\'' +
                ", audit_status='" + audit_status + '\'' +
                ", cert_no='" + cert_no + '\'' +
                ", cert_type='" + cert_type + '\'' +
                ", curr_flow_node='" + curr_flow_node + '\'' +
                ", cust_no='" + cust_no + '\'' +
                ", cust_type='" + cust_type + '\'' +
                ", lock_emp='" + lock_emp + '\'' +
                ", lock_flag='" + lock_flag + '\'' +
                ", name='" + name + '\'' +
                ", next_flow_emp='" + next_flow_emp + '\'' +
                ", next_flow_mode='" + next_flow_mode + '\'' +
                ", next_flow_node='" + next_flow_node + '\'' +
                ", next_flow_post='" + next_flow_post + '\'' +
                ", type_scope='" + type_scope + '\'' +
                ", business_schedule_id='" + business_schedule_id + '\'' +
                ", process_audit_detail_id='" + process_audit_detail_id + '\'' +
                ", process_audit_id='" + process_audit_id + '\'' +
                ", audit_type='" + audit_type + '\'' +
                ", ser_no='" + ser_no + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
