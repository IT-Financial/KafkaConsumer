package com.hyp.entity;

public class ScosBusScheduleDetail {
    private static final long serialVersionUID = 1L;
    private String id;
    private String change_date;
    private String change_emp;
    private String create_date;
    private String create_emp;
    private String enable_flag;
    private String open_source;
    private String unique_ser_no;
    private String archive_status;
    private String audit_emp;
    private String audit_note;
    private String audit_status;
    private String bean_codes;
    private String bean_names;
    private String branch_code;
    private String bus_id;
    private String bus_type;
    private String cert_no;
    private String cert_type;
    private String check_emp;
    private String cust_no;
    private String cust_type;
    private String image_archive_status;
    private String name;
    private String opt_branch_code;
    private String process_id;
    private String src_order_no;
    private String type;
    private String type_scope;
    private String econtract_flag;
    private String black_list_str;
    private String account_type;
    private String spec_bus_type;
    private String evaluate_flag;
    private String client_source;
    private String bus_effective_date;
    private String excute_in_matter_res_flag;
    private String open_branch_code;
    private String double_input_atomic_no;
    private String video_mode;
    private String video_emp_code;
    private String video_emp_name;
    private String archive_desc;
    private String archive_comment;
    private String roll_back_flag;
    private String roll_back_start_flag;
    private String roll_back_process;
    private String crm_flag;
    private String anti_money_laudry_desc;
    private String foreign_dignitaries_desc;
    private String high_risk_area_desc;
    private String archive_date;
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

    public String getArchive_status() {
        return archive_status;
    }

    public void setArchive_status(String archive_status) {
        this.archive_status = archive_status;
    }

    public String getAudit_emp() {
        return audit_emp;
    }

    public void setAudit_emp(String audit_emp) {
        this.audit_emp = audit_emp;
    }

    public String getAudit_note() {
        return audit_note;
    }

    public void setAudit_note(String audit_note) {
        this.audit_note = audit_note;
    }

    public String getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(String audit_status) {
        this.audit_status = audit_status;
    }

    public String getBean_codes() {
        return bean_codes;
    }

    public void setBean_codes(String bean_codes) {
        this.bean_codes = bean_codes;
    }

    public String getBean_names() {
        return bean_names;
    }

