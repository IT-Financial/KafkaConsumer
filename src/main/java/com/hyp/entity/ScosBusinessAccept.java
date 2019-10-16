package com.hyp.entity;

public class ScosBusinessAccept {
    private static final long serialVersionUID = 1L;
    private String id;
    private String change_date;
    private String change_emp;
    private String create_date;
    private String create_emp;
    private String enable_flag;
    private String open_source;
    private String unique_ser_no;
    private String attribute;
    private String opt_branch_code;
    private String card_info;
    private String card_status;
    private String cert_no;
    private String cert_type;
    private String cust_no;
    private String cust_status;
    private String e_app_id;
    private String image_commit_count;
    private String image_type;
    private String name;
    private String note;
    private String open_branch_code;
    private String open_date;
    private String sys_code;
    private String open_desc;
    private String mac_addr;
    private String ip;
    private String special_flag;
    private String other_cust_no;
    private String acct_no;
    private String acct_type;
    private String exist_ymt_no;
    private String ygt_flag;
    private String id_open_branch_code;
    private String client_source;
    private String bus_branch_code;
    private String type_scope;
    private String cust_type;
    private String org_attribute;
    private String normal_flag;
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

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOpt_branch_code() {
        return opt_branch_code;
    }

    public void setOpt_branch_code(String opt_branch_code) {
        this.opt_branch_code = opt_branch_code;
    }

    public String getCard_info() {
        return card_info;
    }

    public void setCard_info(String card_info) {
        this.card_info = card_info;
    }

    public String getCard_status() {
        return card_status;
    }

    public void setCard_status(String card_status) {
        this.card_status = card_status;
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

    public String getCust_no() {
        return cust_no;
    }

    public void setCust_no(String cust_no) {
        this.cust_no = cust_no;
    }

    public String getCust_status() {
        return cust_status;
    }

    public void setCust_status(String cust_status) {
        this.cust_status = cust_status;
    }

    public String getE_app_id() {
        return e_app_id;
    }

    public void setE_app_id(String e_app_id) {
        this.e_app_id = e_app_id;
    }

    public String getImage_commit_count() {
        return image_commit_count;
    }

    public void setImage_commit_count(String image_commit_count) {
        this.image_commit_count = image_commit_count;
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getOpen_branch_code() {
        return open_branch_code;
    }

    public void setOpen_branch_code(String open_branch_code) {
        this.open_branch_code = open_branch_code;
    }

    public String getOpen_date() {
        return open_date;
    }

    public void setOpen_date(String open_date) {
        this.open_date = open_date;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sys_code) {
        this.sys_code = sys_code;
    }

    public String getOpen_desc() {
        return open_desc;
    }

    public void setOpen_desc(String open_desc) {
        this.open_desc = open_desc;
    }

    public String getMac_addr() {
        return mac_addr;
    }

    public void setMac_addr(String mac_addr) {
        this.mac_addr = mac_addr;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSpecial_flag() {
        return special_flag;
    }

    public void setSpecial_flag(String special_flag) {
        this.special_flag = special_flag;
    }

    public String getOther_cust_no() {
        return other_cust_no;
    }

    public void setOther_cust_no(String other_cust_no) {
        this.other_cust_no = other_cust_no;
    }

    public String getAcct_no() {
        return acct_no;
    }

    public void setAcct_no(String acct_no) {
        this.acct_no = acct_no;
    }

    public String getAcct_type() {
        return acct_type;
    }

    public void setAcct_type(String acct_type) {
        this.acct_type = acct_type;
    }

    public String getExist_ymt_no() {
        return exist_ymt_no;
    }

    public void setExist_ymt_no(String exist_ymt_no) {
        this.exist_ymt_no = exist_ymt_no;
    }

    public String getYgt_flag() {
        return ygt_flag;
    }

    public void setYgt_flag(String ygt_flag) {
        this.ygt_flag = ygt_flag;
    }

    public String getId_open_branch_code() {
        return id_open_branch_code;
    }

    public void setId_open_branch_code(String id_open_branch_code) {
        this.id_open_branch_code = id_open_branch_code;
    }

    public String getClient_source() {
        return client_source;
    }

    public void setClient_source(String client_source) {
        this.client_source = client_source;
    }

    public String getBus_branch_code() {
        return bus_branch_code;
    }

    public void setBus_branch_code(String bus_branch_code) {
        this.bus_branch_code = bus_branch_code;
    }

    public String getType_scope() {
        return type_scope;
    }

    public void setType_scope(String type_scope) {
        this.type_scope = type_scope;
    }

    public String getCust_type() {
        return cust_type;
    }

    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
    }

    public String getOrg_attribute() {
        return org_attribute;
    }

    public void setOrg_attribute(String org_attribute) {
        this.org_attribute = org_attribute;
    }

    public String getNormal_flag() {
        return normal_flag;
    }

    public void setNormal_flag(String normal_flag) {
        this.normal_flag = normal_flag;
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
        return "ScosBusinessAccept{" +
                "id='" + id + '\'' +
                ", change_date='" + change_date + '\'' +
                ", change_emp='" + change_emp + '\'' +
                ", create_date='" + create_date + '\'' +
                ", create_emp='" + create_emp + '\'' +
                ", enable_flag='" + enable_flag + '\'' +
                ", open_source='" + open_source + '\'' +
                ", unique_ser_no='" + unique_ser_no + '\'' +
                ", attribute='" + attribute + '\'' +
                ", opt_branch_code='" + opt_branch_code + '\'' +
                ", card_info='" + card_info + '\'' +
                ", card_status='" + card_status + '\'' +
                ", cert_no='" + cert_no + '\'' +
                ", cert_type='" + cert_type + '\'' +
                ", cust_no='" + cust_no + '\'' +
                ", cust_status='" + cust_status + '\'' +
                ", e_app_id='" + e_app_id + '\'' +
                ", image_commit_count='" + image_commit_count + '\'' +
                ", image_type='" + image_type + '\'' +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", open_branch_code='" + open_branch_code + '\'' +
                ", open_date='" + open_date + '\'' +
                ", sys_code='" + sys_code + '\'' +
                ", open_desc='" + open_desc + '\'' +
                ", mac_addr='" + mac_addr + '\'' +
                ", ip='" + ip + '\'' +
                ", special_flag='" + special_flag + '\'' +
                ", other_cust_no='" + other_cust_no + '\'' +
                ", acct_no='" + acct_no + '\'' +
                ", acct_type='" + acct_type + '\'' +
                ", exist_ymt_no='" + exist_ymt_no + '\'' +
                ", ygt_flag='" + ygt_flag + '\'' +
                ", id_open_branch_code='" + id_open_branch_code + '\'' +
                ", client_source='" + client_source + '\'' +
                ", bus_branch_code='" + bus_branch_code + '\'' +
                ", type_scope='" + type_scope + '\'' +
                ", cust_type='" + cust_type + '\'' +
                ", org_attribute='" + org_attribute + '\'' +
                ", normal_flag='" + normal_flag + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
