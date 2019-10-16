package com.hyp.dao;

import com.hyp.common.Constants;
import com.hyp.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.util.List;

/**
 * @author hyp
 * @Description: mysql 入库工具类
 * @Date: 2019-04-03 0:42
 */

@Service("mysqlHelperService")
public class MysqlHelperService implements IMysqlHelperService{

    private static final Logger logger = LoggerFactory.getLogger(MysqlHelperService.class);

    @Autowired
    JdbcTemplate jdbcTemplate;
    int insertBatchSize = 500;

    @Override
    public void setAccountOperationList(List<AccountOperation> aoList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into accountoperation(txdate,txtime,bank_acc,app_flag,app_acc,cust_name,serial_no,tx_type,oper,"
                    +"bank_area,depu_bank,tx_channel,is_active,trade_date,TOPIC_PAR,PAR_OFFSET,PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (AccountOperation accountOperation : aoList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getTxdate()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getTxtime()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getBank_acc()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getApp_flag()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getApp_acc()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getCust_name()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getSerial_no()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getTx_type()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getOper()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getBank_area()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getDepu_bank()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getTx_channel()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getIs_active()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getTrade_date()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(accountOperation.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(accountOperation.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(accountOperation.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+accountOperation.getGetTime()+Constants.SPLIT_SINGLE);
                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[AccountOperation]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+aoList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[AccountOperation]异常！]"+e.getMessage(),e);
        }
    }

    @Override
    public void setCrdBankAccInterfaceList(List<CrdBankAccInterface> cbaList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into CRD_BANK_ACC_INTERFACE (OCCUR_BRANCH, BANK_CODE, BANK_ACC_NO, NEW_BANK_ACC_NO, BANK_CUST_NO, CUST_NO,"
                    + "CUST_TYPE, REQUEST_TYPE, BANK_SERIAL_NO, SH_HOLDER_ACC_NO, SZ_HOLDER_ACC_NO, NAME, ALL_NAME, CERT_TYPE, ID_NO,"
                    + "PHONE, ADDR, POSTCODE, NEW_OPEN_FLAG, RETURN_CODE, RETURN_INFO, DIGITAL_SIGNATURE, PAGER, ENTRUST_METHOD, REPAIR_FLAG, "
                    + "BRANCH_CODE, EMAIL, EMAIL_FLAG, MOBILE, BANK_EMP_CODE, BANK_QUERY_PWD, BANK_DRAW_PWD, BANK_ACC_FLAG, NEW_BANK_ACC_FLAG, "
                    + "CURRENCY_TYPE, SEND_FLAG, BRANCH_SERIAL_NO, EMP_CODE, BANK_ENTRUST, SERIAL_NO, PWD, DEAL_FLAG, REQUEST_DATE, REQUEST_TIME, "
                    + "SOURCE_TYPE, FUND_ACC_NO, BANK_JOINT, FUND_SERIAL_NO, RETURN_DATE, RETURN_TIME, SPARE1, SPARE2, SPARE3, SPARE4, COM_HANDLE, "
                    + "TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (CrdBankAccInterface crdBankAccInterface : cbaList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getOccur_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getNew_bank_acc_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_cust_no()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getCust_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getRequest_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSh_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSz_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getName()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getAll_name()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(crdBankAccInterface.getCert_type()+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getId_no()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getPhone()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getAddr()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getPostcode()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getNew_open_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getReturn_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getReturn_info()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getDigital_signature() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getPager()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getEntrust_method()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getRepair_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBranch_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getEmail()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getEmail_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getMobile()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_emp_code()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_query_pwd()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_draw_pwd()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_acc_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getNew_bank_acc_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getCurrency_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSend_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBranch_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getEmp_code()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_entrust()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSerial_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getPwd()               +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getDeal_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getRequest_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getRequest_time()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSource_type()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getFund_acc_no()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getBank_joint()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getFund_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getReturn_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getReturn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSpare1()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSpare2()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSpare3()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getSpare4()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankAccInterface.getCom_handle()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(crdBankAccInterface.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(crdBankAccInterface.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(crdBankAccInterface.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+crdBankAccInterface.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[CrdBankAccInterface]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+cbaList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[CrdBankAccInterface]异常！]"+e.getMessage(),e);
        }
    }

    public void setOptBankAccInterfaceList(List<OptBankAccInterface> obaList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into OPT_BANK_ACC_INTERFACE (occur_branch, bank_code, bank_acc_no, new_bank_acc_no, bank_cust_no, cust_no,"
                    + "cust_type, request_type, bank_serial_no, sh_holder_acc_no, sz_holder_acc_no, name, all_name, cert_type, id_no,"
                    + "phone, addr, postcode, new_open_flag, return_code, return_info, digital_signature, pager, entrust_method, repair_flag, "
                    + "branch_code, email, email_flag, mobile, bank_emp_code, bank_query_pwd, bank_draw_pwd, bank_acc_flag, new_bank_acc_flag, "
                    + "currency_type, send_flag, branch_serial_no, emp_code, bank_entrust, serial_no, pwd, deal_flag, request_date, request_time, "
                    + "source_type, fund_acc_no, bank_joint, fund_serial_no, return_date, return_time, spare1, spare2, spare3, spare4, com_handle, "
                    + "check_emp, user_id, user_data, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (OptBankAccInterface optBankAccInterface : obaList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getOccur_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getNew_bank_acc_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_cust_no()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getCust_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getRequest_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSh_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSz_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getName()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getAll_name()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(optBankAccInterface.getCert_type()+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getId_no()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getPhone()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getAddr()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getPostcode()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getNew_open_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getReturn_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getReturn_info()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getDigital_signature() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getPager()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getEntrust_method()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getRepair_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBranch_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getEmail()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getEmail_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getMobile()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_emp_code()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_query_pwd()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_draw_pwd()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_acc_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getNew_bank_acc_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getCurrency_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSend_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBranch_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getEmp_code()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_entrust()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSerial_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getPwd()               +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getDeal_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getRequest_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getRequest_time()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSource_type()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getFund_acc_no()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getBank_joint()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getFund_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getReturn_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getReturn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSpare1()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSpare2()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSpare3()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getSpare4()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getCom_handle()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getCheck_emp()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  optBankAccInterface.getUserid()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(optBankAccInterface.getUser_data() + Constants.SPLIT_COMMA);

                suffix.append(optBankAccInterface.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(optBankAccInterface.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(optBankAccInterface.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+optBankAccInterface.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[OptBankAccInterface]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+obaList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[OptBankAccInterface]异常！]"+e.getMessage(),e);
        }
    }

    public void setCrdBankTrfInterfaceList(List<CrdBankTrfInterface> cbtList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into CRD_BANK_TRF_INTERFACE (SOURCE_TYPE, REQUEST_TYPE, BANK_CODE, BANK_ACC_NO, CUST_NO, CURRENCY_TYPE, "
                    + "FUND_ACC_NO, CUST_TYPE, BRANCH_CODE, ENTRUST_METHOD, EMP_CODE, BANK_ENTRST_METHOD, BANK_EMP_CODE, BANK_JOINT,"
                    + "PWD, REQUEST_DATE, REQUEST_TIME, OCCUR_BAL, SERIAL_NO, SH_HOLDER_ACC_NO, SZ_HOLDER_ACC_NO, BANK_SERIAL_NO, "
                    + "DEAL_FLAG, BRANCH_SERIAL_NO, OCCUR_BRANCH, NAME, DIGITAL_SIGNATURE, BANK_QUERY_PWD, BANK_DRAW_PWD, BANK_ACC_FLAG,"
                    + "REPARE_FLAG, SEND_FLAG, RETURN_INFO, RETURN_CODE, FUND_SERIAL_NO, RETURN_DATE, RETURN_TIME, SPARE1, SPARE2, SPARE3,"
                    + "SPARE4, CERT_TYPE, ID_NO, COM_HANDLE, TRF_SOURCE, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (CrdBankTrfInterface crdBankTrfInterface : cbtList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSource_type()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getRequest_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getCurrency_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getFund_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getCust_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBranch_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getEntrust_method()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getEmp_code()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_entrst_method() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_emp_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_joint()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getPwd()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getRequest_date()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getRequest_time()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(crdBankTrfInterface.getOccur_bal() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSerial_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSh_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSz_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getDeal_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBranch_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getOccur_branch()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getName()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getDigital_signature() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_query_pwd()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_draw_pwd()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getBank_acc_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getRepare_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSend_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getReturn_info()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getReturn_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getFund_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getReturn_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getReturn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSpare1()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSpare2()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSpare3()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getSpare4()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(crdBankTrfInterface.getCert_type() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getId_no()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getCom_handle()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  crdBankTrfInterface.getTrf_source()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(crdBankTrfInterface.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(crdBankTrfInterface.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(crdBankTrfInterface.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+crdBankTrfInterface.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[CrdBankTrfInterface]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+cbtList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[CrdBankTrfInterface]异常！]"+e.getMessage(),e);
        }
    }


    public void setOptBankTrfInterfaceList(List<OptBankTrfInterface> btiList ) {
        PreparedStatement pst=null;
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into OPT_BANK_TRF_INTERFACE (source_type, request_type, bank_code, bank_acc_no, cust_no, currency_type, "
                    + "fund_acc_no, cust_type, branch_code, entrust_method, emp_code, bank_entrst_method, bank_emp_code, bank_joint,"
                    + "pwd, request_date, request_time, occur_bal, serial_no, sh_holder_acc_no, sz_holder_acc_no, bank_serial_no, "
                    + "deal_flag, branch_serial_no, occur_branch, name, digital_signature, bank_query_pwd, bank_draw_pwd, bank_acc_flag,"
                    + "repare_flag, send_flag, return_info, return_code, fund_serial_no, return_date, return_time, spare1, spare2, spare3,"
                    + "spare4, cert_type, id_no, com_handle, r_date, trf_source, user_id, user_data, ip, mac, reversal_num, update_time, "
                    + "reversal_mode, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (OptBankTrfInterface bankTrfInterface : btiList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSource_type()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRequest_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCurrency_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getFund_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCust_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBranch_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getEntrust_method()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getEmp_code()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_entrst_method() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_emp_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_joint()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getPwd()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRequest_date()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRequest_time()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getOccur_bal() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSerial_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSh_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSz_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getDeal_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBranch_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getOccur_branch()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getName()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getDigital_signature() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_query_pwd()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_draw_pwd()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_acc_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRepare_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSend_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_info()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getFund_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare1()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare2()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare3()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare4()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getCert_type() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getId_no()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCom_handle()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getR_date()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getTrf_source()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getUser_id()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getUser_data()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getIp()                +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getMac()               +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(bankTrfInterface.getReversal_num()+ Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getUpdate_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReversal_mode()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(bankTrfInterface.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+bankTrfInterface.getGetTime()+Constants.SPLIT_SINGLE);



                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[OptBankTrfInterface]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+btiList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[OptBankTrfInterface]异常！]"+e.getMessage(),e);
        }
    }

    public void setFundDetailList( List<FundDetail> fdList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into FUND_DETAIL (serial_no, cust_no, bank_acc, app_flag, app_acc, txdate, txtime, tx_code, amt, "
                    + "currency, status, serial_no_app, send_flag, serial_no_bank, serial_no_bank_front, fund_kind, depu_bank, "
                    + "bank_area, oper_bank, trade_date, remark, tx_channel, bank_code, bank_acc_secu, TOPIC_PAR, PAR_OFFSET, "
                    + "PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (FundDetail fundDetail : fdList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getSerial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getCust_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getBank_acc()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getApp_flag()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getApp_acc()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getTxdate()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getTxtime()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getTx_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(fundDetail.getAmt() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getCurrency()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getStatus()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getSerial_no_app()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getSend_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getSerial_no_bank() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getSerial_no_bank_front() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getFund_kind()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getDepu_bank()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getBank_area()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getOper_bank()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getTrade_date()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getRemark()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getTx_channel()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getBank_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundDetail.getBank_acc_secu()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(fundDetail.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(fundDetail.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(fundDetail.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+fundDetail.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[FundDetail]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+fdList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[FundDetail]异常！]"+e.getMessage(),e);
        }
    }

    public void setOlpayTradeRecordList( List<OlpayTradeRecord> otrList ) {
        PreparedStatement pst=null;
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into OLPAY_TRADE_RECORD (ID, RECORD_NO, RECORD_STATUS, RECORD_SOURCE, CUST_NO, CUST_BANK_CODE, TRADE_CODE, "
                    + "CREATE_DATE, CREATE_TIME, CLEAR_DATE, CLEAR_TIME, TPO_TRADE_DATE, TPO_TRADE_TIME, TPO_TRADE_CODE, TPO_CLEAR_DATE, "
                    + "TPO_CLEAR_TIME, TPO_CODE, TPO_GOODS_AMOUNT, TPO_PAYMENT_BALANCE, CURRENCY, TPO_TRADE_NOTE, TPO_ORDER_NO, ORDER_STATUS, "
                    + "BRANCH_CODE, SYSTEM_STATUS, PROCESS_TYPE, OPERATOR, OPERATE_DATE, OPERATE_TIME, BMP_RECORD_NO, BMP_FREEZE_DATE, "
                    + "TPO_ORIGINAL_ORDER_NO, TPO_ORIGINAL_DATE, TPO_ORIGINAL_TIME, TPO_MERCHANT_CODE, TPO_MERCHANT_NAME, TPO_CLEAR_FLAG, "
                    + "SYSTEM_CODE, BMP_CLEAR_FLAG, BMP_EXPORT_FLAG, BMP_EXPORT_RESULT, CUST_LOGIN_IP, CUST_LOGIN_MAC, TRADE_CHANNEL, "
                    + "TPO_BANK_CODE, TPO_BANK_ACC_NO, TRADE_FEE, RETURN_AMOUNT, FUND_CHANGE_AMT, CLR_BATCH, CASH_DRAW_STATUS, TPO_MERCHANT_ORDER_NO, "
                    + "TPO_TRADE_FEE, TPO_PROXY_FEE, TPO_CLEAR_AMT, ORIGINAL_TRADE_DATE, ORIGINAL_ORDER_NO, SOC_ORDER_NO, OUTER_INNER_FLAG, ADJUST_NOTE, "
                    + "SOC_ORDER_NO_OLD, BMP_RECORD_NO_OLD, BMP_FLUSH_DATE, EXT_ORDER_STATUS, DEVICE_INFO, STD_CUST_NO, MAP_SYS, POSTED_DATE, POSTING_DATE, "
                    + "REC_TRADE_FEE, TPO_SETTLE_BATCH_NO, DISCOUNT_AMT, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (OlpayTradeRecord olpayTradeRecord : otrList) {
                num++;
                suffix.append("(");
                suffix.append(olpayTradeRecord.getId() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getRecord_no()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getRecord_status() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getRecord_source() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCust_no()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCust_bank_code()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTrade_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCreate_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCreate_time()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getClear_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getClear_time()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_trade_date()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_trade_time()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_trade_code()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_clear_date()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_clear_time()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getTpo_goods_amount() + Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getTpo_payment_balance()  + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCurrency()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_trade_note()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_order_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOrder_status()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBranch_code() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getSystem_status()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getProcess_type()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOperator()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOperate_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOperate_time()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_record_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_freeze_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_original_order_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_original_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_original_time()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_merchant_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_merchant_name()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_clear_flag()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getSystem_code() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_clear_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_export_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_export_result()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCust_login_ip()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCust_login_mac() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTrade_channel()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_bank_code()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_bank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getTrade_fee() + Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getReturn_amount() + Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getFund_change_amt() + Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getClr_batch() + Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getCash_draw_status()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_merchant_order_no()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getTpo_trade_fee() + Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getTpo_proxy_fee() + Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getTpo_clear_amt() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOriginal_trade_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOriginal_order_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getSoc_order_no()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getOuter_inner_flag()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getAdjust_note()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getSoc_order_no_old()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_record_no_old()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getBmp_flush_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getExt_order_status()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getDevice_info()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getStd_cust_no()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getMap_sys()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getPosted_date()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getPosting_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getRec_trade_fee() + Constants.SPLIT_SINGLE+  Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getTpo_settle_batch_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  olpayTradeRecord.getDiscount_amt() +  Constants.SPLIT_SINGLE+  Constants.SPLIT_COMMA);

                suffix.append(olpayTradeRecord.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(olpayTradeRecord.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+olpayTradeRecord.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[OLPAY_TRADE_RECORD]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+otrList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[OLPAY_TRADE_RECORD]异常！]"+e.getMessage(),e);
        }
    }

    // 测试时间 2019/04/02

    public void setBankAccInterfaceList(List<BankAccInterface> bciList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into BANK_ACC_INTERFACE (OCCUR_BRANCH, BANK_CODE, BANK_ACC_NO, NEW_BANK_ACC_NO, BANK_CUST_NO, CUST_NO,"
                    + "CUST_TYPE, REQUEST_TYPE, BANK_SERIAL_NO, SH_HOLDER_ACC_NO, SZ_HOLDER_ACC_NO, NAME, ALL_NAME, CERT_TYPE, ID_NO,"
                    + "PHONE, ADDR, POSTCODE, NEW_OPEN_FLAG, RETURN_CODE, RETURN_INFO, DIGITAL_SIGNATURE, PAGER, ENTRUST_METHOD, REPAIR_FLAG, "
                    + "BRANCH_CODE, EMAIL, EMAIL_FLAG, MOBILE, BANK_EMP_CODE, BANK_QUERY_PWD, BANK_DRAW_PWD, BANK_ACC_FLAG, NEW_BANK_ACC_FLAG, "
                    + "CURRENCY_TYPE, SEND_FLAG, BRANCH_SERIAL_NO, EMP_CODE, BANK_ENTRUST, SERIAL_NO, PWD, DEAL_FLAG, REQUEST_DATE, REQUEST_TIME, "
                    + "SOURCE_TYPE, FUND_ACC_NO, BANK_JOINT, FUND_SERIAL_NO, RETURN_DATE, RETURN_TIME, SPARE1, SPARE2, SPARE3, SPARE4, COM_HANDLE, "
                    + "CHECK_EMP, SOURCES, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (BankAccInterface bankAccInterface : bciList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getOccur_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getNew_bank_acc_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_cust_no()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getCust_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getRequest_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSh_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSz_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getName()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getAll_name()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(bankAccInterface.getCert_type()+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getId_no()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getPhone()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getAddr()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getPostcode()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getNew_open_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getReturn_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getReturn_info()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getDigital_signature() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getPager()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getEntrust_method()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getRepair_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBranch_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getEmail()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getEmail_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getMobile()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_emp_code()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_query_pwd()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_draw_pwd()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_acc_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getNew_bank_acc_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getCurrency_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSend_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBranch_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getEmp_code()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_entrust()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSerial_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getPwd()               +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getDeal_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getRequest_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getRequest_time()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSource_type()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getFund_acc_no()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getBank_joint()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getFund_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getReturn_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getReturn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSpare1()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSpare2()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSpare3()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSpare4()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getCom_handle()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getCheck_emp()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankAccInterface.getSources()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(bankAccInterface.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(bankAccInterface.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(bankAccInterface.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+bankAccInterface.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[BankAccInterface]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+bciList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[BankAccInterface]异常！]"+e.getMessage(),e);
        }
    }


    public void setBankTrfInterfaceList(List<BankTrfInterface> btiList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into BANK_TRF_INTERFACE (SOURCE_TYPE, REQUEST_TYPE, BANK_CODE, BANK_ACC_NO, CUST_NO, CURRENCY_TYPE, "
                    + "FUND_ACC_NO, CUST_TYPE, BRANCH_CODE, ENTRUST_METHOD, EMP_CODE, BANK_ENTRST_METHOD, BANK_EMP_CODE, BANK_JOINT,"
                    + "PWD, REQUEST_DATE, REQUEST_TIME, OCCUR_BAL, SERIAL_NO, SH_HOLDER_ACC_NO, SZ_HOLDER_ACC_NO, BANK_SERIAL_NO, "
                    + "DEAL_FLAG, BRANCH_SERIAL_NO, OCCUR_BRANCH, NAME, DIGITAL_SIGNATURE, BANK_QUERY_PWD, BANK_DRAW_PWD, BANK_ACC_FLAG,"
                    + "REPARE_FLAG, SEND_FLAG, RETURN_INFO, RETURN_CODE, FUND_SERIAL_NO, RETURN_DATE, RETURN_TIME, SPARE1, SPARE2, SPARE3,"
                    + "SPARE4, CERT_TYPE, ID_NO, COM_HANDLE, R_DATE, TRF_SOURCE, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (BankTrfInterface bankTrfInterface : btiList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSource_type()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRequest_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCurrency_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getFund_acc_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCust_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBranch_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getEntrust_method()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getEmp_code()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_entrst_method() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_emp_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_joint()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getPwd()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRequest_date()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRequest_time()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getOccur_bal() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSerial_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSh_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSz_holder_acc_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getDeal_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBranch_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getOccur_branch()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getName()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getDigital_signature() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_query_pwd()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_draw_pwd()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getBank_acc_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getRepare_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSend_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_info()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getFund_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getReturn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare1()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare2()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare3()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getSpare4()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getCert_type() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getId_no()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getCom_handle()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getR_date()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  bankTrfInterface.getTrf_source()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(bankTrfInterface.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(bankTrfInterface.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+bankTrfInterface.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[BankTrfInterface]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+btiList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[BankTrfInterface]异常！]"+e.getMessage(),e);
        }
    }

    public void setCheckSummaryList(List<CheckSummary> chkSummaryList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into CHECK_SUMMARY (BRANCH_CODE, BUSINESS_DATE, SERIAL_NO, CUST_NO, NAME, MARKET_CODE, HOLDER_ACC_NO, "
                    + "SEC_CODE, SEC_SHORT_NAME, BUSINESS_CODE, CURRENCY_TYPE, OCCUR_BAL, TOTAL_OUT_BAL, OCCUR_VOL, TOTAL_OUT_VOL, "
                    + "APPLY_BRANCH, APPLY_EMP, APPLY_DATE, APPLY_TIME, APPLY_NOTE, FIRST_BRANCH, FIRST_EMP, FIRST_DATE, FIRST_TIME, "
                    + "FIRST_RESULT, FIRST_NOTE, SECOND_BRANCH, SECOND_EMP, SECOND_DATE, SECOND_TIME, SECOND_RESULT, SECOND_NOTE, "
                    + "EXPIRE_DATE, DEAL_METHOD, JOIN_DATE, JOIN_CUST_NO, JOIN_SERIAL_NO, REALIZE_FLAG, FLOW_NO, STEP_NO, REST_STEP_NUM, "
                    + "DETAIL_NUM, EXEC_EMP, EXEC_DATE, EXEC_TIME, SYSTEM_NO, THIRD_BRANCH, THIRD_EMP, THIRD_DATE, THIRD_TIME, THIRD_RESULT, "
                    + "THIRD_NOTE, FOURTH_BRANCH, FOURTH_EMP, FOURTH_DATE, FOURTH_TIME, FOURTH_RESULT, FOURTH_NOTE, FIFTH_BRANCH, FIFTH_EMP, "
                    + "FIFTH_DATE, FIFTH_TIME, FIFTH_RESULT, FIFTH_NOTE, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (CheckSummary checkSummary : chkSummaryList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getBranch_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getBusiness_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSerial_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getName()             +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getMarket_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getHolder_acc_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSec_code()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSec_short_name()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getBusiness_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getCurrency_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getOccur_bal() + Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getTotal_out_bal() + Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getOccur_vol() + Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getTotal_out_vol() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getApply_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getApply_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getApply_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getApply_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getApply_note()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFirst_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFirst_emp()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFirst_date()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFirst_time()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFirst_result()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFirst_note()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSecond_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSecond_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSecond_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSecond_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSecond_result()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSecond_note()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getExpire_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getDeal_method()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getJoin_date()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getJoin_cust_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getJoin_serial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getRealize_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFlow_no()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getStep_no() + Constants.SPLIT_COMMA);

                suffix.append(checkSummary.getRest_step_num() + Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getDetail_num() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getExec_emp()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getExec_date()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getExec_time()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getSystem_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getThird_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getThird_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getThird_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getThird_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getThird_result()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getThird_note()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFourth_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFourth_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFourth_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFourth_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFourth_result()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFourth_note()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFifth_branch()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFifth_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFifth_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFifth_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFifth_result()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  checkSummary.getFifth_note()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(checkSummary.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(checkSummary.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+checkSummary.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[CheckSummary]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+chkSummaryList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[CheckSummary]异常！]"+e.getMessage(),e);
        }
    }



    public void setFundStockChangeList( List<FundStockChange> fscList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into FUND_STOCK_CHANGE (OCCUR_DATE, CLR_CTRL, SERIAL_NO, OCCUR_TIME, OCCUR_BRANCH, BRANCH_CODE, CUST_NO, "
                    + "CURRENCY_TYPE, FUND_ACC_NO, CUST_NAME, MARKET_CODE, HOLDER_ACC_NO, SEC_CODE, SEC_CHG, SEC_NET_CHG, SEC_BAL, FUND_CHG, "
                    + "FUND_BAL, BUSINESS_CODE, BANK_CODE, BANK_ACC_NO, BANK_ACC_NAME, OP_EMP, DOUBLE_CHECK_EMP, SEC_SHORT_NAME, DONE_AMT, "
                    + "JOIN_SERIAL_NO, ENTRUST_METHOD, ROOM_NO, CUST_TYPE, STAT_TYPE, CHANGE_TYPE, JOIN_DATE, JOIN_CUST_NO, BILL_NO, NOTE, "
                    + "INTEREST_DATE, INTEND_IN_ACC_DATE, IN_ACC_DATE, IN_ACC_FLAG, RELATIVE_DATE, CANCEL_FLAG, DOUBLE_CHECK_FLAG, CHECK_DATE, "
                    + "IN_OUT, DELIVER_EMP, DELIVER_DATE, DELIVER_FLAG, INTEREST_ACCU, FINE_ACCU, SEC_IN_OUT, SEAT_NO, SEC_TYPE, EXTERNAL_NO, "
                    + "R_DATE, DELIVER_METHOD, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (FundStockChange fundstockChange : fscList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getOccur_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getClr_ctrl()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getSerial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getOccur_time()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getOccur_branch() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getBranch_code()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getCust_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getCurrency_type()+Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getFund_acc_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getCust_name()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getMarket_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getHolder_acc_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getSec_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getSec_chg() + Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getSec_net_chg() + Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getSec_bal() + Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getFund_chg() + Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getFund_bal() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getBusiness_code()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getBank_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getBank_acc_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getBank_acc_name()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getOp_emp()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getDouble_check_emp() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getSec_short_name()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getDone_amt() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getJoin_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getEntrust_method()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getRoom_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getCust_type()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getStat_type()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getChange_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getJoin_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getJoin_cust_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getBill_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getNote()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getInterest_date()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getIntend_in_acc_date()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getIn_acc_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getIn_acc_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getRelative_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getCancel_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getDouble_check_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getCheck_date()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getIn_out()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getDeliver_emp()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getDeliver_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getDeliver_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getInterest_accu() + Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getFine_accu() + Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getSec_in_out()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getSeat_no()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getSec_type()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getExternal_no()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getR_date()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  fundstockChange.getDeliver_method()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(fundstockChange.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(fundstockChange.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+fundstockChange.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[FundStockChange]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+fscList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[FundStockChange]异常！]"+e.getMessage(),e);
        }
    }


    public void setOtherChangeList(List<OtherChange> ocList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into OTHER_CHANGE(BRANCH_CODE, OCCUR_DATE, SERIAL_NO, KSORDER, OCCUR_TIME, EMP_CODE, DOUBLE_CHECK_EMP, "
                    + "CUST_NO, BUSINESS_CODE, CHANGE_TYPE, LAST_VALUE, THIS_VALUE, OP_OBJECT, TYPE, CHECK_DATE, R_DATE, NOTE, OCCUR_BRANCH, "
                    + "OP_SOURCE, TOPIC_PAR, PAR_OFFSET, PAYLOAD_LENGTH, OccuTime, GetTime) values ";
            for (OtherChange otherChange : ocList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getBranch_code()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getOccur_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getSerial_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(otherChange.getKsorder() + Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getOccur_time()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getEmp_code()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getDouble_check_emp() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getCust_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getBusiness_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getChange_type()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getLast_value()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getThis_value()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getOp_object()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getType()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getCheck_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getR_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getNote()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getOccur_branch() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  otherChange.getOp_source()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(otherChange.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(otherChange.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(otherChange.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+otherChange.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql=prefix+suffix.toString().substring(0,suffix.toString().length()-2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[OTHER_CHANGE]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+ocList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[OTHER_CHANGE]异常！]"+e.getMessage(),e);
        }
    }

    /*
       2019/04/12
       新增账户相关八张表
      */
    public void setScosAuditTaskList(List<ScosAuditTask> satList ) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into SCOS_AUDIT_TASK(id, change_date, change_emp, create_date, create_emp, enable_flag, accept_serial_no, " +
                    "atomic_no, match_atomic_no, audit_status, cert_no, cert_type, curr_flow_node, cust_no, cust_type, lock_emp, " +
                    "lock_flag, name, next_flow_emp, next_flow_mode, next_flow_node, next_flow_post, type_scope, business_schedule_id, " +
                    "process_audit_detail_id, process_audit_id, audit_type, ser_no, topic_par, par_offset, payload_length, OccuTime, GetTime)" +
                    " values ";
            for (ScosAuditTask oScosAuditTask : satList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getId()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getChange_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getChange_emp()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCreate_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCreate_emp()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getEnable_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getAccept_serial_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getAtomic_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getMatch_atomic_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getAudit_status()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCert_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCert_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCurr_flow_node()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCust_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getCust_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getLock_emp()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getLock_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getName() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getNext_flow_emp()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getNext_flow_mode()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getNext_flow_node()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getNext_flow_post()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getType_scope()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getBusiness_schedule_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getProcess_audit_detail_id()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getProcess_audit_id()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getAudit_type() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditTask.getSer_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosAuditTask.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosAuditTask.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosAuditTask.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosAuditTask.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosAuditTask]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+satList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[ScosAuditTask]异常！]"+e.getMessage(),e);
        }
    }

    public void setScosBusinessAcceptList(List<ScosBusinessAccept> sbaList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into SCOS_BUSINESS_ACCEPT(id, change_date, change_emp, create_date, create_emp, enable_flag, open_source, " +
                    "unique_ser_no, attribute, opt_branch_code, card_info, card_status, cert_no, cert_type, cust_no, cust_status, " +
                    "e_app_id, image_commit_count, image_type, name, note, open_branch_code, open_date, sys_code, open_desc, mac_addr, ip, " +
                    "special_flag, other_cust_no, acct_no, acct_type, exist_ymt_no, ygt_flag, id_open_branch_code, client_source, bus_branch_code, " +
                    "type_scope, cust_type, org_attribute, normal_flag, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (ScosBusinessAccept oScosBusinessAccept : sbaList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getId()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getChange_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getChange_emp()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCreate_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCreate_emp()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getEnable_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOpen_source() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getUnique_ser_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getAttribute()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOpt_branch_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCard_info()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCard_status()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCert_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCert_type()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCust_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCust_status()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getE_app_id()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getImage_commit_count() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getImage_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getName()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getNote()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOpen_branch_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOpen_date()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getSys_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOpen_desc()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getMac_addr()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getIp() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getSpecial_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOther_cust_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getAcct_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getAcct_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getExist_ymt_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getYgt_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getId_open_branch_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getClient_source()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getBus_branch_code()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getType_scope() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getCust_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getOrg_attribute() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessAccept.getNormal_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosBusinessAccept.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusinessAccept.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusinessAccept.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosBusinessAccept.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosBusinessAccept]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+sbaList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[ScosBusinessAccept]异常！]"+e.getMessage(),e);
        }
    }

    public void setScosBusinessChooseList(List<ScosBusinessChoose> sbcList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into SCOS_BUSINESS_CHOOSE(id, change_date, change_emp, create_date, create_emp, enable_flag, " +
                    "avilibale_business, business_scope, chosen_business, done_business, service_type, business_accept_id,  " +
                    "topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (ScosBusinessChoose oScosBusinessChoose : sbcList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getId()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getChange_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getChange_emp()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getCreate_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getCreate_emp()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getEnable_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getAvilibale_business() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getBusiness_scope()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getChosen_business()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getDone_business()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getService_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusinessChoose.getBusiness_accept_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosBusinessChoose.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusinessChoose.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusinessChoose.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosBusinessChoose.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosBusinessChoose]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+sbcList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[ScosBusinessChoose]异常！]"+e.getMessage(),e);
        }
    }

    public void setScosBusScheduleDetailtList(List<ScosBusScheduleDetail> sbsdList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into SCOS_BUS_SCHEDULE_DETAIL(id, change_date, change_emp, create_date, create_emp, enable_flag, open_source, unique_ser_no, " +
                    "archive_status, audit_emp, audit_note, audit_status, bean_codes, bean_names, branch_code, bus_id, bus_type, cert_no, " +
                    "cert_type, check_emp, cust_no, cust_type, image_archive_status, name, opt_branch_code, process_id, src_order_no, type, " +
                    "type_scope, econtract_flag, black_list_str, account_type, spec_bus_type, evaluate_flag, client_source, bus_effective_date, " +
                    "excute_in_matter_res_flag, open_branch_code, double_input_atomic_no, video_mode, video_emp_code, video_emp_name, archive_desc, " +
                    "archive_comment, roll_back_flag, roll_back_start_flag, roll_back_process, crm_flag, anti_money_laudry_desc, foreign_dignitaries_desc, " +
                    "high_risk_area_desc, archive_date, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (ScosBusScheduleDetail oScosBusScheduleDetail : sbsdList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getId()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getChange_date()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getChange_emp()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCreate_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCreate_emp()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getEnable_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getOpen_source() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getUnique_ser_no()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getArchive_status()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getAudit_emp()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getAudit_note()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getAudit_status()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBean_codes()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBean_names()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBranch_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBus_id()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBus_type()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCert_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCert_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCheck_emp()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCust_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCust_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getImage_archive_status()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getName()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getOpen_branch_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getProcess_id()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getSrc_order_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getType()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getType_scope() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getEcontract_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBlack_list_str()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getAccount_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getSpec_bus_type()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getEvaluate_flag()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getClient_source()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getBus_effective_date()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getExcute_in_matter_res_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getOpen_branch_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getDouble_input_atomic_no() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getVideo_mode()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getVideo_emp_code()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getVideo_emp_name()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getArchive_desc()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getArchive_comment()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getRoll_back_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getRoll_back_start_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getRoll_back_process()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getCrm_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getAnti_money_laudry_desc()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getForeign_dignitaries_desc() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getHigh_risk_area_desc()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusScheduleDetail.getArchive_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosBusScheduleDetail.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusScheduleDetail.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusScheduleDetail.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosBusScheduleDetail.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosBusScheduleDetail]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+sbsdList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[ScosBusScheduleDetail]异常！]"+e.getMessage(),e);
        }
    }

    public void setUserPresenceList(List<UserPresence> userpreList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into USER_PRESENCE(id, user_id, user_no, user_name, mobile, ogr_id, identified_flag, source_type, source_detail_id, " +
                    "province, city, area, address, full_address, fax, telphone, zip_code, mail_address, degree_code, profession_code, service_type, " +
                    "status, callback_day_type, callback_time, create_time, submit_time, end_time, last_update_time, last_update_by, flow_version, " +
                    "user_status, sign_flag, user_flow_status, broker_code, register_way, access_way, attr1, fr_score, channel_id, client_type, user_agent, " +
                    "channel_comment, archive_flag, model_id, archive_date, verify_code, witness_type, device_model, video_empid, audio_empid, review_empid, " +
                    "invite_code, counter_model_no, device_id, fa_success_time, zd_flag, handle_empid, handle_flag, risk_agreement_type, no_open_reason, " +
                    "device_cids, device_type, job_position, work_units, controllers_is_self, beneficiary_is_self, credit_record_good, bad_record_source, " +
                    "flow_no, mobile_style, error_count, black_type, mobile_style_last, user_agent_last, deal_type, auto_verify_comments, transfer_flag, " +
                    "dept_select_flag, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (UserPresence oUserPresence : userpreList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getId()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_name()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getMobile()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getOgr_id()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getIdentified_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getSource_type()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getSource_detail_id()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getProvince()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getCity()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getArea()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getAddress()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getFull_address()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getFax()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getTelphone()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getZip_code()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getMail_address() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDegree_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getProfession_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getService_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getStatus()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getCallback_day_type()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getCallback_time()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getCreate_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getSubmit_time()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getEnd_time() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getLast_update_time()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getLast_update_by() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getFlow_version()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_status()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getSign_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_flow_status()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getBroker_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getRegister_way()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getAccess_way()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getAttr1() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getFr_score()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getChannel_id() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getClient_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_agent()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getChannel_comment()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getArchive_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getModel_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getArchive_date()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getVerify_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getWitness_type()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDevice_model() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getVideo_empid()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getAudio_empid() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getReview_empid()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getInvite_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getCounter_model_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDevice_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getFa_success_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getZd_flag()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getHandle_empid() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getHandle_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getRisk_agreement_type() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getNo_open_reason()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDevice_cids()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDevice_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getJob_position()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getWork_units()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getControllers_is_self()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getBeneficiary_is_self()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getCredit_record_good()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getBad_record_source() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getFlow_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getMobile_style() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getError_count()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getBlack_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getMobile_style_last()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getUser_agent_last()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDeal_type()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getAuto_verify_comments()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getTransfer_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserPresence.getDept_select_flag()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oUserPresence.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oUserPresence.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oUserPresence.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oUserPresence.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[UserPresence]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+userpreList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[UserPresence]异常！]"+e.getMessage(),e);
        }
    }

    public void setBaseOrganizationList(List<BaseOrganization> boList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into BASE_ORGANIZATION(org_id, org_code, name, parent_org_id, org_type, province, city, area, " +
                    "address, zip_code, telphone, contact_person, fax, mail, description, entrust_phone, branch_seat, " +
                    "sell_manager, working_manager, relation_phone, weight, longitude, latitude, status, sycn_time, create_time, " +
                    "create_by, update_time, update_by, commission, alias, remark, default_model_id, commission_desc, " +
                    "auto_verify_status, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (BaseOrganization oBaseOrganization : boList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getOrg_id()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getOrg_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getName()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getParent_org_id()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getOrg_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getProvince()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getCity() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getArea()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getAddress()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getZip_code()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getTelphone()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getContact_person()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getFax()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getMail()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getDescription()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getEntrust_phone()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getBranch_seat()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getSell_manager() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getWorking_manager()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getRelation_phone()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getWeight()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getLongitude()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getLatitude()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getStatus()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getSycn_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getCreate_time()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getCreate_by() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getUpdate_time()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getUpdate_by() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getCommission()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getAlias()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getRemark()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getDefault_model_id()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getCommission_desc()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseOrganization.getAuto_verify_status()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oBaseOrganization.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oBaseOrganization.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oBaseOrganization.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oBaseOrganization.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[BaseOrganization]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+boList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[BaseOrganization]异常！]"+e.getMessage(),e);
        }
    }

    public void setMessTaskList(List<MessTask> mtList ) {
        StringBuffer suffix =new StringBuffer();
        String prefix = null;
        String sql = null;
        try{
            int num=0;
            long startTime = System.currentTimeMillis();
            prefix = "replace into MESS_TASK(task_id, task_no, task_type, title, content, create_time, user_id, " +
                    "user_name, org_id, deal_time, emp_id, emp_name, status, finish_time, result_comment, anti_emp_id, " +
                    "business_detail_id, app_id, locked_flag, submit_type, auto_verify_status, auto_verify_comments, call_back, " +
                    "auto_confirm_status, topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (MessTask oMessTask : mtList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getTask_id()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getTask_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getTask_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getTitle()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getContent()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getCreate_time()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getUser_id() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getUser_name()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getOrg_id()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getDeal_time()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getEmp_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getEmp_name()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getStatus()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getFinish_time()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getResult_comment()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getAnti_emp_id()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getBusiness_detail_id()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getApp_id() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getLocked_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getSubmit_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getAuto_verify_status()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getAuto_verify_comments()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getCall_back()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oMessTask.getAuto_confirm_status()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oMessTask.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oMessTask.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oMessTask.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oMessTask.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[MessTask]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+mtList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[MessTask]异常！]"+e.getMessage(),e);
        }
    }

    public void setScosBusBasicTaskInfoList(List<ScosBusBasicTaskInfo> sbbtList ) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into SCOS_BUS_BASIC_TASK_INFO(ID, CHANGE_DATE, CHANGE_EMP, CREATE_DATE, CREATE_EMP, ENABLE_FLAG, OPEN_SOURCE, " +
                    "UNIQUE_SER_NO, CUST_NO, BUS_ATOMIC_NO, OPEN_FLAG, BUSINESS_ACCEPT_ID, IGNORE_CODES, OPEN_DATE, " +
                    "topic_par, par_offset, payload_length, OccuTime, GetTime) values ";
            for (ScosBusBasicTaskInfo oScosBusBasicTaskInfo : sbbtList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getId()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getChange_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getChange_emp()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getCreate_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getCreate_emp()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getEnable_flag()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getOpen_source()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getUnique_ser_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getCust_no()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getBus_atomic_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getOpen_flag()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getBusiness_accept_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getIgnore_codes()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosBusBasicTaskInfo.getOpen_date()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosBusBasicTaskInfo.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusBasicTaskInfo.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosBusBasicTaskInfo.getPayload_length()+Constants.SPLIT_COMMA);

                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosBusBasicTaskInfo.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosBusBasicTaskInfo]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+sbbtList.size());

        }catch(Exception e){
                logger.error(sql +" [新增[ScosBusBasicTaskInfo]异常！]"+e.getMessage(), e);
            }
    }

    /*
     * 2019年8月新增加5张
     * BaseSysUser
     * ScosAuditlog
     * ScosAuditScheduleLog
     * UserAccounts
     * UserBusinessFlow
     */
    public void setUserAccountsList(List<UserAccounts> uaList) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into USER_ACCOUNTS(account_id, user_id, invset_type, account_type, account_name, account_no, branch_id, " +
                    "branch_name, validate_flag, apply_success_flag, start_time, end_time, error_info, attach_flag, account_code, " +
                    "topic_par, par_offset, payload_length, OccuTime, getTime) values ";
            for (UserAccounts oUserAccounts : uaList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getAccount_id()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getUser_id()            +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getInvset_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getAccount_type()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getAccount_name()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getAccount_no()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getBranch_id()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getBranch_name()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getValidate_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getApply_success_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getStart_time()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getEnd_time()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getError_info()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getAttach_flag()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserAccounts.getAccount_code()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oUserAccounts.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oUserAccounts.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oUserAccounts.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oUserAccounts.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[UserAccounts]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+uaList.size());
        }catch(Exception e){
            logger.error(sql +" [新增[UserAccounts]异常！]"+e.getMessage(), e);
        }
    }

    public void setBaseSysUserList(List<BaseSysUser> bsuList) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into BASE_SYS_USER(emp_id, emp_no, emp_name, mobile, org_id, "
                    + "role_id, user_org_id, last_login_time, password, phone, mail, qq, status, gender, "
                    + "salt, cert_no, last_quit_time, login_mark, auto_verify_status,"
                    + "topic_par, par_offset, payload_length, OccuTime,	getTime) values ";
            for (BaseSysUser oBaseSysUser : bsuList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getEmp_id() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getEmp_no()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getEmp_name()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getMobile()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getOrg_id()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getRole_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getUser_org_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getLast_login_time()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getPassword()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getPhone()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getMail()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getQq()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getStatus()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getGender()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getSalt()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getCert_no()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getLast_quit_time()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getLogin_mark()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oBaseSysUser.getAuto_verify_status()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oBaseSysUser.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oBaseSysUser.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oBaseSysUser.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oBaseSysUser.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[BaseSysUser]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+bsuList.size());

        }catch(Exception e){
            logger.error(sql +" [新增[BaseSysUser]异常！]"+e.getMessage(), e);
        }
    }

    public void setUserBusinessFlowList(List<UserBusinessFlow> ubfList) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into USER_BUSINESS_FLOW(business_id,business_type,user_id,create_time,"
                    + "create_by,create_user_name,description,status,source_detail_id,org_id,"
                    + "org_name,user_name,identity_code,mobile,witness_type, " +
                    "topic_par, par_offset, payload_length, OccuTime, getTime) values ";
            for (UserBusinessFlow oUserBusinessFlow : ubfList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getBusiness_id()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getBusiness_type()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getUser_id()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getCreate_time()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getCreate_by()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getCreate_user_name() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getDescription()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getStatus()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getSource_detail_id() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getOrg_id()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getOrg_name()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getUser_name()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getIdentity_code()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getMobile()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oUserBusinessFlow.getWitness_type()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oUserBusinessFlow.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oUserBusinessFlow.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oUserBusinessFlow.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oUserBusinessFlow.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[UserBusinessFlow]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+ubfList.size());

        }catch(Exception e){
            logger.error(sql +" [新增[UserBusinessFlow]异常！]"+e.getMessage(), e);
        }
    }

    public void setScosAuditlogList(List<ScosAuditLog> salList) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into SCOS_AUDIT_LOG(id, change_date, change_emp, create_date, "
                    + " create_emp, enable_flag, audit_emp, audit_log, audit_result, audit_state_id, "
                    + "audit_task_id, audit_time, sys_code, accept_serial_no, audit_serial_no, "
                    + "audit_type, audit_emp_name, audit_branch_code, emp_mac, audit_emp_postion, "
                    + "topic_par, par_offset, payload_length,OccuTime,getTime) values ";
            for (ScosAuditLog oScosAuditLog : salList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getId()               +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getChange_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getChange_emp()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getCreate_date()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getCreate_emp()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getEnable_flag()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_log()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_result()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_state_id()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_task_id()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_time()       +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getSys_code()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAccept_serial_no()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_serial_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_emp_name()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_branch_code() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getEmp_mac()           +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditLog.getAudit_emp_postion() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosAuditLog.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosAuditLog.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosAuditLog.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosAuditLog.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosAuditLog]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+salList.size());

        }catch(Exception e){
            logger.error(sql +" [新增[ScosAuditLog]异常！]"+e.getMessage(), e);
        }
    }

    public void setScosAuditScheduleLogList(List<ScosAuditScheduleLog> saslList) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into SCOS_AUDIT_SCHEDULE_LOG(id, change_date, change_emp, create_date, "
                    + "create_emp, enable_flag, business_atomic, business_code, business_type, "
                    + "business_result, open_msg, remark, son_ser_no, status, unique_ser_no, "
                    + "sys_code, open_source, opt_type,  topic_par, par_offset, payload_length,"
                    + "OccuTime,getTime) values ";
            for (ScosAuditScheduleLog oScosAuditScheduleLog : saslList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getId()              +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getChange_date()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getChange_emp()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getCreate_date()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getCreate_emp()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getEnable_flag()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getBusiness_atomic() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getBusiness_code()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getBusiness_type()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getBusiness_result() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getOpen_msg()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getRemark()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getSon_ser_no()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getStatus()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getUnique_ser_no()   +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getSys_code()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getOpen_source()     +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oScosAuditScheduleLog.getOpt_type()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oScosAuditScheduleLog.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oScosAuditScheduleLog.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oScosAuditScheduleLog.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oScosAuditScheduleLog.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosAuditScheduleLog]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+saslList.size());

        }catch(Exception e){
            logger.error(sql +" [新增[ScosAuditScheduleLog]异常！]"+e.getMessage(), e);
        }
    }

    public void setScosBusinessChooseDetailList(List<ScosBusinessChooseDetail> sbcdList) {
        StringBuffer suffix = new StringBuffer();
        String prefix = null;
        String sql = null;
        try {
            int num=0;
            long startTime = System.currentTimeMillis();

            prefix = "replace into SCOS_BUSINESS_CHOOSE_DETAIL(ID,CHANGE_DATE,CHANGE_EMP,CREATE_DATE,"
                    + "CREATE_EMP,ENABLE_FLAG,BUSINESS_ACCEPT_ID,BUS_ID,CHOSEN_BUSINESS,UPDATE_AFTER,"
                    + "EXT1,EXT2,EXT3, topic_par, "
                    + "par_offset, payload_length,OccuTime,getTime) values ";
            for (ScosBusinessChooseDetail oscosBusinessChooseDetail : sbcdList) {
                num++;
                suffix.append("(");
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getId()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getChange_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getChange_emp()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getCreate_date()    +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getCreate_emp()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getEnable_flag() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getBusiness_accept_id()      +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getBus_id()          +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getChosen_business() +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getUpdate_after()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getExt1()         +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getExt2()        +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+  oscosBusinessChooseDetail.getExt3()  +Constants.SPLIT_SINGLE+Constants.SPLIT_COMMA);

                suffix.append(oscosBusinessChooseDetail.getTopic_par()+Constants.SPLIT_COMMA);
                suffix.append(oscosBusinessChooseDetail.getPar_offset()+Constants.SPLIT_COMMA);
                suffix.append(oscosBusinessChooseDetail.getPayload_length()+Constants.SPLIT_COMMA);
                suffix.append("now()"+Constants.SPLIT_COMMA);
                suffix.append(Constants.SPLIT_SINGLE+oscosBusinessChooseDetail.getGetTime()+Constants.SPLIT_SINGLE);

                suffix.append(" ),\n");
                if(num >= insertBatchSize){
                    sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                    jdbcTemplate.execute(sql);
                    sql=null;
                    suffix=new StringBuffer();
                    num=0;
                }
            }
            if(num != 0){
                sql = prefix + suffix.toString().substring(0, suffix.toString().length() - 2);
                jdbcTemplate.execute(sql);
            }
            long endTime = System.currentTimeMillis();
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>[ScosBusinessChooseDetail]入库耗时："+(endTime-startTime) +" ms" +" 批量处理数据量："+sbcdList.size());

        }catch(Exception e){
            logger.error(sql +" [新增[ScosBusinessChooseDetail]异常！]"+e.getMessage(), e);
        }
    }

/*End*/
}
