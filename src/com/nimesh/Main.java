package com.nimesh;

import java.util.ArrayList;


class IntClass {
    private int myValue;
    public IntClass(Integer myValue){
        this.myValue = myValue;
    }

    private int getMyValue(){
        return this.myValue;
    }

    private void setMyValue(){
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        ArrayList<IntClass> myIntClass = new ArrayList<IntClass>();
        myIntClass.add(new IntClass(56));

        ArrayList<Integer> newInt = new ArrayList<Integer>();

        for(int i = 0; i<10; i++){
            newInt.add(Integer.valueOf(i)); //Autoboxing int i to Integer class with .valueOf(i)
        }

        for(int i = 0; i<newInt.size(); i++){
            System.out.println(newInt.get(i).intValue()); //Unboxing by .intValue()
        }

        Integer myIntValue = 56; //can also be Integer.valueOf(56)
        int integer = myIntValue; //basciaclly should have been myIntValue.intValue()

        ArrayList<Double> myDouble = new ArrayList<Double>();

        for (double db = 0; db <10.0; db += 0.5){
            myDouble.add(Double.valueOf(db));
        }

        for(int i = 0; i<myDouble.size(); i++){
            System.out.println(i+1 +". "+myDouble.get(i).doubleValue());
        }
    }
}
