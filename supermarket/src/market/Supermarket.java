package market;

public class Supermarket {

    public static void commend(){


    }

    public static void menu(){
        System.out.println("请选择所需购买的商品");
        System.out.print("0.结账 1.饼干 10元 2.水 2元 3.杯子 20元 4.可乐 3元 5.盲盒 10元 ");
    } //菜单选择

    public static int[] commodity(int x,int y){
        int[] i;
        y=0;
        i =new int[5];
        i[x-1]=++y;
        return i;
    } //购物车








    public static void buy(){
        System.out.println("你要购买的东西？");
    }

    public static void discount(){
        System.out.println("是否使用优惠券");
    }//折扣选择














}
