package com.xuanyuslf;

public class formula {
    public static double high;
    public static double low;
    public static int heartRate;
    public static void moringRate(){
        high= (input.moringRate * 1.8);
        low= (input.moringRate * 1.4);
    }
    public static void heartRate(){
        heartRate=(170-input.age);
    }
    public static void clamHeartRate(){
        low=((judge.n-input.age-input.calmHeartRate)*0.6+input.calmHeartRate);
        high=((judge.n-input.age-input.calmHeartRate)*0.8+input.calmHeartRate);
    }
}
