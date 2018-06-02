package qimo_02;

import java.util.*;

public class hulan_31 {

    public static void main(StringL[] args) {
        System.out.println("请输入一个身份证号码：");
        Scanner sc = new Scanner(System.in);
        String idcard = sc.next();
        if (!(idcard.length() == 18)) {
            System.out.println("输入不正确，请重新输入：");
            idcard = sc.next();
        }
        String idcard17 = idcard.substring(0, 17);//前17位
        String idcard18 = idcard.substring(17, 18);//第18位
        String idcard2 = idcard.substring(0, 2);//省份
        String idcard10 = idcard.substring(6, 4);//年龄
        String idcard14 = idcard.substring(6, 8);
        System.out.println(idcard18);
        char a[] = null;
        a = idcard17.toCharArray();
        int[] b = new int[idcard17.length()];
        int sum = 0;
        b = converCharToInt(a);
        int c[] = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        for (int i = 0; i < b.length; i++) {
            for (int k = 0; k < c.length; k++) {
                if (i == k) {
                    sum = sum + b[i] * c[k];
                }
            }
        }
        System.out.println(sum);
        int k[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int remainder = 0;
        remainder = sum % 11;
        String later;
        switch (remainder) {
            case 0:
                later = "1";
                break;
            case 1:
                later = "0";
                break;
            case 2:
                later = "X";
                break;
            case 3:
                later = "9";
                break;
            case 4:
                later = "8";
                break;
            case 5:
                later = "7";
                break;
            case 6:
                later = "6";
                break;
            case 7:
                later = "5";
                break;
            case 8:
                later = "4";
                break;
            case 9:
                later = "3";
                break;
            case 10:
                later = "2";
                break;
            default:
                later = "身份证无效";
                break;
        }
        if (idcard18.equalsIgnoreCase(later))
            System.out.println("身份证号码合法");
        else
            System.out.println("身份证号码不合法");

        //省份
        String province = "cd";
        switch (idcard2) {
            case "11":
                province = "北京";
                break;
            case "12":
                province = "天津";
                break;
            case "13":
                province = "河北";
                break;
            case "14":
                province = "山西";
                break;
            case "15":
                province = "内蒙古";
                break;
            case "21":
                province = "辽宁";
                break;
            case "22":
                province = "吉林";
                break;
            case "23":
                province = "黑龙江";
                break;
            case "31":
                province = "上海";
                break;
            case "32":
                province = "江苏";
                break;
            case "33":
                province = "浙江";
                break;
            case "34":
                province = "安徽";
                break;
            case "35":
                province = "福建";
                break;
            case "36":
                province = "江西";
                break;
            case "37":
                province = "山东";
                break;
            case "41":
                province = "河南";
                break;
            case "42":
                province = "湖北";
                break;
            case "43":
                province = "湖南";
                break;
            case "44":
                province = "广东";
                break;
            case "45":
                province = "广西";
                break;
            case "46":
                province = "海南";
                break;
            case "50":
                province = "重庆";
                break;
            case "51":
                province = "四川";
                break;
            case "52":
                province = "贵州";
                break;
            case "53":
                province = "云南";
                break;
            case "54":
                province = "西藏";
                break;
            case "61":
                province = "陕西";
                break;
            case "62":
                province = "甘肃";
                break;
            case "63":
                province = "青海";
                break;
            case "64":
                province = "宁夏";
                break;
            case "65":
                province = "新疆";
                break;
            case "71":
                province = "台湾";
                break;
            case "81":
                province = "香港";
                break;
            case "82":
                province = "澳门";
                break;
            case "91":
                province = "国外";
                break;
            default:
                province = "身份证无效";
                break;
        }

        //出生年月
        String year, month, day;
        year = idcard.substring(6, 10);
        month = idcard.substring(10, 12);
        day = idcard.substring(12, 14);
        System.out.println("出生日期：" + year + "年" + month + "月" + day + "日");


        //年龄
        String idcard10;
        int v = Integer.parseInt(idcard10);
        int age = 2018 - v;
        System.out.println(" ");//报错的地方
    }

    public static int[] converCharToInt(char[] c) {
        int[] a = new int[c.length];
        int k = 0;
        for (char temp : c) {
            a[k++] = Integer.parseInt(String.valueOf(temp));
        }
        return a;
    }

}
