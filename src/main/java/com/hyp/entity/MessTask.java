package com.hyp.entity;

public class MessTask {
    private static final long serialVersionUID = 1L;
    private String task_id;
    private String task_no;
    private String task_type;
    private String title;
    private String content;
    private String create_time;
    private String user_id;
    private String user_name;
    private String org_id;
    private String deal_time;
    private String emp_id;
    private String emp_name;
    private String status;
    private String finish_time;
    private String result_comment;
    private String anti_emp_id;
    private String business_detail_id;
    private String app_id;
    private String locked_flag;
    private String submit_type;
    private String auto_verify_status;
    private String auto_verify_comments;
    private String call_back;
    private String auto_confirm_status;
    private String GetTime;

    /* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
    private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
    private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
    private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getTask_no() {
        return task_no;
    }

    public void setTask_no(String task_no) {
        this.task_no = task_no;
    }

    public String getTask_type() {
        return task_type;
    }

    public void setTask_type(String task_type) {
        this.task_type = task_type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getDeal_time() {
        return deal_time;
    }

    public void setDeal_time(String deal_time) {
        this.deal_time = deal_time;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFinish_time() {
        return finish_time;
    }

    public void setFinish_time(String finish_time) {
        this.finish_time = finish_time;
    }

    public String getResult_comment() {
        return result_comment;
    }

    public void setResult_comment(String result_comment) {
        this.result_comment = result_comment;
    }

    public String getAnti_emp_id() {
        return anti_emp_id;
    }

    public void setAnti_emp_id(String anti_emp_id) {
        this.anti_emp_id = anti_emp_id;
    }

    public String getBusiness_detail_id() {
        return business_detail_id;
    }

    public void setBusiness_detail_id(String business_detail_id) {
        this.business_detail_id = business_detail_id;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getLocked_flag() {
        return locked_flag;
    }

    public void setLocked_flag(String locked_flag) {
        this.locked_flag = locked_flag;
    }

    public String getSubmit_type() {
        return submit_type;
    }

    public void setSubmit_type(String submit_type) {
        this.submit_type = submit_type;
    }

    public String getAuto_verify_status() {
        return auto_verify_status;
    }

    public void setAuto_verify_status(String auto_verify_status) {
        this.auto_verify_status = auto_verify_status;
    }

    public String getAuto_verify_comments() {
        return auto_verify_comments;
    }

    public void setAuto_verify_comments(String auto_verify_comments) {
        this.auto_verify_comments = auto_verify_comments;
    }

    public String getCall_back() {
        return call_back;
    }

    public void setCall_back(String call_back) {
        this.call_back = call_back;
    }

    public String getAuto_confirm_status() {
        return auto_confirm_status;
    }

    public void setAuto_confirm_status(String auto_confirm_status) {
        this.auto_confirm_status = auto_confirm_status;
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
        return "MessTask{" +
                "task_id='" + task_id + '\'' +
                ", task_no='" + task_no + '\'' +
                ", task_type='" + task_type + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", create_time='" + create_time + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", org_id='" + org_id + '\'' +
                ", deal_time='" + deal_time + '\'' +
                ", emp_id='" + emp_id + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", status='" + status + '\'' +
                ", finish_time='" + finish_time + '\'' +
                ", result_comment='" + result_comment + '\'' +
                ", anti_emp_id='" + anti_emp_id + '\'' +
                ", business_detail_id='" + business_detail_id + '\'' +
                ", app_id='" + app_id + '\'' +
                ", locked_flag='" + locked_flag + '\'' +
                ", submit_type='" + submit_type + '\'' +
                ", auto_verify_status='" + auto_verify_status + '\'' +
                ", auto_verify_comments='" + auto_verify_comments + '\'' +
                ", call_back='" + call_back + '\'' +
                ", auto_confirm_status='" + auto_confirm_status + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
