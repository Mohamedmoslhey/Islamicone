package com.example.hp_pc.tasabeh;

/**
 * Created by HP-PC on 7/6/2017.
 */

public class Word {

    // Azkhaar Doaa for the word
    private String mAzkhaarDetail ;
    //Number of Azkhaar to say
    private String mAzkhaarNumber ;


    /**create new object of word
      @param azkhaarDetail the Doaa user should say
     @param azkhaarNumber  number of time should user say doaa**/
    public Word (String azkhaarDetail , String azkhaarNumber){
        mAzkhaarDetail = azkhaarDetail ;
        mAzkhaarNumber = azkhaarNumber ;

    }
    //get AzkhaarDOaa from the word
    public String getAzkhaarDetail() {return mAzkhaarDetail;}

    // get number of doaa you should say
    public String getAzkhaarlNumber() {return mAzkhaarNumber;}
}
