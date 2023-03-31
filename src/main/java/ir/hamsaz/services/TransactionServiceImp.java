package ir.hamsaz.services;

import ir.hamsaz.models.Transactions;

public class TransactionServiceImp implements TransactionService{

    public Transactions getP_conflict() {
        return p_conflict;
    }

    public Transactions getB_conflict() {
        return b_conflict;
    }

    private Transactions p_conflict;
    private Transactions b_conflict;

    private int piramod_count = 0;
    private int bp_count = 0;
    private int skh_count = 0;

    //when find a conflict that flag will be 1
    private int flag = 0;

    public TransactionServiceImp(){
        p_conflict = new Transactions();
        b_conflict = new Transactions();
    }

    @Override
    public void find_conflict(Transactions piramid,Transactions behpardakht){

        int bp_count = 0;

        for (int i = 0; i < piramid.get_trs_size(); i++) {
            flag = 0;
            for (int j = bp_count; j < 10; j++) {
                if(piramid.get_price(i).equals( behpardakht.get_price(j)) ) {
                    bp_count += j;
                    flag = 1;
                    break;
                }else{
                    b_conflict.addTrs(behpardakht.get_price(j),behpardakht.get_traking_number(j));
                }
            }
            if(flag == 0){
                p_conflict.addTrs(piramid.get_price(i),piramid.get_traking_number(i));
            }
        }

    }






}