    public void setBean_names(String bean_names) {
        this.bean_names = bean_names;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public String getBus_id() {
        return bus_id;
    }

    public void setBus_id(String bus_id) {
        this.bus_id = bus_id;
    }

    public String getBus_type() {
        return bus_type;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
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

    public String getCheck_emp() {
        return check_emp;
    }

    public void setCheck_emp(String check_emp) {
        this.check_emp = check_emp;
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

    public String getImage_archive_status() {
        return image_archive_status;
    }

    public void setImage_archive_status(String image_archive_status) {
        this.image_archive_status = image_archive_status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpt_branch_code() {
        return opt_branch_code;
    }

    public void setOpt_branch_code(String opt_branch_code) {
        this.opt_branch_code = opt_branch_code;
    }

    public String getProcess_id() {
        return process_id;
    }

    public void setProcess_id(String process_id) {
        this.process_id = process_id;
    }

    public String getSrc_order_no() {
        return src_order_no;
    }

    public void setSrc_order_no(String src_order_no) {
        this.src_order_no = src_order_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_scope() {
        return type_scope;
    }

    public void setType_scope(String type_scope) {
        this.type_scope = type_scope;
    }

    public String getEcontract_flag() {
        return econtract_flag;
    }

    public void setEcontract_flag(String econtract_flag) {
        this.econtract_flag = econtract_flag;
    }

    public String getBlack_list_str() {
        return black_list_str;
    }

    public void setBlack_list_str(String black_list_str) {
        this.black_list_str = black_list_str;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getSpec_bus_type() {
        return spec_bus_type;
    }

    public void setSpec_bus_type(String spec_bus_type) {
        this.spec_bus_type = spec_bus_type;
    }

    public String getEvaluate_flag() {
        return evaluate_flag;
    }

    public void setEvaluate_flag(String evaluate_flag) {
        this.evaluate_flag = evaluate_flag;
    }

    public String getClient_source() {
        return client_source;
    }

    public void setClient_source(String client_source) {
        this.client_source = client_source;
    }

    public String getBus_effective_date() {
        return bus_effective_date;
    }

    public void setBus_effective_date(String bus_effective_date) {
        this.bus_effective_date = bus_effective_date;
    }

    public String getExcute_in_matter_res_flag() {
        return excute_in_matter_res_flag;
    }

    public void setExcute_in_matter_res_flag(String excute_in_matter_res_flag) {
        this.excute_in_matter_res_flag = excute_in_matter_res_flag;
    }

    public String getOpen_branch_code() {
        return open_branch_code;
    }

    public void setOpen_branch_code(String open_branch_code) {
        this.open_branch_code = open_branch_code;
    }

    public String getDouble_input_atomic_no() {
        return double_input_atomic_no;
    }

    public void setDouble_input_atomic_no(String double_input_atomic_no) {
        this.double_input_atomic_no = double_input_atomic_no;
    }

    public String getVideo_mode() {
        return video_mode;
    }

    public void setVideo_mode(String video_mode) {
        this.video_mode = video_mode;
    }

    public String getVideo_emp_code() {
        return video_emp_code;
    }

    public void setVideo_emp_code(String video_emp_code) {
        this.video_emp_code = video_emp_code;
    }

    public String getVideo_emp_name() {
        return video_emp_name;
    }

    public void setVideo_emp_name(String video_emp_name) {
        this.video_emp_name = video_emp_name;
    }

    public String getArchive_desc() {
        return archive_desc;
    }

    public void setArchive_desc(String archive_desc) {
        this.archive_desc = archive_desc;
    }

    public String getArchive_comment() {
        return archive_comment;
    }

    public void setArchive_comment(String archive_comment) {
        this.archive_comment = archive_comment;
    }

    public String getRoll_back_flag() {
        return roll_back_flag;
    }

    public void setRoll_back_flag(String roll_back_flag) {
        this.roll_back_flag = roll_back_flag;
    }

    public String getRoll_back_start_flag() {
        return roll_back_start_flag;
    }

    public void setRoll_back_start_flag(String roll_back_start_flag) {
        this.roll_back_start_flag = roll_back_start_flag;
    }

    public String getRoll_back_process() {
        return roll_back_process;
    }

    public void setRoll_back_process(String roll_back_process) {
        this.roll_back_process = roll_back_process;
    }

    public String getCrm_flag() {
        return crm_flag;
    }

    public void setCrm_flag(String crm_flag) {
        this.crm_flag = crm_flag;
    }

    public String getAnti_money_laudry_desc() {
        return anti_money_laudry_desc;
    }

    public void setAnti_money_laudry_desc(String anti_money_laudry_desc) {
        this.anti_money_laudry_desc = anti_money_laudry_desc;
    }

    public String getForeign_dignitaries_desc() {
        return foreign_dignitaries_desc;
    }

    public void setForeign_dignitaries_desc(String foreign_dignitaries_desc) {
        this.foreign_dignitaries_desc = foreign_dignitaries_desc;
    }

    public String getHigh_risk_area_desc() {
        return high_risk_area_desc;
    }

    public void setHigh_risk_area_desc(String high_risk_area_desc) {
        this.high_risk_area_desc = high_risk_area_desc;
    }

    public String getArchive_date() {
        return archive_date;
    }

    public void setArchive_date(String archive_date) {
        this.archive_date = archive_date;
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
        return "ScosBusScheduleDetail{" +
                "id='" + id + '\'' +
                ", change_date='" + change_date + '\'' +
                ", change_emp='" + change_emp + '\'' +
                ", create_date='" + create_date + '\'' +
                ", create_emp='" + create_emp + '\'' +
                ", enable_flag='" + enable_flag + '\'' +
                ", open_source='" + open_source + '\'' +
                ", unique_ser_no='" + unique_ser_no + '\'' +
                ", archive_status='" + archive_status + '\'' +
                ", audit_emp='" + audit_emp + '\'' +
                ", audit_note='" + audit_note + '\'' +
                ", audit_status='" + audit_status + '\'' +
                ", bean_codes='" + bean_codes + '\'' +
                ", bean_names='" + bean_names + '\'' +
                ", branch_code='" + branch_code + '\'' +
                ", bus_id='" + bus_id + '\'' +
                ", bus_type='" + bus_type + '\'' +
                ", cert_no='" + cert_no + '\'' +
                ", cert_type='" + cert_type + '\'' +
                ", check_emp='" + check_emp + '\'' +
                ", cust_no='" + cust_no + '\'' +
                ", cust_type='" + cust_type + '\'' +
                ", image_archive_status='" + image_archive_status + '\'' +
                ", name='" + name + '\'' +
                ", opt_branch_code='" + opt_branch_code + '\'' +
                ", process_id='" + process_id + '\'' +
                ", src_order_no='" + src_order_no + '\'' +
                ", type='" + type + '\'' +
                ", type_scope='" + type_scope + '\'' +
                ", econtract_flag='" + econtract_flag + '\'' +
                ", black_list_str='" + black_list_str + '\'' +
                ", account_type='" + account_type + '\'' +
                ", spec_bus_type='" + spec_bus_type + '\'' +
                ", evaluate_flag='" + evaluate_flag + '\'' +
                ", client_source='" + client_source + '\'' +
                ", bus_effective_date='" + bus_effective_date + '\'' +
                ", excute_in_matter_res_flag='" + excute_in_matter_res_flag + '\'' +
                ", open_branch_code='" + open_branch_code + '\'' +
                ", double_input_atomic_no='" + double_input_atomic_no + '\'' +
                ", video_mode='" + video_mode + '\'' +
                ", video_emp_code='" + video_emp_code + '\'' +
                ", video_emp_name='" + video_emp_name + '\'' +
                ", archive_desc='" + archive_desc + '\'' +
                ", archive_comment='" + archive_comment + '\'' +
                ", roll_back_flag='" + roll_back_flag + '\'' +
                ", roll_back_start_flag='" + roll_back_start_flag + '\'' +
                ", roll_back_process='" + roll_back_process + '\'' +
                ", crm_flag='" + crm_flag + '\'' +
                ", anti_money_laudry_desc='" + anti_money_laudry_desc + '\'' +
                ", foreign_dignitaries_desc='" + foreign_dignitaries_desc + '\'' +
                ", high_risk_area_desc='" + high_risk_area_desc + '\'' +
                ", archive_date='" + archive_date + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
