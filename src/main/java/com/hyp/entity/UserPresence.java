package com.hyp.entity;

public class UserPresence {
    private static final long serialVersionUID = 1L;
    private String id;
    private String user_id;
    private String user_no;
    private String user_name;
    private String mobile;
    private String ogr_id;
    private String identified_flag;
    private String source_type;
    private String source_detail_id;
    private String province;
    private String city;
    private String area;
    private String address;
    private String full_address;
    private String fax;
    private String telphone;
    private String zip_code;
    private String mail_address;
    private String degree_code;
    private String profession_code;
    private String service_type;
    private String status;
    private String callback_day_type;
    private String callback_time;
    private String create_time;
    private String submit_time;
    private String end_time;
    private String last_update_time;
    private String last_update_by;
    private String flow_version;
    private String user_status;
    private String sign_flag;
    private String user_flow_status;
    private String broker_code;
    private String register_way;
    private String access_way;
    private String attr1;
    private String fr_score;
    private String channel_id;
    private String client_type;
    private String user_agent;
    private String channel_comment;
    private String archive_flag;
    private String model_id;
    private String archive_date;
    private String verify_code;
    private String witness_type;
    private String device_model;
    private String video_empid;
    private String audio_empid;
    private String review_empid;
    private String invite_code;
    private String counter_model_no;
    private String device_id;
    private String fa_success_time;
    private String zd_flag;
    private String handle_empid;
    private String handle_flag;
    private String risk_agreement_type;
    private String no_open_reason;
    private String device_cids;
    private String device_type;
    private String job_position;
    private String work_units;
    private String controllers_is_self;
    private String beneficiary_is_self;
    private String credit_record_good;
    private String bad_record_source;
    private String flow_no;
    private String mobile_style;
    private String error_count;
    private String black_type;
    private String mobile_style_last;
    private String user_agent_last;
    private String deal_type;
    private String auto_verify_comments;
    private String transfer_flag;
    private String dept_select_flag;
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

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_no() {
        return user_no;
    }

