package com.hyp.common;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "config")
public class AppConfigManager {

    //定义tableName
    public  String crd_bank_acc_interface;
    public  String crd_bank_trf_interface;
    public  String olpayTradeRecord;
    public  String accountoperation;
    public  String fundDetail;
    public  String opt_bank_acc_interface;
    public  String opt_bank_trf_interface;
    public  String bank_trf_interface;
    public  String bank_acc_interface;
    public  String check_summary;
    public  String other_change;
    public  String fund_stock_change;
    public  String scos_audit_task;
    public  String scos_business_accept;
    public  String scos_business_choose;
    public  String scos_bus_schedule_detail;
    public  String user_presence;
    public  String base_organization;
    public  String mess_task;
    public  String scos_bus_basic_taskinfo;
    public  String scos_audit_schedule_log;
    public  String scos_audit_log;
    public  String base_sys_user;
    public  String user_business_flow;
    public  String user_accounts;
    public  String scos_business_choose_detail;
    public  String not_use;
    //入库最大时间间隔
    public  int interval;
    public  int batchSize;


    public String getCrd_bank_acc_interface() {
        return crd_bank_acc_interface;
    }

    public void setCrd_bank_acc_interface(String crd_bank_acc_interface) {
        this.crd_bank_acc_interface = crd_bank_acc_interface;
    }

    public String getCrd_bank_trf_interface() {
        return crd_bank_trf_interface;
    }

    public void setCrd_bank_trf_interface(String crd_bank_trf_interface) {
        this.crd_bank_trf_interface = crd_bank_trf_interface;
    }

    public String getOlpayTradeRecord() {
        return olpayTradeRecord;
    }

    public void setOlpayTradeRecord(String olpayTradeRecord) {
        this.olpayTradeRecord = olpayTradeRecord;
    }

    public String getAccountoperation() {
        return accountoperation;
    }

    public void setAccountoperation(String accountoperation) {
        this.accountoperation = accountoperation;
    }

    public String getFundDetail() {
        return fundDetail;
    }

    public void setFundDetail(String fundDetail) {
        this.fundDetail = fundDetail;
    }

    public String getOpt_bank_acc_interface() {
        return opt_bank_acc_interface;
    }

    public void setOpt_bank_acc_interface(String opt_bank_acc_interface) {
        this.opt_bank_acc_interface = opt_bank_acc_interface;
    }

    public String getOpt_bank_trf_interface() {
        return opt_bank_trf_interface;
    }

    public void setOpt_bank_trf_interface(String opt_bank_trf_interface) {
        this.opt_bank_trf_interface = opt_bank_trf_interface;
    }

    public String getBank_trf_interface() {
        return bank_trf_interface;
    }

    public void setBank_trf_interface(String bank_trf_interface) {
        this.bank_trf_interface = bank_trf_interface;
    }

    public String getBank_acc_interface() {
        return bank_acc_interface;
    }

    public void setBank_acc_interface(String bank_acc_interface) {
        this.bank_acc_interface = bank_acc_interface;
    }

    public String getCheck_summary() {
        return check_summary;
    }

    public void setCheck_summary(String check_summary) {
        this.check_summary = check_summary;
    }

    public String getOther_change() {
        return other_change;
    }

    public void setOther_change(String other_change) {
        this.other_change = other_change;
    }

    public String getFund_stock_change() {
        return fund_stock_change;
    }

    public void setFund_stock_change(String fund_stock_change) {
        this.fund_stock_change = fund_stock_change;
    }

    public String getNot_use() {
        return not_use;
    }

    public void setNot_use(String not_use) {
        this.not_use = not_use;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public String getScos_audit_task() {
        return scos_audit_task;
    }

    public void setScos_audit_task(String scos_audit_task) {
        this.scos_audit_task = scos_audit_task;
    }

    public String getScos_business_accept() {
        return scos_business_accept;
    }

    public void setScos_business_accept(String scos_business_accept) {
        this.scos_business_accept = scos_business_accept;
    }

    public String getScos_business_choose() {
        return scos_business_choose;
    }

    public void setScos_business_choose(String scos_business_choose) {
        this.scos_business_choose = scos_business_choose;
    }

    public String getScos_bus_schedule_detail() {
        return scos_bus_schedule_detail;
    }

    public void setScos_bus_schedule_detail(String scos_bus_schedule_detail) {
        this.scos_bus_schedule_detail = scos_bus_schedule_detail;
    }

    public String getUser_presence() {
        return user_presence;
    }

    public void setUser_presence(String user_presence) {
        this.user_presence = user_presence;
    }

    public String getBase_organization() {
        return base_organization;
    }

    public void setBase_organization(String base_organization) {
        this.base_organization = base_organization;
    }

    public String getMess_task() {
        return mess_task;
    }

    public void setMess_task(String mess_task) {
        this.mess_task = mess_task;
    }

    public String getScos_bus_basic_taskinfo() {
        return scos_bus_basic_taskinfo;
    }

    public void setScos_bus_basic_taskinfo(String scos_bus_basic_taskinfo) {
        this.scos_bus_basic_taskinfo = scos_bus_basic_taskinfo;
    }

    public String getScos_audit_schedule_log() {
        return scos_audit_schedule_log;
    }

    public void setScos_audit_schedule_log(String scos_audit_schedule_log) {
        this.scos_audit_schedule_log = scos_audit_schedule_log;
    }

    public String getScos_audit_log() {
        return scos_audit_log;
    }

    public void setScos_audit_log(String scos_audit_log) {
        this.scos_audit_log = scos_audit_log;
    }

    public String getBase_sys_user() {
        return base_sys_user;
    }

    public void setBase_sys_user(String base_sys_user) {
        this.base_sys_user = base_sys_user;
    }

    public String getUser_business_flow() {
        return user_business_flow;
    }

    public void setUser_business_flow(String user_business_flow) {
        this.user_business_flow = user_business_flow;
    }

    public String getUser_accounts() {
        return user_accounts;
    }

    public void setUser_accounts(String user_accounts) {
        this.user_accounts = user_accounts;
    }

    public String getScos_business_choose_detail() {
        return scos_business_choose_detail;
    }

    public void setScos_business_choose_detail(String scos_business_choose_detail) {
        this.scos_business_choose_detail = scos_business_choose_detail;
    }
}
