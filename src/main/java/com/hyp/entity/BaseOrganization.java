package com.hyp.entity;

public class BaseOrganization {
    private static final long serialVersionUID = 1L;
    private String org_id;
    private String org_code;
    private String name;
    private String parent_org_id;
    private String org_type;
    private String province;
    private String city;
    private String area;
    private String address;
    private String zip_code;
    private String telphone;
    private String contact_person;
    private String fax;
    private String mail;
    private String description;
    private String entrust_phone;
    private String branch_seat;
    private String sell_manager;
    private String working_manager;
    private String relation_phone;
    private String weight;
    private String longitude;
    private String latitude;
    private String status;
    private String sycn_time;
    private String create_time;
    private String create_by;
    private String update_time;
    private String update_by;
    private String commission;
    private String alias;
    private String remark;
    private String default_model_id;
    private String commission_desc;
    private String auto_verify_status;
    private String GetTime;

    /* 以下三个字段, 调试专用, 非 kafka 消息包含的数据 */
    private int topic_par; /* 非 json 包含字段, 用于记录该消息所在的 topic partition */
    private long par_offset; /* 非 json 包含字段, 用于记录该消息所在的 partition 的 offset */
    private int payload_length; /* 非 json 包含字段, 用于记录该消息的 长度 */

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent_org_id() {
        return parent_org_id;
    }

    public void setParent_org_id(String parent_org_id) {
        this.parent_org_id = parent_org_id;
    }

    public String getOrg_type() {
        return org_type;
    }

    public void setOrg_type(String org_type) {
        this.org_type = org_type;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEntrust_phone() {
        return entrust_phone;
    }

    public void setEntrust_phone(String entrust_phone) {
        this.entrust_phone = entrust_phone;
    }

    public String getBranch_seat() {
        return branch_seat;
    }

    public void setBranch_seat(String branch_seat) {
        this.branch_seat = branch_seat;
    }

    public String getSell_manager() {
        return sell_manager;
    }

    public void setSell_manager(String sell_manager) {
        this.sell_manager = sell_manager;
    }

    public String getWorking_manager() {
        return working_manager;
    }

    public void setWorking_manager(String working_manager) {
        this.working_manager = working_manager;
    }

    public String getRelation_phone() {
        return relation_phone;
    }

    public void setRelation_phone(String relation_phone) {
        this.relation_phone = relation_phone;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSycn_time() {
        return sycn_time;
    }

    public void setSycn_time(String sycn_time) {
        this.sycn_time = sycn_time;
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

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDefault_model_id() {
        return default_model_id;
    }

    public void setDefault_model_id(String default_model_id) {
        this.default_model_id = default_model_id;
    }

    public String getCommission_desc() {
        return commission_desc;
    }

    public void setCommission_desc(String commission_desc) {
        this.commission_desc = commission_desc;
    }

    public String getAuto_verify_status() {
        return auto_verify_status;
    }

    public void setAuto_verify_status(String auto_verify_status) {
        this.auto_verify_status = auto_verify_status;
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
        return "BaseOrganization{" +
                "org_id='" + org_id + '\'' +
                ", org_code='" + org_code + '\'' +
                ", name='" + name + '\'' +
                ", parent_org_id='" + parent_org_id + '\'' +
                ", org_type='" + org_type + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", telphone='" + telphone + '\'' +
                ", contact_person='" + contact_person + '\'' +
                ", fax='" + fax + '\'' +
                ", mail='" + mail + '\'' +
                ", description='" + description + '\'' +
                ", entrust_phone='" + entrust_phone + '\'' +
                ", branch_seat='" + branch_seat + '\'' +
                ", sell_manager='" + sell_manager + '\'' +
                ", working_manager='" + working_manager + '\'' +
                ", relation_phone='" + relation_phone + '\'' +
                ", weight='" + weight + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", status='" + status + '\'' +
                ", sycn_time='" + sycn_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_by='" + create_by + '\'' +
                ", update_time='" + update_time + '\'' +
                ", update_by='" + update_by + '\'' +
                ", commission='" + commission + '\'' +
                ", alias='" + alias + '\'' +
                ", remark='" + remark + '\'' +
                ", default_model_id='" + default_model_id + '\'' +
                ", commission_desc='" + commission_desc + '\'' +
                ", auto_verify_status='" + auto_verify_status + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
