package newHomeSW;


import java.util.Random;

public class Init {


    public Integer initMark(){
        int temp=2+ (int) (Math.random()*4);
        return temp;
    }
    public newHomeSW.Items initItems(int i){

        return Items.values()[i];
    }
}
