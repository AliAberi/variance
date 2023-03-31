package ir.hamsaz.controller;

import ir.hamsaz.models.FakeInfo;
import ir.hamsaz.models.Transactions;
import ir.hamsaz.services.TransactionService;
import ir.hamsaz.services.TransactionServiceImp;
import ir.hamsaz.view.MainPage;

public class Controller {
    private TransactionService transactionService;
    private FakeInfo fakeInfo;
    public Controller(){
        transactionService = new TransactionServiceImp();
        fakeInfo = new FakeInfo();
    }

    public void dataController(){
        transactionService.find_conflict(fakeInfo.getPiramid(), fakeInfo.getBehpardakht());
        transactionService.getP_conflict();
        transactionService.getB_conflict();
    }
    public static void initView(){
        new MainPage();
    }

}