    public void setUser_no(String user_no) {
        this.user_no = user_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOgr_id() {
        return ogr_id;
    }

    public void setOgr_id(String ogr_id) {
        this.ogr_id = ogr_id;
    }

    public String getIdentified_flag() {
        return identified_flag;
    }

    public void setIdentified_flag(String identified_flag) {
        this.identified_flag = identified_flag;
    }

    public String getSource_type() {
        return source_type;
    }

    public void setSource_type(String source_type) {
        this.source_type = source_type;
    }

    public String getSource_detail_id() {
        return source_detail_id;
    }

    public void setSource_detail_id(String source_detail_id) {
        this.source_detail_id = source_detail_id;
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

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address;
    }

    public String getDegree_code() {
        return degree_code;
    }

    public void setDegree_code(String degree_code) {
        this.degree_code = degree_code;
    }

    public String getProfession_code() {
        return profession_code;
    }

    public void setProfession_code(String profession_code) {
        this.profession_code = profession_code;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCallback_day_type() {
        return callback_day_type;
    }

    public void setCallback_day_type(String callback_day_type) {
        this.callback_day_type = callback_day_type;
    }

    public String getCallback_time() {
        return callback_time;
    }

    public void setCallback_time(String callback_time) {
        this.callback_time = callback_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(String submit_time) {
        this.submit_time = submit_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getLast_update_time() {
        return last_update_time;
    }

    public void setLast_update_time(String last_update_time) {
        this.last_update_time = last_update_time;
    }

    public String getLast_update_by() {
        return last_update_by;
    }

    public void setLast_update_by(String last_update_by) {
        this.last_update_by = last_update_by;
    }

    public String getFlow_version() {
        return flow_version;
    }

    public void setFlow_version(String flow_version) {
        this.flow_version = flow_version;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getSign_flag() {
        return sign_flag;
    }

    public void setSign_flag(String sign_flag) {
        this.sign_flag = sign_flag;
    }

    public String getUser_flow_status() {
        return user_flow_status;
    }

    public void setUser_flow_status(String user_flow_status) {
        this.user_flow_status = user_flow_status;
    }

    public String getBroker_code() {
        return broker_code;
    }

    public void setBroker_code(String broker_code) {
        this.broker_code = broker_code;
    }

    public String getRegister_way() {
        return register_way;
    }

    public void setRegister_way(String register_way) {
        this.register_way = register_way;
    }

    public String getAccess_way() {
        return access_way;
    }

    public void setAccess_way(String access_way) {
        this.access_way = access_way;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getFr_score() {
        return fr_score;
    }

    public void setFr_score(String fr_score) {
        this.fr_score = fr_score;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getClient_type() {
        return client_type;
    }

    public void setClient_type(String client_type) {
        this.client_type = client_type;
    }

    public String getUser_agent() {
        return user_agent;
    }

    public void setUser_agent(String user_agent) {
        this.user_agent = user_agent;
    }

    public String getChannel_comment() {
        return channel_comment;
    }

    public void setChannel_comment(String channel_comment) {
        this.channel_comment = channel_comment;
    }

    public String getArchive_flag() {
        return archive_flag;
    }

    public void setArchive_flag(String archive_flag) {
        this.archive_flag = archive_flag;
    }

    public String getModel_id() {
        return model_id;
    }

    public void setModel_id(String model_id) {
        this.model_id = model_id;
    }

    public String getArchive_date() {
        return archive_date;
    }

    public void setArchive_date(String archive_date) {
        this.archive_date = archive_date;
    }

    public String getVerify_code() {
        return verify_code;
    }

    public void setVerify_code(String verify_code) {
        this.verify_code = verify_code;
    }

    public String getWitness_type() {
        return witness_type;
    }

    public void setWitness_type(String witness_type) {
        this.witness_type = witness_type;
    }

    public String getDevice_model() {
        return device_model;
    }

    public void setDevice_model(String device_model) {
        this.device_model = device_model;
    }

    public String getVideo_empid() {
        return video_empid;
    }

    public void setVideo_empid(String video_empid) {
        this.video_empid = video_empid;
    }

    public String getAudio_empid() {
        return audio_empid;
    }

    public void setAudio_empid(String audio_empid) {
        this.audio_empid = audio_empid;
    }

    public String getReview_empid() {
        return review_empid;
    }

    public void setReview_empid(String review_empid) {
        this.review_empid = review_empid;
    }

    public String getInvite_code() {
        return invite_code;
    }

    public void setInvite_code(String invite_code) {
        this.invite_code = invite_code;
    }

    public String getCounter_model_no() {
        return counter_model_no;
    }

    public void setCounter_model_no(String counter_model_no) {
        this.counter_model_no = counter_model_no;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getFa_success_time() {
        return fa_success_time;
    }

    public void setFa_success_time(String fa_success_time) {
        this.fa_success_time = fa_success_time;
    }

    public String getZd_flag() {
        return zd_flag;
    }

    public void setZd_flag(String zd_flag) {
        this.zd_flag = zd_flag;
    }

    public String getHandle_empid() {
        return handle_empid;
    }

    public void setHandle_empid(String handle_empid) {
        this.handle_empid = handle_empid;
    }

    public String getHandle_flag() {
        return handle_flag;
    }

    public void setHandle_flag(String handle_flag) {
        this.handle_flag = handle_flag;
    }

    public String getRisk_agreement_type() {
        return risk_agreement_type;
    }

    public void setRisk_agreement_type(String risk_agreement_type) {
        this.risk_agreement_type = risk_agreement_type;
    }

    public String getNo_open_reason() {
        return no_open_reason;
    }

    public void setNo_open_reason(String no_open_reason) {
        this.no_open_reason = no_open_reason;
    }

    public String getDevice_cids() {
        return device_cids;
    }

    public void setDevice_cids(String device_cids) {
        this.device_cids = device_cids;
    }

    public String getDevice_type() {
        return device_type;
    }

    public void setDevice_type(String device_type) {
        this.device_type = device_type;
    }

    public String getJob_position() {
        return job_position;
    }

    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }

    public String getWork_units() {
        return work_units;
    }

    public void setWork_units(String work_units) {
        this.work_units = work_units;
    }

    public String getControllers_is_self() {
        return controllers_is_self;
    }

    public void setControllers_is_self(String controllers_is_self) {
        this.controllers_is_self = controllers_is_self;
    }

    public String getBeneficiary_is_self() {
        return beneficiary_is_self;
    }

    public void setBeneficiary_is_self(String beneficiary_is_self) {
        this.beneficiary_is_self = beneficiary_is_self;
    }

    public String getCredit_record_good() {
        return credit_record_good;
    }

    public void setCredit_record_good(String credit_record_good) {
        this.credit_record_good = credit_record_good;
    }

    public String getBad_record_source() {
        return bad_record_source;
    }

    public void setBad_record_source(String bad_record_source) {
        this.bad_record_source = bad_record_source;
    }

    public String getFlow_no() {
        return flow_no;
    }

    public void setFlow_no(String flow_no) {
        this.flow_no = flow_no;
    }

    public String getMobile_style() {
        return mobile_style;
    }

    public void setMobile_style(String mobile_style) {
        this.mobile_style = mobile_style;
    }

    public String getError_count() {
        return error_count;
    }

    public void setError_count(String error_count) {
        this.error_count = error_count;
    }

    public String getBlack_type() {
        return black_type;
    }

    public void setBlack_type(String black_type) {
        this.black_type = black_type;
    }

    public String getMobile_style_last() {
        return mobile_style_last;
    }

    public void setMobile_style_last(String mobile_style_last) {
        this.mobile_style_last = mobile_style_last;
    }

    public String getUser_agent_last() {
        return user_agent_last;
    }

    public void setUser_agent_last(String user_agent_last) {
        this.user_agent_last = user_agent_last;
    }

    public String getDeal_type() {
        return deal_type;
    }

    public void setDeal_type(String deal_type) {
        this.deal_type = deal_type;
    }

    public String getAuto_verify_comments() {
        return auto_verify_comments;
    }

    public void setAuto_verify_comments(String auto_verify_comments) {
        this.auto_verify_comments = auto_verify_comments;
    }

    public String getTransfer_flag() {
        return transfer_flag;
    }

    public void setTransfer_flag(String transfer_flag) {
        this.transfer_flag = transfer_flag;
    }

    public String getDept_select_flag() {
        return dept_select_flag;
    }

    public void setDept_select_flag(String dept_select_flag) {
        this.dept_select_flag = dept_select_flag;
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
        return "UserPresence{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", user_no='" + user_no + '\'' +
                ", user_name='" + user_name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", ogr_id='" + ogr_id + '\'' +
                ", identified_flag='" + identified_flag + '\'' +
                ", source_type='" + source_type + '\'' +
                ", source_detail_id='" + source_detail_id + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", full_address='" + full_address + '\'' +
                ", fax='" + fax + '\'' +
                ", telphone='" + telphone + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", mail_address='" + mail_address + '\'' +
                ", degree_code='" + degree_code + '\'' +
                ", profession_code='" + profession_code + '\'' +
                ", service_type='" + service_type + '\'' +
                ", status='" + status + '\'' +
                ", callback_day_type='" + callback_day_type + '\'' +
                ", callback_time='" + callback_time + '\'' +
                ", create_time='" + create_time + '\'' +
                ", submit_time='" + submit_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", last_update_time='" + last_update_time + '\'' +
                ", last_update_by='" + last_update_by + '\'' +
                ", flow_version='" + flow_version + '\'' +
                ", user_status='" + user_status + '\'' +
                ", sign_flag='" + sign_flag + '\'' +
                ", user_flow_status='" + user_flow_status + '\'' +
                ", broker_code='" + broker_code + '\'' +
                ", register_way='" + register_way + '\'' +
                ", access_way='" + access_way + '\'' +
                ", attr1='" + attr1 + '\'' +
                ", fr_score='" + fr_score + '\'' +
                ", channel_id='" + channel_id + '\'' +
                ", client_type='" + client_type + '\'' +
                ", user_agent='" + user_agent + '\'' +
                ", channel_comment='" + channel_comment + '\'' +
                ", archive_flag='" + archive_flag + '\'' +
                ", model_id='" + model_id + '\'' +
                ", archive_date='" + archive_date + '\'' +
                ", verify_code='" + verify_code + '\'' +
                ", witness_type='" + witness_type + '\'' +
                ", device_model='" + device_model + '\'' +
                ", video_empid='" + video_empid + '\'' +
                ", audio_empid='" + audio_empid + '\'' +
                ", review_empid='" + review_empid + '\'' +
                ", invite_code='" + invite_code + '\'' +
                ", counter_model_no='" + counter_model_no + '\'' +
                ", device_id='" + device_id + '\'' +
                ", fa_success_time='" + fa_success_time + '\'' +
                ", zd_flag='" + zd_flag + '\'' +
                ", handle_empid='" + handle_empid + '\'' +
                ", handle_flag='" + handle_flag + '\'' +
                ", risk_agreement_type='" + risk_agreement_type + '\'' +
                ", no_open_reason='" + no_open_reason + '\'' +
                ", device_cids='" + device_cids + '\'' +
                ", device_type='" + device_type + '\'' +
                ", job_position='" + job_position + '\'' +
                ", work_units='" + work_units + '\'' +
                ", controllers_is_self='" + controllers_is_self + '\'' +
                ", beneficiary_is_self='" + beneficiary_is_self + '\'' +
                ", credit_record_good='" + credit_record_good + '\'' +
                ", bad_record_source='" + bad_record_source + '\'' +
                ", flow_no='" + flow_no + '\'' +
                ", mobile_style='" + mobile_style + '\'' +
                ", error_count='" + error_count + '\'' +
                ", black_type='" + black_type + '\'' +
                ", mobile_style_last='" + mobile_style_last + '\'' +
                ", user_agent_last='" + user_agent_last + '\'' +
                ", deal_type='" + deal_type + '\'' +
                ", auto_verify_comments='" + auto_verify_comments + '\'' +
                ", transfer_flag='" + transfer_flag + '\'' +
                ", dept_select_flag='" + dept_select_flag + '\'' +
                ", GetTime='" + GetTime + '\'' +
                ", topic_par=" + topic_par +
                ", par_offset=" + par_offset +
                ", payload_length=" + payload_length +
                '}';
    }
}
