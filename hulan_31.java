package qimo_02;

import java.util.*;

public class hulan_31 {

    public static void main(StringL[] args) {
        System.out.println("������һ�����֤���룺");
        Scanner sc = new Scanner(System.in);
        String idcard = sc.next();
        if (!(idcard.length() == 18)) {
            System.out.println("���벻��ȷ�����������룺");
            idcard = sc.next();
        }
        String idcard17 = idcard.substring(0, 17);//ǰ17λ
        String idcard18 = idcard.substring(17, 18);//��18λ
        String idcard2 = idcard.substring(0, 2);//ʡ��
        String idcard10 = idcard.substring(6, 4);//����
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
                later = "���֤��Ч";
                break;
        }
        if (idcard18.equalsIgnoreCase(later))
            System.out.println("���֤����Ϸ�");
        else
            System.out.println("���֤���벻�Ϸ�");

        //ʡ��
        String province = "cd";
        switch (idcard2) {
            case "11":
                province = "����";
                break;
            case "12":
                province = "���";
                break;
            case "13":
                province = "�ӱ�";
                break;
            case "14":
                province = "ɽ��";
                break;
            case "15":
                province = "���ɹ�";
                break;
            case "21":
                province = "����";
                break;
            case "22":
                province = "����";
                break;
            case "23":
                province = "������";
                break;
            case "31":
                province = "�Ϻ�";
                break;
            case "32":
                province = "����";
                break;
            case "33":
                province = "�㽭";
                break;
            case "34":
                province = "����";
                break;
            case "35":
                province = "����";
                break;
            case "36":
                province = "����";
                break;
            case "37":
                province = "ɽ��";
                break;
            case "41":
                province = "����";
                break;
            case "42":
                province = "����";
                break;
            case "43":
                province = "����";
                break;
            case "44":
                province = "�㶫";
                break;
            case "45":
                province = "����";
                break;
            case "46":
                province = "����";
                break;
            case "50":
                province = "����";
                break;
            case "51":
                province = "�Ĵ�";
                break;
            case "52":
                province = "����";
                break;
            case "53":
                province = "����";
                break;
            case "54":
                province = "����";
                break;
            case "61":
                province = "����";
                break;
            case "62":
                province = "����";
                break;
            case "63":
                province = "�ຣ";
                break;
            case "64":
                province = "����";
                break;
            case "65":
                province = "�½�";
                break;
            case "71":
                province = "̨��";
                break;
            case "81":
                province = "���";
                break;
            case "82":
                province = "����";
                break;
            case "91":
                province = "����";
                break;
            default:
                province = "���֤��Ч";
                break;
        }

        //��������
        String year, month, day;
        year = idcard.substring(6, 10);
        month = idcard.substring(10, 12);
        day = idcard.substring(12, 14);
        System.out.println("�������ڣ�" + year + "��" + month + "��" + day + "��");


        //����
        String idcard10;
        int v = Integer.parseInt(idcard10);
        int age = 2018 - v;
        System.out.println(" ");//����ĵط�
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
