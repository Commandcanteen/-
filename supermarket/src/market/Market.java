package market;

import java.util.Scanner;


public class Market {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Supermarket.menu();
    int[]i;
    i=new int[]{10,2,20,3,10};
    int num =scan.nextInt();
    int[] commodity;
    commodity=new int[5];
    for(;num!=0;num=scan.nextInt()){

        switch (num){
            case 1:
                commodity[0]=(int)( commodity[0]+1);
                Supermarket.menu();
                break;
            case 2:
                commodity[1]=(int)( commodity[1]+1);
                Supermarket.menu();
                break;
            case 3:
                commodity[2]=(int)( commodity[2]+1);
                Supermarket.menu();
                break;
            case 4:
                commodity[3]=(int)( commodity[3]+1);
                Supermarket.menu();
                break;
            case 5:
                commodity[4]=(int)( commodity[4]+1);
                Supermarket.menu();
                break;
            default:
                System.out.println("请输入正确的商品编号");
        }

    }

    Supermarket.discount();

    int x =scan.nextInt();
    int all =((commodity[0]*i[0]+commodity[1]*i[1]+commodity[2]*i[2]+commodity[3]*i[3]+commodity[4]*i[4])%10)*x;



    System.out.println("商品的总价为"+all+"元");






}
}
