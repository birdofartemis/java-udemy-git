package com.company.poo.interfaces.ex2.models.services;

import com.company.poo.interfaces.ex2.models.entities.Contract;
import com.company.poo.interfaces.ex2.models.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private PaymentOnlineService paymentOnlineService;

    public ContractService(PaymentOnlineService paymentOnlineService) {
        this.paymentOnlineService = paymentOnlineService;
    }

    public PaymentOnlineService getPaymentOnlineService() {
        return paymentOnlineService;
    }

    public void setPaymentOnlineService(PaymentOnlineService paymentOnlineService) {
        this.paymentOnlineService = paymentOnlineService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        double totalQuota;

        for(int i = 1; i<=months; i++){
            totalQuota = basicQuota + paymentOnlineService.totalTax(basicQuota, i);
            contract.addInstallment(new Installment(addMonths(contract.getDate(), i), totalQuota));
        }
    }


    private Date addMonths(Date date, int nMonth){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, nMonth);

        return calendar.getTime();
    }
}
