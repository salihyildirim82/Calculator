package com.company;

public class Calculator {

    public static int add(int... parameter) {
        int sum = 0;
        for (int sss : parameter) {
            sum = sum + sss;
        }
        return sum;
    }

    public static int subtract(int... parameter) {
        int result = parameter[0];
        for (int i = 1; i < parameter.length; i++) {
            if (result <= parameter[i]) {
                result = parameter[i] - result;
            } else {
                result = result - parameter[i];
            }
        }
        return result;
    }

    public static int multiply(int... parameter){
        int sum=1;
        for (int sss:parameter) {
            sum=sum*sss;
        }
        return sum;
    }

    public static double divide(int... parameter){
        double result=parameter[0];
        for (int i = 1; i < parameter.length ; i++) {
            if(parameter[i]!=0){
                result=1.0*result/parameter[i];
            }else{
                System.out.println("An undefined result occurs");
                result=-1;
            }
        }
        return result;
    }

}
