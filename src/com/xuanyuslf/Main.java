package com.xuanyuslf;


import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        input.check();
        if (Objects.equals(input.heart, "有")) {
            input.inputMoringRate();
            formula.moringRate();
            judge.heartProblemOrNo();
        }
        else if (Objects.equals(input.heart,"无")){
            if (input.age>=40){
                formula.heartRate();
                judge.highAge();
            }
            else{
                input.inputCalmHearRate();
                input.inputGender();
                judge.gender();
                formula.clamHeartRate();
                judge.heartProblemOrNo();
            }
        }
    }
}