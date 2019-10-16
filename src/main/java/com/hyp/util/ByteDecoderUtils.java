package com.hyp.util;

import java.io.Serializable;

import com.hyp.entity.*;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ByteDecoderUtils implements Serializable{
	
	private static final long serialVersionUID = 3164168074880616449L;
	
	private static Logger logger = LoggerFactory.getLogger(ByteDecoderUtils.class);

	public static String getTableName(JSONObject jsonObject){
		try{
			String tableName = jsonObject.get("tableName").toString();
			return tableName.toLowerCase();
		}catch(Exception e){
			logger.error("解析[表名]异常！......[json]的格式："+jsonObject.toString());
			e.printStackTrace();
		} 
		return null;
	}
	
	
	public static JSONObject byteToJson(byte[] data){
		try{
			String event = ByteUtil.byteToString(data);
			
			logger.debug("event: " + event);
			
			JSONObject jsonObject = JSONObject.fromObject(event);
			return jsonObject;
		}catch(Exception e){
			logger.error(">>>>>>>>>>解析[json]异常<<<<<<<<<" + ByteUtil.byteToString(data));
			e.printStackTrace();
		} 
		return null;
	}
	
	
	public static AccountOperation getAccountOperation(JSONObject jsonObject){
		AccountOperation accountOperation = null;
		try {
			accountOperation = new AccountOperation();
			
			String txdate = jsonObject.get("TXDATE").toString();
			String txtime = jsonObject.get("TXTIME").toString();
			String bank_acc = jsonObject.get("BANK_ACC").toString();
			String app_flag = jsonObject.get("APP_FLAG").toString();
			String app_acc = jsonObject.get("APP_ACC").toString();
			String cust_name = jsonObject.get("CUST_NAME").toString();
			String serial_no = jsonObject.get("SERIAL_NO").toString();
			String tx_type = jsonObject.get("TX_TYPE").toString();
			String oper = jsonObject.get("OPER").toString();
			String bank_area = jsonObject.get("BANK_AREA").toString();
			String depu_bank = jsonObject.get("DEPU_BANK").toString();
			String tx_channel = jsonObject.get("TX_CHANNEL").toString();
			String is_active = jsonObject.get("IS_ACTIVE").toString();
			String trade_date = jsonObject.get("TRADE_DATE").toString();
			
			accountOperation.setTxdate(txdate);
			accountOperation.setTxtime(txtime);
			accountOperation.setBank_acc(bank_acc);
			accountOperation.setApp_flag(app_flag);
			accountOperation.setApp_acc(app_acc);
			accountOperation.setCust_name(cust_name);
			accountOperation.setSerial_no(serial_no);
			accountOperation.setTx_type(tx_type);
			accountOperation.setOper(oper);
			accountOperation.setBank_area(bank_area);
			accountOperation.setDepu_bank(depu_bank);
			accountOperation.setTx_channel(tx_channel);
			accountOperation.setIs_active(is_active);
			accountOperation.setTrade_date(trade_date);
			
		} catch (Exception e) {
			logger.error("解析[AccountOperation]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObject.toString());
			e.printStackTrace();
		}
		return accountOperation;
	}
	
	public static CrdBankAccInterface getCrdBankAccInterface(JSONObject jsonObj){
		
		CrdBankAccInterface crdBankAccInterface = null ;
		
		try {
			crdBankAccInterface = new CrdBankAccInterface();
			String  OCCUR_BRANCH  = jsonObj.get("OCCUR_BRANCH").toString();     
			String  BANK_CODE     = jsonObj.get("BANK_CODE").toString();       
			String  BANK_ACC_NO   = jsonObj.get("BANK_ACC_NO").toString();    
			String  NEW_BANK_ACC_NO  =  jsonObj.get("NEW_BANK_ACC_NO").toString();
			String  BANK_CUST_NO     =  jsonObj.get("BANK_CUST_NO").toString();
			String  CUST_NO          =  jsonObj.get("CUST_NO").toString();
			String  CUST_TYPE        =  jsonObj.get("CUST_TYPE").toString();
			String  REQUEST_TYPE     =  jsonObj.get("REQUEST_TYPE").toString();
			String  BANK_SERIAL_NO   =  jsonObj.get("BANK_SERIAL_NO").toString();
			String  SH_HOLDER_ACC_NO =  jsonObj.get("SH_HOLDER_ACC_NO").toString();
			
			String  SZ_HOLDER_ACC_NO =  jsonObj.get("SZ_HOLDER_ACC_NO").toString();
			String  NAME             =  jsonObj.get("NAME").toString();
			String  ALL_NAME         =  jsonObj.get("ALL_NAME").toString();
			String  CERT_TYPE        =  jsonObj.get("CERT_TYPE").toString();
			String  ID_NO            =  jsonObj.get("ID_NO").toString();
			String  PHONE            =  jsonObj.get("PHONE").toString();
			String  ADDR             =  jsonObj.get("ADDR").toString();
			String  POSTCODE         =  jsonObj.get("POSTCODE").toString();
			String  NEW_OPEN_FLAG    =  jsonObj.get("NEW_OPEN_FLAG").toString();
			String  RETURN_CODE      =  jsonObj.get("RETURN_CODE").toString();
			
			String  RETURN_INFO      =  jsonObj.get("RETURN_INFO").toString();
			String  DIGITAL_SIGNATURE =  jsonObj.get("DIGITAL_SIGNATURE").toString();
			String  PAGER             =  jsonObj.get("PAGER").toString();
			String  ENTRUST_METHOD    =  jsonObj.get("ENTRUST_METHOD").toString();
			String  REPAIR_FLAG       =  jsonObj.get("REPAIR_FLAG").toString(); 
			String  BRANCH_CODE       =  jsonObj.get("BRANCH_CODE").toString();
			String  EMAIL             =  jsonObj.get("EMAIL").toString();
			String  EMAIL_FLAG        =  jsonObj.get("EMAIL_FLAG").toString();
			String  MOBILE            =  jsonObj.get("MOBILE").toString();
			String  BANK_EMP_CODE     =  jsonObj.get("BANK_EMP_CODE").toString();
			
			String  BANK_QUERY_PWD    =  jsonObj.get("BANK_QUERY_PWD").toString();
			String  BANK_DRAW_PWD     =  jsonObj.get("BANK_DRAW_PWD").toString();
			String  BANK_ACC_FLAG     =  jsonObj.get("BANK_ACC_FLAG").toString();
			String  NEW_BANK_ACC_FLAG =  jsonObj.get("NEW_BANK_ACC_FLAG").toString();
			String  CURRENCY_TYPE    =  jsonObj.get("CURRENCY_TYPE").toString();
			String  SEND_FLAG        =  jsonObj.get("SEND_FLAG").toString();
			String  BRANCH_SERIAL_NO =  jsonObj.get("BRANCH_SERIAL_NO").toString();
			String  EMP_CODE         =  jsonObj.get("EMP_CODE").toString();
			String  BANK_ENTRUST     =  jsonObj.get("BANK_ENTRUST").toString();
			String  SERIAL_NO        =  jsonObj.get("SERIAL_NO").toString();
			
			String  PWD              =  jsonObj.get("PWD").toString();
			String  DEAL_FLAG        =  jsonObj.get("DEAL_FLAG").toString();
			String  REQUEST_DATE     =  jsonObj.get("REQUEST_DATE").toString();
			String  REQUEST_TIME     =  jsonObj.get("REQUEST_TIME").toString();
			String  SOURCE_TYPE      =  jsonObj.get("SOURCE_TYPE").toString();
			String  FUND_ACC_NO      =  jsonObj.get("FUND_ACC_NO").toString();
			String  BANK_JOINT       =  jsonObj.get("BANK_JOINT").toString();
			String  FUND_SERIAL_NO   =  jsonObj.get("FUND_SERIAL_NO").toString();
			String  RETURN_DATE      =  jsonObj.get("RETURN_DATE").toString();
			String  RETURN_TIME      =  jsonObj.get("RETURN_TIME").toString();
			
			String  SPARE1           =  jsonObj.get("SPARE1").toString();
			String  SPARE2           =  jsonObj.get("SPARE2").toString();
			String  SPARE3           =  jsonObj.get("SPARE3").toString();
			String  SPARE4           =  jsonObj.get("SPARE4").toString();
			String  COM_HANDLE       =  jsonObj.get("COM_HANDLE").toString();
			
			crdBankAccInterface.setName(NAME);
			crdBankAccInterface.setOccur_branch(OCCUR_BRANCH);
			crdBankAccInterface.setBank_code(BANK_CODE);
			crdBankAccInterface.setBank_acc_no(BANK_ACC_NO);
			crdBankAccInterface.setNew_bank_acc_no(NEW_BANK_ACC_NO);
			crdBankAccInterface.setBank_cust_no(BANK_CUST_NO);
			crdBankAccInterface.setCust_no(CUST_NO);
			crdBankAccInterface.setCust_type(CUST_TYPE);
			crdBankAccInterface.setRequest_type(REQUEST_TYPE);
			crdBankAccInterface.setBank_serial_no(BANK_SERIAL_NO);
			crdBankAccInterface.setSh_holder_acc_no(SH_HOLDER_ACC_NO);
			
			crdBankAccInterface.setSz_holder_acc_no(SZ_HOLDER_ACC_NO);
			crdBankAccInterface.setAll_name(ALL_NAME);
			crdBankAccInterface.setCert_type(Integer.parseInt(CERT_TYPE));
			crdBankAccInterface.setId_no(ID_NO);
			crdBankAccInterface.setPhone(PHONE);
			crdBankAccInterface.setAddr(ADDR);
			crdBankAccInterface.setPostcode(POSTCODE);
			crdBankAccInterface.setNew_open_flag(NEW_OPEN_FLAG);
			crdBankAccInterface.setReturn_code(RETURN_CODE);
			
			crdBankAccInterface.setReturn_info(RETURN_INFO);
			crdBankAccInterface.setDigital_signature(DIGITAL_SIGNATURE);
			crdBankAccInterface.setPager(PAGER);
			crdBankAccInterface.setEntrust_method(ENTRUST_METHOD);
			crdBankAccInterface.setRepair_flag(REPAIR_FLAG);
			crdBankAccInterface.setBranch_code(BRANCH_CODE);
			crdBankAccInterface.setEmail(EMAIL);
			crdBankAccInterface.setEmail_flag(EMAIL_FLAG);
			crdBankAccInterface.setMobile(MOBILE);
			crdBankAccInterface.setBank_emp_code(BANK_EMP_CODE);
			
			crdBankAccInterface.setBank_query_pwd(BANK_QUERY_PWD);
			crdBankAccInterface.setBank_draw_pwd(BANK_DRAW_PWD);
			crdBankAccInterface.setBank_acc_flag(BANK_ACC_FLAG);
			crdBankAccInterface.setNew_bank_acc_flag(NEW_BANK_ACC_FLAG);
			crdBankAccInterface.setCurrency_type(CURRENCY_TYPE);
			crdBankAccInterface.setSend_flag(SEND_FLAG);
			crdBankAccInterface.setBranch_serial_no(BRANCH_SERIAL_NO);
			crdBankAccInterface.setEmp_code(EMP_CODE);
			crdBankAccInterface.setBank_entrust(BANK_ENTRUST);
			crdBankAccInterface.setSerial_no(SERIAL_NO);
			
			crdBankAccInterface.setPwd(PWD);
			crdBankAccInterface.setDeal_flag(DEAL_FLAG);
			crdBankAccInterface.setRequest_date(REQUEST_DATE);
			crdBankAccInterface.setRequest_time(REQUEST_TIME);
			crdBankAccInterface.setSource_type(SOURCE_TYPE);
			crdBankAccInterface.setFund_acc_no(FUND_ACC_NO);
			crdBankAccInterface.setBank_joint(BANK_JOINT);
			crdBankAccInterface.setFund_serial_no(FUND_SERIAL_NO);
			crdBankAccInterface.setReturn_date(RETURN_DATE);
			crdBankAccInterface.setReturn_time(RETURN_TIME);
			
			crdBankAccInterface.setSpare1(SPARE1);
			crdBankAccInterface.setSpare2(SPARE2);
			crdBankAccInterface.setSpare3(SPARE3);
			crdBankAccInterface.setSpare4(SPARE4);
			crdBankAccInterface.setCom_handle(COM_HANDLE);
			
		} catch (Exception e) {
			logger.error("解析[CrdBankAccInterface]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}	
		return crdBankAccInterface;
	}
	
	public static OptBankAccInterface getOptBankAccInterface(JSONObject jsonObj){
		
		OptBankAccInterface optBankAccInterface = null ;
		
		try {
			optBankAccInterface = new OptBankAccInterface();
			String  OCCUR_BRANCH  = jsonObj.get("OCCUR_BRANCH").toString();     
			String  BANK_CODE     = jsonObj.get("BANK_CODE").toString();       
			String  BANK_ACC_NO   = jsonObj.get("BANK_ACC_NO").toString();    
			String  NEW_BANK_ACC_NO  =  jsonObj.get("NEW_BANK_ACC_NO").toString();
			String  BANK_CUST_NO     =  jsonObj.get("BANK_CUST_NO").toString();
			String  CUST_NO          =  jsonObj.get("CUST_NO").toString();
			String  CUST_TYPE        =  jsonObj.get("CUST_TYPE").toString();
			String  REQUEST_TYPE     =  jsonObj.get("REQUEST_TYPE").toString();
			String  BANK_SERIAL_NO   =  jsonObj.get("BANK_SERIAL_NO").toString();
			String  SH_HOLDER_ACC_NO =  jsonObj.get("SH_HOLDER_ACC_NO").toString();
			
			String  SZ_HOLDER_ACC_NO =  jsonObj.get("SZ_HOLDER_ACC_NO").toString();
			String  NAME             =  jsonObj.get("NAME").toString();
			String  ALL_NAME         =  jsonObj.get("ALL_NAME").toString();
			String  CERT_TYPE        =  jsonObj.get("CERT_TYPE").toString();
			String  ID_NO            =  jsonObj.get("ID_NO").toString();
			String  PHONE            =  jsonObj.get("PHONE").toString();
			String  ADDR             =  jsonObj.get("ADDR").toString();
			String  POSTCODE         =  jsonObj.get("POSTCODE").toString();
			String  NEW_OPEN_FLAG    =  jsonObj.get("NEW_OPEN_FLAG").toString();
			String  RETURN_CODE      =  jsonObj.get("RETURN_CODE").toString();
			
			String  RETURN_INFO      =  jsonObj.get("RETURN_INFO").toString();
			String  DIGITAL_SIGNATURE =  jsonObj.get("DIGITAL_SIGNATURE").toString();
			String  PAGER             =  jsonObj.get("PAGER").toString();
			String  ENTRUST_METHOD    =  jsonObj.get("ENTRUST_METHOD").toString();
			String  REPAIR_FLAG       =  jsonObj.get("REPAIR_FLAG").toString(); 
			String  BRANCH_CODE       =  jsonObj.get("BRANCH_CODE").toString();
			String  EMAIL             =  jsonObj.get("EMAIL").toString();
			String  EMAIL_FLAG        =  jsonObj.get("EMAIL_FLAG").toString();
			String  MOBILE            =  jsonObj.get("MOBILE").toString();
			String  BANK_EMP_CODE     =  jsonObj.get("BANK_EMP_CODE").toString();
			
			String  BANK_QUERY_PWD    =  jsonObj.get("BANK_QUERY_PWD").toString();
			String  BANK_DRAW_PWD     =  jsonObj.get("BANK_DRAW_PWD").toString();
			String  BANK_ACC_FLAG     =  jsonObj.get("BANK_ACC_FLAG").toString();
			String  NEW_BANK_ACC_FLAG =  jsonObj.get("NEW_BANK_ACC_FLAG").toString();
			String  CURRENCY_TYPE    =  jsonObj.get("CURRENCY_TYPE").toString();
			String  SEND_FLAG        =  jsonObj.get("SEND_FLAG").toString();
			String  BRANCH_SERIAL_NO =  jsonObj.get("BRANCH_SERIAL_NO").toString();
			String  EMP_CODE         =  jsonObj.get("EMP_CODE").toString();
			String  BANK_ENTRUST     =  jsonObj.get("BANK_ENTRUST").toString();
			String  SERIAL_NO        =  jsonObj.get("SERIAL_NO").toString();
			
			String  PWD              =  jsonObj.get("PWD").toString();
			String  DEAL_FLAG        =  jsonObj.get("DEAL_FLAG").toString();
			String  REQUEST_DATE     =  jsonObj.get("REQUEST_DATE").toString();
			String  REQUEST_TIME     =  jsonObj.get("REQUEST_TIME").toString();
			String  SOURCE_TYPE      =  jsonObj.get("SOURCE_TYPE").toString();
			String  FUND_ACC_NO      =  jsonObj.get("FUND_ACC_NO").toString();
			String  BANK_JOINT       =  jsonObj.get("BANK_JOINT").toString();
			String  FUND_SERIAL_NO   =  jsonObj.get("FUND_SERIAL_NO").toString();
			String  RETURN_DATE      =  jsonObj.get("RETURN_DATE").toString();
			String  RETURN_TIME      =  jsonObj.get("RETURN_TIME").toString();
			
			String  SPARE1           =  jsonObj.get("SPARE1").toString();
			String  SPARE2           =  jsonObj.get("SPARE2").toString();
			String  SPARE3           =  jsonObj.get("SPARE3").toString();
			String  SPARE4           =  jsonObj.get("SPARE4").toString();
			String  COM_HANDLE       =  jsonObj.get("COM_HANDLE").toString();
			String  CHECK_EMP        =  jsonObj.get("CHECK_EMP").toString();
			String  user_id          =  jsonObj.get("USER_ID").toString();
			String  user_data        =  jsonObj.get("USER_DATA").toString();
			
			optBankAccInterface.setName(NAME);
			optBankAccInterface.setOccur_branch(OCCUR_BRANCH);
			optBankAccInterface.setBank_code(BANK_CODE);
			optBankAccInterface.setBank_acc_no(BANK_ACC_NO);
			optBankAccInterface.setNew_bank_acc_no(NEW_BANK_ACC_NO);
			optBankAccInterface.setBank_cust_no(BANK_CUST_NO);
			optBankAccInterface.setCust_no(CUST_NO);
			optBankAccInterface.setCust_type(CUST_TYPE);
			optBankAccInterface.setRequest_type(REQUEST_TYPE);
			optBankAccInterface.setBank_serial_no(BANK_SERIAL_NO);
			optBankAccInterface.setSh_holder_acc_no(SH_HOLDER_ACC_NO);
			
			optBankAccInterface.setSz_holder_acc_no(SZ_HOLDER_ACC_NO);
			optBankAccInterface.setAll_name(ALL_NAME);
			optBankAccInterface.setCert_type(Integer.parseInt(CERT_TYPE));
			optBankAccInterface.setId_no(ID_NO);
			optBankAccInterface.setPhone(PHONE);
			optBankAccInterface.setAddr(ADDR);
			optBankAccInterface.setPostcode(POSTCODE);
			optBankAccInterface.setNew_open_flag(NEW_OPEN_FLAG);
			optBankAccInterface.setReturn_code(RETURN_CODE);
			
			optBankAccInterface.setReturn_info(RETURN_INFO);
			optBankAccInterface.setDigital_signature(DIGITAL_SIGNATURE);
			optBankAccInterface.setPager(PAGER);
			optBankAccInterface.setEntrust_method(ENTRUST_METHOD);
			optBankAccInterface.setRepair_flag(REPAIR_FLAG);
			optBankAccInterface.setBranch_code(BRANCH_CODE);
			optBankAccInterface.setEmail(EMAIL);
			optBankAccInterface.setEmail_flag(EMAIL_FLAG);
			optBankAccInterface.setMobile(MOBILE);
			optBankAccInterface.setBank_emp_code(BANK_EMP_CODE);
			
			optBankAccInterface.setBank_query_pwd(BANK_QUERY_PWD);
			optBankAccInterface.setBank_draw_pwd(BANK_DRAW_PWD);
			optBankAccInterface.setBank_acc_flag(BANK_ACC_FLAG);
			optBankAccInterface.setNew_bank_acc_flag(NEW_BANK_ACC_FLAG);
			optBankAccInterface.setCurrency_type(CURRENCY_TYPE);
			optBankAccInterface.setSend_flag(SEND_FLAG);
			optBankAccInterface.setBranch_serial_no(BRANCH_SERIAL_NO);
			optBankAccInterface.setEmp_code(EMP_CODE);
			optBankAccInterface.setBank_entrust(BANK_ENTRUST);
			optBankAccInterface.setSerial_no(SERIAL_NO);
			
			optBankAccInterface.setPwd(PWD);
			optBankAccInterface.setDeal_flag(DEAL_FLAG);
			optBankAccInterface.setRequest_date(REQUEST_DATE);
			optBankAccInterface.setRequest_time(REQUEST_TIME);
			optBankAccInterface.setSource_type(SOURCE_TYPE);
			optBankAccInterface.setFund_acc_no(FUND_ACC_NO);
			optBankAccInterface.setBank_joint(BANK_JOINT);
			optBankAccInterface.setFund_serial_no(FUND_SERIAL_NO);
			optBankAccInterface.setReturn_date(RETURN_DATE);
			optBankAccInterface.setReturn_time(RETURN_TIME);
			
			optBankAccInterface.setSpare1(SPARE1);
			optBankAccInterface.setSpare2(SPARE2);
			optBankAccInterface.setSpare3(SPARE3);
			optBankAccInterface.setSpare4(SPARE4);
			optBankAccInterface.setCom_handle(COM_HANDLE);
			optBankAccInterface.setCheck_emp(CHECK_EMP);
			optBankAccInterface.setUser_data(Integer.parseInt(user_data));
			optBankAccInterface.setUserid(user_id);

		} catch (Exception e) {
			logger.error("解析[optBankAccInterface]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return optBankAccInterface;
	}
	 
	
	public static CrdBankTrfInterface getCrdBankTrfInterface(JSONObject jsonObj){
		
		CrdBankTrfInterface crdBankTrfInterface = null;
		
		try {
			crdBankTrfInterface = new CrdBankTrfInterface();
			String  SOURCE_TYPE        =  jsonObj.get("SOURCE_TYPE").toString();        
			String  REQUEST_TYPE       =  jsonObj.get("REQUEST_TYPE").toString();
			String  BANK_CODE          =  jsonObj.get("BANK_CODE").toString();
			String  BANK_ACC_NO        =  jsonObj.get("BANK_ACC_NO").toString();
			String  CUST_NO            =  jsonObj.get("CUST_NO").toString();
			String  CURRENCY_TYPE      =  jsonObj.get("CURRENCY_TYPE").toString();
			String  FUND_ACC_NO        =  jsonObj.get("FUND_ACC_NO").toString();
			String  CUST_TYPE          =  jsonObj.get("CUST_TYPE").toString();
			String  BRANCH_CODE        =  jsonObj.get("BRANCH_CODE").toString();
			String  ENTRUST_METHOD     =  jsonObj.get("ENTRUST_METHOD").toString();
			String  EMP_CODE           =  jsonObj.get("EMP_CODE").toString();
			
			String  BANK_ENTRST_METHOD =  jsonObj.get("BANK_ENTRST_METHOD").toString();
			String  BANK_EMP_CODE      =  jsonObj.get("BANK_EMP_CODE").toString();
			String  BANK_JOINT         =  jsonObj.get("BANK_JOINT").toString();
			String  PWD                =  jsonObj.get("PWD").toString();
			String  REQUEST_DATE       =  jsonObj.get("REQUEST_DATE").toString();
			String  REQUEST_TIME       =  jsonObj.get("REQUEST_TIME").toString();
			String  OCCUR_BAL          =  jsonObj.get("OCCUR_BAL").toString();
			String  SERIAL_NO          =  jsonObj.get("SERIAL_NO").toString();
			String  SH_HOLDER_ACC_NO   =  jsonObj.get("SH_HOLDER_ACC_NO").toString();
			String  SZ_HOLDER_ACC_NO   =  jsonObj.get("SZ_HOLDER_ACC_NO").toString();
			
			String  BANK_SERIAL_NO     =  jsonObj.get("BANK_SERIAL_NO").toString();
			String  DEAL_FLAG          =  jsonObj.get("DEAL_FLAG").toString();
			String  BRANCH_SERIAL_NO   =  jsonObj.get("BRANCH_SERIAL_NO").toString();
			String  OCCUR_BRANCH       =  jsonObj.get("OCCUR_BRANCH").toString();
			String  NAME               =  jsonObj.get("NAME").toString();
			String  DIGITAL_SIGNATURE  =  jsonObj.get("DIGITAL_SIGNATURE").toString();
			String  BANK_QUERY_PWD     =  jsonObj.get("BANK_QUERY_PWD").toString();
			String  BANK_DRAW_PWD      =  jsonObj.get("BANK_DRAW_PWD").toString();
			String  BANK_ACC_FLAG      =  jsonObj.get("BANK_ACC_FLAG").toString();
			String  REPARE_FLAG        =  jsonObj.get("REPARE_FLAG").toString();
			
			String  SEND_FLAG          =  jsonObj.get("SEND_FLAG").toString();
			String  RETURN_INFO        =  jsonObj.get("RETURN_INFO").toString();
			String  RETURN_CODE        =  jsonObj.get("RETURN_CODE").toString();
			String  FUND_SERIAL_NO     =  jsonObj.get("FUND_SERIAL_NO").toString();
			String  RETURN_DATE        =  jsonObj.get("RETURN_DATE").toString();
			String  RETURN_TIME        =  jsonObj.get("RETURN_TIME").toString();
			String  SPARE1             =  jsonObj.get("SPARE1").toString();
			String  SPARE2             =  jsonObj.get("SPARE2").toString();
			String  SPARE3             =  jsonObj.get("SPARE3").toString();
			String  SPARE4             =  jsonObj.get("SPARE4").toString();
			
			String  CERT_TYPE          =  jsonObj.get("CERT_TYPE").toString();
			String  ID_NO              =  jsonObj.get("ID_NO").toString();
			String  COM_HANDLE         =  jsonObj.get("COM_HANDLE").toString();
			String  TRF_SOURCE         =  jsonObj.get("TRF_SOURCE").toString();
	
			crdBankTrfInterface.setSource_type(SOURCE_TYPE);
			crdBankTrfInterface.setRequest_type(REQUEST_TYPE);
			crdBankTrfInterface.setBank_code(BANK_CODE);
			crdBankTrfInterface.setBank_acc_no(BANK_ACC_NO);
			crdBankTrfInterface.setCust_no(CUST_NO);
			crdBankTrfInterface.setCurrency_type(CURRENCY_TYPE);
			crdBankTrfInterface.setFund_acc_no(FUND_ACC_NO);
			crdBankTrfInterface.setCust_type(CUST_TYPE);
			crdBankTrfInterface.setBranch_code(BRANCH_CODE);
			crdBankTrfInterface.setEntrust_method(ENTRUST_METHOD);
			crdBankTrfInterface.setEmp_code(EMP_CODE);
			
			crdBankTrfInterface.setBank_entrst_method(BANK_ENTRST_METHOD);
			crdBankTrfInterface.setBank_emp_code(BANK_EMP_CODE);
			crdBankTrfInterface.setBank_joint(BANK_JOINT);
			crdBankTrfInterface.setPwd(PWD);
			crdBankTrfInterface.setRequest_date(REQUEST_DATE);
			crdBankTrfInterface.setRequest_time(REQUEST_TIME);
			crdBankTrfInterface.setOccur_bal(Double.parseDouble(OCCUR_BAL));
			crdBankTrfInterface.setSerial_no(SERIAL_NO);
			crdBankTrfInterface.setSh_holder_acc_no(SH_HOLDER_ACC_NO);
			crdBankTrfInterface.setSz_holder_acc_no(SZ_HOLDER_ACC_NO);
			
			crdBankTrfInterface.setBank_serial_no(BANK_SERIAL_NO);
			crdBankTrfInterface.setOccur_branch(OCCUR_BRANCH);
			crdBankTrfInterface.setName(NAME);
			crdBankTrfInterface.setDigital_signature(DIGITAL_SIGNATURE);
			crdBankTrfInterface.setBank_query_pwd(BANK_QUERY_PWD);
			crdBankTrfInterface.setBank_draw_pwd(BANK_DRAW_PWD);
			crdBankTrfInterface.setBank_acc_flag(BANK_ACC_FLAG);
			crdBankTrfInterface.setRepare_flag(REPARE_FLAG);
			crdBankTrfInterface.setSend_flag(SEND_FLAG);
			crdBankTrfInterface.setReturn_info(RETURN_INFO);
			
			crdBankTrfInterface.setReturn_code(RETURN_CODE);
			crdBankTrfInterface.setFund_serial_no(FUND_SERIAL_NO);
			crdBankTrfInterface.setReturn_date(RETURN_DATE);
			crdBankTrfInterface.setReturn_time(RETURN_TIME);
			crdBankTrfInterface.setSpare1(SPARE1);
			crdBankTrfInterface.setSpare2(SPARE2);
			crdBankTrfInterface.setSpare3(SPARE3);
			crdBankTrfInterface.setSpare4(SPARE4);
			crdBankTrfInterface.setCert_type(Integer.parseInt(CERT_TYPE));
			
			crdBankTrfInterface.setDeal_flag(DEAL_FLAG);
			crdBankTrfInterface.setBranch_serial_no(BRANCH_SERIAL_NO);
			
			crdBankTrfInterface.setId_no(ID_NO);
			crdBankTrfInterface.setCom_handle(COM_HANDLE);
			crdBankTrfInterface.setTrf_source(TRF_SOURCE);

		} catch (Exception e) {
			logger.error("解析[CrdBankTrfInterface]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return crdBankTrfInterface;
	}
	
	
	public static OptBankTrfInterface getOptBankTrfInterface(JSONObject jsonObj){
		
		OptBankTrfInterface optBankTrfInterface = null;
		
		try {
			optBankTrfInterface = new OptBankTrfInterface();
			String  SOURCE_TYPE        =  jsonObj.get("SOURCE_TYPE").toString();        
			String  REQUEST_TYPE       =  jsonObj.get("REQUEST_TYPE").toString();
			String  BANK_CODE          =  jsonObj.get("BANK_CODE").toString();
			String  BANK_ACC_NO        =  jsonObj.get("BANK_ACC_NO").toString();
			String  CUST_NO            =  jsonObj.get("CUST_NO").toString();
			String  CURRENCY_TYPE      =  jsonObj.get("CURRENCY_TYPE").toString();
			String  FUND_ACC_NO        =  jsonObj.get("FUND_ACC_NO").toString();
			String  CUST_TYPE          =  jsonObj.get("CUST_TYPE").toString();
			String  BRANCH_CODE        =  jsonObj.get("BRANCH_CODE").toString();
			String  ENTRUST_METHOD     =  jsonObj.get("ENTRUST_METHOD").toString();
			String  EMP_CODE           =  jsonObj.get("EMP_CODE").toString();
			
			String  BANK_ENTRST_METHOD =  jsonObj.get("BANK_ENTRST_METHOD").toString();
			String  BANK_EMP_CODE      =  jsonObj.get("BANK_EMP_CODE").toString();
			String  BANK_JOINT         =  jsonObj.get("BANK_JOINT").toString();
			String  PWD                =  jsonObj.get("PWD").toString();
			String  REQUEST_DATE       =  jsonObj.get("REQUEST_DATE").toString();
			String  REQUEST_TIME       =  jsonObj.get("REQUEST_TIME").toString();
			String  OCCUR_BAL          =  jsonObj.get("OCCUR_BAL").toString();
			String  SERIAL_NO          =  jsonObj.get("SERIAL_NO").toString();
			String  SH_HOLDER_ACC_NO   =  jsonObj.get("SH_HOLDER_ACC_NO").toString();
			String  SZ_HOLDER_ACC_NO   =  jsonObj.get("SZ_HOLDER_ACC_NO").toString();
			
			String  BANK_SERIAL_NO     =  jsonObj.get("BANK_SERIAL_NO").toString();
			String  DEAL_FLAG          =  jsonObj.get("DEAL_FLAG").toString();
			String  BRANCH_SERIAL_NO   =  jsonObj.get("BRANCH_SERIAL_NO").toString();
			String  OCCUR_BRANCH       =  jsonObj.get("OCCUR_BRANCH").toString();
			String  NAME               =  jsonObj.get("NAME").toString();
			String  DIGITAL_SIGNATURE  =  jsonObj.get("DIGITAL_SIGNATURE").toString();
			String  BANK_QUERY_PWD     =  jsonObj.get("BANK_QUERY_PWD").toString();
			String  BANK_DRAW_PWD      =  jsonObj.get("BANK_DRAW_PWD").toString();
			String  BANK_ACC_FLAG      =  jsonObj.get("BANK_ACC_FLAG").toString();
			String  REPARE_FLAG        =  jsonObj.get("REPARE_FLAG").toString();
			
			String  SEND_FLAG          =  jsonObj.get("SEND_FLAG").toString();
			String  RETURN_INFO        =  jsonObj.get("RETURN_INFO").toString();
			String  RETURN_CODE        =  jsonObj.get("RETURN_CODE").toString();
			String  FUND_SERIAL_NO     =  jsonObj.get("FUND_SERIAL_NO").toString();
			String  RETURN_DATE        =  jsonObj.get("RETURN_DATE").toString();
			String  RETURN_TIME        =  jsonObj.get("RETURN_TIME").toString();
			String  SPARE1             =  jsonObj.get("SPARE1").toString();
			String  SPARE2             =  jsonObj.get("SPARE2").toString();
			String  SPARE3             =  jsonObj.get("SPARE3").toString();
			String  SPARE4             =  jsonObj.get("SPARE4").toString();
			
			String  CERT_TYPE          =  jsonObj.get("CERT_TYPE").toString();
			String  ID_NO              =  jsonObj.get("ID_NO").toString();
			String  COM_HANDLE         =  jsonObj.get("COM_HANDLE").toString();
			String  R_DATE             =  jsonObj.get("R_DATE").toString();
			String  TRF_SOURCE         =  jsonObj.get("TRF_SOURCE").toString();
			String  user_id            =  jsonObj.get("USER_ID").toString();
			String  user_data          =  jsonObj.get("USER_DATA").toString();
			String  ip                 =  jsonObj.get("IP").toString();
			String  mac                =  jsonObj.get("MAC").toString();
			String  reversal_num       =  jsonObj.get("REVERSAL_NUM").toString();
			String  update_time        =  jsonObj.get("UPDATE_TIME").toString();
			String  reversal_mode      =  jsonObj.get("REVERSAL_MODE").toString();

			optBankTrfInterface.setSource_type(SOURCE_TYPE);
			optBankTrfInterface.setRequest_type(REQUEST_TYPE);
			optBankTrfInterface.setBank_code(BANK_CODE);
			optBankTrfInterface.setBank_acc_no(BANK_ACC_NO);
			optBankTrfInterface.setCust_no(CUST_NO);
			optBankTrfInterface.setCurrency_type(CURRENCY_TYPE);
			optBankTrfInterface.setFund_acc_no(FUND_ACC_NO);
			optBankTrfInterface.setCust_type(CUST_TYPE);
			optBankTrfInterface.setBranch_code(BRANCH_CODE);
			optBankTrfInterface.setEntrust_method(ENTRUST_METHOD);
			optBankTrfInterface.setEmp_code(EMP_CODE);
			
			optBankTrfInterface.setBank_entrst_method(BANK_ENTRST_METHOD);
			optBankTrfInterface.setBank_emp_code(BANK_EMP_CODE);
			optBankTrfInterface.setBank_joint(BANK_JOINT);
			optBankTrfInterface.setPwd(PWD);
			optBankTrfInterface.setRequest_date(REQUEST_DATE);
			optBankTrfInterface.setRequest_time(REQUEST_TIME);
			optBankTrfInterface.setOccur_bal(Double.parseDouble(OCCUR_BAL));
			optBankTrfInterface.setSerial_no(SERIAL_NO);
			optBankTrfInterface.setSh_holder_acc_no(SH_HOLDER_ACC_NO);
			optBankTrfInterface.setSz_holder_acc_no(SZ_HOLDER_ACC_NO);
			
			optBankTrfInterface.setBank_serial_no(BANK_SERIAL_NO);
			optBankTrfInterface.setOccur_branch(OCCUR_BRANCH);
			optBankTrfInterface.setName(NAME);
			optBankTrfInterface.setDigital_signature(DIGITAL_SIGNATURE);
			optBankTrfInterface.setBank_query_pwd(BANK_QUERY_PWD);
			optBankTrfInterface.setBank_draw_pwd(BANK_DRAW_PWD);
			optBankTrfInterface.setBank_acc_flag(BANK_ACC_FLAG);
			optBankTrfInterface.setRepare_flag(REPARE_FLAG);
			optBankTrfInterface.setSend_flag(SEND_FLAG);
			optBankTrfInterface.setReturn_info(RETURN_INFO);
			
			optBankTrfInterface.setReturn_code(RETURN_CODE);
			optBankTrfInterface.setFund_serial_no(FUND_SERIAL_NO);
			optBankTrfInterface.setReturn_date(RETURN_DATE);
			optBankTrfInterface.setReturn_time(RETURN_TIME);
			optBankTrfInterface.setSpare1(SPARE1);
			optBankTrfInterface.setSpare2(SPARE2);
			optBankTrfInterface.setSpare3(SPARE3);
			optBankTrfInterface.setSpare4(SPARE4);
			optBankTrfInterface.setCert_type(Integer.parseInt(CERT_TYPE));
			
			optBankTrfInterface.setDeal_flag(DEAL_FLAG);
			optBankTrfInterface.setBranch_serial_no(BRANCH_SERIAL_NO);
			
			optBankTrfInterface.setId_no(ID_NO);
			optBankTrfInterface.setCom_handle(COM_HANDLE);
			optBankTrfInterface.setR_date(R_DATE);
			optBankTrfInterface.setTrf_source(TRF_SOURCE);
			optBankTrfInterface.setUser_id(user_id);
			optBankTrfInterface.setUser_data(Integer.parseInt(user_data));
			optBankTrfInterface.setIp(ip);
			optBankTrfInterface.setMac(mac);
			optBankTrfInterface.setReversal_num(Integer.parseInt(reversal_num));
			optBankTrfInterface.setUpdate_time(update_time);
			optBankTrfInterface.setReversal_mode(reversal_mode);
	
		} catch (Exception e) {
			logger.error("解析[OptBankTrfInterface]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return optBankTrfInterface;
	}
	
	public static OlpayTradeRecord getOlpayTradeRecord(JSONObject jsonObj){
		
		OlpayTradeRecord olpayTradeRecord = null;
		
		try {
			olpayTradeRecord = new OlpayTradeRecord();
			String  ID                    = jsonObj.get("ID").toString();         
			String  RECORD_NO             = jsonObj.get("RECORD_NO").toString();
			String  RECORD_STATUS         = jsonObj.get("RECORD_STATUS").toString();
			String  RECORD_SOURCE         = jsonObj.get("RECORD_SOURCE").toString();
			String  CUST_NO               = jsonObj.get("CUST_NO").toString();
			String  CUST_BANK_CODE        = jsonObj.get("CUST_BANK_CODE").toString();
			String  TRADE_CODE            = jsonObj.get("TRADE_CODE").toString();
			String  CREATE_DATE           = jsonObj.get("CREATE_DATE").toString();
			String  CREATE_TIME           = jsonObj.get("CREATE_TIME").toString();
			String  CLEAR_DATE            = jsonObj.get("CLEAR_DATE").toString();
			String  CLEAR_TIME            = jsonObj.get("CLEAR_TIME").toString();
			String  TPO_TRADE_DATE        = jsonObj.get("TPO_TRADE_DATE").toString();
			String  TPO_TRADE_TIME        = jsonObj.get("TPO_TRADE_TIME").toString();
			String  TPO_TRADE_CODE        = jsonObj.get("TPO_TRADE_CODE").toString();
			String  TPO_CLEAR_DATE        = jsonObj.get("TPO_CLEAR_DATE").toString();
			String  TPO_CLEAR_TIME        = jsonObj.get("TPO_CLEAR_TIME").toString();
			String  TPO_CODE              = jsonObj.get("TPO_CODE").toString();
			String  TPO_GOODS_AMOUNT      = jsonObj.get("TPO_GOODS_AMOUNT").toString();
			String  TPO_PAYMENT_BALANCE   = jsonObj.get("TPO_PAYMENT_BALANCE").toString();
			String  CURRENCY              = jsonObj.get("CURRENCY").toString();
			String  TPO_TRADE_NOTE        = jsonObj.get("TPO_TRADE_NOTE").toString();
			String  TPO_ORDER_NO          = jsonObj.get("TPO_ORDER_NO").toString();
			String  ORDER_STATUS          = jsonObj.get("ORDER_STATUS").toString();
			String  BRANCH_CODE           = jsonObj.get("BRANCH_CODE").toString();
			String  SYSTEM_STATUS         = jsonObj.get("SYSTEM_STATUS").toString();
			String  PROCESS_TYPE          = jsonObj.get("PROCESS_TYPE").toString();
			String  OPERATOR              = jsonObj.get("OPERATOR").toString();
			String  OPERATE_DATE          = jsonObj.get("OPERATE_DATE").toString();
			String  OPERATE_TIME          = jsonObj.get("OPERATE_TIME").toString();
			String  BMP_RECORD_NO         = jsonObj.get("BMP_RECORD_NO").toString();
			String  BMP_FREEZE_DATE       = jsonObj.get("BMP_FREEZE_DATE").toString();
			String  TPO_ORIGINAL_ORDER_NO = jsonObj.get("TPO_ORIGINAL_ORDER_NO").toString();
			String  TPO_ORIGINAL_DATE     = jsonObj.get("TPO_ORIGINAL_DATE").toString();
			String  TPO_ORIGINAL_TIME     = jsonObj.get("TPO_ORIGINAL_TIME").toString();
			String  TPO_MERCHANT_CODE     = jsonObj.get("TPO_MERCHANT_CODE").toString();
			String  TPO_MERCHANT_NAME     = jsonObj.get("TPO_MERCHANT_NAME").toString();
			String  TPO_CLEAR_FLAG        = jsonObj.get("TPO_CLEAR_FLAG").toString();
			String  SYSTEM_CODE           = jsonObj.get("SYSTEM_CODE").toString();
			String  BMP_CLEAR_FLAG        = jsonObj.get("BMP_CLEAR_FLAG").toString();
			
			String  BMP_EXPORT_FLAG       = jsonObj.get("BMP_EXPORT_FLAG").toString();
			String  BMP_EXPORT_RESULT     = jsonObj.get("BMP_EXPORT_RESULT").toString();
			String  CUST_LOGIN_IP         = jsonObj.get("CUST_LOGIN_IP").toString();
			String  CUST_LOGIN_MAC        = jsonObj.get("CUST_LOGIN_MAC").toString();
			String  TRADE_CHANNEL         = jsonObj.get("TRADE_CHANNEL").toString();
			String  TPO_BANK_CODE         = jsonObj.get("TPO_BANK_CODE").toString();
			String  TPO_BANK_ACC_NO       = jsonObj.get("TPO_BANK_ACC_NO").toString();
			String  TRADE_FEE             = jsonObj.get("TRADE_FEE").toString();
			String  RETURN_AMOUNT         = jsonObj.get("RETURN_AMOUNT").toString();
			String  FUND_CHANGE_AMT       = jsonObj.get("FUND_CHANGE_AMT").toString();
			String  CLR_BATCH             = jsonObj.get("CLR_BATCH").toString();
			String  CASH_DRAW_STATUS      = jsonObj.get("CASH_DRAW_STATUS").toString();
			String  TPO_MERCHANT_ORDER_NO = jsonObj.get("TPO_MERCHANT_ORDER_NO").toString();
			String  TPO_TRADE_FEE         = jsonObj.get("TPO_TRADE_FEE").toString();
			String  TPO_PROXY_FEE         = jsonObj.get("TPO_PROXY_FEE").toString();
			String  TPO_CLEAR_AMT         = jsonObj.get("TPO_CLEAR_AMT").toString();
			String  ORIGINAL_TRADE_DATE   = jsonObj.get("ORIGINAL_TRADE_DATE").toString();
			String  ORIGINAL_ORDER_NO     = jsonObj.get("ORIGINAL_ORDER_NO").toString();
			String  SOC_ORDER_NO          = jsonObj.get("SOC_ORDER_NO").toString();
			String  OUTER_INNER_FLAG      = jsonObj.get("OUTER_INNER_FLAG").toString();
			String  ADJUST_NOTE           = jsonObj.get("ADJUST_NOTE").toString();
			String  SOC_ORDER_NO_OLD      = jsonObj.get("SOC_ORDER_NO_OLD").toString();
			String  BMP_RECORD_NO_OLD     = jsonObj.get("BMP_RECORD_NO_OLD").toString();
			String  BMP_FLUSH_DATE        = jsonObj.get("BMP_FLUSH_DATE").toString();
			String  EXT_ORDER_STATUS      = jsonObj.get("EXT_ORDER_STATUS").toString();
			String  DEVICE_INFO           = jsonObj.get("DEVICE_INFO").toString();
			String  STD_CUST_NO           = jsonObj.get("STD_CUST_NO").toString();
			String  MAP_SYS               = jsonObj.get("MAP_SYS").toString();
			String  POSTED_DATE           = jsonObj.get("POSTED_DATE").toString();
			String  POSTING_DATE          = jsonObj.get("POSTING_DATE").toString();
			String  REC_TRADE_FEE         = jsonObj.get("REC_TRADE_FEE").toString();
			String  TPO_SETTLE_BATCH_NO   = jsonObj.get("TPO_SETTLE_BATCH_NO").toString();
			String  DISCOUNT_AMT          = jsonObj.get("DISCOUNT_AMT").toString();
			
			olpayTradeRecord.setId(Integer.parseInt(ID));
			olpayTradeRecord.setRecord_no(RECORD_NO);
			olpayTradeRecord.setRecord_source(RECORD_SOURCE);
			olpayTradeRecord.setCust_no(CUST_NO);
			olpayTradeRecord.setCust_bank_code(CUST_BANK_CODE);
			olpayTradeRecord.setTrade_code(TRADE_CODE);
			olpayTradeRecord.setCreate_date(CREATE_DATE);
			olpayTradeRecord.setCreate_time(CREATE_TIME);
			olpayTradeRecord.setClear_date(CLEAR_DATE);
			olpayTradeRecord.setClear_time(CLEAR_TIME);
			olpayTradeRecord.setTpo_trade_date(TPO_TRADE_DATE);
			olpayTradeRecord.setTpo_trade_time(TPO_TRADE_TIME);
			olpayTradeRecord.setTpo_trade_code(TPO_TRADE_CODE);
			olpayTradeRecord.setTpo_clear_date(TPO_CLEAR_DATE);
			olpayTradeRecord.setTpo_clear_time(TPO_CLEAR_TIME);
			olpayTradeRecord.setTpo_code(TPO_CODE);
			olpayTradeRecord.setTpo_goods_amount(Double.parseDouble(TPO_GOODS_AMOUNT));
			olpayTradeRecord.setTpo_payment_balance(Double.parseDouble(TPO_PAYMENT_BALANCE));
			olpayTradeRecord.setCurrency(CURRENCY);
			olpayTradeRecord.setTpo_trade_note(TPO_TRADE_NOTE);
			olpayTradeRecord.setTpo_order_no(TPO_ORDER_NO);
			olpayTradeRecord.setOrder_status(ORDER_STATUS);
			olpayTradeRecord.setBranch_code(BRANCH_CODE);
			olpayTradeRecord.setSystem_status(Byte.parseByte(SYSTEM_STATUS));
			olpayTradeRecord.setProcess_type(Byte.parseByte(PROCESS_TYPE));
			olpayTradeRecord.setOperator(OPERATOR);
			olpayTradeRecord.setOperate_date(OPERATE_DATE);
			olpayTradeRecord.setOperate_time(OPERATE_TIME);
			olpayTradeRecord.setBmp_record_no(BMP_RECORD_NO);
			olpayTradeRecord.setBmp_freeze_date(BMP_FREEZE_DATE);
			olpayTradeRecord.setTpo_original_order_no(TPO_ORIGINAL_ORDER_NO);
			olpayTradeRecord.setTpo_original_date(TPO_ORIGINAL_DATE);
			olpayTradeRecord.setTpo_original_time(TPO_ORIGINAL_TIME);
			olpayTradeRecord.setTpo_merchant_code(TPO_MERCHANT_CODE);
			olpayTradeRecord.setTpo_merchant_name(TPO_MERCHANT_NAME);
			olpayTradeRecord.setTpo_clear_flag(Byte.parseByte(TPO_CLEAR_FLAG));
			olpayTradeRecord.setSystem_code(Integer.parseInt(SYSTEM_CODE));
			olpayTradeRecord.setBmp_clear_flag(BMP_CLEAR_FLAG);
			olpayTradeRecord.setBmp_export_flag(Byte.parseByte(BMP_EXPORT_FLAG));
			olpayTradeRecord.setBmp_export_result(BMP_EXPORT_RESULT);
			olpayTradeRecord.setCust_login_ip(CUST_LOGIN_IP);
			olpayTradeRecord.setCust_login_mac(CUST_LOGIN_MAC);
			olpayTradeRecord.setTrade_channel(TRADE_CHANNEL);
			olpayTradeRecord.setTpo_bank_code(TPO_BANK_CODE);
			olpayTradeRecord.setTpo_bank_acc_no(TPO_BANK_ACC_NO);
			olpayTradeRecord.setTrade_fee(Double.parseDouble(TRADE_FEE));
			olpayTradeRecord.setReturn_amount(Double.parseDouble(RETURN_AMOUNT));
			olpayTradeRecord.setFund_change_amt(Double.parseDouble(FUND_CHANGE_AMT));
			olpayTradeRecord.setClr_batch(Integer.parseInt(CLR_BATCH));
			olpayTradeRecord.setCash_draw_status(CASH_DRAW_STATUS);
			olpayTradeRecord.setTpo_merchant_order_no(TPO_MERCHANT_ORDER_NO);
			olpayTradeRecord.setTpo_trade_fee(Double.parseDouble(TPO_TRADE_FEE));
			olpayTradeRecord.setTpo_proxy_fee(Double.parseDouble(TPO_PROXY_FEE));
			olpayTradeRecord.setTpo_clear_amt(Double.parseDouble(TPO_CLEAR_AMT));
			olpayTradeRecord.setOriginal_trade_date(ORIGINAL_TRADE_DATE);
			olpayTradeRecord.setOriginal_order_no(ORIGINAL_ORDER_NO);
			olpayTradeRecord.setSoc_order_no(SOC_ORDER_NO);
			olpayTradeRecord.setOuter_inner_flag(OUTER_INNER_FLAG);
			olpayTradeRecord.setAdjust_note(ADJUST_NOTE);
			olpayTradeRecord.setSoc_order_no_old(SOC_ORDER_NO_OLD);
			olpayTradeRecord.setBmp_record_no_old(BMP_RECORD_NO_OLD);
			olpayTradeRecord.setBmp_flush_date(BMP_FLUSH_DATE);
			olpayTradeRecord.setExt_order_status(EXT_ORDER_STATUS);
			olpayTradeRecord.setDevice_info(DEVICE_INFO);
			olpayTradeRecord.setStd_cust_no(STD_CUST_NO);
			olpayTradeRecord.setMap_sys(MAP_SYS);
			olpayTradeRecord.setPosted_date(POSTED_DATE);
			olpayTradeRecord.setPosting_date(POSTING_DATE);
			olpayTradeRecord.setRec_trade_fee(REC_TRADE_FEE);
			olpayTradeRecord.setTpo_settle_batch_no(TPO_SETTLE_BATCH_NO);
			olpayTradeRecord.setDiscount_amt(DISCOUNT_AMT);
			
			olpayTradeRecord.setRecord_status(RECORD_STATUS);   
			
		} catch (Exception e) {
			logger.error("解析[OlpayTradeRecord]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		
	    return olpayTradeRecord;
	}
	
	public static FundDetail getFundDetail(JSONObject jsonObj){
		
		  FundDetail fundDetail = null;
		  
		  try {
			  fundDetail = new FundDetail();
			  String  SERIAL_NO           = jsonObj.get("SERIAL_NO").toString();           
			  String  CUST_NO             = jsonObj.get("CUST_NO").toString();
			  String  BANK_ACC            = jsonObj.get("BANK_ACC").toString(); 
			  String  APP_FLAG            = jsonObj.get("APP_FLAG").toString();
			  String  APP_ACC             = jsonObj.get("APP_ACC").toString();
			  String  TXDATE              = jsonObj.get("TXDATE").toString();
			  String  TXTIME              = jsonObj.get("TXTIME").toString();
			  String  TX_CODE             = jsonObj.get("TX_CODE").toString();
			  String  AMT                 = jsonObj.get("AMT").toString();
			  String  CURRENCY            = jsonObj.get("CURRENCY").toString();
			  String  STATUS              = jsonObj.get("STATUS").toString();
			  String  SERIAL_NO_APP       = jsonObj.get("SERIAL_NO_APP").toString();
			  String  SEND_FLAG           = jsonObj.get("SEND_FLAG").toString();
			  String  SERIAL_NO_BANK      = jsonObj.get("SERIAL_NO_BANK").toString();
			  String  SERIAL_NO_BANK_FRONT = jsonObj.get("SERIAL_NO_BANK_FRONT").toString();
			  String  FUND_KIND           = jsonObj.get("FUND_KIND").toString();
			  String  DEPU_BANK           = jsonObj.get("DEPU_BANK").toString();
			  String  BANK_AREA           = jsonObj.get("BANK_AREA").toString();
			  String  OPER_BANK           = jsonObj.get("OPER_BANK").toString();
			  String  TRADE_DATE          = jsonObj.get("TRADE_DATE").toString();
			  String  REMARK              = jsonObj.get("REMARK").toString();
			  String  TX_CHANNEL          = jsonObj.get("TX_CHANNEL").toString();
			  String  BANK_CODE           = jsonObj.get("BANK_CODE").toString();
			  String  BANK_ACC_SECU       = jsonObj.get("BANK_ACC_SECU").toString();
			  
			  fundDetail.setSerial_no(SERIAL_NO);
			  fundDetail.setCust_no(CUST_NO);
			  fundDetail.setBank_acc(BANK_ACC);
			  fundDetail.setApp_acc(APP_ACC);
			  fundDetail.setApp_flag(APP_FLAG);
			  fundDetail.setApp_acc(APP_ACC);
			  fundDetail.setTxdate(TXDATE);
			  fundDetail.setTxtime(TXTIME);
			  fundDetail.setAmt(Double.parseDouble(AMT));
			  fundDetail.setCurrency(CURRENCY);
			  fundDetail.setStatus(STATUS);
			  fundDetail.setSerial_no_app(SERIAL_NO_APP);
			  fundDetail.setSend_flag(Byte.parseByte(SEND_FLAG));
			  fundDetail.setSerial_no_bank(SERIAL_NO_BANK);
			  fundDetail.setSerial_no_bank_front(SERIAL_NO_BANK_FRONT);
			  fundDetail.setFund_kind(Byte.parseByte(FUND_KIND));
			  fundDetail.setDepu_bank(DEPU_BANK);
			  fundDetail.setBank_area(BANK_AREA);
			  fundDetail.setOper_bank(OPER_BANK);
			  fundDetail.setTrade_date(TRADE_DATE);
			  fundDetail.setRemark(REMARK);
			  fundDetail.setTx_channel(TX_CHANNEL);
			  fundDetail.setBank_code(BANK_CODE);
			  fundDetail.setBank_acc_secu(BANK_ACC_SECU);
			  fundDetail.setTx_code(TX_CODE);
			
		} catch (Exception e) {
			logger.error("解析[FundDetail]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return fundDetail;
	}
	
	//========================> 以下逻辑没测试，不上线
	
	/*
	 * 60 个字段
	 */
	public static BankAccInterface getBankAccInterface(JSONObject jsonObj){
		
		BankAccInterface bankAccInterface = null ;
		
		try {
			bankAccInterface = new BankAccInterface();
			String  OCCUR_BRANCH  = jsonObj.get("OCCUR_BRANCH").toString();     
			String  BANK_CODE     = jsonObj.get("BANK_CODE").toString();       
			String  BANK_ACC_NO   = jsonObj.get("BANK_ACC_NO").toString();    
			String  NEW_BANK_ACC_NO  =  jsonObj.get("NEW_BANK_ACC_NO").toString();
			String  BANK_CUST_NO     =  jsonObj.get("BANK_CUST_NO").toString();
			String  CUST_NO          =  jsonObj.get("CUST_NO").toString();
			String  CUST_TYPE        =  jsonObj.get("CUST_TYPE").toString();
			String  REQUEST_TYPE     =  jsonObj.get("REQUEST_TYPE").toString();
			String  BANK_SERIAL_NO   =  jsonObj.get("BANK_SERIAL_NO").toString();
			String  SH_HOLDER_ACC_NO =  jsonObj.get("SH_HOLDER_ACC_NO").toString();
			
			String  SZ_HOLDER_ACC_NO =  jsonObj.get("SZ_HOLDER_ACC_NO").toString();
			String  NAME             =  jsonObj.get("NAME").toString();
			String  ALL_NAME         =  jsonObj.get("ALL_NAME").toString();
			String  CERT_TYPE        =  jsonObj.get("CERT_TYPE").toString();
			String  ID_NO            =  jsonObj.get("ID_NO").toString();
			String  PHONE            =  jsonObj.get("PHONE").toString();
			String  ADDR             =  jsonObj.get("ADDR").toString();
			String  POSTCODE         =  jsonObj.get("POSTCODE").toString();
			String  NEW_OPEN_FLAG    =  jsonObj.get("NEW_OPEN_FLAG").toString();
			String  RETURN_CODE      =  jsonObj.get("RETURN_CODE").toString();
			
			String  RETURN_INFO      =  jsonObj.get("RETURN_INFO").toString();
			String  DIGITAL_SIGNATURE =  jsonObj.get("DIGITAL_SIGNATURE").toString();
			String  PAGER             =  jsonObj.get("PAGER").toString();
			String  ENTRUST_METHOD    =  jsonObj.get("ENTRUST_METHOD").toString();
			String  REPAIR_FLAG       =  jsonObj.get("REPAIR_FLAG").toString(); 
			String  BRANCH_CODE       =  jsonObj.get("BRANCH_CODE").toString();
			String  EMAIL             =  jsonObj.get("EMAIL").toString();
			String  EMAIL_FLAG        =  jsonObj.get("EMAIL_FLAG").toString();
			String  MOBILE            =  jsonObj.get("MOBILE").toString();
			String  BANK_EMP_CODE     =  jsonObj.get("BANK_EMP_CODE").toString();
			
			String  BANK_QUERY_PWD    =  jsonObj.get("BANK_QUERY_PWD").toString();
			String  BANK_DRAW_PWD     =  jsonObj.get("BANK_DRAW_PWD").toString();
			String  BANK_ACC_FLAG     =  jsonObj.get("BANK_ACC_FLAG").toString();
			String  NEW_BANK_ACC_FLAG =  jsonObj.get("NEW_BANK_ACC_FLAG").toString();
			String  CURRENCY_TYPE    =  jsonObj.get("CURRENCY_TYPE").toString();
			String  SEND_FLAG        =  jsonObj.get("SEND_FLAG").toString();
			String  BRANCH_SERIAL_NO =  jsonObj.get("BRANCH_SERIAL_NO").toString();
			String  EMP_CODE         =  jsonObj.get("EMP_CODE").toString();
			String  BANK_ENTRUST     =  jsonObj.get("BANK_ENTRUST").toString();
			String  SERIAL_NO        =  jsonObj.get("SERIAL_NO").toString();
			
			String  PWD              =  jsonObj.get("PWD").toString();
			String  DEAL_FLAG        =  jsonObj.get("DEAL_FLAG").toString();
			String  REQUEST_DATE     =  jsonObj.get("REQUEST_DATE").toString();
			String  REQUEST_TIME     =  jsonObj.get("REQUEST_TIME").toString();
			String  SOURCE_TYPE      =  jsonObj.get("SOURCE_TYPE").toString();
			String  FUND_ACC_NO      =  jsonObj.get("FUND_ACC_NO").toString();
			String  BANK_JOINT       =  jsonObj.get("BANK_JOINT").toString();
			String  FUND_SERIAL_NO   =  jsonObj.get("FUND_SERIAL_NO").toString();
			String  RETURN_DATE      =  jsonObj.get("RETURN_DATE").toString();
			String  RETURN_TIME      =  jsonObj.get("RETURN_TIME").toString();
			
			String  SPARE1           =  jsonObj.get("SPARE1").toString();
			String  SPARE2           =  jsonObj.get("SPARE2").toString();
			String  SPARE3           =  jsonObj.get("SPARE3").toString();
			String  SPARE4           =  jsonObj.get("SPARE4").toString();
			String  COM_HANDLE       =  jsonObj.get("COM_HANDLE").toString();
			String  CHECK_EMP        =  jsonObj.get("CHECK_EMP").toString();
			String  SOURCES          =  jsonObj.get("SOURCES").toString();
			
			bankAccInterface.setName(NAME);
			bankAccInterface.setOccur_branch(OCCUR_BRANCH);
			bankAccInterface.setBank_code(BANK_CODE);
			bankAccInterface.setBank_acc_no(BANK_ACC_NO);
			bankAccInterface.setNew_bank_acc_no(NEW_BANK_ACC_NO);
			bankAccInterface.setBank_cust_no(BANK_CUST_NO);
			bankAccInterface.setCust_no(CUST_NO);
			bankAccInterface.setCust_type(CUST_TYPE);
			bankAccInterface.setRequest_type(REQUEST_TYPE);
			bankAccInterface.setBank_serial_no(BANK_SERIAL_NO);
			bankAccInterface.setSh_holder_acc_no(SH_HOLDER_ACC_NO);
			
			bankAccInterface.setSz_holder_acc_no(SZ_HOLDER_ACC_NO);
			bankAccInterface.setAll_name(ALL_NAME);
			bankAccInterface.setCert_type(Integer.parseInt(CERT_TYPE));
			bankAccInterface.setId_no(ID_NO);
			bankAccInterface.setPhone(PHONE);
			bankAccInterface.setAddr(ADDR);
			bankAccInterface.setPostcode(POSTCODE);
			bankAccInterface.setNew_open_flag(NEW_OPEN_FLAG);
			bankAccInterface.setReturn_code(RETURN_CODE);
			
			bankAccInterface.setReturn_info(RETURN_INFO);
			bankAccInterface.setDigital_signature(DIGITAL_SIGNATURE);
			bankAccInterface.setPager(PAGER);
			bankAccInterface.setEntrust_method(ENTRUST_METHOD);
			bankAccInterface.setRepair_flag(REPAIR_FLAG);
			bankAccInterface.setBranch_code(BRANCH_CODE);
			bankAccInterface.setEmail(EMAIL);
			bankAccInterface.setEmail_flag(EMAIL_FLAG);
			bankAccInterface.setMobile(MOBILE);
			bankAccInterface.setBank_emp_code(BANK_EMP_CODE);
			
			bankAccInterface.setBank_query_pwd(BANK_QUERY_PWD);
			bankAccInterface.setBank_draw_pwd(BANK_DRAW_PWD);
			bankAccInterface.setBank_acc_flag(BANK_ACC_FLAG);
			bankAccInterface.setNew_bank_acc_flag(NEW_BANK_ACC_FLAG);
			bankAccInterface.setCurrency_type(CURRENCY_TYPE);
			bankAccInterface.setSend_flag(SEND_FLAG);
			bankAccInterface.setBranch_serial_no(BRANCH_SERIAL_NO);
			bankAccInterface.setEmp_code(EMP_CODE);
			bankAccInterface.setBank_entrust(BANK_ENTRUST);
			bankAccInterface.setSerial_no(SERIAL_NO);
			
			bankAccInterface.setPwd(PWD);
			bankAccInterface.setDeal_flag(DEAL_FLAG);
			bankAccInterface.setRequest_date(REQUEST_DATE);
			bankAccInterface.setRequest_time(REQUEST_TIME);
			bankAccInterface.setSource_type(SOURCE_TYPE);
			bankAccInterface.setFund_acc_no(FUND_ACC_NO);
			bankAccInterface.setBank_joint(BANK_JOINT);
			bankAccInterface.setFund_serial_no(FUND_SERIAL_NO);
			bankAccInterface.setReturn_date(RETURN_DATE);
			bankAccInterface.setReturn_time(RETURN_TIME);
			
			bankAccInterface.setSpare1(SPARE1);
			bankAccInterface.setSpare2(SPARE2);
			bankAccInterface.setSpare3(SPARE3);
			bankAccInterface.setSpare4(SPARE4);
			bankAccInterface.setCom_handle(COM_HANDLE);
			bankAccInterface.setCheck_emp(CHECK_EMP);
			bankAccInterface.setSources(SOURCES);

		} catch (Exception e) {
			logger.error("解析[BankAccInterface]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		
		return bankAccInterface;
	}
	
	
	public static BankTrfInterface getBankTrfInterface(JSONObject jsonObj){
		
		BankTrfInterface bankTrfInterface = null;
		
		try {
			bankTrfInterface = new BankTrfInterface();
			String  SOURCE_TYPE        =  jsonObj.get("SOURCE_TYPE").toString();        
			String  REQUEST_TYPE       =  jsonObj.get("REQUEST_TYPE").toString();
			String  BANK_CODE          =  jsonObj.get("BANK_CODE").toString();
			String  BANK_ACC_NO        =  jsonObj.get("BANK_ACC_NO").toString();
			String  CUST_NO            =  jsonObj.get("CUST_NO").toString();
			String  CURRENCY_TYPE      =  jsonObj.get("CURRENCY_TYPE").toString();
			String  FUND_ACC_NO        =  jsonObj.get("FUND_ACC_NO").toString();
			String  CUST_TYPE          =  jsonObj.get("CUST_TYPE").toString();
			String  BRANCH_CODE        =  jsonObj.get("BRANCH_CODE").toString();
			String  ENTRUST_METHOD     =  jsonObj.get("ENTRUST_METHOD").toString();
			String  EMP_CODE           =  jsonObj.get("EMP_CODE").toString();
			
			String  BANK_ENTRST_METHOD =  jsonObj.get("BANK_ENTRST_METHOD").toString();
			String  BANK_EMP_CODE      =  jsonObj.get("BANK_EMP_CODE").toString();
			String  BANK_JOINT         =  jsonObj.get("BANK_JOINT").toString();
			String  PWD                =  jsonObj.get("PWD").toString();
			String  REQUEST_DATE       =  jsonObj.get("REQUEST_DATE").toString();
			String  REQUEST_TIME       =  jsonObj.get("REQUEST_TIME").toString();
			String  OCCUR_BAL          =  jsonObj.get("OCCUR_BAL").toString();
			String  SERIAL_NO          =  jsonObj.get("SERIAL_NO").toString();
			String  SH_HOLDER_ACC_NO   =  jsonObj.get("SH_HOLDER_ACC_NO").toString();
			String  SZ_HOLDER_ACC_NO   =  jsonObj.get("SZ_HOLDER_ACC_NO").toString();
			
			String  BANK_SERIAL_NO     =  jsonObj.get("BANK_SERIAL_NO").toString();
			String  DEAL_FLAG          =  jsonObj.get("DEAL_FLAG").toString();
			String  BRANCH_SERIAL_NO   =  jsonObj.get("BRANCH_SERIAL_NO").toString();
			String  OCCUR_BRANCH       =  jsonObj.get("OCCUR_BRANCH").toString();
			String  NAME               =  jsonObj.get("NAME").toString();
			String  DIGITAL_SIGNATURE  =  jsonObj.get("DIGITAL_SIGNATURE").toString();
			String  BANK_QUERY_PWD     =  jsonObj.get("BANK_QUERY_PWD").toString();
			String  BANK_DRAW_PWD      =  jsonObj.get("BANK_DRAW_PWD").toString();
			String  BANK_ACC_FLAG      =  jsonObj.get("BANK_ACC_FLAG").toString();
			String  REPARE_FLAG        =  jsonObj.get("REPARE_FLAG").toString();
			
			String  SEND_FLAG          =  jsonObj.get("SEND_FLAG").toString();
			String  RETURN_INFO        =  jsonObj.get("RETURN_INFO").toString();
			String  RETURN_CODE        =  jsonObj.get("RETURN_CODE").toString();
			String  FUND_SERIAL_NO     =  jsonObj.get("FUND_SERIAL_NO").toString();
			String  RETURN_DATE        =  jsonObj.get("RETURN_DATE").toString();
			String  RETURN_TIME        =  jsonObj.get("RETURN_TIME").toString();
			String  SPARE1             =  jsonObj.get("SPARE1").toString();
			String  SPARE2             =  jsonObj.get("SPARE2").toString();
			String  SPARE3             =  jsonObj.get("SPARE3").toString();
			String  SPARE4             =  jsonObj.get("SPARE4").toString();
			
			String  CERT_TYPE          =  jsonObj.get("CERT_TYPE").toString();
			String  ID_NO              =  jsonObj.get("ID_NO").toString();
			String  COM_HANDLE         =  jsonObj.get("COM_HANDLE").toString();
			String  R_DATE             =  jsonObj.get("R_DATE").toString();
			String  TRF_SOURCE         =  jsonObj.get("TRF_SOURCE").toString();

			bankTrfInterface.setSource_type(SOURCE_TYPE);
			bankTrfInterface.setRequest_type(REQUEST_TYPE);
			bankTrfInterface.setBank_code(BANK_CODE);
			bankTrfInterface.setBank_acc_no(BANK_ACC_NO);
			bankTrfInterface.setCust_no(CUST_NO);
			bankTrfInterface.setCurrency_type(CURRENCY_TYPE);
			bankTrfInterface.setFund_acc_no(FUND_ACC_NO);
			bankTrfInterface.setCust_type(CUST_TYPE);
			bankTrfInterface.setBranch_code(BRANCH_CODE);
			bankTrfInterface.setEntrust_method(ENTRUST_METHOD);
			bankTrfInterface.setEmp_code(EMP_CODE);
			
			bankTrfInterface.setBank_entrst_method(BANK_ENTRST_METHOD);
			bankTrfInterface.setBank_emp_code(BANK_EMP_CODE);
			bankTrfInterface.setBank_joint(BANK_JOINT);
			bankTrfInterface.setPwd(PWD);
			bankTrfInterface.setRequest_date(REQUEST_DATE);
			bankTrfInterface.setRequest_time(REQUEST_TIME);
			bankTrfInterface.setOccur_bal(Double.parseDouble(OCCUR_BAL));
			bankTrfInterface.setSerial_no(SERIAL_NO);
			bankTrfInterface.setSh_holder_acc_no(SH_HOLDER_ACC_NO);
			bankTrfInterface.setSz_holder_acc_no(SZ_HOLDER_ACC_NO);
			
			bankTrfInterface.setBank_serial_no(BANK_SERIAL_NO);
			bankTrfInterface.setOccur_branch(OCCUR_BRANCH);
			bankTrfInterface.setName(NAME);
			bankTrfInterface.setDigital_signature(DIGITAL_SIGNATURE);
			bankTrfInterface.setBank_query_pwd(BANK_QUERY_PWD);
			bankTrfInterface.setBank_draw_pwd(BANK_DRAW_PWD);
			bankTrfInterface.setBank_acc_flag(BANK_ACC_FLAG);
			bankTrfInterface.setRepare_flag(REPARE_FLAG);
			bankTrfInterface.setSend_flag(SEND_FLAG);
			bankTrfInterface.setReturn_info(RETURN_INFO);
			
			bankTrfInterface.setReturn_code(RETURN_CODE);
			bankTrfInterface.setFund_serial_no(FUND_SERIAL_NO);
			bankTrfInterface.setReturn_date(RETURN_DATE);
			bankTrfInterface.setReturn_time(RETURN_TIME);
			bankTrfInterface.setSpare1(SPARE1);
			bankTrfInterface.setSpare2(SPARE2);
			bankTrfInterface.setSpare3(SPARE3);
			bankTrfInterface.setSpare4(SPARE4);
			bankTrfInterface.setCert_type(Integer.parseInt(CERT_TYPE));
			
			bankTrfInterface.setDeal_flag(DEAL_FLAG);
			bankTrfInterface.setBranch_serial_no(BRANCH_SERIAL_NO);
			
			bankTrfInterface.setId_no(ID_NO);
			bankTrfInterface.setCom_handle(COM_HANDLE);
			bankTrfInterface.setR_date(R_DATE);
			bankTrfInterface.setTrf_source(TRF_SOURCE);

		} catch (Exception e) {
			logger.error("解析[BankTrfInterface]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return bankTrfInterface;
	}
	
	
	public static CheckSummary getCheckSummary(JSONObject jsonObj){
		
		CheckSummary checkSummary = null;
		
		try {
			checkSummary = new CheckSummary();
			String  BRANCH_CODE    =  jsonObj.get("BRANCH_CODE").toString();   
			String  BUSINESS_DATE  =  jsonObj.get("BUSINESS_DATE").toString();
			String  SERIAL_NO      =  jsonObj.get("SERIAL_NO").toString();
			String  CUST_NO        =  jsonObj.get("CUST_NO").toString();
			String  NAME           =  jsonObj.get("NAME").toString();
			String  MARKET_CODE    =  jsonObj.get("MARKET_CODE").toString();
			String  HOLDER_ACC_NO  =  jsonObj.get("HOLDER_ACC_NO").toString();
			String  SEC_CODE       =  jsonObj.get("SEC_CODE").toString();
			String  SEC_SHORT_NAME =  jsonObj.get("SEC_SHORT_NAME").toString();
			String  BUSINESS_CODE  =  jsonObj.get("BUSINESS_CODE").toString();
			String  CURRENCY_TYPE  =  jsonObj.get("CURRENCY_TYPE").toString();
			String  OCCUR_BAL      =  jsonObj.get("OCCUR_BAL").toString();
			String  TOTAL_OUT_BAL  =  jsonObj.get("TOTAL_OUT_BAL").toString();
			String  OCCUR_VOL      =  jsonObj.get("OCCUR_VOL").toString();
			String  TOTAL_OUT_VOL  =  jsonObj.get("TOTAL_OUT_VOL").toString();
			String  APPLY_BRANCH   =  jsonObj.get("APPLY_BRANCH").toString();
			String  APPLY_EMP      =  jsonObj.get("APPLY_EMP").toString();
			String  APPLY_DATE     =  jsonObj.get("APPLY_DATE").toString();
			String  APPLY_TIME     =  jsonObj.get("APPLY_TIME").toString();
			String  APPLY_NOTE     =  jsonObj.get("APPLY_NOTE").toString();
			String  FIRST_BRANCH   =  jsonObj.get("FIRST_BRANCH").toString();
			String  FIRST_EMP      =  jsonObj.get("FIRST_EMP").toString();
			String  FIRST_DATE     =  jsonObj.get("FIRST_DATE").toString();
			String  FIRST_TIME     =  jsonObj.get("FIRST_TIME").toString();
			String  FIRST_RESULT   =  jsonObj.get("FIRST_RESULT").toString();
			String  FIRST_NOTE     =  jsonObj.get("FIRST_NOTE").toString();
			String  SECOND_BRANCH  =  jsonObj.get("SECOND_BRANCH").toString();
			String  SECOND_EMP     =  jsonObj.get("SECOND_EMP").toString();
			String  SECOND_DATE    =  jsonObj.get("SECOND_DATE").toString();
			String  SECOND_TIME    =  jsonObj.get("SECOND_TIME").toString();
			String  SECOND_RESULT  =  jsonObj.get("SECOND_RESULT").toString();
			String  SECOND_NOTE    =  jsonObj.get("SECOND_NOTE").toString();
			String  EXPIRE_DATE    =  jsonObj.get("EXPIRE_DATE").toString();
			String  DEAL_METHOD    =  jsonObj.get("DEAL_METHOD").toString();
			String  JOIN_DATE      =  jsonObj.get("JOIN_DATE").toString();
			String  JOIN_CUST_NO   =  jsonObj.get("JOIN_CUST_NO").toString();
			String  JOIN_SERIAL_NO =  jsonObj.get("JOIN_SERIAL_NO").toString();
			String  REALIZE_FLAG   =  jsonObj.get("REALIZE_FLAG").toString();
			String  FLOW_NO        =  jsonObj.get("FLOW_NO").toString();
			String  STEP_NO        =  jsonObj.get("STEP_NO").toString();
			String  REST_STEP_NUM  =  jsonObj.get("REST_STEP_NUM").toString();
			String  DETAIL_NUM     =  jsonObj.get("DETAIL_NUM").toString();
			String  EXEC_EMP       =  jsonObj.get("EXEC_EMP").toString();
			String  EXEC_DATE      =  jsonObj.get("EXEC_DATE").toString();
			String  EXEC_TIME      =  jsonObj.get("EXEC_TIME").toString();
			String  SYSTEM_NO      =  jsonObj.get("SYSTEM_NO").toString();
			String  THIRD_BRANCH   =  jsonObj.get("THIRD_BRANCH").toString();
			String  THIRD_EMP      =  jsonObj.get("THIRD_EMP").toString();
			String  THIRD_DATE     =  jsonObj.get("THIRD_DATE").toString();
			String  THIRD_TIME     =  jsonObj.get("THIRD_TIME").toString();
			String  THIRD_RESULT   =  jsonObj.get("THIRD_RESULT").toString();
			String  THIRD_NOTE     =  jsonObj.get("THIRD_NOTE").toString();
			String  FOURTH_BRANCH  =  jsonObj.get("FOURTH_BRANCH").toString();
			String  FOURTH_EMP     =  jsonObj.get("FOURTH_EMP").toString();
			String  FOURTH_DATE    =  jsonObj.get("FOURTH_DATE").toString();
			String  FOURTH_TIME    =  jsonObj.get("FOURTH_TIME").toString();
			String  FOURTH_RESULT  =  jsonObj.get("FOURTH_RESULT").toString();
			String  FOURTH_NOTE    =  jsonObj.get("FOURTH_NOTE").toString();
			String  FIFTH_BRANCH   =  jsonObj.get("FIFTH_BRANCH").toString();
			String  FIFTH_EMP      =  jsonObj.get("FIFTH_EMP").toString();
			String  FIFTH_DATE     =  jsonObj.get("FIFTH_DATE").toString();
			String  FIFTH_TIME     =  jsonObj.get("FIFTH_TIME").toString();
			String  FIFTH_RESULT   =  jsonObj.get("FIFTH_RESULT").toString();
			String  FIFTH_NOTE     =  jsonObj.get("FIFTH_NOTE").toString();
			
			checkSummary.setBranch_code(BRANCH_CODE);
			checkSummary.setBusiness_date(BUSINESS_DATE);
			checkSummary.setSerial_no(SERIAL_NO);
			checkSummary.setCust_no(CUST_NO);
			checkSummary.setName(NAME);
			checkSummary.setMarket_code(MARKET_CODE);
			checkSummary.setHolder_acc_no(HOLDER_ACC_NO);
			checkSummary.setSec_code(SEC_CODE);
			checkSummary.setSec_short_name(SEC_SHORT_NAME);
			checkSummary.setBusiness_code(BUSINESS_CODE);
			checkSummary.setCurrency_type(CURRENCY_TYPE);
			checkSummary.setOccur_bal(Double.parseDouble(OCCUR_BAL));
			checkSummary.setTotal_out_bal(Double.parseDouble(TOTAL_OUT_BAL));
			checkSummary.setApply_branch(APPLY_BRANCH);
			checkSummary.setApply_emp(APPLY_EMP);
			checkSummary.setApply_date(APPLY_DATE);
			checkSummary.setApply_time(APPLY_TIME);
			checkSummary.setApply_note(APPLY_NOTE);
			checkSummary.setFirst_branch(FIRST_BRANCH);
			checkSummary.setFirst_emp(FIRST_EMP);
			checkSummary.setFirst_date(FIRST_DATE);
			checkSummary.setFirst_time(FIRST_TIME);
			checkSummary.setFirst_result(FIRST_RESULT);
			checkSummary.setFirst_note(FIRST_NOTE);
			checkSummary.setSecond_branch(SECOND_BRANCH);
			checkSummary.setSecond_emp(SECOND_EMP);
			checkSummary.setSecond_date(SECOND_DATE);
			checkSummary.setSecond_time(SECOND_TIME);
			checkSummary.setSecond_result(SECOND_RESULT);
			checkSummary.setSecond_note(SECOND_NOTE);
			checkSummary.setExpire_date(EXPIRE_DATE);
			checkSummary.setDeal_method(DEAL_METHOD);
			checkSummary.setJoin_date(JOIN_DATE);
			checkSummary.setJoin_cust_no(JOIN_CUST_NO);
			checkSummary.setJoin_serial_no(JOIN_SERIAL_NO);
			checkSummary.setRealize_flag(REALIZE_FLAG);
			checkSummary.setFlow_no(FLOW_NO);
			checkSummary.setStep_no(Integer.parseInt(STEP_NO));
			checkSummary.setRest_step_num(Integer.parseInt(REST_STEP_NUM));
			checkSummary.setDetail_num(Integer.parseInt(DETAIL_NUM));
			checkSummary.setExec_emp(EXEC_EMP);
			checkSummary.setExec_date(EXEC_DATE);
			checkSummary.setExec_time(EXEC_TIME);
			checkSummary.setSystem_no(SYSTEM_NO);
			checkSummary.setThird_branch(THIRD_BRANCH);
			checkSummary.setThird_emp(THIRD_EMP);
			checkSummary.setThird_date(THIRD_DATE);
			checkSummary.setThird_time(THIRD_TIME);
			checkSummary.setThird_result(THIRD_RESULT);
			checkSummary.setThird_note(THIRD_NOTE);
			checkSummary.setFourth_branch(FOURTH_BRANCH);
			checkSummary.setFourth_emp(FOURTH_EMP);
			checkSummary.setFourth_date(FOURTH_DATE);
			checkSummary.setFourth_time(FOURTH_TIME);
			checkSummary.setFourth_result(FOURTH_RESULT);
			checkSummary.setFourth_note(FOURTH_NOTE);	
			
			checkSummary.setFifth_branch(FIFTH_BRANCH);
			checkSummary.setFifth_emp(FIFTH_EMP);
			checkSummary.setFifth_date(FIFTH_DATE);
			checkSummary.setFifth_time(FIFTH_TIME);
			checkSummary.setFifth_result(FIFTH_RESULT);
			checkSummary.setFifth_note(FIFTH_NOTE);	
			
			checkSummary.setOccur_vol(Double.parseDouble(OCCUR_VOL));
			checkSummary.setTotal_out_vol(Double.parseDouble(TOTAL_OUT_VOL));
			
		} catch (Exception e) {
			logger.error("解析[CheckSummary]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return checkSummary;
	}
	
	
	public static FundStockChange getFundStockChange(JSONObject jsonObj){
		
		FundStockChange fundStockChange = null;
		
		try {
			
			fundStockChange = new FundStockChange();
			String  OCCUR_DATE        = jsonObj.get("OCCUR_DATE").toString();    
			String  CLR_CTRL          = jsonObj.get("CLR_CTRL").toString();
			String  SERIAL_NO         = jsonObj.get("SERIAL_NO").toString();
			String  OCCUR_TIME        = jsonObj.get("OCCUR_TIME").toString();
			String  OCCUR_BRANCH      = jsonObj.get("OCCUR_BRANCH").toString();
			String  BRANCH_CODE       = jsonObj.get("BRANCH_CODE").toString();
			String  CUST_NO           = jsonObj.get("CUST_NO").toString();
			String  CURRENCY_TYPE     = jsonObj.get("CURRENCY_TYPE").toString();
			String  FUND_ACC_NO       = jsonObj.get("FUND_ACC_NO").toString();
			String  CUST_NAME         = jsonObj.get("CUST_NAME").toString();
			String  MARKET_CODE       = jsonObj.get("MARKET_CODE").toString();
			String  HOLDER_ACC_NO     = jsonObj.get("HOLDER_ACC_NO").toString();
			String  SEC_CODE          = jsonObj.get("SEC_CODE").toString();
			String  SEC_CHG           = jsonObj.get("SEC_CHG").toString();
			String  SEC_NET_CHG       = jsonObj.get("SEC_NET_CHG").toString();
			String  SEC_BAL           = jsonObj.get("SEC_BAL").toString();
			String  FUND_CHG          = jsonObj.get("FUND_CHG").toString();
			String  FUND_BAL          = jsonObj.get("FUND_BAL").toString();
			String  BUSINESS_CODE     = jsonObj.get("BUSINESS_CODE").toString();
			String  BANK_CODE         = jsonObj.get("BANK_CODE").toString();
			String  BANK_ACC_NO       = jsonObj.get("BANK_ACC_NO").toString();
			String  BANK_ACC_NAME     = jsonObj.get("BANK_ACC_NAME").toString();
			String  OP_EMP            = jsonObj.get("OP_EMP").toString();
			String  DOUBLE_CHECK_EMP  = jsonObj.get("DOUBLE_CHECK_EMP").toString();
			String  SEC_SHORT_NAME    = jsonObj.get("SEC_SHORT_NAME").toString();
			String  DONE_AMT          = jsonObj.get("DONE_AMT").toString();
			String  JOIN_SERIAL_NO    = jsonObj.get("JOIN_SERIAL_NO").toString();
			String  ENTRUST_METHOD    = jsonObj.get("ENTRUST_METHOD").toString();
			String  ROOM_NO           = jsonObj.get("ROOM_NO").toString();
			String  CUST_TYPE          = jsonObj.get("CUST_TYPE").toString();
			String  STAT_TYPE          = jsonObj.get("STAT_TYPE").toString();
			String  CHANGE_TYPE        = jsonObj.get("CHANGE_TYPE").toString();
			String  JOIN_DATE          = jsonObj.get("JOIN_DATE").toString();
			String  JOIN_CUST_NO       = jsonObj.get("JOIN_CUST_NO").toString();
			String  BILL_NO            = jsonObj.get("BILL_NO").toString();
			String  NOTE               = jsonObj.get("NOTE").toString();
			String  INTEREST_DATE      = jsonObj.get("INTEREST_DATE").toString();
			String  INTEND_IN_ACC_DATE = jsonObj.get("INTEND_IN_ACC_DATE").toString();
			String  IN_ACC_DATE        = jsonObj.get("IN_ACC_DATE").toString();
			String  IN_ACC_FLAG        = jsonObj.get("IN_ACC_FLAG").toString();
			String  RELATIVE_DATE      = jsonObj.get("RELATIVE_DATE").toString();
			String  CANCEL_FLAG        = jsonObj.get("CANCEL_FLAG").toString();
			String  DOUBLE_CHECK_FLAG  = jsonObj.get("DOUBLE_CHECK_FLAG").toString();
			String  CHECK_DATE         = jsonObj.get("CHECK_DATE").toString();
			String  IN_OUT             = jsonObj.get("IN_OUT").toString();
			String  DELIVER_EMP        = jsonObj.get("DELIVER_EMP").toString();
			String  DELIVER_DATE       = jsonObj.get("DELIVER_DATE").toString();
			String  DELIVER_FLAG       = jsonObj.get("DELIVER_FLAG").toString();
			String  INTEREST_ACCU      = jsonObj.get("INTEREST_ACCU").toString();
			String  FINE_ACCU          = jsonObj.get("FINE_ACCU").toString();
			String  SEC_IN_OUT         = jsonObj.get("SEC_IN_OUT").toString();
			String  SEAT_NO            = jsonObj.get("SEAT_NO").toString();
			String  SEC_TYPE           = jsonObj.get("SEC_TYPE").toString();
			String  EXTERNAL_NO        = jsonObj.get("EXTERNAL_NO").toString();
			String  R_DATE             = jsonObj.get("R_DATE").toString();
			String  DELIVER_METHOD     = jsonObj.get("DELIVER_METHOD").toString();
			
			fundStockChange.setOccur_date(OCCUR_DATE);
			fundStockChange.setClr_ctrl(Integer.parseInt(CLR_CTRL));
			fundStockChange.setSerial_no(SERIAL_NO);
			fundStockChange.setOccur_time(OCCUR_TIME);
			fundStockChange.setOccur_branch(OCCUR_BRANCH);
			fundStockChange.setBranch_code(BRANCH_CODE);
			fundStockChange.setCust_no(CUST_NO);
			fundStockChange.setCurrency_type(CURRENCY_TYPE);
			fundStockChange.setFund_acc_no(FUND_ACC_NO);
			fundStockChange.setCust_name(CUST_NAME);
			fundStockChange.setMarket_code(MARKET_CODE);
			fundStockChange.setHolder_acc_no(HOLDER_ACC_NO);
			fundStockChange.setSec_chg(Double.parseDouble(SEC_CHG));
			fundStockChange.setFund_bal(Double.parseDouble(FUND_BAL));
			fundStockChange.setBusiness_code(BUSINESS_CODE);
			fundStockChange.setBank_code(BANK_CODE);
			fundStockChange.setBank_acc_no(BANK_ACC_NO);
			fundStockChange.setBank_acc_name(BANK_ACC_NAME);
			fundStockChange.setOp_emp(OP_EMP);
			fundStockChange.setDouble_check_emp(DOUBLE_CHECK_EMP);
			fundStockChange.setSec_short_name(SEC_SHORT_NAME);
			fundStockChange.setDone_amt(Double.parseDouble(DONE_AMT));
			fundStockChange.setJoin_serial_no(JOIN_SERIAL_NO);
			fundStockChange.setEntrust_method(ENTRUST_METHOD);
			fundStockChange.setRoom_no(ROOM_NO);
			fundStockChange.setCust_type(CUST_TYPE);
			fundStockChange.setStat_type(STAT_TYPE);
			fundStockChange.setChange_type(CHANGE_TYPE);
			fundStockChange.setJoin_date(JOIN_DATE);
			fundStockChange.setJoin_cust_no(JOIN_CUST_NO);
			fundStockChange.setBill_no(BILL_NO);
			fundStockChange.setNote(NOTE);
			fundStockChange.setInterest_date(INTEREST_DATE);
			fundStockChange.setIntend_in_acc_date(INTEND_IN_ACC_DATE);
			fundStockChange.setIn_acc_date(IN_ACC_DATE);
			fundStockChange.setIn_acc_flag(IN_ACC_FLAG);
			fundStockChange.setRelative_date(RELATIVE_DATE);
			fundStockChange.setCancel_flag(CANCEL_FLAG);
			fundStockChange.setCheck_date(CHECK_DATE);
			fundStockChange.setIn_out(IN_OUT);
			fundStockChange.setDeliver_emp(DELIVER_EMP);
			fundStockChange.setDeliver_date(DELIVER_DATE);
			fundStockChange.setDeliver_flag(DELIVER_FLAG);
			fundStockChange.setInterest_accu(Double.parseDouble(INTEREST_ACCU));
			fundStockChange.setFine_accu(Double.parseDouble(FINE_ACCU));
			fundStockChange.setSec_in_out(SEC_IN_OUT);
			fundStockChange.setSeat_no(SEAT_NO);
			fundStockChange.setSec_type(SEC_TYPE);
			fundStockChange.setExternal_no(EXTERNAL_NO);
			fundStockChange.setR_date(R_DATE);
			fundStockChange.setDeliver_method(DELIVER_METHOD);
			fundStockChange.setDouble_check_flag(DOUBLE_CHECK_FLAG);
			
			fundStockChange.setSec_code(SEC_CODE);
			fundStockChange.setSec_net_chg(Double.parseDouble(SEC_NET_CHG));
			fundStockChange.setSec_bal(Double.parseDouble(SEC_BAL));
			fundStockChange.setFund_chg(Double.parseDouble(FUND_CHG));
			
		} catch (Exception e) {
			logger.error("解析[FundStockChange]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return fundStockChange;
	}
	
	
	public static OtherChange getOtherChange(JSONObject jsonObj){
		
		OtherChange otherChange = null;
		
		try {
			
			otherChange = new OtherChange();
			String  BRANCH_CODE      = jsonObj.get("BRANCH_CODE").toString();    
			String  OCCUR_DATE       = jsonObj.get("OCCUR_DATE").toString();
			String  SERIAL_NO        = jsonObj.get("SERIAL_NO").toString();
			String  KSORDER          = jsonObj.get("KSORDER").toString();
			String  OCCUR_TIME       = jsonObj.get("OCCUR_TIME").toString();
			String  EMP_CODE         = jsonObj.get("EMP_CODE").toString();
			String  DOUBLE_CHECK_EMP = jsonObj.get("DOUBLE_CHECK_EMP").toString();
			String  CUST_NO          = jsonObj.get("CUST_NO").toString();
			String  BUSINESS_CODE    = jsonObj.get("BUSINESS_CODE").toString();
			String  CHANGE_TYPE      = jsonObj.get("CHANGE_TYPE").toString();
			String  LAST_VALUE       = jsonObj.get("LAST_VALUE").toString();
			String  THIS_VALUE       = jsonObj.get("THIS_VALUE").toString();
			String  OP_OBJECT        = jsonObj.get("OP_OBJECT").toString();
			String  TYPE             = jsonObj.get("TYPE").toString();
			String  CHECK_DATE       = jsonObj.get("CHECK_DATE").toString();
			String  R_DATE           = jsonObj.get("R_DATE").toString();
			String  NOTE             = jsonObj.get("NOTE").toString();
			String  OCCUR_BRANCH     = jsonObj.get("OCCUR_BRANCH").toString();
			String  OP_SOURCE        = jsonObj.get("OP_SOURCE").toString();

			otherChange.setBranch_code(BRANCH_CODE);
			otherChange.setOccur_date(OCCUR_DATE);
			otherChange.setSerial_no(SERIAL_NO);
			otherChange.setKsorder(Integer.parseInt(KSORDER));
			otherChange.setOccur_time(OCCUR_TIME);
			otherChange.setEmp_code(EMP_CODE);
			otherChange.setDouble_check_emp(DOUBLE_CHECK_EMP);
			otherChange.setCust_no(CUST_NO);
			otherChange.setBusiness_code(BUSINESS_CODE);
			otherChange.setChange_type(CHANGE_TYPE);
			otherChange.setLast_value(LAST_VALUE);
			otherChange.setThis_value(THIS_VALUE);
			otherChange.setOp_object(OP_OBJECT);
			otherChange.setType(TYPE);
			otherChange.setCheck_date(CHECK_DATE);
			otherChange.setR_date(R_DATE);
			otherChange.setNote(NOTE);
			otherChange.setOccur_branch(OCCUR_BRANCH);
			otherChange.setOp_source(OP_SOURCE);
			   
		} catch (Exception e) {
			logger.error("解析[OtherChange]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return otherChange;
	}

	/*
       2019/04/12
       新增账户相关八张表
      */
	public static ScosAuditTask getScosAuditTask(JSONObject jsonObj){

		ScosAuditTask scosAuditTask = null;

		try {

			scosAuditTask = new ScosAuditTask();
			String  id  = jsonObj.get("ID").toString();
			String  change_date  = jsonObj.get("CHANGE_DATE").toString();
			String  change_emp  = jsonObj.get("CHANGE_EMP").toString();
			String  create_date  = jsonObj.get("CREATE_DATE").toString();
			String  create_emp  = jsonObj.get("CREATE_EMP").toString();
			String  enable_flag  = jsonObj.get("ENABLE_FLAG").toString();
			String  accept_serial_no  = jsonObj.get("ACCEPT_SERIAL_NO").toString();
			String  atomic_no  = jsonObj.get("ATOMIC_NO").toString();
			String  match_atomic_no  = jsonObj.get("MATCH_ATOMIC_NO").toString();
			String  audit_status  = jsonObj.get("AUDIT_STATUS").toString();
			String  cert_no  = jsonObj.get("CERT_NO").toString();
			String  cert_type  = jsonObj.get("CERT_TYPE").toString();
			String  curr_flow_node  = jsonObj.get("CURR_FLOW_NODE").toString();
			String  cust_no  = jsonObj.get("CUST_NO").toString();
			String  cust_type  = jsonObj.get("CUST_TYPE").toString();
			String  lock_emp  = jsonObj.get("LOCK_EMP").toString();
			String  lock_flag  = jsonObj.get("LOCK_FLAG").toString();
			String  name  = jsonObj.get("NAME").toString();
			String  next_flow_emp  = jsonObj.get("NEXT_FLOW_EMP").toString();
			String  next_flow_mode  = jsonObj.get("NEXT_FLOW_MODE").toString();
			String  next_flow_node  = jsonObj.get("NEXT_FLOW_NODE").toString();
			String  next_flow_post  = jsonObj.get("NEXT_FLOW_POST").toString();
			String  type_scope  = jsonObj.get("TYPE_SCOPE").toString();
			String  business_schedule_id  = jsonObj.get("BUSINESS_SCHEDULE_ID").toString();
			String  process_audit_detail_id  = jsonObj.get("PROCESS_AUDIT_DETAIL_ID").toString();
			String  process_audit_id  = jsonObj.get("PROCESS_AUDIT_ID").toString();
			String  audit_type  = jsonObj.get("AUDIT_TYPE").toString();
			String  ser_no  = jsonObj.get("SER_NO").toString();

			scosAuditTask.setId(id);
			scosAuditTask.setChange_date(change_date);
			scosAuditTask.setChange_emp(change_emp);
			scosAuditTask.setCreate_date(create_date);
			scosAuditTask.setCreate_emp(create_emp);
			scosAuditTask.setEnable_flag(enable_flag);
			scosAuditTask.setAccept_serial_no(accept_serial_no);
			scosAuditTask.setAtomic_no(atomic_no);
			scosAuditTask.setMatch_atomic_no(match_atomic_no);
			scosAuditTask.setAudit_status(audit_status);
			scosAuditTask.setCert_no(cert_no);
			scosAuditTask.setCert_type(cert_type);
			scosAuditTask.setCurr_flow_node(curr_flow_node);
			scosAuditTask.setCust_no(cust_no);
			scosAuditTask.setCust_type(cust_type);
			scosAuditTask.setLock_emp(lock_emp);
			scosAuditTask.setLock_flag(lock_flag);
			scosAuditTask.setName(name);
			scosAuditTask.setNext_flow_emp(next_flow_emp);
			scosAuditTask.setNext_flow_mode(next_flow_mode);
			scosAuditTask.setNext_flow_node(next_flow_node);
			scosAuditTask.setNext_flow_post(next_flow_post);
			scosAuditTask.setType_scope(type_scope);
			scosAuditTask.setBusiness_schedule_id(business_schedule_id);
			scosAuditTask.setProcess_audit_detail_id(process_audit_detail_id);
			scosAuditTask.setProcess_audit_id(process_audit_id);
			scosAuditTask.setAudit_type(audit_type);
			scosAuditTask.setSer_no(ser_no);

		} catch (Exception e) {
			logger.error("解析[ScosAuditTask]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return scosAuditTask;
	}


	public static ScosBusinessAccept getScosBusinessAccept(JSONObject jsonObj){

		ScosBusinessAccept scosBusinessAccept = null;

		try {

			scosBusinessAccept = new ScosBusinessAccept();
			String  id  = jsonObj.get("ID").toString();
			String  change_date  = jsonObj.get("CHANGE_DATE").toString();
			String  change_emp  = jsonObj.get("CHANGE_EMP").toString();
			String  create_date  = jsonObj.get("CREATE_DATE").toString();
			String  create_emp  = jsonObj.get("CREATE_EMP").toString();
			String  enable_flag  = jsonObj.get("ENABLE_FLAG").toString();
			String  open_source  = jsonObj.get("OPEN_SOURCE").toString();
			String  unique_ser_no  = jsonObj.get("UNIQUE_SER_NO").toString();
			String  attribute  = jsonObj.get("ATTRIBUTE").toString();
			String  opt_branch_code  = jsonObj.get("OPT_BRANCH_CODE").toString();
			String  card_info  = jsonObj.get("CARD_INFO").toString();
			String  card_status  = jsonObj.get("CARD_STATUS").toString();
			String  cert_no  = jsonObj.get("CERT_NO").toString();
			String  cert_type  = jsonObj.get("CERT_TYPE").toString();
			String  cust_no  = jsonObj.get("CUST_NO").toString();
			String  cust_status  = jsonObj.get("CUST_STATUS").toString();
			String  e_app_id  = jsonObj.get("E_APP_ID").toString();
			String  image_commit_count  = jsonObj.get("IMAGE_COMMIT_COUNT").toString();
			String  image_type  = jsonObj.get("IMAGE_TYPE").toString();
			String  name  = jsonObj.get("NAME").toString();
			String  note  = jsonObj.get("NOTE").toString();
			String  open_branch_code  = jsonObj.get("OPEN_BRANCH_CODE").toString();
			String  open_date  = jsonObj.get("OPEN_DATE").toString();
			String  sys_code  = jsonObj.get("SYS_CODE").toString();
			String  open_desc  = jsonObj.get("OPEN_DESC").toString();
			String  mac_addr  = jsonObj.get("MAC_ADDR").toString();
			String  ip  = jsonObj.get("IP").toString();
			String  special_flag  = jsonObj.get("SPECIAL_FLAG").toString();
			String  other_cust_no  = jsonObj.get("OTHER_CUST_NO").toString();
			String  acct_no  = jsonObj.get("ACCT_NO").toString();
			String  acct_type  = jsonObj.get("ACCT_TYPE").toString();
			String  exist_ymt_no  = jsonObj.get("EXIST_YMT_NO").toString();
			String  ygt_flag  = jsonObj.get("YGT_FLAG").toString();
			String  id_open_branch_code  = jsonObj.get("ID_OPEN_BRANCH_CODE").toString();
			String  client_source  = jsonObj.get("CLIENT_SOURCE").toString();
			String  bus_branch_code  = jsonObj.get("BUS_BRANCH_CODE").toString();
			String  type_scope  = jsonObj.get("TYPE_SCOPE").toString();
			String  cust_type  = jsonObj.get("CUST_TYPE").toString();
			String  org_attribute  = jsonObj.get("ORG_ATTRIBUTE").toString();
			String  normal_flag  = jsonObj.get("NORMAL_FLAG").toString();

			scosBusinessAccept.setId(id);
			scosBusinessAccept.setChange_date(change_date);
			scosBusinessAccept.setChange_emp(change_emp);
			scosBusinessAccept.setCreate_date(create_date);
			scosBusinessAccept.setCreate_emp(create_emp);
			scosBusinessAccept.setEnable_flag(enable_flag);
			scosBusinessAccept.setOpen_source(open_source);
			scosBusinessAccept.setUnique_ser_no(unique_ser_no);
			scosBusinessAccept.setAttribute(attribute);
			scosBusinessAccept.setOpt_branch_code(opt_branch_code);
			scosBusinessAccept.setCard_info(card_info);
			scosBusinessAccept.setCard_status(card_status);
			scosBusinessAccept.setCert_no(cert_no);
			scosBusinessAccept.setCert_type(cert_type);
			scosBusinessAccept.setCust_no(cust_no);
			scosBusinessAccept.setCust_status(cust_status);
			scosBusinessAccept.setE_app_id(e_app_id);
			scosBusinessAccept.setImage_commit_count(image_commit_count);
			scosBusinessAccept.setImage_type(image_type);
			scosBusinessAccept.setName(name);
			scosBusinessAccept.setNote(note);
			scosBusinessAccept.setOpen_branch_code(open_branch_code);
			scosBusinessAccept.setOpen_date(open_date);
			scosBusinessAccept.setSys_code(sys_code);
			scosBusinessAccept.setOpen_desc(open_desc);
			scosBusinessAccept.setMac_addr(mac_addr);
			scosBusinessAccept.setIp(ip);
			scosBusinessAccept.setSpecial_flag(special_flag);
			scosBusinessAccept.setOther_cust_no(other_cust_no);
			scosBusinessAccept.setAcct_no(acct_no);
			scosBusinessAccept.setAcct_type(acct_type);
			scosBusinessAccept.setExist_ymt_no(exist_ymt_no);
			scosBusinessAccept.setYgt_flag(ygt_flag);
			scosBusinessAccept.setId_open_branch_code(id_open_branch_code);
			scosBusinessAccept.setClient_source(client_source);
			scosBusinessAccept.setBus_branch_code(bus_branch_code);
			scosBusinessAccept.setType_scope(type_scope);
			scosBusinessAccept.setCust_type(cust_type);
			scosBusinessAccept.setOrg_attribute(org_attribute);
			scosBusinessAccept.setNormal_flag(normal_flag);

		} catch (Exception e) {
			logger.error("解析[ScosBusinessAccept]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return scosBusinessAccept;
	}

	public static ScosBusinessChoose getScosBusinessChoose(JSONObject jsonObj){

		ScosBusinessChoose scosBusinessChoose = null;

		try {
			scosBusinessChoose = new ScosBusinessChoose();
			String  id  = jsonObj.get("ID").toString();
			String  change_date  = jsonObj.get("CHANGE_DATE").toString();
			String  change_emp  = jsonObj.get("CHANGE_EMP").toString();
			String  create_date  = jsonObj.get("CREATE_DATE").toString();
			String  create_emp  = jsonObj.get("CREATE_EMP").toString();
			String  enable_flag  = jsonObj.get("ENABLE_FLAG").toString();
			String  avilibale_business  = jsonObj.get("AVILIBALE_BUSINESS").toString();
			String  business_scope  = jsonObj.get("BUSINESS_SCOPE").toString();
			String  chosen_business  = jsonObj.get("CHOSEN_BUSINESS").toString();
			String  done_business  = jsonObj.get("DONE_BUSINESS").toString();
			String  service_type  = jsonObj.get("SERVICE_TYPE").toString();
			String  business_accept_id  = jsonObj.get("BUSINESS_ACCEPT_ID").toString();

			scosBusinessChoose.setId(id);
			scosBusinessChoose.setChange_date(change_date);
			scosBusinessChoose.setChange_emp(change_emp);
			scosBusinessChoose.setCreate_date(create_date);
			scosBusinessChoose.setCreate_emp(create_emp);
			scosBusinessChoose.setEnable_flag(enable_flag);
			scosBusinessChoose.setAvilibale_business(avilibale_business);
			scosBusinessChoose.setBusiness_scope(business_scope);
			scosBusinessChoose.setChosen_business(chosen_business);
			scosBusinessChoose.setDone_business(done_business);
			scosBusinessChoose.setService_type(service_type);
			scosBusinessChoose.setBusiness_accept_id(business_accept_id);

		} catch (Exception e) {
			logger.error("解析[ScosBusinessChoose]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return scosBusinessChoose;
	}

	public static ScosBusScheduleDetail getScosBusScheduleDetail(JSONObject jsonObj){

		ScosBusScheduleDetail scosBusScheduleDetail = null;

		try {
			scosBusScheduleDetail = new ScosBusScheduleDetail();
			String  id   = jsonObj.get("ID").toString();
			String  change_date   = jsonObj.get("CHANGE_DATE").toString();
			String  change_emp   = jsonObj.get("CHANGE_EMP").toString();
			String  create_date   = jsonObj.get("CREATE_DATE").toString();
			String  create_emp   = jsonObj.get("CREATE_EMP").toString();
			String  enable_flag   = jsonObj.get("ENABLE_FLAG").toString();
			String  open_source   = jsonObj.get("OPEN_SOURCE").toString();
			String  unique_ser_no   = jsonObj.get("UNIQUE_SER_NO").toString();
			String  archive_status   = jsonObj.get("ARCHIVE_STATUS").toString();
			String  audit_emp   = jsonObj.get("AUDIT_EMP").toString();
			String  audit_note   = jsonObj.get("AUDIT_NOTE").toString();
			String  audit_status   = jsonObj.get("AUDIT_STATUS").toString();
			String  bean_codes   = jsonObj.get("BEAN_CODES").toString();
			String  bean_names   = jsonObj.get("BEAN_NAMES").toString();
			String  branch_code   = jsonObj.get("BRANCH_CODE").toString();
			String  bus_id   = jsonObj.get("BUS_ID").toString();
			String  bus_type   = jsonObj.get("BUS_TYPE").toString();
			String  cert_no   = jsonObj.get("CERT_NO").toString();
			String  cert_type   = jsonObj.get("CERT_TYPE").toString();
			String  check_emp   = jsonObj.get("CHECK_EMP").toString();
			String  cust_no   = jsonObj.get("CUST_NO").toString();
			String  cust_type   = jsonObj.get("CUST_TYPE").toString();
			String  image_archive_status   = jsonObj.get("IMAGE_ARCHIVE_STATUS").toString();
			String  name   = jsonObj.get("NAME").toString();
			String  opt_branch_code   = jsonObj.get("OPT_BRANCH_CODE").toString();
			String  process_id   = jsonObj.get("PROCESS_ID").toString();
			String  src_order_no   = jsonObj.get("SRC_ORDER_NO").toString();
			String  type   = jsonObj.get("TYPE").toString();
			String  type_scope   = jsonObj.get("TYPE_SCOPE").toString();
			String  econtract_flag   = jsonObj.get("ECONTRACT_FLAG").toString();
			String  black_list_str   = jsonObj.get("BLACK_LIST_STR").toString();
			String  account_type   = jsonObj.get("ACCOUNT_TYPE").toString();
			String  spec_bus_type   = jsonObj.get("SPEC_BUS_TYPE").toString();
			String  evaluate_flag   = jsonObj.get("EVALUATE_FLAG").toString();
			String  client_source   = jsonObj.get("CLIENT_SOURCE").toString();
			String  bus_effective_date   = jsonObj.get("BUS_EFFECTIVE_DATE").toString();
			String  excute_in_matter_res_flag   = jsonObj.get("EXCUTE_IN_MATTER_RES_FLAG").toString();
			String  open_branch_code   = jsonObj.get("OPEN_BRANCH_CODE").toString();
			String  double_input_atomic_no   = jsonObj.get("DOUBLE_INPUT_ATOMIC_NO").toString();
			String  video_mode   = jsonObj.get("VIDEO_MODE").toString();
			String  video_emp_code   = jsonObj.get("VIDEO_EMP_CODE").toString();
			String  video_emp_name   = jsonObj.get("VIDEO_EMP_NAME").toString();
			String  archive_desc   = jsonObj.get("ARCHIVE_DESC").toString();
			String  archive_comment   = jsonObj.get("ARCHIVE_COMMENT").toString();
			String  roll_back_flag   = jsonObj.get("ROLL_BACK_FLAG").toString();
			String  roll_back_start_flag   = jsonObj.get("ROLL_BACK_START_FLAG").toString();
			String  roll_back_process   = jsonObj.get("ROLL_BACK_PROCESS").toString();
			String  crm_flag   = jsonObj.get("CRM_FLAG").toString();
			String  anti_money_laudry_desc   = jsonObj.get("ANTI_MONEY_LAUDRY_DESC").toString();
			String  foreign_dignitaries_desc   = jsonObj.get("FOREIGN_DIGNITARIES_DESC").toString();
			String  high_risk_area_desc   = jsonObj.get("HIGH_RISK_AREA_DESC").toString();
			String  archive_date   = jsonObj.get("ARCHIVE_DATE").toString();

			scosBusScheduleDetail.setId(id);
			scosBusScheduleDetail.setChange_date(change_date);
			scosBusScheduleDetail.setChange_emp(change_emp);
			scosBusScheduleDetail.setCreate_date(create_date);
			scosBusScheduleDetail.setCreate_emp(create_emp);
			scosBusScheduleDetail.setEnable_flag(enable_flag);
			scosBusScheduleDetail.setOpen_source(open_source);
			scosBusScheduleDetail.setUnique_ser_no(unique_ser_no);
			scosBusScheduleDetail.setArchive_status(archive_status);
			scosBusScheduleDetail.setAudit_emp(audit_emp);
			scosBusScheduleDetail.setAudit_note(audit_note);
			scosBusScheduleDetail.setAudit_status(audit_status);
			scosBusScheduleDetail.setBean_codes(bean_codes);
			scosBusScheduleDetail.setBean_names(bean_names);
			scosBusScheduleDetail.setBranch_code(branch_code);
			scosBusScheduleDetail.setBus_id(bus_id);
			scosBusScheduleDetail.setBus_type(bus_type);
			scosBusScheduleDetail.setCert_no(cert_no);
			scosBusScheduleDetail.setCert_type(cert_type);
			scosBusScheduleDetail.setCheck_emp(check_emp);
			scosBusScheduleDetail.setCust_no(cust_no);
			scosBusScheduleDetail.setCust_type(cust_type);
			scosBusScheduleDetail.setImage_archive_status(image_archive_status);
			scosBusScheduleDetail.setName(name);
			scosBusScheduleDetail.setOpt_branch_code(opt_branch_code);
			scosBusScheduleDetail.setProcess_id(process_id);
			scosBusScheduleDetail.setSrc_order_no(src_order_no);
			scosBusScheduleDetail.setType(type);
			scosBusScheduleDetail.setType_scope(type_scope);
			scosBusScheduleDetail.setEcontract_flag(econtract_flag);
			scosBusScheduleDetail.setBlack_list_str(black_list_str);
			scosBusScheduleDetail.setAccount_type(account_type);
			scosBusScheduleDetail.setSpec_bus_type(spec_bus_type);
			scosBusScheduleDetail.setEvaluate_flag(evaluate_flag);
			scosBusScheduleDetail.setClient_source(client_source);
			scosBusScheduleDetail.setBus_effective_date(bus_effective_date);
			scosBusScheduleDetail.setExcute_in_matter_res_flag(excute_in_matter_res_flag);
			scosBusScheduleDetail.setOpen_branch_code(open_branch_code);
			scosBusScheduleDetail.setDouble_input_atomic_no(double_input_atomic_no);
			scosBusScheduleDetail.setVideo_mode(video_mode);
			scosBusScheduleDetail.setVideo_emp_code(video_emp_code);
			scosBusScheduleDetail.setVideo_emp_name(video_emp_name);
			scosBusScheduleDetail.setArchive_desc(archive_desc);
			scosBusScheduleDetail.setArchive_comment(archive_comment);
			scosBusScheduleDetail.setRoll_back_flag(roll_back_flag);
			scosBusScheduleDetail.setRoll_back_start_flag(roll_back_start_flag);
			scosBusScheduleDetail.setRoll_back_process(roll_back_process);
			scosBusScheduleDetail.setCrm_flag(crm_flag);
			scosBusScheduleDetail.setAnti_money_laudry_desc(anti_money_laudry_desc);
			scosBusScheduleDetail.setForeign_dignitaries_desc(foreign_dignitaries_desc);
			scosBusScheduleDetail.setHigh_risk_area_desc(high_risk_area_desc);
			scosBusScheduleDetail.setArchive_date(archive_date);

		} catch (Exception e) {
			logger.error("解析[ScosBusScheduleDetail]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return scosBusScheduleDetail;
	}

	public static UserPresence getUserPresence(JSONObject jsonObj){

		UserPresence userPresence = null;

		try {
			userPresence = new UserPresence();

			String  id   = jsonObj.get("ID").toString();
			String  user_id   = jsonObj.get("USER_ID").toString();
			String  user_no   = jsonObj.get("USER_NO").toString();
			String  user_name   = jsonObj.get("USER_NAME").toString();
			String  mobile   = jsonObj.get("MOBILE").toString();
			String  ogr_id   = jsonObj.get("OGR_ID").toString();
			String  identified_flag   = jsonObj.get("IDENTIFIED_FLAG").toString();
			String  source_type   = jsonObj.get("SOURCE_TYPE").toString();
			String  source_detail_id   = jsonObj.get("SOURCE_DETAIL_ID").toString();
			String  province   = jsonObj.get("PROVINCE").toString();
			String  city   = jsonObj.get("CITY").toString();
			String  area   = jsonObj.get("AREA").toString();
			String  address   = jsonObj.get("ADDRESS").toString();
			String  full_address   = jsonObj.get("FULL_ADDRESS").toString();
			String  fax   = jsonObj.get("FAX").toString();
			String  telphone   = jsonObj.get("TELPHONE").toString();
			String  zip_code   = jsonObj.get("ZIP_CODE").toString();
			String  mail_address   = jsonObj.get("MAIL_ADDRESS").toString();
			String  degree_code   = jsonObj.get("DEGREE_CODE").toString();
			String  profession_code   = jsonObj.get("PROFESSION_CODE").toString();
			String  service_type   = jsonObj.get("SERVICE_TYPE").toString();
			String  status   = jsonObj.get("STATUS").toString();
			String  callback_day_type   = jsonObj.get("CALLBACK_DAY_TYPE").toString();
			String  callback_time   = jsonObj.get("CALLBACK_TIME").toString();
			String  create_time   = jsonObj.get("CREATE_TIME").toString();
			String  submit_time   = jsonObj.get("SUBMIT_TIME").toString();
			String  end_time   = jsonObj.get("END_TIME").toString();
			String  last_update_time   = jsonObj.get("LAST_UPDATE_TIME").toString();
			String  last_update_by   = jsonObj.get("LAST_UPDATE_BY").toString();
			String  flow_version   = jsonObj.get("FLOW_VERSION").toString();
			String  user_status   = jsonObj.get("USER_STATUS").toString();
			String  sign_flag   = jsonObj.get("SIGN_FLAG").toString();
			String  user_flow_status   = jsonObj.get("USER_FLOW_STATUS").toString();
			String  broker_code   = jsonObj.get("BROKER_CODE").toString();
			String  register_way   = jsonObj.get("REGISTER_WAY").toString();
			String  access_way   = jsonObj.get("ACCESS_WAY").toString();
			String  attr1   = jsonObj.get("ATTR1").toString();
			String  fr_score   = jsonObj.get("FR_SCORE").toString();
			String  channel_id   = jsonObj.get("CHANNEL_ID").toString();
			String  client_type   = jsonObj.get("CLIENT_TYPE").toString();
			String  user_agent   = jsonObj.get("USER_AGENT").toString();
			String  channel_comment   = jsonObj.get("CHANNEL_COMMENT").toString();
			String  archive_flag   = jsonObj.get("ARCHIVE_FLAG").toString();
			String  model_id   = jsonObj.get("MODEL_ID").toString();
			String  archive_date   = jsonObj.get("ARCHIVE_DATE").toString();
			String  verify_code   = jsonObj.get("VERIFY_CODE").toString();
			String  witness_type   = jsonObj.get("WITNESS_TYPE").toString();
			String  device_model   = jsonObj.get("DEVICE_MODEL").toString();
			String  video_empid   = jsonObj.get("VIDEO_EMPID").toString();
			String  audio_empid   = jsonObj.get("AUDIO_EMPID").toString();
			String  review_empid   = jsonObj.get("REVIEW_EMPID").toString();
			String  invite_code   = jsonObj.get("INVITE_CODE").toString();
			String  counter_model_no   = jsonObj.get("COUNTER_MODEL_NO").toString();
			String  device_id   = jsonObj.get("DEVICE_ID").toString();
			String  fa_success_time   = jsonObj.get("FA_SUCCESS_TIME").toString();
			String  zd_flag   = jsonObj.get("ZD_FLAG").toString();
			String  handle_empid   = jsonObj.get("HANDLE_EMPID").toString();
			String  handle_flag   = jsonObj.get("HANDLE_FLAG").toString();
			String  risk_agreement_type   = jsonObj.get("RISK_AGREEMENT_TYPE").toString();
			String  no_open_reason   = jsonObj.get("NO_OPEN_REASON").toString();
			String  device_cids   = jsonObj.get("DEVICE_CIDS").toString();
			String  device_type   = jsonObj.get("DEVICE_TYPE").toString();
			String  job_position   = jsonObj.get("JOB_POSITION").toString();
			String  work_units   = jsonObj.get("WORK_UNITS").toString();
			String  controllers_is_self   = jsonObj.get("CONTROLLERS_IS_SELF").toString();
			String  beneficiary_is_self   = jsonObj.get("BENEFICIARY_IS_SELF").toString();
			String  credit_record_good   = jsonObj.get("CREDIT_RECORD_GOOD").toString();
			String  bad_record_source   = jsonObj.get("BAD_RECORD_SOURCE").toString();
			String  flow_no   = jsonObj.get("FLOW_NO").toString();
			String  mobile_style   = jsonObj.get("MOBILE_STYLE").toString();
			String  error_count   = jsonObj.get("ERROR_COUNT").toString();
			String  black_type   = jsonObj.get("BLACK_TYPE").toString();
			String  mobile_style_last   = jsonObj.get("MOBILE_STYLE_LAST").toString();
			String  user_agent_last   = jsonObj.get("USER_AGENT_LAST").toString();
			String  deal_type   = jsonObj.get("DEAL_TYPE").toString();
			String  auto_verify_comments   = jsonObj.get("AUTO_VERIFY_COMMENTS").toString();
			String  transfer_flag   = jsonObj.get("TRANSFER_FLAG").toString();
			String  dept_select_flag   = jsonObj.get("DEPT_SELECT_FLAG").toString();

			userPresence.setId(id);
			userPresence.setUser_id(user_id);
			userPresence.setUser_no(user_no);
			userPresence.setUser_name(user_name);
			userPresence.setMobile(mobile);
			userPresence.setOgr_id(ogr_id);
			userPresence.setIdentified_flag(identified_flag);
			userPresence.setSource_type(source_type);
			userPresence.setSource_detail_id(source_detail_id);
			userPresence.setProvince(province);
			userPresence.setCity(city);
			userPresence.setArea(area);
			userPresence.setAddress(address);
			userPresence.setFull_address(full_address);
			userPresence.setFax(fax);
			userPresence.setTelphone(telphone);
			userPresence.setZip_code(zip_code);
			userPresence.setMail_address(mail_address);
			userPresence.setDegree_code(degree_code);
			userPresence.setProfession_code(profession_code);
			userPresence.setService_type(service_type);
			userPresence.setStatus(status);
			userPresence.setCallback_day_type(callback_day_type);
			userPresence.setCallback_time(callback_time);
			userPresence.setCreate_time(create_time);
			userPresence.setSubmit_time(submit_time);
			userPresence.setEnd_time(end_time);
			userPresence.setLast_update_time(last_update_time);
			userPresence.setLast_update_by(last_update_by);
			userPresence.setFlow_version(flow_version);
			userPresence.setUser_status(user_status);
			userPresence.setSign_flag(sign_flag);
			userPresence.setUser_flow_status(user_flow_status);
			userPresence.setBroker_code(broker_code);
			userPresence.setRegister_way(register_way);
			userPresence.setAccess_way(access_way);
			userPresence.setAttr1(attr1);
			userPresence.setFr_score(fr_score);
			userPresence.setChannel_id(channel_id);
			userPresence.setClient_type(client_type);
			userPresence.setUser_agent(user_agent);
			userPresence.setChannel_comment(channel_comment);
			userPresence.setArchive_flag(archive_flag);
			userPresence.setModel_id(model_id);
			userPresence.setArchive_date(archive_date);
			userPresence.setVerify_code(verify_code);
			userPresence.setWitness_type(witness_type);
			userPresence.setDevice_model(device_model);
			userPresence.setVideo_empid(video_empid);
			userPresence.setAudio_empid(audio_empid);
			userPresence.setReview_empid(review_empid);
			userPresence.setInvite_code(invite_code);
			userPresence.setCounter_model_no(counter_model_no);
			userPresence.setDevice_id(device_id);
			userPresence.setFa_success_time(fa_success_time);
			userPresence.setZd_flag(zd_flag);
			userPresence.setHandle_empid(handle_empid);
			userPresence.setHandle_flag(handle_flag);
			userPresence.setRisk_agreement_type(risk_agreement_type);
			userPresence.setNo_open_reason(no_open_reason);
			userPresence.setDevice_cids(device_cids);
			userPresence.setDevice_type(device_type);
			userPresence.setJob_position(job_position);
			userPresence.setWork_units(work_units);
			userPresence.setControllers_is_self(controllers_is_self);
			userPresence.setBeneficiary_is_self(beneficiary_is_self);
			userPresence.setCredit_record_good(credit_record_good);
			userPresence.setBad_record_source(bad_record_source);
			userPresence.setFlow_no(flow_no);
			userPresence.setMobile_style(mobile_style);
			userPresence.setError_count(error_count);
			userPresence.setBlack_type(black_type);
			userPresence.setMobile_style_last(mobile_style_last);
			userPresence.setUser_agent_last(user_agent_last);
			userPresence.setDeal_type(deal_type);
			userPresence.setAuto_verify_comments(auto_verify_comments);
			userPresence.setTransfer_flag(transfer_flag);
			userPresence.setDept_select_flag(dept_select_flag);

		} catch (Exception e) {
			logger.error("解析[UserPresence]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return userPresence;
	}

	public static BaseOrganization getBaseOrganization(JSONObject jsonObj){

		BaseOrganization baseOrganization = null;

		try {
			baseOrganization = new BaseOrganization();
			String  org_id  = jsonObj.get("ORG_ID").toString();
			String  org_code  = jsonObj.get("ORG_CODE").toString();
			String  name  = jsonObj.get("NAME").toString();
			String  parent_org_id  = jsonObj.get("PARENT_ORG_ID").toString();
			String  org_type  = jsonObj.get("ORG_TYPE").toString();
			String  province  = jsonObj.get("PROVINCE").toString();
			String  city  = jsonObj.get("CITY").toString();
			String  area  = jsonObj.get("AREA").toString();
			String  address  = jsonObj.get("ADDRESS").toString();
			String  zip_code  = jsonObj.get("ZIP_CODE").toString();
			String  telphone  = jsonObj.get("TELPHONE").toString();
			String  contact_person  = jsonObj.get("CONTACT_PERSON").toString();
			String  fax  = jsonObj.get("FAX").toString();
			String  mail  = jsonObj.get("MAIL").toString();
			String  description  = jsonObj.get("DESCRIPTION").toString();
			String  entrust_phone  = jsonObj.get("ENTRUST_PHONE").toString();
			String  branch_seat  = jsonObj.get("BRANCH_SEAT").toString();
			String  sell_manager  = jsonObj.get("SELL_MANAGER").toString();
			String  working_manager  = jsonObj.get("WORKING_MANAGER").toString();
			String  relation_phone  = jsonObj.get("RELATION_PHONE").toString();
			String  weight  = jsonObj.get("WEIGHT").toString();
			String  longitude  = jsonObj.get("LONGITUDE").toString();
			String  latitude  = jsonObj.get("LATITUDE").toString();
			String  status  = jsonObj.get("STATUS").toString();
			String  sycn_time  = jsonObj.get("SYCN_TIME").toString();
			String  create_time  = jsonObj.get("CREATE_TIME").toString();
			String  create_by  = jsonObj.get("CREATE_BY").toString();
			String  update_time  = jsonObj.get("UPDATE_TIME").toString();
			String  update_by  = jsonObj.get("UPDATE_BY").toString();
			String  commission  = jsonObj.get("COMMISSION").toString();
			String  alias  = jsonObj.get("ALIAS").toString();
			String  remark  = jsonObj.get("REMARK").toString();
			String  default_model_id  = jsonObj.get("DEFAULT_MODEL_ID").toString();
			String  commission_desc  = jsonObj.get("COMMISSION_DESC").toString();
			String  auto_verify_status  = jsonObj.get("AUTO_VERIFY_STATUS").toString();

			baseOrganization.setOrg_id(org_id);
			baseOrganization.setOrg_code(org_code);
			baseOrganization.setName(name);
			baseOrganization.setParent_org_id(parent_org_id);
			baseOrganization.setOrg_type(org_type);
			baseOrganization.setProvince(province);
			baseOrganization.setCity(city);
			baseOrganization.setArea(area);
			baseOrganization.setAddress(address);
			baseOrganization.setZip_code(zip_code);
			baseOrganization.setTelphone(telphone);
			baseOrganization.setContact_person(contact_person);
			baseOrganization.setFax(fax);
			baseOrganization.setMail(mail);
			baseOrganization.setDescription(description);
			baseOrganization.setEntrust_phone(entrust_phone);
			baseOrganization.setBranch_seat(branch_seat);
			baseOrganization.setSell_manager(sell_manager);
			baseOrganization.setWorking_manager(working_manager);
			baseOrganization.setRelation_phone(relation_phone);
			baseOrganization.setWeight(weight);
			baseOrganization.setLongitude(longitude);
			baseOrganization.setLatitude(latitude);
			baseOrganization.setStatus(status);
			baseOrganization.setSycn_time(sycn_time);
			baseOrganization.setCreate_time(create_time);
			baseOrganization.setCreate_by(create_by);
			baseOrganization.setUpdate_time(update_time);
			baseOrganization.setUpdate_by(update_by);
			baseOrganization.setCommission(commission);
			baseOrganization.setAlias(alias);
			baseOrganization.setRemark(remark);
			baseOrganization.setDefault_model_id(default_model_id);
			baseOrganization.setCommission_desc(commission_desc);
			baseOrganization.setAuto_verify_status(auto_verify_status);

		} catch (Exception e) {
			logger.error("解析[BaseOrganization]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return baseOrganization;
	}

	public static MessTask getMessTask(JSONObject jsonObj){

		MessTask messTask = null;

		try {
			messTask = new MessTask();
			String  task_id  = jsonObj.get("TASK_ID").toString();
			String  task_no  = jsonObj.get("TASK_NO").toString();
			String  task_type  = jsonObj.get("TASK_TYPE").toString();
			String  title  = jsonObj.get("TITLE").toString();
			String  content  = jsonObj.get("CONTENT").toString();
			String  create_time  = jsonObj.get("CREATE_TIME").toString();
			String  user_id  = jsonObj.get("USER_ID").toString();
			String  user_name  = jsonObj.get("USER_NAME").toString();
			String  org_id  = jsonObj.get("ORG_ID").toString();
			String  deal_time  = jsonObj.get("DEAL_TIME").toString();
			String  emp_id  = jsonObj.get("EMP_ID").toString();
			String  emp_name  = jsonObj.get("EMP_NAME").toString();
			String  status  = jsonObj.get("STATUS").toString();
			String  finish_time  = jsonObj.get("FINISH_TIME").toString();
			String  result_comment  = jsonObj.get("RESULT_COMMENT").toString();
			String  anti_emp_id  = jsonObj.get("ANTI_EMP_ID").toString();
			String  business_detail_id  = jsonObj.get("BUSINESS_DETAIL_ID").toString();
			String  app_id  = jsonObj.get("APP_ID").toString();
			String  locked_flag  = jsonObj.get("LOCKED_FLAG").toString();
			String  submit_type  = jsonObj.get("SUBMIT_TYPE").toString();
			String  auto_verify_status  = jsonObj.get("AUTO_VERIFY_STATUS").toString();
			String  auto_verify_comments  = jsonObj.get("AUTO_VERIFY_COMMENTS").toString();
			String  call_back  = jsonObj.get("CALL_BACK").toString();
			String  auto_confirm_status  = jsonObj.get("AUTO_CONFIRM_STATUS").toString();

			messTask.setTask_id(task_id);
			messTask.setTask_no(task_no);
			messTask.setTask_type(task_type);
			messTask.setTitle(title);
			messTask.setContent(content);
			messTask.setCreate_time(create_time);
			messTask.setUser_id(user_id);
			messTask.setUser_name(user_name);
			messTask.setOrg_id(org_id);
			messTask.setDeal_time(deal_time);
			messTask.setEmp_id(emp_id);
			messTask.setEmp_name(emp_name);
			messTask.setStatus(status);
			messTask.setFinish_time(finish_time);
			messTask.setResult_comment(result_comment);
			messTask.setAnti_emp_id(anti_emp_id);
			messTask.setBusiness_detail_id(business_detail_id);
			messTask.setApp_id(app_id);
			messTask.setLocked_flag(locked_flag);
			messTask.setSubmit_type(submit_type);
			messTask.setAuto_verify_status(auto_verify_status);
			messTask.setAuto_verify_comments(auto_verify_comments);
			messTask.setCall_back(call_back);
			messTask.setAuto_confirm_status(auto_confirm_status);

		} catch (Exception e) {
			logger.error("解析[MessTask]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return messTask;
	}

	public static ScosBusBasicTaskInfo getScosBusBasicTaskInfo(JSONObject jsonObj){

		ScosBusBasicTaskInfo scosBusBasicTaskInfo = null;

		try {
			scosBusBasicTaskInfo = new ScosBusBasicTaskInfo();
			String  id  = jsonObj.get("ID").toString();
			String  change_date  = jsonObj.get("CHANGE_DATE").toString();
			String  change_emp  = jsonObj.get("CHANGE_EMP").toString();
			String  create_date  = jsonObj.get("CREATE_DATE").toString();
			String  create_emp  = jsonObj.get("CREATE_EMP").toString();
			String  enable_flag  = jsonObj.get("ENABLE_FLAG").toString();
			String  open_source  = jsonObj.get("OPEN_SOURCE").toString();
			String  unique_ser_no  = jsonObj.get("UNIQUE_SER_NO").toString();
			String  cust_no  = jsonObj.get("CUST_NO").toString();
			String  bus_atomic_no  = jsonObj.get("BUS_ATOMIC_NO").toString();
			String  open_flag  = jsonObj.get("OPEN_FLAG").toString();
			String  business_accept_id  = jsonObj.get("BUSINESS_ACCEPT_ID").toString();
			String  ignore_codes  = jsonObj.get("IGNORE_CODES").toString();
			String  open_date  = jsonObj.get("OPEN_DATE").toString();

			scosBusBasicTaskInfo.setId(id);
			scosBusBasicTaskInfo.setChange_date(change_date);
			scosBusBasicTaskInfo.setChange_emp(change_emp);
			scosBusBasicTaskInfo.setCreate_date(create_date);
			scosBusBasicTaskInfo.setCreate_emp(create_emp);
			scosBusBasicTaskInfo.setEnable_flag(enable_flag);
			scosBusBasicTaskInfo.setOpen_source(open_source);
			scosBusBasicTaskInfo.setUnique_ser_no(unique_ser_no);
			scosBusBasicTaskInfo.setCust_no(cust_no);
			scosBusBasicTaskInfo.setBus_atomic_no(bus_atomic_no);
			scosBusBasicTaskInfo.setOpen_flag(open_flag);
			scosBusBasicTaskInfo.setBusiness_accept_id(business_accept_id);
			scosBusBasicTaskInfo.setIgnore_codes(ignore_codes);
			scosBusBasicTaskInfo.setOpen_date(open_date);

		} catch (Exception e) {
			logger.error("解析[ScosBusBasicTaskInfo]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return scosBusBasicTaskInfo;
	}

    public static UserAccounts getUserAccounts(JSONObject jsonObj) {

        UserAccounts userAccounts = null;

        try {
            userAccounts = new UserAccounts();
            String account_id = jsonObj.get("ACCOUNT_ID").toString();
            String user_id = jsonObj.get("USER_ID").toString();
            String invset_type = jsonObj.get("INVSET_TYPE").toString();
            String account_type = jsonObj.get("ACCOUNT_TYPE").toString();
            String account_name = jsonObj.get("ACCOUNT_NAME").toString();
            String account_no = jsonObj.get("ACCOUNT_NO").toString();
            String branch_id = jsonObj.get("BRANCH_ID").toString();
            String branch_name = jsonObj.get("BRANCH_NAME").toString();
            String validate_flag = jsonObj.get("VALIDATE_FLAG").toString();
            String apply_success_flag = jsonObj.get("APPLY_SUCCESS_FLAG").toString();
            String end_time = jsonObj.get("END_TIME").toString();
            String start_time = jsonObj.get("START_TIME").toString();
            String error_info = jsonObj.get("ERROR_INFO").toString();
            String attach_flag = jsonObj.get("ATTACH_FLAG").toString();
            String account_code = jsonObj.get("ACCOUNT_CODE").toString();

            userAccounts.setAccount_id(account_id);
            userAccounts.setUser_id(user_id);
            userAccounts.setInvset_type(invset_type);
            userAccounts.setAccount_type(account_type);
            userAccounts.setAccount_name(account_name);
            userAccounts.setAccount_no(account_no);
            userAccounts.setBranch_id(branch_id);
            userAccounts.setBranch_name(branch_name);
            userAccounts.setValidate_flag(validate_flag);
            userAccounts.setApply_success_flag(apply_success_flag);
            userAccounts.setStart_time(start_time);
            userAccounts.setEnd_time(end_time);
            userAccounts.setError_info(error_info);
            userAccounts.setAttach_flag(attach_flag);
            userAccounts.setAccount_code(account_code);

        } catch(Exception e) {
            logger.error("解析[UserAccounts]......异常！请检查字段是否书写准确" + e.getMessage());
            logger.error(jsonObj.toString());
            e.printStackTrace();
        }
        return userAccounts;
    }

    public static BaseSysUser getBaseSysUser(JSONObject jsonObj) {
        BaseSysUser baseSysUser = null;
        try {
            baseSysUser = new BaseSysUser();
            String emp_id = jsonObj.get("EMP_ID").toString();
            String emp_no = jsonObj.get("EMP_NO").toString();
            String emp_name = jsonObj.get("EMP_NAME").toString();
            String mobile = jsonObj.get("MOBILE").toString();
            String org_id = jsonObj.get("ORG_ID").toString();
            String role_id = jsonObj.get("ROLE_ID").toString();
            String user_org_id = jsonObj.get("USER_ORG_ID").toString();
            String last_login_time = jsonObj.get("LAST_LOGIN_TIME").toString();
            String password = jsonObj.get("PASSWORD").toString();
            String phone = jsonObj.get("PHONE").toString();
            String mail = jsonObj.get("MAIL").toString();
            String qq = jsonObj.get("QQ").toString();
            String gender = jsonObj.get("GENDER").toString();
            String status = jsonObj.get("STATUS").toString();
            String salt = jsonObj.get("SALT").toString();
            String cert_no = jsonObj.get("CERT_NO").toString();
            String last_quit_time = jsonObj.get("LAST_QUIT_TIME").toString();
            String login_mark = jsonObj.get("LOGIN_MARK").toString();
            String auto_verify_status = jsonObj.get("AUTO_VERIFY_STATUS").toString();

            baseSysUser.setEmp_id(emp_id);
            baseSysUser.setEmp_no(emp_no);
            baseSysUser.setEmp_name(emp_name);
            baseSysUser.setMobile(mobile);
            baseSysUser.setOrg_id(org_id);
            baseSysUser.setRole_id(role_id);
            baseSysUser.setUser_org_id(user_org_id);
            baseSysUser.setLast_login_time(last_login_time);
            baseSysUser.setPassword(password);
            baseSysUser.setPhone(phone);
            baseSysUser.setMail(mail);
            baseSysUser.setQq(qq);
            baseSysUser.setStatus(status);
            baseSysUser.setGender(gender);
            baseSysUser.setSalt(salt);
            baseSysUser.setCert_no(cert_no);
            baseSysUser.setLast_quit_time(last_quit_time);
            baseSysUser.setLogin_mark(login_mark);
            baseSysUser.setAuto_verify_status(auto_verify_status);
        } catch (Exception e) {
            logger.error("解析[BaseSysUser]......异常！请检查字段是否书写准确" + e.getMessage());
            logger.error(jsonObj.toString());
            e.printStackTrace();
        }
        return baseSysUser;
    }

    public static UserBusinessFlow getUserBusinessFlow(JSONObject jsonObj) {
        UserBusinessFlow userBusinessFlow = null;

        try {
            userBusinessFlow = new UserBusinessFlow();
            String business_id = jsonObj.get("BUSINESS_ID").toString();
            String business_type = jsonObj.get("BUSINESS_TYPE").toString();
            String user_id = jsonObj.get("USER_ID").toString();
            String create_time = jsonObj.get("CREATE_TIME").toString();
            String create_by = jsonObj.get("CREATE_BY").toString();
            String create_user_name = jsonObj.get("CREATE_USER_NAME").toString();
            String description = jsonObj.get("DESCRIPTION").toString();
            String status = jsonObj.get("STATUS").toString();
            String source_detail_id = jsonObj.get("SOURCE_DETAIL_ID").toString();
            String org_id = jsonObj.get("ORG_ID").toString();
            String org_name = jsonObj.get("ORG_NAME").toString();
            String user_name = jsonObj.get("USER_NAME").toString();
            String identity_code = jsonObj.get("IDENTITY_CODE").toString();
            String mobile = jsonObj.get("MOBILE").toString();
            String witness_type = jsonObj.get("WITNESS_TYPE").toString();

            userBusinessFlow.setBusiness_id(business_id);
            userBusinessFlow.setBusiness_type(business_type);
            userBusinessFlow.setUser_id(user_id);
            userBusinessFlow.setCreate_time(create_time);
            userBusinessFlow.setCreate_by(create_by);
            userBusinessFlow.setCreate_user_name(create_user_name);
            userBusinessFlow.setDescription(description);
            userBusinessFlow.setStatus(status);
            userBusinessFlow.setSource_detail_id(source_detail_id);
            userBusinessFlow.setOrg_id(org_id);
            userBusinessFlow.setOrg_name(org_name);
            userBusinessFlow.setUser_name(user_name);
            userBusinessFlow.setIdentity_code(identity_code);
            userBusinessFlow.setMobile(mobile);
            userBusinessFlow.setWitness_type(witness_type);
        } catch(Exception e) {
            logger.error("解析[UserBusinessFlow]......异常！请检查字段是否书写准确" + e.getMessage());
            logger.error(jsonObj.toString());
            e.printStackTrace();
        }
        return userBusinessFlow;
    }

    public static ScosAuditLog getScosAuditLog(JSONObject jsonObj) {
        ScosAuditLog scosAuditLog = null;
        try {
            scosAuditLog = new ScosAuditLog();
            String id = jsonObj.get("ID").toString();
            String change_date = jsonObj.get("CHANGE_DATE").toString();
            String change_emp = jsonObj.get("CHANGE_EMP").toString();
            String create_date = jsonObj.get("CREATE_DATE").toString();
            String create_emp = jsonObj.get("CREATE_EMP").toString();
            String enable_flag = jsonObj.get("ENABLE_FLAG").toString();
            String audit_emp = jsonObj.get("AUDIT_EMP").toString();
            String audit_log = jsonObj.get("AUDIT_LOG").toString();
            String audit_result = jsonObj.get("AUDIT_RESULT").toString();
            String audit_state_id = jsonObj.get("AUDIT_STATE_ID").toString();
            String audit_task_id = jsonObj.get("AUDIT_TASK_ID").toString();
            String audit_time = jsonObj.get("AUDIT_TIME").toString();
            String sys_code = jsonObj.get("SYS_CODE").toString();
            String accept_serial_no = jsonObj.get("ACCEPT_SERIAL_NO").toString();
            String audit_serial_no = jsonObj.get("AUDIT_SERIAL_NO").toString();
            String audit_type = jsonObj.get("AUDIT_TYPE").toString();
            String audit_emp_name = jsonObj.get("AUDIT_EMP_NAME").toString();
            String audit_branch_code = jsonObj.get("AUDIT_BRANCH_CODE").toString();
            String emp_mac = jsonObj.get("EMP_MAC").toString();
            String audit_emp_postion = jsonObj.get("AUDIT_EMP_POSTION").toString();

            scosAuditLog.setId(id);
            scosAuditLog.setChange_date(change_date);
            scosAuditLog.setChange_emp(change_emp);
            scosAuditLog.setCreate_date(create_date);
            scosAuditLog.setCreate_emp(create_emp);
            scosAuditLog.setEnable_flag(enable_flag);
            scosAuditLog.setAudit_emp(audit_emp);
            scosAuditLog.setAudit_log(audit_log);
            scosAuditLog.setAudit_result(audit_result);
            scosAuditLog.setAudit_state_id(audit_state_id);
            scosAuditLog.setAudit_task_id(audit_task_id);
            scosAuditLog.setAudit_time(audit_time);
            scosAuditLog.setSys_code(sys_code);
            scosAuditLog.setAccept_serial_no(accept_serial_no);
            scosAuditLog.setAudit_serial_no(audit_serial_no);
            scosAuditLog.setAudit_type(audit_type);
            scosAuditLog.setAudit_emp_name(audit_emp_name);
            scosAuditLog.setAudit_branch_code(audit_branch_code);
            scosAuditLog.setEmp_mac(emp_mac);
            scosAuditLog.setAudit_emp_postion(audit_emp_postion);

        } catch(Exception e) {
            logger.error("解析[ScosAuditLog]......异常！请检查字段是否书写准确" + e.getMessage());
            logger.error(jsonObj.toString());
            e.printStackTrace();
        }
        return scosAuditLog;
    }

    public static ScosAuditScheduleLog getScosAuditScheduleLog(JSONObject jsonObj) {
        ScosAuditScheduleLog scosAuditScheduleLog = null;

        try {
            scosAuditScheduleLog = new ScosAuditScheduleLog();
            String id = jsonObj.get("ID").toString();
            String change_date = jsonObj.get("CHANGE_DATE").toString();
            String change_emp = jsonObj.get("CHANGE_EMP").toString();
            String create_date = jsonObj.get("CREATE_DATE").toString();
            String create_emp = jsonObj.get("CREATE_EMP").toString();
            String enable_flag = jsonObj.get("ENABLE_FLAG").toString();
            String business_atomic = jsonObj.get("BUSINESS_ATOMIC").toString();
            String business_code = jsonObj.get("BUSINESS_CODE").toString();
            String business_type = jsonObj.get("BUSINESS_TYPE").toString();
            String business_result = jsonObj.get("BUSINESS_RESULT").toString();
            String open_msg = jsonObj.get("OPEN_MSG").toString();
            String remark = jsonObj.get("REMARK").toString();
            String son_ser_no = jsonObj.get("SON_SER_NO").toString();
            String status = jsonObj.get("STATUS").toString();
            String unique_ser_no = jsonObj.get("UNIQUE_SER_NO").toString();
            String sys_code = jsonObj.get("SYS_CODE").toString();
            String open_source = jsonObj.get("OPEN_SOURCE").toString();
            String opt_type = jsonObj.get("OPT_TYPE").toString();

            scosAuditScheduleLog.setId(id);
            scosAuditScheduleLog.setChange_date(change_date);
            scosAuditScheduleLog.setChange_emp(change_emp);
            scosAuditScheduleLog.setCreate_date(create_date);
            scosAuditScheduleLog.setCreate_emp(create_emp);
            scosAuditScheduleLog.setEnable_flag(enable_flag);
            scosAuditScheduleLog.setBusiness_atomic(business_atomic);
            scosAuditScheduleLog.setBusiness_code(business_code);
            scosAuditScheduleLog.setBusiness_type(business_type);
            scosAuditScheduleLog.setBusiness_result(business_result);
            scosAuditScheduleLog.setOpen_msg(open_msg);
            scosAuditScheduleLog.setRemark(remark);
            scosAuditScheduleLog.setSon_ser_no(son_ser_no);
            scosAuditScheduleLog.setStatus(status);
            scosAuditScheduleLog.setUnique_ser_no(unique_ser_no);
            scosAuditScheduleLog.setSys_code(sys_code);
            scosAuditScheduleLog.setOpen_source(open_source);
            scosAuditScheduleLog.setOpt_type(opt_type);

        } catch(Exception e) {
            logger.error("解析[ScosAuditScheduleLog]......异常！请检查字段是否书写准确" + e.getMessage());
            logger.error(jsonObj.toString());
            e.printStackTrace();
        }
        return scosAuditScheduleLog;
    }

	public static ScosBusinessChooseDetail getScosBusinessChooseDetail (JSONObject jsonObj) {
		ScosBusinessChooseDetail scosBusinessChooseDetail = null;
		try {
			scosBusinessChooseDetail = new ScosBusinessChooseDetail();
			String id = jsonObj.get("ID").toString();
			String change_date = jsonObj.get("CHANGE_DATE").toString();
			String change_emp = jsonObj.get("CHANGE_EMP").toString();
			String create_date = jsonObj.get("CREATE_DATE").toString();
			String create_emp = jsonObj.get("CREATE_EMP").toString();
			String enable_flag = jsonObj.get("ENABLE_FLAG").toString();
			String business_accept_id = jsonObj.get("BUSINESS_ACCEPT_ID").toString();
			String bus_id = jsonObj.get("BUS_ID").toString();
			String chosen_business = jsonObj.get("CHOSEN_BUSINESS").toString();
			String update_after = jsonObj.get("UPDATE_AFTER").toString();
			String ext1 = jsonObj.get("EXT1").toString();
			String ext2 = jsonObj.get("EXT2").toString();
			String ext3 = jsonObj.get("EXT3").toString();

			scosBusinessChooseDetail.setId(id);
			scosBusinessChooseDetail.setChange_date(change_date);
			scosBusinessChooseDetail.setChange_emp(change_emp);
			scosBusinessChooseDetail.setCreate_date(create_date);
			scosBusinessChooseDetail.setCreate_emp(create_emp);
			scosBusinessChooseDetail.setEnable_flag(enable_flag);
			scosBusinessChooseDetail.setBusiness_accept_id(business_accept_id);
			scosBusinessChooseDetail.setBus_id(bus_id);
			scosBusinessChooseDetail.setChosen_business(chosen_business);
			scosBusinessChooseDetail.setUpdate_after(update_after);
			scosBusinessChooseDetail.setExt1(ext1);
			scosBusinessChooseDetail.setExt2(ext2);
			scosBusinessChooseDetail.setExt3(ext3);
		} catch (Exception e) {
			logger.error("解析[ScosBusinessChooseDetail]......异常！请检查字段是否书写准确" + e.getMessage());
			logger.error(jsonObj.toString());
			e.printStackTrace();
		}
		return scosBusinessChooseDetail;
	}

/*End*/
}
