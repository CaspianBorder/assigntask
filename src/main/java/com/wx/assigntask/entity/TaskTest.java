package com.wx.assigntask.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wx
 * @Date: 2018/12/8 18:17
 * @Version 1.0
 */
public class TaskTest {
    private int algorithmId;
    private String algorithmName;
    private int item_num;
    private String item_1;
    private String item_2;
    private String item_3;
    private String item_4;
    private String item_5;
    private String item_6;
    private String item_7;
    private String item_8;
    private String item_9;
    private String item_10;

    public int getAlgorithmId() {
        return algorithmId;
    }

    public void setAlgorithmId(int algorithmId) {
        this.algorithmId = algorithmId;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public int getItem_num() {
        return item_num;
    }

    public void setItem_num(int item_num) {
        this.item_num = item_num;
    }

    public String getItem_1() {
        return item_1;
    }

    public void setItem_1(String item_1) {
        this.item_1 = item_1;
    }

    public String getItem_2() {
        return item_2;
    }

    public void setItem_2(String item_2) {
        this.item_2 = item_2;
    }

    public String getItem_3() {
        return item_3;
    }

    public void setItem_3(String item_3) {
        this.item_3 = item_3;
    }

    public String getItem_4() {
        return item_4;
    }

    public void setItem_4(String item_4) {
        this.item_4 = item_4;
    }

    public String getItem_5() {
        return item_5;
    }

    public void setItem_5(String item_5) {
        this.item_5 = item_5;
    }

    public String getItem_6() {
        return item_6;
    }

    public void setItem_6(String item_6) {
        this.item_6 = item_6;
    }

    public String getItem_7() {
        return item_7;
    }

    public void setItem_7(String item_7) {
        this.item_7 = item_7;
    }

    public String getItem_8() {
        return item_8;
    }

    public void setItem_8(String item_8) {
        this.item_8 = item_8;
    }

    public String getItem_9() {
        return item_9;
    }

    public void setItem_9(String item_9) {
        this.item_9 = item_9;
    }

    public String getItem_10() {
        return item_10;
    }

    public void setItem_10(String item_10) {
        this.item_10 = item_10;
    }



    @Override
    public String toString() {
        return "TaskTest{" +
                "algorithmId=" + algorithmId +
                ", algorithmName='" + algorithmName + '\'' +
                ", item_num=" + item_num +
                ", item_1='" + item_1 + '\'' +
                ", item_2='" + item_2 + '\'' +
                ", item_3='" + item_3 + '\'' +
                ", item_4='" + item_4 + '\'' +
                ", item_5='" + item_5 + '\'' +
                ", item_6='" + item_6 + '\'' +
                ", item_7='" + item_7 + '\'' +
                ", item_8='" + item_8 + '\'' +
                ", item_9='" + item_9 + '\'' +
                ", item_10='" + item_10 + '\'' +
                '}';
    }

    public List getItems(){
       List items = new ArrayList();
       items.add(algorithmId);
       items.add(item_1);
       items.add(item_2);
       items.add(item_3);
       items.add(item_4);
       items.add(item_5);
       items.add(item_6);
       items.add(item_7);
       items.add(item_8);
       items.add(item_9);
       items.add(item_10);

       return items;
    }
}