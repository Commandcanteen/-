package game;
import java.util.Scanner;
public class sys {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("选择菜单：7.查看队伍；8.增加队员；9.删除队员；10.计算输出;11.修改队内角色;-1.退出");
        int commend=scan.nextInt();
        int num1;
        int people;
        int num;

        user[] u1= new user[5];
        u1[0]=new Goldm();
        u1[1]=new woodm();
        u1[2]=new waterm();
        u1[3]=new firem();
        u1[4]=new earthm();
        
        for(;commend!=-1;commend=scan.nextInt()){
            
            switch (commend){
                case 7:
                  for (int i=0;i<u1.length;i++){
                      u1[i].show();
                      
                  }
                  break;
                case 8:
                    System.out.println("请输入要添加的队员编号");
                    int n = scan.nextInt();
                    u1[n].adduser();
                    break;
                case 9:
                    System.out.println("请输入要删除的队员编号");
                    int x =scan.nextInt();
                    u1[x].tuser();
                    break;
                case 10:
                    int all =0;
                    for(int i=0;i<u1.length;i++){
                        all+=u1[i].num1();
                    }
                    System.out.println("该队伍的输出为"+all);
                    break;
                case 11:
                    System.out.println("请输入要修改的队员编号");
                    int p =scan.nextInt();
                    System.out.println("请选择要修改的角色信息：1.解除武器，2.佩戴武器");
                    int y=scan.nextInt();
                    if(y==1){
                        u1[p].te();
                    }else {
                        u1[p].adde();
                }
                    break;
                default:
                    System.out.println("请输入正确的命令");
                    
                
            }

            System.out.println("选择菜单：7.查看队伍；8.增加队员；9.删除队员；10.计算输出;11.修改队内角色;-1.退出");
        }
        
       
       
        
        
    }
}
