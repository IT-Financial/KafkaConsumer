package com.hyp.dao;

import com.hyp.entity.*;

import java.util.List;

public interface IMysqlHelperService {

    public void setAccountOperationList(List<AccountOperation> aoList);

    public void setCrdBankAccInterfaceList(List<CrdBankAccInterface> cbaList);

    public void setOptBankAccInterfaceList(List<OptBankAccInterface> obaList );

    public void setCrdBankTrfInterfaceList(List<CrdBankTrfInterface> cbtList );

    public void setOptBankTrfInterfaceList(List<OptBankTrfInterface> btiList );

    public void setFundDetailList( List<FundDetail> fdList );

    public void setOlpayTradeRecordList( List<OlpayTradeRecord> otrList );

    public void setBankAccInterfaceList(List<BankAccInterface> bciList );

    public void setBankTrfInterfaceList(List<BankTrfInterface> btiList );

    public void setCheckSummaryList(List<CheckSummary> chkSummaryList );

    public void setFundStockChangeList( List<FundStockChange> fscList );

    public void setOtherChangeList(List<OtherChange> ocList );

    public void setScosAuditTaskList(List<ScosAuditTask> satList );

    public void setScosBusinessAcceptList(List<ScosBusinessAccept> sbaList );

    public void setScosBusinessChooseList(List<ScosBusinessChoose> sbcList );

    public void setScosBusScheduleDetailtList(List<ScosBusScheduleDetail> sbsdList );

    public void setUserPresenceList(List<UserPresence> userpreList );

    public void setBaseOrganizationList(List<BaseOrganization> boList );

    public void setMessTaskList(List<MessTask> mtList );

    public void setScosBusBasicTaskInfoList(List<ScosBusBasicTaskInfo> sbbtList );

}
