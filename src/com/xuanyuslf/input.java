package com.xuanyuslf;

import java.util.Objects;
import java.util.Scanner;

public class input {
    public static int age;
    public static int currentHeartRate;
    public static String heart;
    public static int moringRate;
    public static int calmHeartRate;
    public static String gender;

    public static void check() {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.print("请输入年龄=");
            age = s.nextInt();
            if (120 >= age && age >= 1) {
                break;
            } else {
                System.out.println("输入错误请重新输入");
            }
        }
        while (true) {
            Scanner c = new Scanner(System.in);
            System.out.print("请输入当前心率=");
            currentHeartRate = c.nextInt();
            if (220 - age >= currentHeartRate && currentHeartRate >= 40) {
                break;
            } else {
                System.out.println("输入错误请重新输入");
            }
        }
        while (true) {
            Scanner d = new Scanner(System.in);
            System.out.println("请输入心脏有无问题=");
            heart = d.next();
            if (Objects.equals(heart, "有") || Objects.equals(heart, "无")) {
                break;
            }
            else {
                System.out.println("输入错误,请重新输入");
            }
        }
    }

    public static void inputMoringRate() {
        Scanner e = new Scanner(System.in);
        System.out.println("请输入晨脉=");
        moringRate = e.nextInt();
    }

    public static void inputCalmHearRate() {
        while (true) {
            Scanner f = new Scanner(System.in);
            System.out.print("请输入平静时心率=");
            calmHeartRate = f.nextInt();
            if (220 - age >= calmHeartRate && calmHeartRate >= 40) {
                break;
            } else {
                System.out.println("输入错误请重新输入");
            }
        }
    }

    public static void  inputGender() {
        while (true) {
            Scanner g = new Scanner(System.in);
            System.out.print("请输入性别=");
            gender = g.next();
            if (Objects.equals(gender, "女") || Objects.equals(gender, "男")) {
                break;
            } else {
                System.out.println("输入错误请重新输入");
            }
        }
    }
}