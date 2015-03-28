package edu.amherst.fyang17.myapplication;

import com.orm.SugarRecord;

/**
 * Created by Administrator on 3/28/2015.
 */
public class Numbers extends SugarRecord<Numbers>{
    int sum=0;

    public Numbers(){
    }
    public Numbers(int n){
        sum = n;
    }
}
