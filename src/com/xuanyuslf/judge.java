package com.xuanyuslf;

import java.util.Objects;

public class judge {
    public static int n;
    public static void heartProblemOrNo(){
        if (input.currentHeartRate<formula.low){
            System.out.println("您的运动心率过低,适宜运动心率应为:" + formula.low + "~" + formula.high + ",当前运动心率为"+ input.currentHeartRate );
        }
        else if (input.currentHeartRate>formula.high){
            System.out.println("您的运动心率过高,适宜运动心率应为:" + formula.low+ "~" + formula.high + ",当前运动心率为"+ input.currentHeartRate );
        }
        else if (input.currentHeartRate>=formula.low && formula.high>=input.currentHeartRate){
            System.out.println("您的运动心率正常,适宜运动心率应为:" + formula.low + "~" + formula.high + ",当前运动心率为"+ input.currentHeartRate );
        }
    }
    public static void highAge(){
        if (formula.heartRate<=input.currentHeartRate){
            System.out.println("您的运动心率正好，适宜运动心率应为"+formula.heartRate+",实际运动心率为"+input.currentHeartRate);
        }else {
            System.out.println("您的运动心率过高，适宜运动心率应为"+formula.heartRate+",实际运动心率为"+input.currentHeartRate);
        }
    }
    public static void gender(){
        if (Objects.equals(input.gender,"男")){
            n=220;
        }else {
            n=210;
        }
    }
}

