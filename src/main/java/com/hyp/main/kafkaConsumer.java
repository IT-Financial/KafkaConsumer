package com.hyp.main;

import com.hyp.common.AppConfigManager;
import com.hyp.entity.*;
import com.hyp.util.ByteDecoderUtils;
import com.hyp.util.DateUtils;
import net.sf.json.JSONObject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Optional;

/**
 * @Description: 用一句话描述这个类的作用
 * @Date: 2019-04-02 19:00
 */

@Component
public class kafkaConsumer{

    @Autowired
    MyStartRunner myStartRunner;

    @Autowired
    AppConfigManager appConfigManager;

    private static final Logger logger = LoggerFactory.getLogger(kafkaConsumer.class);

    private long lastAoTimeMillis = System.currentTimeMillis();
    private long lastCrdAccTimeMillis = System.currentTimeMillis();
    private long lastCrdTrfTimeMillis = System.currentTimeMillis();
    private long lastOptAccTimeMillis = System.currentTimeMillis();
    private long lastOptTrfTimeMillis = System.currentTimeMillis();

    private long lastAccTimeMillis = System.currentTimeMillis();
    private long lastTrfTimeMillis = System.currentTimeMillis();
    private long lastCsTimeMillis = System.currentTimeMillis();
    private long lastFdTimeMillis = System.currentTimeMillis();
    private long lastFscTimeMillis = System.currentTimeMillis();
    private long lastOtrTimeMillis = System.currentTimeMillis();
    private long lastOcTimeMillis = System.currentTimeMillis();

    private long lastScosAtTimeMillis = System.currentTimeMillis();
    private long lastScosBaTimeMillis = System.currentTimeMillis();
    private long lastScosBcTimeMillis = System.currentTimeMillis();
    private long lastScosBsdTimeMillis = System.currentTimeMillis();
    private long lastUserPreTimeMillis = System.currentTimeMillis();
    private long lastBaseOrgTimeMillis = System.currentTimeMillis();
    private long lastMesstaskTimeMillis = System.currentTimeMillis();
    private long lastScosBusBasicTaskInfoTimeMillis = System.currentTimeMillis();

    private long lastUserAccountsTimeMillis = System.currentTimeMillis();
    private long lastBaseSysUserTimeMillis = System.currentTimeMillis();
    private long lastScosAuditLogTimeMillis = System.currentTimeMillis();
    private long lastScosAuditScheduleLogTimeMillis = System.currentTimeMillis();
    private long lastUserBusinessFlowTimeMillis = System.currentTimeMillis();
    private long lastScosBusinessChooseDetailMillis = System.currentTimeMillis();


    LinkedList<AccountOperation> accountOperations = new LinkedList<AccountOperation>();
    LinkedList<FundDetail> fundDetails = new LinkedList<FundDetail>();
    LinkedList<OlpayTradeRecord> olpayTradeRecords = new LinkedList<OlpayTradeRecord>();
    LinkedList<CrdBankAccInterface> crdBankAccInterfaces = new LinkedList<CrdBankAccInterface>();
    LinkedList<OptBankAccInterface> optBankAccInterfaces = new LinkedList<OptBankAccInterface>();
    LinkedList<CrdBankTrfInterface> crdBankTrfInterfaces = new LinkedList<CrdBankTrfInterface>();
    LinkedList<OptBankTrfInterface> optBankTrfInterfaces = new LinkedList<OptBankTrfInterface>();

    LinkedList<BankAccInterface> bankAccInterfaces = new LinkedList<BankAccInterface>();
    LinkedList<BankTrfInterface> bankTrfInterfaces = new LinkedList<BankTrfInterface>();
    LinkedList<CheckSummary> checkSummarys = new LinkedList<CheckSummary>();
    LinkedList<FundStockChange> fundStockChanges = new LinkedList<FundStockChange>();
    LinkedList<OtherChange> otherChanges = new LinkedList<OtherChange>();

    LinkedList<ScosAuditTask> scosAuditTasks = new LinkedList<ScosAuditTask>();
    LinkedList<ScosBusinessAccept> scosBusinessAccepts = new LinkedList<ScosBusinessAccept>();
    LinkedList<ScosBusinessChoose> scosBusinessChooses = new LinkedList<ScosBusinessChoose>();
    LinkedList<ScosBusScheduleDetail> scosBusScheduleDetails = new LinkedList<ScosBusScheduleDetail>();
    LinkedList<BaseOrganization> baseOrganizations = new LinkedList<BaseOrganization>();
    LinkedList<MessTask> messTasks = new LinkedList<MessTask>();
    LinkedList<UserPresence> userPresences = new LinkedList<UserPresence>();
    LinkedList<ScosBusBasicTaskInfo> scosBusBasicTaskInfos = new LinkedList<ScosBusBasicTaskInfo>();

