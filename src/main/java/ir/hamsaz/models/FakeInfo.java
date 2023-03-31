package ir.hamsaz.models;

public class FakeInfo {


    private Transactions piramid;
    private Transactions behpardakht;

    public FakeInfo(){
        piramid = new Transactions();
        behpardakht = new Transactions();
        fill_piramid();
        fill_behpardakht();
    }


    private Transactions fill_piramid(){
        add_to_list("147254","516476",this.piramid);
        add_to_list("764781","516472",this.piramid);
        add_to_list("73054","516452",this.piramid);
        add_to_list("421043","516477",this.piramid);
        add_to_list("873508","516478",this.piramid);
        add_to_list("571200","516482",this.piramid);
        add_to_list("97854","516484",this.piramid);
        add_to_list("96254","516483",this.piramid);
        add_to_list("1152726","516479",this.piramid);
        add_to_list("197493","516475",this.piramid);
        add_to_list("202254","516486",this.piramid);
        add_to_list("325308","516487",this.piramid);
        add_to_list("989198","516480",this.piramid);
        add_to_list("827788","516489",this.piramid);
        add_to_list("52154","516491",this.piramid);
        add_to_list("192833","516490",this.piramid);
        add_to_list("176254","516495",this.piramid);
        add_to_list("870348","516485",this.piramid);
        add_to_list("1103998","516493",this.piramid);

        return this.piramid;
    }

    private Transactions fill_behpardakht(){
        add_to_list("764781","800254347207",this.behpardakht);
        add_to_list("73054","800254347248",this.behpardakht);
        add_to_list("421043","800254347286",this.behpardakht);
        add_to_list("873508","800254347341",this.behpardakht);
        add_to_list("571200","800254347376",this.behpardakht);
        add_to_list("97854","800254347418",this.behpardakht);
        add_to_list("96254","800254347478",this.behpardakht);
        add_to_list("1152726","800254347506",this.behpardakht);
        add_to_list("197493","800254347532",this.behpardakht);
        add_to_list("202254","800254347563",this.behpardakht);
        add_to_list("325308","800254347599",this.behpardakht);
        add_to_list("989198","800254347642",this.behpardakht);
        add_to_list("827788","800254347710",this.behpardakht);
        add_to_list("52154","800254347770",this.behpardakht);
        add_to_list("192833","800254347804",this.behpardakht);
        add_to_list("176254","800254347901",this.behpardakht);
        add_to_list("870348","800254347924",this.behpardakht);
        add_to_list("1103998","800254351028",this.behpardakht);
        add_to_list("355508","800254351068",this.behpardakht);

        return  this.behpardakht;
    }
    /**@
     @param:
     get first
    @return:
     String
     */
    public Transactions getPiramid() {
        return piramid;
    }

    public Transactions getBehpardakht() {
        return behpardakht;
    }

    //this is for add one transaction
    private void add_to_list(String price,String Traking_number,Transactions p){
        Transaction t = new Transaction(price, Traking_number);
        p.addTrs(t);
    }



}
