package com.hyp.main;

import com.hyp.common.AppConfigManager;
import com.hyp.dao.ITestDao;
import com.hyp.dao.MysqlHelperService;
import com.hyp.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @author HYP
 * @Description: 用一句话描述这个类的作用
 * @Date: 2019-04-03 19:10
 */

@Service("myStartRunner")
public class MyStartRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyStartRunner.class);

    @Autowired
    ITestDao testDao;

    @Autowired
    AppConfigManager appConfigManager;


    @Autowired
    MysqlHelperService mysqlHelperService;

    int iMaxThreshold = 5;
    int iMinThreshold = 1;


    LinkedList<AccountOperation> accountOperationList = new LinkedList<AccountOperation>();
    LinkedList<CrdBankAccInterface> crdBankAccInterfaceList = new LinkedList<CrdBankAccInterface>();
    LinkedList<CrdBankTrfInterface> crdBankTrfInterfaceList = new LinkedList<CrdBankTrfInterface>();
    LinkedList<OptBankAccInterface> optBankAccInterfaceList = new LinkedList<OptBankAccInterface>();
    LinkedList<OptBankTrfInterface> optBankTrfInterfaceList = new LinkedList<OptBankTrfInterface>();
    LinkedList<OlpayTradeRecord> olpayTradeRecordList = new LinkedList<OlpayTradeRecord>();
    LinkedList<FundDetail> fundDetailList = new LinkedList<FundDetail>();

    LinkedList<BankAccInterface> bankAccInterfaceList = new LinkedList<BankAccInterface>();
    LinkedList<BankTrfInterface> bankTrfInterfaceList = new LinkedList<BankTrfInterface>();
    LinkedList<CheckSummary> checkSummaryList = new LinkedList<CheckSummary>();
    LinkedList<FundStockChange> fundStockChangeList = new LinkedList<FundStockChange>();
    LinkedList<OtherChange> otherChangeList = new LinkedList<OtherChange>();

    LinkedList<ScosAuditTask> scosAuditTaskList = new LinkedList<ScosAuditTask>();
    LinkedList<ScosBusinessAccept> scosBusinessAcceptList = new LinkedList<ScosBusinessAccept>();
    LinkedList<ScosBusinessChoose> scosBusinessChooseList = new LinkedList<ScosBusinessChoose>();
    LinkedList<ScosBusScheduleDetail> scosBusScheduleDetailList = new LinkedList<ScosBusScheduleDetail>();
    LinkedList<UserPresence> userPresenceList = new LinkedList<UserPresence>();
    LinkedList<BaseOrganization> baseOrganizationList = new LinkedList<BaseOrganization>();
    LinkedList<MessTask> messTaskList = new LinkedList<MessTask>();
    LinkedList<ScosBusBasicTaskInfo> scosBusBasicTaskInfoList = new LinkedList<ScosBusBasicTaskInfo>();

    /*2019/08/15*/
    LinkedList<UserAccounts> userAccountsList = new LinkedList<UserAccounts>();
    LinkedList<BaseSysUser>  baseSysUserList = new LinkedList<BaseSysUser>();
    LinkedList<ScosAuditScheduleLog> scosAuditScheduleLogList = new LinkedList<ScosAuditScheduleLog>();
    LinkedList<UserBusinessFlow> userBusinessFlowList = new LinkedList<UserBusinessFlow>();
    LinkedList<ScosAuditLog> scosAuditLogList = new LinkedList<ScosAuditLog>();

    /*2019/09/09*/
    LinkedList<ScosBusinessChooseDetail> scosBusinessChooseDetailList = new LinkedList<ScosBusinessChooseDetail>();


    @Override
    public void run(ApplicationArguments args) throws Exception {

        /**
         * 启动入库线程
         */
        Thread accountOperationThread = new Thread(new AccountOperationToDb());
        accountOperationThread.start();

        Thread crdBankAccInterfaceThread = new Thread(new CrdBankAccInterfaceToDb());
        crdBankAccInterfaceThread.start();

        Thread crdBankTrfInterfaceThread = new Thread(new CrdBankTrfInterfaceToDb());
        crdBankTrfInterfaceThread.start();

        Thread optBankAccInterfaceThread = new Thread(new OptBankAccInterfaceToDb());
        optBankAccInterfaceThread.start();

        Thread optBankTrfInterfaceThread = new Thread(new OptBankTrfInterfaceToDb());
        optBankTrfInterfaceThread.start();

        Thread olpayTradeRecordThread = new Thread(new OlpayTradeRecordToDb());
        olpayTradeRecordThread.start();

        Thread fundDetailThread = new Thread(new FundDetailToDb());
        fundDetailThread.start();

        Thread checkSummaryThread = new Thread(new CheckSummaryToDb());
        checkSummaryThread.start();

        Thread bankTrfInterfaceThread = new Thread(new BankTrfInterfaceToDb());
        bankTrfInterfaceThread.start();

        Thread bankAccInterfaceThread = new Thread(new BankAccInterfaceToDb());
        bankAccInterfaceThread.start();

        Thread fundStockChangeThread = new Thread(new FundStockChangeToDb());
        fundStockChangeThread.start();

        Thread OtherChangeThread = new Thread(new OtherChangeToDb());
        OtherChangeThread.start();

        // **** 账户
        Thread ScosAuditTaskThread = new Thread(new ScosAuditTaskToDb());
        ScosAuditTaskThread.start();

        Thread ScosBusinessAcceptThread = new Thread(new ScosBusinessAcceptToDb());
        ScosBusinessAcceptThread.start();

        Thread ScosBusinessChooseThread = new Thread(new ScosBusinessChooseToDb());
        ScosBusinessChooseThread.start();

        Thread ScosBusScheduleDetailThread = new Thread(new ScosBusScheduleDetailToDb());
        ScosBusScheduleDetailThread.start();

        Thread BaseOrganizationThread = new Thread(new BaseOrganizationToDb());
        BaseOrganizationThread.start();

        Thread MessTaskThread = new Thread(new MessTaskToDb());
        MessTaskThread.start();

        Thread UserPresenceThread = new Thread(new UserPresenceToDb());
        UserPresenceThread.start();

        Thread ScosBusBasicTaskInfoThread = new Thread(new ScosBusBasicTaskInfoToDb());
        ScosBusBasicTaskInfoThread.start();

        /*运营监控 0815*/
        Thread BaseSysUserThread = new Thread(new BaseSysUserToDb());
        BaseSysUserThread.start();

        Thread UserAccountsThread = new Thread(new UserAccountsToDb());
        UserAccountsThread.start();

        Thread ScosAuditScheduleLogThread = new Thread(new ScosAuditScheduleLogToDb());
        ScosAuditScheduleLogThread.start();

        Thread ScosAuditLogThread = new Thread(new ScosAuditLogToDb());
        ScosAuditLogThread.start();

        Thread UserBusinessFlowThread = new Thread(new UserBusinessFlowToDb());
        UserBusinessFlowThread.start();

        // 0909
        Thread ScosBusinessChooseDetailThread = new Thread(new ScosBusinessChooseDetailToDb());
        ScosBusinessChooseDetailThread.start();
    }


    /**
     * 把数据添加到list缓存
     */
    public void addAccountOperationList(List<AccountOperation> accountOperations) {
        if (accountOperations != null && accountOperations.size() > 0) {
            synchronized (accountOperationList) {
                accountOperationList.addAll(accountOperations);
                accountOperationList.notifyAll();
            }
        }

        while (accountOperationList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (accountOperationList) {
                try {
                    accountOperationList.wait();
                } catch (Exception e) {
                    logger.error(">>[addAccountOperationList]等待[accountOperationList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<AccountOperation> getAccountOperationList(int batchSize){
        List<AccountOperation> aoList = new LinkedList<AccountOperation>();
        int i = 0;
        int size = 0;
        synchronized (accountOperationList) {
            while (accountOperationList.isEmpty()) {
                try {
                    accountOperationList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[AccountOperation]异常：" + e.getMessage());
                }
            }
            while (!accountOperationList.isEmpty() && i < batchSize) {
                aoList.add(accountOperationList.poll());
                i ++;
            }
            size = accountOperationList.size();
        }
        logger.info("取[AccountOperation]数据缓存：" + aoList.size() + "条,剩余：" + size);

        if (accountOperationList.size() <= batchSize * iMinThreshold ) {
            synchronized (accountOperationList) {
                accountOperationList.notifyAll();
            }
        }
        return aoList;
    }

    public void addCrdBankAccInterfaceList(List<CrdBankAccInterface> crdBankAccInterfaces) {
        if (crdBankAccInterfaces != null && crdBankAccInterfaces.size() > 0) {
            synchronized (crdBankAccInterfaceList) {
                crdBankAccInterfaceList.addAll(crdBankAccInterfaces);
                crdBankAccInterfaceList.notifyAll();
            }
        }

        while (crdBankAccInterfaceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (crdBankAccInterfaceList) {
                try {
                    crdBankAccInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addCrdBankAccInterfaceList]等待[crdBankAccInterfaceList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<CrdBankAccInterface> getCrdBankAccInterfaceList(int batchSize){
        List<CrdBankAccInterface> baiList = new LinkedList<CrdBankAccInterface>();
        int i = 0;
        int size = 0;
        synchronized (crdBankAccInterfaceList) {
            while (crdBankAccInterfaceList.isEmpty()) {
                try {
                    crdBankAccInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[BankAccInterface]异常：" + e.getMessage());
                }
            }
            while (!crdBankAccInterfaceList.isEmpty() && i < batchSize) {
                baiList.add(crdBankAccInterfaceList.poll());
                i ++;
            }
            size = crdBankAccInterfaceList.size();
        }
        logger.info("取[crdBankAccInterfaceList]数据缓存：" + baiList.size() + "条,剩余：" + size);

        if (crdBankAccInterfaceList.size() <= batchSize * iMinThreshold ) {
            synchronized (crdBankAccInterfaceList) {
                crdBankAccInterfaceList.notifyAll();
            }
        }
        return baiList;
    }


    public void addOptBankAccInterfaceList(List<OptBankAccInterface> optBankAccInterfaces) {
        if (optBankAccInterfaces != null && optBankAccInterfaces.size() > 0) {
            synchronized (optBankAccInterfaceList) {
                optBankAccInterfaceList.addAll(optBankAccInterfaces);
                optBankAccInterfaceList.notifyAll();
            }
        }

        while (optBankAccInterfaceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (optBankAccInterfaceList) {
                try {
                    optBankAccInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addOptBankAccInterfaceList]等待[optBankAccInterfaceList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<OptBankAccInterface> getOptBankAccInterfaceList(int batchSize){
        List<OptBankAccInterface> baiList = new LinkedList<OptBankAccInterface>();
        int i = 0;
        int size = 0;
        synchronized (optBankAccInterfaceList) {
            while (optBankAccInterfaceList.isEmpty()) {
                try {
                    optBankAccInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[optBankAccInterfaceList]异常：" + e.getMessage());
                }
            }
            while (!optBankAccInterfaceList.isEmpty() && i < batchSize) {
                baiList.add(optBankAccInterfaceList.poll());
                i ++;
            }
            size = optBankAccInterfaceList.size();
        }
        logger.info("取[optBankAccInterfaceList]数据缓存：" + baiList.size() + "条,剩余：" + size);

        if (optBankAccInterfaceList.size() <= batchSize * iMinThreshold ) {
            synchronized (optBankAccInterfaceList) {
                optBankAccInterfaceList.notifyAll();
            }
        }
        return baiList;
    }


    public void addCrdBankTrfInterfaceList(List<CrdBankTrfInterface> crdBankTrfInterfaces) {
        if (crdBankTrfInterfaces != null && crdBankTrfInterfaces.size() > 0) {
            synchronized (crdBankTrfInterfaceList) {
                crdBankTrfInterfaceList.addAll(crdBankTrfInterfaces);
                crdBankTrfInterfaceList.notifyAll();
            }
        }

        while (crdBankTrfInterfaceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (crdBankTrfInterfaceList) {
                try {
                    crdBankTrfInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addCrdBankTrfInterfaceList]等待[crdBankTrfInterfaceList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<CrdBankTrfInterface> getCrdBankTrfInterfaceList(int batchSize){
        List<CrdBankTrfInterface> baiList = new LinkedList<CrdBankTrfInterface>();
        int i = 0;
        int size = 0;
        synchronized (crdBankTrfInterfaceList) {
            while (crdBankTrfInterfaceList.isEmpty()) {
                try {
                    crdBankTrfInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[crdBankTrfInterfaceList]异常：" + e.getMessage());
                }
            }
            while (!crdBankTrfInterfaceList.isEmpty() && i < batchSize) {
                baiList.add(crdBankTrfInterfaceList.poll());
                i ++;
            }
            size = crdBankTrfInterfaceList.size();
        }
        logger.info("取[crdBankTrfInterfaceList]数据缓存：" + baiList.size() + "条,剩余：" + size);

        if (crdBankTrfInterfaceList.size() <= batchSize * iMinThreshold ) {
            synchronized (crdBankTrfInterfaceList) {
                crdBankTrfInterfaceList.notifyAll();
            }
        }
        return baiList;
    }


    public void addOptBankTrfInterfaceList(List<OptBankTrfInterface> optBankTrfInterfaces) {
        if (optBankTrfInterfaces != null && optBankTrfInterfaces.size() > 0) {
            synchronized (optBankTrfInterfaceList) {
                optBankTrfInterfaceList.addAll(optBankTrfInterfaces);
                optBankTrfInterfaceList.notifyAll();
            }
        }

        while (optBankTrfInterfaceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (optBankTrfInterfaceList) {
                try {
                    optBankTrfInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addOptBankTrfInterfaceList]等待[optBankTrfInterfaceList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<OptBankTrfInterface> getOptBankTrfInterfaceList(int batchSize){
        List<OptBankTrfInterface> baiList = new LinkedList<OptBankTrfInterface>();
        int i = 0;
        int size = 0;
        synchronized (optBankTrfInterfaceList) {
            while (optBankTrfInterfaceList.isEmpty()) {
                try {
                    optBankTrfInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[optBankTrfInterfaceList]异常：" + e.getMessage());
                }
            }
            while (!optBankTrfInterfaceList.isEmpty() && i < batchSize) {
                baiList.add(optBankTrfInterfaceList.poll());
                i ++;
            }
            size = optBankTrfInterfaceList.size();
        }
        logger.info("取[optBankTrfInterfaceList]数据缓存：" + baiList.size() + "条,剩余：" + size);

        if (optBankTrfInterfaceList.size() <= batchSize * iMinThreshold ) {
            synchronized (optBankTrfInterfaceList) {
                optBankTrfInterfaceList.notifyAll();
            }
        }
        return baiList;
    }


    public void addBankAccInterfaceList(List<BankAccInterface> bankAccInterfaces) {
        if (bankAccInterfaces != null && bankAccInterfaces.size() > 0) {
            synchronized (bankAccInterfaceList) {
                bankAccInterfaceList.addAll(bankAccInterfaces);
                bankAccInterfaceList.notifyAll();
            }
        }

        while (bankAccInterfaceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (bankAccInterfaceList) {
                try {
                    bankAccInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addBankAccInterfaceList]等待[bankAccInterfaceList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<BankAccInterface> getBankAccInterfaceList(int batchSize){
        List<BankAccInterface> baiList = new LinkedList<BankAccInterface>();
        int i = 0;
        int size = 0;
        synchronized (bankAccInterfaceList) {
            while (bankAccInterfaceList.isEmpty()) {
                try {
                    bankAccInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[BankAccInterface]异常：" + e.getMessage());
                }
            }
            while (!bankAccInterfaceList.isEmpty() && i < batchSize) {
                baiList.add(bankAccInterfaceList.poll());
                i ++;
            }
            size = bankAccInterfaceList.size();
        }
        logger.info("取[BankAccInterface]数据缓存：" + baiList.size() + "条,剩余：" + size);

        if (bankAccInterfaceList.size() <= batchSize * iMinThreshold ) {
            synchronized (bankAccInterfaceList) {
                bankAccInterfaceList.notifyAll();
            }
        }
        return baiList;
    }

    public void addBankTrfInterfaceList(List<BankTrfInterface> bankTrfInterfaces) {
        if (bankTrfInterfaces != null && bankTrfInterfaces.size() > 0) {
            synchronized (bankTrfInterfaceList) {
                bankTrfInterfaceList.addAll(bankTrfInterfaces);
                bankTrfInterfaceList.notifyAll();
            }
        }

        while (bankTrfInterfaceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (bankTrfInterfaceList) {
                try {
                    bankTrfInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addBankTrfInterfaceList]等待[bankTrfInterfaceList]异常：" + e.getMessage());
                }
            }
        }
    }


    /**
     * 取缓存
     */
    public List<BankTrfInterface> getBankTrfInterfaceList(int batchSize){
        List<BankTrfInterface> btiList = new LinkedList<BankTrfInterface>();
        int i = 0;
        int size = 0;
        synchronized (bankTrfInterfaceList) {
            while (bankTrfInterfaceList.isEmpty()) {
                try {
                    bankTrfInterfaceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[BankTrfInterface]异常：" + e.getMessage());
                }
            }
            while (!bankTrfInterfaceList.isEmpty() && i < batchSize) {
                btiList.add(bankTrfInterfaceList.poll());
                i ++;
            }
            size = bankTrfInterfaceList.size();
        }
        logger.info("取[BankTrfInterface]数据缓存：" + btiList.size() + "条,剩余：" + size);

        if (bankTrfInterfaceList.size() <= batchSize * iMinThreshold ) {
            synchronized (bankTrfInterfaceList) {
                bankTrfInterfaceList.notifyAll();
            }
        }
        return btiList;
    }

    public void addCheckSummaryList(List<CheckSummary> checkSummarys) {
        if (checkSummarys != null && checkSummarys.size() > 0) {
            synchronized (checkSummaryList) {
                checkSummaryList.addAll(checkSummarys);
                checkSummaryList.notifyAll();
            }
        }

        while (checkSummaryList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (checkSummaryList) {
                try {
                    checkSummaryList.wait();
                } catch (Exception e) {
                    logger.error(">>[addCheckSummaryList]等待[checkSummaryList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<CheckSummary> getCheckSummaryList(int batchSize){
        List<CheckSummary> csList = new LinkedList<CheckSummary>();
        int i = 0;
        int size = 0;
        synchronized (checkSummaryList) {
            while (checkSummaryList.isEmpty()) {
                try {
                    checkSummaryList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[CheckSummary]异常：" + e.getMessage());
                }
            }
            while (!checkSummaryList.isEmpty() && i < batchSize) {
                csList.add(checkSummaryList.poll());
                i ++;
            }
            size = checkSummaryList.size();
        }
        logger.info("取[CheckSummary]数据缓存：" + csList.size() + "条,剩余：" + size);

        if (checkSummaryList.size() <= batchSize * iMinThreshold ) {
            synchronized (checkSummaryList) {
                checkSummaryList.notifyAll();
            }
        }
        return csList;
    }

    public void addFundDetailList(List<FundDetail> fundDetails) {
        if (fundDetails != null && fundDetails.size() > 0) {
            synchronized (fundDetailList) {
                fundDetailList.addAll(fundDetails);
                fundDetailList.notifyAll();
            }
        }

        while (fundDetailList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (fundDetailList) {
                try {
                    fundDetailList.wait();
                } catch (Exception e) {
                    logger.error(">>[addFundDetailList]等待[fundDetailList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<FundDetail> getFundDetailList(int batchSize){
        List<FundDetail> fdList = new LinkedList<FundDetail>();
        int i = 0;
        int size = 0;
        synchronized (fundDetailList) {
            while (fundDetailList.isEmpty()) {
                try {
                    fundDetailList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[FundDetail]异常：" + e.getMessage());
                }
            }
            while (!fundDetailList.isEmpty() && i < batchSize) {
                fdList.add(fundDetailList.poll());
                i ++;
            }
            size = fundDetailList.size();
        }
        logger.info("取[FundDetail]数据缓存：" + fdList.size() + "条,剩余：" + size);

        if (fundDetailList.size() <= batchSize * iMinThreshold) {
            synchronized (fundDetailList) {
                fundDetailList.notifyAll();
            }
        }
        return fdList;
    }

    public void addFundStockChangeList(List<FundStockChange> fundStockChanges) {
        if (fundStockChanges != null && fundStockChanges.size() > 0) {
            synchronized (fundStockChangeList) {
                fundStockChangeList.addAll(fundStockChanges);
                fundStockChangeList.notifyAll();
            }
        }

        while (fundStockChangeList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (fundStockChangeList) {
                try {
                    fundStockChangeList.wait();
                } catch (Exception e) {
                    logger.error(">>[addFundStockChangeList]等待[fundStockChangeList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<FundStockChange> getFundStockChangeList(int batchSize){
        List<FundStockChange> fscList = new LinkedList<FundStockChange>();
        int i = 0;
        int size = 0;
        synchronized (fundStockChangeList) {
            while (fundStockChangeList.isEmpty()) {
                try {
                    fundStockChangeList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[FundStockChange]异常：" + e.getMessage());
                }
            }
            while (!fundStockChangeList.isEmpty() && i < batchSize) {
                fscList.add(fundStockChangeList.poll());
                i ++;
            }
            size = fundStockChangeList.size();
        }
        logger.info("取[FundStockChange]数据缓存：" + fscList.size() + "条,剩余：" + size);

        if (fundStockChangeList.size() <= batchSize * iMinThreshold ) {
            synchronized (fundStockChangeList) {
                fundStockChangeList.notifyAll();
            }
        }
        return fscList;
    }

    public void addOlpayTradeRecordList(List<OlpayTradeRecord> olpayTradeRecords) {
        if (olpayTradeRecords != null && olpayTradeRecords.size() > 0) {
            synchronized (olpayTradeRecordList) {
                olpayTradeRecordList.addAll(olpayTradeRecords);
                olpayTradeRecordList.notifyAll();
            }
        }

        while (olpayTradeRecordList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (olpayTradeRecordList) {
                try {
                    olpayTradeRecordList.wait();
                } catch (Exception e) {
                    logger.error(">>[addOlpayTradeRecordList]等待[olpayTradeRecordList]异常：" + e.getMessage());
                }
            }
        }
    }


    /**
     * 取缓存
     */
    public List<OlpayTradeRecord> getOlpayTradeRecordList(int batchSize){
        List<OlpayTradeRecord> otrList = new LinkedList<OlpayTradeRecord>();
        int i = 0;
        int size = 0;
        synchronized (olpayTradeRecordList) {
            while (olpayTradeRecordList.isEmpty()) {
                try {
                    olpayTradeRecordList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[OlpayTradeRecord]异常：" + e.getMessage());
                }
            }
            while (!olpayTradeRecordList.isEmpty() && i < batchSize) {
                otrList.add(olpayTradeRecordList.poll());
                i ++;
            }
            size = olpayTradeRecordList.size();
        }
        logger.info("取[OlpayTradeRecord]数据缓存：" + otrList.size() + "条,剩余：" + size);

        if (olpayTradeRecordList.size() <= batchSize * iMinThreshold ) {
            synchronized (olpayTradeRecordList) {
                olpayTradeRecordList.notifyAll();
            }
        }
        return otrList;
    }

    public void addOtherChangeList(List<OtherChange> otherChanges) {
        if (otherChanges != null && otherChanges.size() > 0) {
            synchronized (otherChangeList) {
                otherChangeList.addAll(otherChanges);
                otherChangeList.notifyAll();
            }
        }

        while (otherChangeList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (otherChangeList) {
                try {
                    otherChangeList.wait();
                } catch (Exception e) {
                    logger.error(">>[addOtherChangeList]等待[otherChangeList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<OtherChange> getOtherChangeList(int batchSize){
        List<OtherChange> ocList = new LinkedList<OtherChange>();
        int i = 0;
        int size = 0;
        synchronized (otherChangeList) {
            while (otherChangeList.isEmpty()) {
                try {
                    otherChangeList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[OtherChange]异常：" + e.getMessage());
                }
            }
            while (!otherChangeList.isEmpty() && i < batchSize) {
                ocList.add(otherChangeList.poll());
                i ++;
            }
            size = otherChangeList.size();
        }
        logger.info("取[OtherChange]数据缓存：" + ocList.size() + "条,剩余：" + size);

        if (otherChangeList.size() <= batchSize * iMinThreshold ) {
            synchronized (otherChangeList) {
                otherChangeList.notifyAll();
            }
        }
        return ocList;
    }

    /*
       2019/04/12
       新增账户相关八张表
     */
    public void addScosAuditTaskList(List<ScosAuditTask> scosAuditTasks) {
        if (scosAuditTasks != null && scosAuditTasks.size() > 0) {
            synchronized (scosAuditTaskList) {
                scosAuditTaskList.addAll(scosAuditTasks);
                scosAuditTaskList.notifyAll();
            }
        }

        while (scosAuditTaskList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosAuditTaskList) {
                try {
                    scosAuditTaskList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosAuditTaskList]等待[scosAuditTaskList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<ScosAuditTask> getScosAuditTasksList(int batchSize){
        List<ScosAuditTask> satList = new LinkedList<ScosAuditTask>();
        int i = 0;
        int size = 0;
        synchronized (scosAuditTaskList) {
            while (scosAuditTaskList.isEmpty()) {
                try {
                    scosAuditTaskList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosAuditTask]异常：" + e.getMessage());
                }
            }
            while (!scosAuditTaskList.isEmpty() && i < batchSize) {
                satList.add(scosAuditTaskList.poll());
                i ++;
            }
            size = scosAuditTaskList.size();
        }
        logger.info("取[ScosAuditTask]数据缓存：" + satList.size() + "条,剩余：" + size);

        if (scosAuditTaskList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosAuditTaskList) {
                scosAuditTaskList.notifyAll();
            }
        }
        return satList;
    }

    public void addScosBusinessAcceptList(List<ScosBusinessAccept> scosBusinessAccepts) {
        if (scosBusinessAccepts != null && scosBusinessAccepts.size() > 0) {
            synchronized (scosBusinessAcceptList) {
                scosBusinessAcceptList.addAll(scosBusinessAccepts);
                scosBusinessAcceptList.notifyAll();
            }
        }

        while (scosBusinessAcceptList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosBusinessAcceptList) {
                try {
                    scosBusinessAcceptList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosBusinessAcceptList]等待[scosBusinessAcceptList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<ScosBusinessAccept> getScosBusinessAcceptList(int batchSize){
        List<ScosBusinessAccept> sbaList = new LinkedList<ScosBusinessAccept>();
        int i = 0;
        int size = 0;
        synchronized (scosBusinessAcceptList) {
            while (scosBusinessAcceptList.isEmpty()) {
                try {
                    scosBusinessAcceptList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosBusinessAccept]异常：" + e.getMessage());
                }
            }
            while (!scosBusinessAcceptList.isEmpty() && i < batchSize) {
                sbaList.add(scosBusinessAcceptList.poll());
                i ++;
            }
            size = scosBusinessAcceptList.size();
        }
        logger.info("取[ScosBusinessAccept]数据缓存：" + sbaList.size() + "条,剩余：" + size);

        if (scosBusinessAcceptList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosBusinessAcceptList) {
                scosBusinessAcceptList.notifyAll();
            }
        }
        return sbaList;
    }

    public void addScosBusinessChooseList(List<ScosBusinessChoose> scosBusinessChooses) {
        if (scosBusinessChooses != null && scosBusinessChooses.size() > 0) {
            synchronized (scosBusinessChooseList) {
                scosBusinessChooseList.addAll(scosBusinessChooses);
                scosBusinessChooseList.notifyAll();
            }
        }

        while (scosBusinessChooseList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosBusinessChooseList) {
                try {
                    scosBusinessChooseList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosBusinessChooseList]等待[scosBusinessChooseList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<ScosBusinessChoose> getScosBusinessChooseList(int batchSize){
        List<ScosBusinessChoose> sbcList = new LinkedList<ScosBusinessChoose>();
        int i = 0;
        int size = 0;
        synchronized (scosBusinessChooseList) {
            while (scosBusinessChooseList.isEmpty()) {
                try {
                    scosBusinessChooseList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosBusinessChoose]异常：" + e.getMessage());
                }
            }
            while (!scosBusinessChooseList.isEmpty() && i < batchSize) {
                sbcList.add(scosBusinessChooseList.poll());
                i ++;
            }
            size = scosBusinessChooseList.size();
        }
        logger.info("取[ScosBusinessChoose]数据缓存：" + sbcList.size() + "条,剩余：" + size);

        if (scosBusinessChooseList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosBusinessChooseList) {
                scosBusinessChooseList.notifyAll();
            }
        }
        return sbcList;
    }

    public void addScosBusScheduleDetailList(List<ScosBusScheduleDetail> scosBusScheduleDetails) {
        if (scosBusScheduleDetails != null && scosBusScheduleDetails.size() > 0) {
            synchronized (scosBusScheduleDetailList) {
                scosBusScheduleDetailList.addAll(scosBusScheduleDetails);
                scosBusScheduleDetailList.notifyAll();
            }
        }

        while (scosBusScheduleDetailList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosBusScheduleDetailList) {
                try {
                    scosBusScheduleDetailList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosBusScheduleDetailList]等待[scosBusScheduleDetailList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<ScosBusScheduleDetail> getScosBusScheduleDetailList(int batchSize){
        List<ScosBusScheduleDetail> sbsdList = new LinkedList<ScosBusScheduleDetail>();
        int i = 0;
        int size = 0;
        synchronized (scosBusScheduleDetailList) {
            while (scosBusScheduleDetailList.isEmpty()) {
                try {
                    scosBusScheduleDetailList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosBusScheduleDetail]异常：" + e.getMessage());
                }
            }
            while (!scosBusScheduleDetailList.isEmpty() && i < batchSize) {
                sbsdList.add(scosBusScheduleDetailList.poll());
                i ++;
            }
            size = scosBusScheduleDetailList.size();
        }
        logger.info("取[ScosBusScheduleDetail]数据缓存：" + sbsdList.size() + "条,剩余：" + size);

        if (scosBusScheduleDetailList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosBusScheduleDetailList) {
                scosBusScheduleDetailList.notifyAll();
            }
        }
        return sbsdList;
    }

    public void addUserPresenceList(List<UserPresence> userPresences) {
        if (userPresences != null && userPresences.size() > 0) {
            synchronized (userPresenceList) {
                userPresenceList.addAll(userPresences);
                userPresenceList.notifyAll();
            }
        }

        while (userPresenceList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (userPresenceList) {
                try {
                    userPresenceList.wait();
                } catch (Exception e) {
                    logger.error(">>[addUserPresenceList]等待[userPresenceList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<UserPresence> getUserPresenceList(int batchSize){
        List<UserPresence> upList = new LinkedList<UserPresence>();
        int i = 0;
        int size = 0;
        synchronized (userPresenceList) {
            while (userPresenceList.isEmpty()) {
                try {
                    userPresenceList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[UserPresence]异常：" + e.getMessage());
                }
            }
            while (!userPresenceList.isEmpty() && i < batchSize) {
                upList.add(userPresenceList.poll());
                i ++;
            }
            size = userPresenceList.size();
        }
        logger.info("取[UserPresence]数据缓存：" + upList.size() + "条,剩余：" + size);

        if (userPresenceList.size() <= batchSize * iMinThreshold ) {
            synchronized (userPresenceList) {
                userPresenceList.notifyAll();
            }
        }
        return upList;
    }

    public void addBaseOrganizationList(List<BaseOrganization> baseOrganizations) {
        if (baseOrganizations != null && baseOrganizations.size() > 0) {
            synchronized (baseOrganizationList) {
                baseOrganizationList.addAll(baseOrganizations);
                baseOrganizationList.notifyAll();
            }
        }

        while (baseOrganizationList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (baseOrganizationList) {
                try {
                    baseOrganizationList.wait();
                } catch (Exception e) {
                    logger.error(">>[addBaseOrganizationList]等待[baseOrganizationList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<BaseOrganization> getBaseOrganizationList(int batchSize){
        List<BaseOrganization> boList = new LinkedList<BaseOrganization>();
        int i = 0;
        int size = 0;
        synchronized (baseOrganizationList) {
            while (baseOrganizationList.isEmpty()) {
                try {
                    baseOrganizationList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[BaseOrganization]异常：" + e.getMessage());
                }
            }
            while (!baseOrganizationList.isEmpty() && i < batchSize) {
                boList.add(baseOrganizationList.poll());
                i ++;
            }
            size = baseOrganizationList.size();
        }
        logger.info("取[BaseOrganization]数据缓存：" + boList.size() + "条,剩余：" + size);

        if (baseOrganizationList.size() <= batchSize * iMinThreshold ) {
            synchronized (baseOrganizationList) {
                baseOrganizationList.notifyAll();
            }
        }
        return boList;
    }

    public void addMessTaskList(List<MessTask> messTasks) {
        if (messTasks != null && messTasks.size() > 0) {
            synchronized (messTaskList) {
                messTaskList.addAll(messTasks);
                messTaskList.notifyAll();
            }
        }

        while (messTaskList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (messTaskList) {
                try {
                    messTaskList.wait();
                } catch (Exception e) {
                    logger.error(">>[addMessTaskList]等待[messTaskList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<MessTask> getMessTaskList(int batchSize){
        List<MessTask> mtList = new LinkedList<MessTask>();
        int i = 0;
        int size = 0;
        synchronized (messTaskList) {
            while (messTaskList.isEmpty()) {
                try {
                    messTaskList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[MessTask]异常：" + e.getMessage());
                }
            }
            while (!messTaskList.isEmpty() && i < batchSize) {
                mtList.add(messTaskList.poll());
                i++;
            }
            size = messTaskList.size();
        }
        logger.info("取[MessTask]数据缓存：" + mtList.size() + "条,剩余：" + size);

        if (messTaskList.size() <= batchSize * iMinThreshold ) {
            synchronized (messTaskList) {
                messTaskList.notifyAll();
            }
        }
        return mtList;
    }

    public void addScosBusBasicTaskInfoList(List<ScosBusBasicTaskInfo> scosBusBasicTaskInfos) {
        if (scosBusBasicTaskInfos != null && scosBusBasicTaskInfos.size() > 0) {
            synchronized (scosBusBasicTaskInfoList) {
                scosBusBasicTaskInfoList.addAll(scosBusBasicTaskInfos);
                scosBusBasicTaskInfoList.notifyAll();
            }
        }

        while (scosBusBasicTaskInfoList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosBusBasicTaskInfoList) {
                try {
                    scosBusBasicTaskInfoList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosBusBasicTaskInfoList]等待[scosBusBasicTaskInfoList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<ScosBusBasicTaskInfo> getScosBusBasicTaskInfoList(int batchSize){
        List<ScosBusBasicTaskInfo> sbbtList = new LinkedList<ScosBusBasicTaskInfo>();
        int i = 0;
        int size = 0;
        synchronized (scosBusBasicTaskInfoList) {
            while (scosBusBasicTaskInfoList.isEmpty()) {
                try {
                    scosBusBasicTaskInfoList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosBusBasicTaskInfo]异常：" + e.getMessage());
                }
            }
            while (!scosBusBasicTaskInfoList.isEmpty() && i < batchSize) {
                sbbtList.add(scosBusBasicTaskInfoList.poll());
                i ++;
            }
            size = scosBusBasicTaskInfoList.size();
        }
        logger.info("取[ScosBusBasicTaskInfo]数据缓存：" + sbbtList.size() + "条,剩余：" + size);

        if (scosBusBasicTaskInfoList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosBusBasicTaskInfoList) {
                scosBusBasicTaskInfoList.notifyAll();
            }
        }
        return sbbtList;
    }

    /*2019/08/15*/
    public void addUserAccountsList(List<UserAccounts> userAccounts) {
        if (userAccounts != null && userAccounts.size() > 0) {
            synchronized (userAccountsList) {
                userAccountsList.addAll(userAccounts);
                userAccountsList.notifyAll();
            }
        }
        while (userAccountsList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (userAccountsList) {
                try {
                    userAccountsList.wait();
                } catch (Exception e) {
                    logger.error(">>[addUserAccountsList]等待[userAccountsList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<UserAccounts> getUserAccountsList(int batchSize){
        List<UserAccounts> uaList = new LinkedList<UserAccounts>();
        int i = 0;
        int size = 0;
        synchronized (userAccountsList) {
            while (userAccountsList.isEmpty()) {
                try {
                    userAccountsList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[UserAccounts]异常：" + e.getMessage());
                }
            }
            while (!userAccountsList.isEmpty() && i < batchSize) {
                uaList.add(userAccountsList.poll());
                i ++;
            }
            size = userAccountsList.size();
        }
        logger.info("取[UserAccounts]数据缓存：" + uaList.size() + "条,剩余：" + size);

        if (userAccountsList.size() <= batchSize * iMinThreshold ) {
            synchronized (userAccountsList) {
                userAccountsList.notifyAll();
            }
        }
        return uaList;
    }

    public void addBaseSysUserList(List<BaseSysUser> baseSysUsers) {
        if (baseSysUsers != null && baseSysUsers.size() > 0) {
            synchronized (baseSysUserList) {
                baseSysUserList.addAll(baseSysUsers);
                baseSysUserList.notifyAll();
            }
        }
        while (baseSysUserList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (baseSysUserList) {
                try {
                    baseSysUserList.wait();
                } catch (Exception e) {
                    logger.error(">>[addBaseSysUserList]等待[baseSysUserList]异常：" + e.getMessage());
                }
            }
        }
    }

    /**
     * 取缓存
     */
    public List<BaseSysUser> getBaseSysUserList(int batchSize){
        List<BaseSysUser> bsuList = new LinkedList<BaseSysUser>();
        int i = 0;
        int size = 0;
        synchronized (baseSysUserList) {
            while (baseSysUserList.isEmpty()) {
                try {
                    baseSysUserList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[BaseSysUser]异常：" + e.getMessage());
                }
            }
            while (!baseSysUserList.isEmpty() && i < batchSize) {
                bsuList.add(baseSysUserList.poll());
                i ++;
            }
            size = baseSysUserList.size();
        }
        logger.info("取[BaseSysUser]数据缓存：" + bsuList.size() + "条,剩余：" + size);

        if (baseSysUserList.size() <= batchSize * iMinThreshold ) {
            synchronized (baseSysUserList) {
                baseSysUserList.notifyAll();
            }
        }
        return bsuList;
    }

    public void addScosAuditScheduleLogList(List<ScosAuditScheduleLog> scosAuditScheduleLogs) {
        if (scosAuditScheduleLogs != null && scosAuditScheduleLogs.size() > 0) {
            synchronized (scosAuditScheduleLogList) {
                scosAuditScheduleLogList.addAll(scosAuditScheduleLogs);
                scosAuditScheduleLogList.notifyAll();
            }
        }
        while (scosAuditScheduleLogList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosAuditScheduleLogList) {
                try {
                    scosAuditScheduleLogList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosAuditScheduleLogList]等待[scosAuditScheduleLogList]异常：" + e.getMessage());
                }
            }
        }
    }

    public List<ScosAuditScheduleLog> getScosAuditScheduleLogList(int batchSize){
        List<ScosAuditScheduleLog> sasList = new LinkedList<ScosAuditScheduleLog>();
        int i = 0;
        int size = 0;
        synchronized (scosAuditScheduleLogList) {
            while (scosAuditScheduleLogList.isEmpty()) {
                try {
                    scosAuditScheduleLogList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosAuditScheduleLog]异常：" + e.getMessage());
                }
            }
            while (!scosAuditScheduleLogList.isEmpty() && i < batchSize) {
                sasList.add(scosAuditScheduleLogList.poll());
                i ++;
            }
            size = scosAuditScheduleLogList.size();
        }
        logger.info("取[ScosAuditScheduleLog]数据缓存：" + sasList.size() + "条,剩余：" + size);

        if (scosAuditScheduleLogList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosAuditScheduleLogList) {
                scosAuditScheduleLogList.notifyAll();
            }
        }
        return sasList;
    }

    public void addUserBusinessFlowList(List<UserBusinessFlow> sserBusinessFlows) {
        if (sserBusinessFlows != null && sserBusinessFlows.size() > 0) {
            synchronized (userBusinessFlowList) {
                userBusinessFlowList.addAll(sserBusinessFlows);
                userBusinessFlowList.notifyAll();
            }
        }
        while (userBusinessFlowList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (userBusinessFlowList) {
                try {
                    userBusinessFlowList.wait();
                } catch (Exception e) {
                    logger.error(">>[adduserBusinessFlowList]等待[userBusinessFlowList]异常：" + e.getMessage());
                }
            }
        }
    }

    public List<UserBusinessFlow> getUserBusinessFlowList(int batchSize){
        List<UserBusinessFlow> ubfList = new LinkedList<UserBusinessFlow>();
        int i = 0;
        int size = 0;
        synchronized (userBusinessFlowList) {
            while (userBusinessFlowList.isEmpty()) {
                try {
                    userBusinessFlowList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[UserBusinessFlow]异常：" + e.getMessage());
                }
            }
            while (!userBusinessFlowList.isEmpty() && i < batchSize) {
                ubfList.add(userBusinessFlowList.poll());
                i ++;
            }
            size = userBusinessFlowList.size();
        }
        logger.info("取[UserBusinessFlow]数据缓存：" + ubfList.size() + "条,剩余：" + size);

        if (userBusinessFlowList.size() <= batchSize * iMinThreshold ) {
            synchronized (userBusinessFlowList) {
                userBusinessFlowList.notifyAll();
            }
        }
        return ubfList;
    }

    public void addScosAuditLogList(List<ScosAuditLog> scosAuditLogs) {
        if (scosAuditLogs != null && scosAuditLogs.size() > 0) {
            synchronized (scosAuditLogList) {
                scosAuditLogList.addAll(scosAuditLogs);
                scosAuditLogList.notifyAll();
            }
        }
        while (scosAuditLogList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosAuditLogList) {
                try {
                    scosAuditLogList.wait();
                } catch (Exception e) {
                    logger.error(">>[addscosAuditLogList]等待[scosAuditLogList]异常：" + e.getMessage());
                }
            }
        }
    }

    public List<ScosAuditLog> getScosAuditLogList(int batchSize){
        List<ScosAuditLog> salList = new LinkedList<ScosAuditLog>();
        int i = 0;
        int size = 0;
        synchronized (scosAuditLogList) {
            while (scosAuditLogList.isEmpty()) {
                try {
                    scosAuditLogList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[ScosAuditLog]异常：" + e.getMessage());
                }
            }
            while (!scosAuditLogList.isEmpty() && i < batchSize) {
                salList.add(scosAuditLogList.poll());
                i ++;
            }
            size = scosAuditLogList.size();
        }
        logger.info("取[ScosAuditLog]数据缓存：" + salList.size() + "条,剩余：" + size);

        if (scosAuditLogList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosAuditLogList) {
                scosAuditLogList.notifyAll();
            }
        }
        return salList;
    }

    // 0909
    public void addScosBusinessChooseDetailList(List<ScosBusinessChooseDetail> scosBusinessChooseDetails) {
        if (scosBusinessChooseDetails != null && scosBusinessChooseDetails.size() > 0) {
            synchronized (scosBusinessChooseDetailList) {
                scosBusinessChooseDetailList.addAll(scosBusinessChooseDetails);
                scosBusinessChooseDetailList.notifyAll();
            }
        }
        while (scosBusinessChooseDetailList.size() >= appConfigManager.batchSize * iMaxThreshold) {
            synchronized (scosBusinessChooseDetailList) {
                try {
                    scosBusinessChooseDetailList.wait();
                } catch (Exception e) {
                    logger.error(">>[addScosBusinessChooseDetailList]等待[scosBusinessChooseDetailList]异常：" + e.getMessage());
                }
            }
        }
    }

    public List<ScosBusinessChooseDetail> getScosBusinessChooseDetailList(int batchSize){
        List<ScosBusinessChooseDetail> sbcdList = new LinkedList<ScosBusinessChooseDetail>();
        int i = 0;
        int size = 0;
        synchronized (scosBusinessChooseDetailList) {
            while (scosBusinessChooseDetailList.isEmpty()) {
                try {
                    scosBusinessChooseDetailList.wait();
                } catch (Exception e) {
                    logger.error(">>等待[scosBusinessChooseDetailList]异常：" + e.getMessage());
                }
            }
            while (!scosBusinessChooseDetailList.isEmpty() && i < batchSize) {
                sbcdList.add(scosBusinessChooseDetailList.poll());
                i ++;
            }
            size = scosBusinessChooseDetailList.size();
        }
        logger.info("取[scosBusinessChooseDetailList]数据缓存：" + sbcdList.size() + "条,剩余：" + size);

        if (scosBusinessChooseDetailList.size() <= batchSize * iMinThreshold ) {
            synchronized (scosBusinessChooseDetailList) {
                scosBusinessChooseDetailList.notifyAll();
            }
        }
        return sbcdList;
    }


    /***********************************************入库线程************************************************************/

    public class AccountOperationToDb implements Runnable{

        public AccountOperationToDb(){
        }

        @Override
        public void run() {
            logger.info(">>>>>>>>>启动[AccountOperation]入库线程<<<<<<<<<<<<");
            while (true) {
                List<AccountOperation> list = getAccountOperationList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setAccountOperationList(list);
                }
            }
        }
    }

    public class CrdBankAccInterfaceToDb implements Runnable{

        public CrdBankAccInterfaceToDb( ){
        }

        @Override
        public void run() {
            logger.info(">>>>>>>>>启动[CrdBankAccInterface]入库线程<<<<<<<<<<<<");
            while (true) {
                List<CrdBankAccInterface> list = getCrdBankAccInterfaceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setCrdBankAccInterfaceList(list);
                }
            }
        }
    }

    public class CrdBankTrfInterfaceToDb implements Runnable{

        public CrdBankTrfInterfaceToDb( ){
            
        }

        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[CrdBankTrfInterface]入库线程<<<<<<<<<<<<");
            while (true) {
                List<CrdBankTrfInterface> list = getCrdBankTrfInterfaceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setCrdBankTrfInterfaceList(list);
                }
            }
        }
    }

    public class OptBankAccInterfaceToDb implements Runnable{

        public OptBankAccInterfaceToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[OptBankAccInterface]入库线程<<<<<<<<<<<<");
            while (true) {
                List<OptBankAccInterface> list = getOptBankAccInterfaceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setOptBankAccInterfaceList(list);
                }
            }
        }
    }


    public class OptBankTrfInterfaceToDb implements Runnable{

        public OptBankTrfInterfaceToDb( ){
        }

        public void run() {
            logger.info(">>>>>>>>>>>>启动[OptBankTrfInterface]入库线程<<<<<<<<<<<<");
            while (true) {
                List<OptBankTrfInterface> list = getOptBankTrfInterfaceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setOptBankTrfInterfaceList(list);
                }
            }

        }
    }

    public class BankAccInterfaceToDb implements Runnable{

        public BankAccInterfaceToDb( ){
        }

        public void run() {
            logger.info(">>>>>>>>>>>>启动[BankAccInterface]入库线程<<<<<<<<<<<<");
            while (true) {
                List<BankAccInterface> list = getBankAccInterfaceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setBankAccInterfaceList(list);
                }
            }

        }
    }


    public class BankTrfInterfaceToDb implements Runnable{

        public BankTrfInterfaceToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[BankTrfInterface]入库线程<<<<<<<<<<<<");
            while (true) {
                List<BankTrfInterface> list = getBankTrfInterfaceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setBankTrfInterfaceList(list);
                }
            }

        }
    }


    public class CheckSummaryToDb implements Runnable{

        public CheckSummaryToDb( ){
        }

        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[CheckSummary]入库线程<<<<<<<<<<<<");
            while (true) {
                List<CheckSummary> list = getCheckSummaryList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setCheckSummaryList(list);
                }
            }

        }
    }


    public class FundDetailToDb implements Runnable{

        public FundDetailToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[FundDetail]入库线程<<<<<<<<<<<<");
            while (true) {
                List<FundDetail> list = getFundDetailList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setFundDetailList(list);
                }
            }

        }
    }


    public class FundStockChangeToDb implements Runnable{

        public FundStockChangeToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[FundStockChange]入库线程<<<<<<<<<<<<");
            while (true) {
                List<FundStockChange> list = getFundStockChangeList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setFundStockChangeList(list);
                }
            }

        }
    }

    public class OlpayTradeRecordToDb implements Runnable{

        public OlpayTradeRecordToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[OlpayTradeRecord]入库线程<<<<<<<<<<<<");
            while (true) {
                List<OlpayTradeRecord> list = getOlpayTradeRecordList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setOlpayTradeRecordList(list);
                }
            }

        }
    }

    public class OtherChangeToDb implements Runnable{

        public OtherChangeToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[OtherChange]入库线程<<<<<<<<<<<<");
            while (true) {
                List<OtherChange> list = getOtherChangeList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setOtherChangeList(list);
                }
            }

        }
    }

    /*
   2019/04/12
   新增账户相关八张表
  */
    public class ScosAuditTaskToDb implements Runnable{

        public ScosAuditTaskToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosAuditTask]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosAuditTask> list = getScosAuditTasksList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosAuditTaskList(list);
                }
            }
        }
    }

    public class ScosBusinessAcceptToDb implements Runnable{

        public ScosBusinessAcceptToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosBusinessAccept]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosBusinessAccept> list = getScosBusinessAcceptList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosBusinessAcceptList(list);
                }
            }
        }
    }

    public class ScosBusinessChooseToDb implements Runnable{

        public ScosBusinessChooseToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosBusinessChoose]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosBusinessChoose> list = getScosBusinessChooseList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosBusinessChooseList(list);
                }
            }
        }
    }

    public class ScosBusScheduleDetailToDb implements Runnable{

        public ScosBusScheduleDetailToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosBusScheduleDetail]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosBusScheduleDetail> list = getScosBusScheduleDetailList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosBusScheduleDetailtList(list);
                }
            }
        }
    }

    public class UserPresenceToDb implements Runnable{

        public UserPresenceToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[UserPresence]入库线程<<<<<<<<<<<<");
            while (true) {
                List<UserPresence> list = getUserPresenceList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setUserPresenceList(list);
                }
            }
        }
    }

    public class BaseOrganizationToDb implements Runnable{

        public BaseOrganizationToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[BaseOrganization]入库线程<<<<<<<<<<<<");
            while (true) {
                List<BaseOrganization> list = getBaseOrganizationList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setBaseOrganizationList(list);
                }
            }
        }
    }

    public class MessTaskToDb implements Runnable{

        public MessTaskToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[MessTask]入库线程<<<<<<<<<<<<");
            while (true) {
                List<MessTask> list = getMessTaskList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setMessTaskList(list);
                }
            }
        }
    }

    public class ScosBusBasicTaskInfoToDb implements Runnable{

        public ScosBusBasicTaskInfoToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosBusBasicTaskInfo]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosBusBasicTaskInfo> list = getScosBusBasicTaskInfoList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosBusBasicTaskInfoList(list);
                }
            }
        }
    }

    /*新增运营监控五张表*/
    public class UserAccountsToDb implements Runnable{

        public UserAccountsToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[UserAccounts]入库线程<<<<<<<<<<<<");
            while (true) {
                List<UserAccounts> list = getUserAccountsList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setUserAccountsList(list);
                }
            }
        }
    }

    public class BaseSysUserToDb implements Runnable{

        public BaseSysUserToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[BaseSysUser]入库线程<<<<<<<<<<<<");
            while (true) {
                List<BaseSysUser> list = getBaseSysUserList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setBaseSysUserList(list);
                }
            }
        }
    }

    public class UserBusinessFlowToDb implements Runnable{

        public UserBusinessFlowToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[UserBusinessFlow]入库线程<<<<<<<<<<<<");
            while (true) {
                List<UserBusinessFlow> list = getUserBusinessFlowList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setUserBusinessFlowList(list);
                }
            }
        }
    }

    public class ScosAuditScheduleLogToDb implements Runnable{

        public ScosAuditScheduleLogToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosAuditScheduleLog]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosAuditScheduleLog> list = getScosAuditScheduleLogList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosAuditScheduleLogList(list);
                }
            }
        }
    }

    public class ScosAuditLogToDb implements Runnable{

        public ScosAuditLogToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosAuditLog]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosAuditLog> list = getScosAuditLogList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosAuditlogList(list);
                }
            }
        }
    }

    public class ScosBusinessChooseDetailToDb implements Runnable{

        public ScosBusinessChooseDetailToDb( ){
        }
        @Override
        public void run() {
            logger.info(">>>>>>>>>>>>启动[ScosBusinessChooseDetail]入库线程<<<<<<<<<<<<");
            while (true) {
                List<ScosBusinessChooseDetail>  list = getScosBusinessChooseDetailList(appConfigManager.getBatchSize());
                if (list!=null && list.size()!=0) {
                    mysqlHelperService.setScosBusinessChooseDetailList(list);
                }
            }
        }
    }

/*End*/
}