    LinkedList<UserAccounts> userAccounts = new LinkedList<UserAccounts>();
    LinkedList<BaseSysUser> baseSysUsers  = new LinkedList<BaseSysUser>();
    LinkedList<ScosAuditLog> scosAuditLogs = new LinkedList<ScosAuditLog>();
    LinkedList<ScosAuditScheduleLog> scosAuditScheduleLogs = new LinkedList<ScosAuditScheduleLog>();
    LinkedList<UserBusinessFlow> userBusinessFlows = new LinkedList<UserBusinessFlow>();
    LinkedList<ScosBusinessChooseDetail> scosBusinessChooseDetails = new LinkedList<ScosBusinessChooseDetail>();

    /**
     * @param topic  topic
     */
    @KafkaListener(topics = "#{'${spring.kafka.listener_topics}'.split(',')}")
    public void doBankAccInterface(ConsumerRecord<?, ?> record, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
        //判断是否NULL
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            //获取消息
            Object message = kafkaMessage.get();
            //获取 partition
            int partition = record.partition();
            // 获取当前偏移量
            long offset = record.offset();
            // 消息长度
            int length   = record.serializedValueSize();
            // 数据获取时间
            String getTime = DateUtils.getDate("yyyy-MM-dd HH:mm:ss");

            exceute(message, partition, offset, length, topic, getTime);
        }
    }



    /**
     * 数据统一解析执行类
     * @param message
     */
    public void exceute(Object message, int partition, long offset, int length, String topic, String sGetTime){

        JSONObject jsonObject = JSONObject.fromObject(message);

        if (jsonObject!=null && jsonObject.length() > 0) {
            //获取表名
            String tableName = ByteDecoderUtils.getTableName(jsonObject);
            logger.debug("topic: " + topic + "  tableName: " + tableName + " offset: " + offset);

            if (topic.equalsIgnoreCase(appConfigManager.getAccountoperation()))
            {
                AccountOperation accountOperation = ByteDecoderUtils.getAccountOperation(jsonObject);
                accountOperation.setTopic_par(partition);
                accountOperation.setPar_offset(offset);
                accountOperation.setPayload_length(length);
                accountOperation.setGetTime(sGetTime);

                accountOperations.add(accountOperation);
                if ( (accountOperations.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastAoTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addAccountOperationList(accountOperations);
                    accountOperations.clear();
                    lastAoTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getFundDetail()))
            {
                FundDetail fundDetail = ByteDecoderUtils.getFundDetail(jsonObject);
                fundDetail.setTopic_par(partition);
                fundDetail.setPar_offset(offset);
                fundDetail.setPayload_length(length);
                fundDetail.setGetTime(sGetTime);

                fundDetails.add(fundDetail);
                if ( (fundDetails.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastFdTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addFundDetailList(fundDetails);
                    fundDetails.clear();
                    lastFdTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getOlpayTradeRecord()))
            {
                OlpayTradeRecord olpayTradeRecord = ByteDecoderUtils.getOlpayTradeRecord(jsonObject);
                olpayTradeRecord.setTopic_par(partition);
                olpayTradeRecord.setPar_offset(offset);
                olpayTradeRecord.setPayload_length(length);
                olpayTradeRecord.setGetTime(sGetTime);

                olpayTradeRecords.add(olpayTradeRecord);
                if ( (olpayTradeRecords.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastOtrTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addOlpayTradeRecordList(olpayTradeRecords);
                    olpayTradeRecords.clear();
                    lastOtrTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getCrd_bank_acc_interface()))
            {
                CrdBankAccInterface crdBankAccInterface = ByteDecoderUtils.getCrdBankAccInterface(jsonObject);
                crdBankAccInterface.setTopic_par(partition);
                crdBankAccInterface.setPar_offset(offset);
                crdBankAccInterface.setPayload_length(length);
                crdBankAccInterface.setGetTime(sGetTime);

                crdBankAccInterfaces.add(crdBankAccInterface);
                if ( (crdBankAccInterfaces.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastCrdAccTimeMillis > appConfigManager.getInterval())) {
                    myStartRunner.addCrdBankAccInterfaceList(crdBankAccInterfaces);
                    crdBankAccInterfaces.clear();
                    lastCrdAccTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.opt_bank_acc_interface))
            {
                OptBankAccInterface optBankAccInterface = ByteDecoderUtils.getOptBankAccInterface(jsonObject);
                optBankAccInterface.setTopic_par(partition);
                optBankAccInterface.setPar_offset(offset);
                optBankAccInterface.setPayload_length(length);
                optBankAccInterface.setGetTime(sGetTime);

                optBankAccInterfaces.add(optBankAccInterface);
                if ( (optBankAccInterfaces.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastOptAccTimeMillis > appConfigManager.getInterval())) {
                    myStartRunner.addOptBankAccInterfaceList(optBankAccInterfaces);
                    optBankAccInterfaces.clear();
                    lastOptAccTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getCrd_bank_trf_interface()))
            {
                CrdBankTrfInterface crdBankTrfInterface = ByteDecoderUtils.getCrdBankTrfInterface(jsonObject);
                crdBankTrfInterface.setPar_offset(offset);
                crdBankTrfInterface.setTopic_par(partition);
                crdBankTrfInterface.setPayload_length(length);
                crdBankTrfInterface.setGetTime(sGetTime);

                crdBankTrfInterfaces.add(crdBankTrfInterface);
                if ( (crdBankTrfInterfaces.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastCrdTrfTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addCrdBankTrfInterfaceList(crdBankTrfInterfaces);
                    bankTrfInterfaces.clear();
                    lastCrdTrfTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getOpt_bank_trf_interface()))
            {
                OptBankTrfInterface optBankTrfInterface = ByteDecoderUtils.getOptBankTrfInterface(jsonObject);
                optBankTrfInterface.setTopic_par(partition);
                optBankTrfInterface.setPar_offset(offset);
                optBankTrfInterface.setPayload_length(length);
                optBankTrfInterface.setGetTime(sGetTime);

                optBankTrfInterfaces.add(optBankTrfInterface);
                if ( (optBankTrfInterfaces.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastOptTrfTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addOptBankTrfInterfaceList(optBankTrfInterfaces);
                    optBankTrfInterfaces.clear();
                    lastOptTrfTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getBank_acc_interface()))  /*开始测试20190402*/
            {
                BankAccInterface bankAccInterface = ByteDecoderUtils.getBankAccInterface(jsonObject);
                bankAccInterface.setTopic_par(partition);
                bankAccInterface.setPar_offset(offset);
                bankAccInterface.setPayload_length(length);
                bankAccInterface.setGetTime(sGetTime);

                bankAccInterfaces.add(bankAccInterface);
                if ( (bankAccInterfaces.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastAccTimeMillis > appConfigManager.getInterval())) {
                    myStartRunner.addBankAccInterfaceList(bankAccInterfaces);
                    bankAccInterfaces.clear();
                    lastAccTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getBank_trf_interface()))
            {
                BankTrfInterface bankTrfInterface = ByteDecoderUtils.getBankTrfInterface(jsonObject);
                bankTrfInterface.setTopic_par(partition);
                bankTrfInterface.setPar_offset(offset);
                bankTrfInterface.setPayload_length(length);
                bankTrfInterface.setGetTime(sGetTime);

                bankTrfInterfaces.add(bankTrfInterface);
                if ( (bankTrfInterfaces.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastTrfTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addBankTrfInterfaceList(bankTrfInterfaces);
                    bankTrfInterfaces.clear();
                    lastTrfTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getCheck_summary()))
            {
                CheckSummary checkSummary = ByteDecoderUtils.getCheckSummary(jsonObject);
                checkSummary.setTopic_par(partition);
                checkSummary.setPar_offset(offset);
                checkSummary.setPayload_length(length);
                checkSummary.setGetTime(sGetTime);

                checkSummarys.add(checkSummary);
                if ( (checkSummarys.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastCsTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addCheckSummaryList(checkSummarys);
                    checkSummarys.clear();
                    lastCsTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getFund_stock_change()))
            {
                FundStockChange fundStockChange = ByteDecoderUtils.getFundStockChange(jsonObject);
                fundStockChange.setTopic_par(partition);
                fundStockChange.setPar_offset(offset);
                fundStockChange.setPayload_length(length);
                fundStockChange.setGetTime(sGetTime);

                fundStockChanges.add(fundStockChange);
                if ( (fundStockChanges.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastFscTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addFundStockChangeList(fundStockChanges);
                    fundStockChanges.clear();
                    lastFscTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getOther_change()))
            {
                OtherChange otherChange = ByteDecoderUtils.getOtherChange(jsonObject);
                otherChange.setTopic_par(partition);
                otherChange.setPar_offset(offset);
                otherChange.setPayload_length(length);
                otherChange.setGetTime(sGetTime);

                otherChanges.add(otherChange);
                if ( (otherChanges.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastOcTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addOtherChangeList(otherChanges);
                    otherChanges.clear();
                    lastOcTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_audit_task()))	/* 2019/04/12 新增账户相关八张表*/
            {
                ScosAuditTask scosAuditTask = ByteDecoderUtils.getScosAuditTask(jsonObject);
                scosAuditTask.setTopic_par(partition);
                scosAuditTask.setPar_offset(offset);
                scosAuditTask.setPayload_length(length);
                scosAuditTask.setGetTime(sGetTime);

                scosAuditTasks.add(scosAuditTask);
                if ( (scosAuditTasks.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosAtTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosAuditTaskList(scosAuditTasks);
                    scosAuditTasks.clear();
                    lastScosAtTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_business_accept()))
            {
                ScosBusinessAccept scosBusinessAccept = ByteDecoderUtils.getScosBusinessAccept(jsonObject);
                scosBusinessAccept.setTopic_par(partition);
                scosBusinessAccept.setPar_offset(offset);
                scosBusinessAccept.setPayload_length(length);
                scosBusinessAccept.setGetTime(sGetTime);

                scosBusinessAccepts.add(scosBusinessAccept);
                if ( (scosBusinessAccepts.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosBaTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosBusinessAcceptList(scosBusinessAccepts);
                    scosBusinessAccepts.clear();
                    lastScosBaTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_business_choose()))
            {
                ScosBusinessChoose scosBusinessChoose = ByteDecoderUtils.getScosBusinessChoose(jsonObject);
                scosBusinessChoose.setTopic_par(partition);
                scosBusinessChoose.setPar_offset(offset);
                scosBusinessChoose.setPayload_length(length);
                scosBusinessChoose.setGetTime(sGetTime);

                scosBusinessChooses.add(scosBusinessChoose);
                if ( (scosBusinessChooses.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosBcTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosBusinessChooseList(scosBusinessChooses);
                    scosBusinessChooses.clear();
                    lastScosBcTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_bus_schedule_detail()))
            {
                ScosBusScheduleDetail scosBusScheduleDetail = ByteDecoderUtils.getScosBusScheduleDetail(jsonObject);
                scosBusScheduleDetail.setTopic_par(partition);
                scosBusScheduleDetail.setPar_offset(offset);
                scosBusScheduleDetail.setPayload_length(length);
                scosBusScheduleDetail.setGetTime(sGetTime);

                scosBusScheduleDetails.add(scosBusScheduleDetail);
                if ( (scosBusScheduleDetails.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosBsdTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosBusScheduleDetailList(scosBusScheduleDetails);
                    scosBusScheduleDetails.clear();
                    lastScosBsdTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getUser_presence()))
            {
                UserPresence userPresence = ByteDecoderUtils.getUserPresence(jsonObject);
                userPresence.setTopic_par(partition);
                userPresence.setPar_offset(offset);
                userPresence.setPayload_length(length);
                userPresence.setGetTime(sGetTime);

                userPresences.add(userPresence);
                if ( (userPresences.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastUserPreTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addUserPresenceList(userPresences);
                    userPresences.clear();
                    lastUserPreTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getBase_organization()))
            {
                BaseOrganization baseOrganization = ByteDecoderUtils.getBaseOrganization(jsonObject);
                baseOrganization.setTopic_par(partition);
                baseOrganization.setPar_offset(offset);
                baseOrganization.setPayload_length(length);
                baseOrganization.setGetTime(sGetTime);

                baseOrganizations.add(baseOrganization);
                if ( (baseOrganizations.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastBaseOrgTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addBaseOrganizationList(baseOrganizations);
                    baseOrganizations.clear();
                    lastBaseOrgTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getMess_task()))
            {
                MessTask messTask = ByteDecoderUtils.getMessTask(jsonObject);
                messTask.setTopic_par(partition);
                messTask.setPar_offset(offset);
                messTask.setPayload_length(length);
                messTask.setGetTime(sGetTime);

                messTasks.add(messTask);
                if ( (messTasks.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastMesstaskTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addMessTaskList(messTasks);
                    messTasks.clear();
                    lastMesstaskTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_bus_basic_taskinfo()))
            {
                ScosBusBasicTaskInfo scosBusBasicTaskInfo = ByteDecoderUtils.getScosBusBasicTaskInfo(jsonObject);
                scosBusBasicTaskInfo.setTopic_par(partition);
                scosBusBasicTaskInfo.setPar_offset(offset);
                scosBusBasicTaskInfo.setPayload_length(length);
                scosBusBasicTaskInfo.setGetTime(sGetTime);

                scosBusBasicTaskInfos.add(scosBusBasicTaskInfo);
                if ( (scosBusBasicTaskInfos.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosBusBasicTaskInfoTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosBusBasicTaskInfoList(scosBusBasicTaskInfos);
                    scosBusBasicTaskInfos.clear();
                    lastScosBusBasicTaskInfoTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getUser_accounts())) /*2019/08/15新增运营监控五张表*/
            {
                UserAccounts userAccount = ByteDecoderUtils.getUserAccounts(jsonObject);
                userAccount.setTopic_par(partition);
                userAccount.setPar_offset(offset);
                userAccount.setPayload_length(length);
                userAccount.setGetTime(sGetTime);

                userAccounts.add(userAccount);
                if ( (userAccounts.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastUserAccountsTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addUserAccountsList(userAccounts);
                    userAccounts.clear();
                    lastUserAccountsTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getUser_business_flow()))
            {
                UserBusinessFlow userBusinessFlow = ByteDecoderUtils.getUserBusinessFlow(jsonObject);
                userBusinessFlow.setTopic_par(partition);
                userBusinessFlow.setPar_offset(offset);
                userBusinessFlow.setPayload_length(length);
                userBusinessFlow.setGetTime(sGetTime);

                userBusinessFlows.add(userBusinessFlow);
                if ( (userBusinessFlows.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastUserBusinessFlowTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addUserBusinessFlowList(userBusinessFlows);
                    userBusinessFlows.clear();
                    lastUserBusinessFlowTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getBase_sys_user()))
            {
                BaseSysUser baseSysUser = ByteDecoderUtils.getBaseSysUser(jsonObject);
                baseSysUser.setTopic_par(partition);
                baseSysUser.setPar_offset(offset);
                baseSysUser.setPayload_length(length);
                baseSysUser.setGetTime(sGetTime);

                baseSysUsers.add(baseSysUser);
                if ( (baseSysUsers.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastBaseSysUserTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addBaseSysUserList(baseSysUsers);
                    baseSysUsers.clear();
                    lastBaseSysUserTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_audit_log()))
            {
                ScosAuditLog scosAuditLog = ByteDecoderUtils.getScosAuditLog(jsonObject);
                scosAuditLog.setTopic_par(partition);
                scosAuditLog.setPar_offset(offset);
                scosAuditLog.setPayload_length(length);
                scosAuditLog.setGetTime(sGetTime);

                scosAuditLogs.add(scosAuditLog);
                if ( (scosAuditLogs.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosAuditLogTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosAuditLogList(scosAuditLogs);
                    scosAuditLogs.clear();
                    lastScosAuditLogTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_audit_schedule_log()))
            {
                ScosAuditScheduleLog scosAuditScheduleLog = ByteDecoderUtils.getScosAuditScheduleLog(jsonObject);
                scosAuditScheduleLog.setTopic_par(partition);
                scosAuditScheduleLog.setPar_offset(offset);
                scosAuditScheduleLog.setPayload_length(length);
                scosAuditScheduleLog.setGetTime(sGetTime);

                scosAuditScheduleLogs.add(scosAuditScheduleLog);
                if ( (scosAuditScheduleLogs.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosAuditScheduleLogTimeMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosAuditScheduleLogList(scosAuditScheduleLogs);
                    scosAuditScheduleLogs.clear();
                    lastScosAuditScheduleLogTimeMillis = System.currentTimeMillis();
                }
            }
            else if (topic.equalsIgnoreCase(appConfigManager.getScos_business_choose_detail())) // 2019/09/09
            {
                ScosBusinessChooseDetail scosBusinessChooseDetail = ByteDecoderUtils.getScosBusinessChooseDetail(jsonObject);
                scosBusinessChooseDetail.setTopic_par(partition);
                scosBusinessChooseDetail.setPar_offset(offset);
                scosBusinessChooseDetail.setPayload_length(length);
                scosBusinessChooseDetail.setGetTime(sGetTime);

                scosBusinessChooseDetails.add(scosBusinessChooseDetail);
                if ( (scosBusinessChooseDetails.size() == appConfigManager.getBatchSize()) || (System.currentTimeMillis() - lastScosBusinessChooseDetailMillis > appConfigManager.getInterval()) ) {
                    myStartRunner.addScosBusinessChooseDetailList(scosBusinessChooseDetails);
                    scosBusinessChooseDetails.clear();
                    lastScosBusinessChooseDetailMillis = System.currentTimeMillis();
                }
            }
            else
            {
                logger.error(">>>>>>>>>>>>没有找到对应的topic<<<<<<<<<<<<<,topic = " + topic);
            }
        }else {
            logger.error(">>>>>>>>空数据<<<<<<<<<<<");
        }
    }

/*End*/
}
