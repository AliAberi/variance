package ir.hamsaz.services;

import ir.hamsaz.models.Transactions;

public interface TransactionService {
    void find_conflict(Transactions piramid, Transactions behpardakht);
    Transactions getP_conflict();
    Transactions getB_conflict();
}
