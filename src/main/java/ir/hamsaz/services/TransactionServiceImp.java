package ir.hamsaz.services;

import ir.hamsaz.models.Transactions;

public class TransactionServiceImp implements TransactionService {


    private Transactions p_conflict;
    private Transactions b_conflict;

    private int piramod_count = 0;
    private int bp_count = 0;
    private int skh_count = 0;

    //when find a conflict that flag will be 1


    public TransactionServiceImp() {
        p_conflict = new Transactions();
        b_conflict = new Transactions();
    }

    @Override
    public void find_conflict(Transactions piramid, Transactions behpardakht) {

        int bp_count = 0;
        boolean Pflag;
        int bp_rest;
        Transactions b_read = new Transactions();

        //move piramid list
        for (int i = 0; i < piramid.get_trs_size(); i++) {

            //cheack piramid eqals behpardakht
            Pflag = false;

            //when arrive to end of behpardakht list, most cheack overflow
            if(bp_count+10 > behpardakht.get_trs_size()){
                bp_rest = behpardakht.get_trs_size() - bp_count;
            }else{
                bp_rest = 10;
            }

            //move behpardakht list
            for (int j = bp_count; j < bp_rest; j++) {
                if (piramid.get_price(0).equals(behpardakht.get_price(j))) {
                    Pflag = true;
                    piramid.RemoveTransaction(0);
                    behpardakht.RemoveTransaction(j);
                    break;
                }
                else {
                    b_read.addTrs(behpardakht.get_price(j), behpardakht.get_traking_number(j));
                }
            }
            if(Pflag){
                if(b_read.isEmpty()){

                }else{
                    for (int k = 0; k < b_read.get_trs_size(); k++) {
                        behpardakht.RemoveTransaction(0);
                    }
                    b_conflict.addTransactionsToTrs(b_read);
                    b_read.RemoceAllTransactions();

                }
            }else{
                b_read.RemoceAllTransactions();
                p_conflict.addTrs(piramid.getTrs().get(0));
                piramid.RemoveTransaction(0);
            }

        }

    }

    public Transactions getP_conflict() {
        return p_conflict;
    }

    public Transactions getB_conflict() {
        return b_conflict;
    }

}
