package edu.xcdq;

/**
 * @qvthor liuwenzheng
 * @date 2021/4/20 14:48
 */
public class Phone {
    public double width ;
    public double height ;
    public int weight ;
    public String color ;
    /*
        构造方法:1一定没有返回值 2 方法的名字必须和类名完全一致
     */
    //无参构造方法，不管写不写，系统都会生成
    public Phone(){

    }
    //构造方法 包含全部的参数，全参构造方法
    public Phone(double kuandu ,double gaodu ,int zhongliang ,String yanse){
        width = kuandu ;
        height = gaodu ;
        weight = zhongliang ;
        color = yanse ;
    }
    public Phone(double kuandu,double gaodu ,int zhongliang){
        weight = zhongliang ;
        width = kuandu ;
        height = gaodu ;
    }
    public Phone(double kuandu,int gaodu ,int zhongliang){
        weight = zhongliang ;
        width = kuandu ;
        height = gaodu ;
    }
    public Phone(int gaodu ,double kuandu,int zhongliang){
        weight = zhongliang ;
        width = kuandu ;
        height = gaodu ;
    }
    public Phone(int gaodu ,int kuandu,int zhongliang){
        weight = zhongliang ;
        width = kuandu ;
        height = gaodu ;
    }

    public void startUp(){
        System.out.println("手机即将开机");
    }
    public void suopin(){
        System.out.println("手机即将锁屏");
    }


    //方法的复写
    public String toString() {
        return "{" + width + "" + color + " " + weight + "}" ;

    }






}
