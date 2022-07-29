package game;
import java.util.Scanner;
/**
 * @author tedu主要的命令窗口
 */
public class Sys {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("选择菜单：7.查看队伍；8.增加队员；9.删除队员；10.计算输出;11.修改队内角色;-1.退出");
        int commend=scan.nextInt();
        int num1;
        int people;
        int num;

        User[] u1= new User[5];
        u1[0]=new Gold();
        u1[1]=new Wood();
        u1[2]=new Water();
        u1[3]=new Fire();
        u1[4]=new Earth();
        
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
                    if(n<u1.length){
                        u1[n].add_user();  
                    }else {
                        System.out.println("请输入正确的对员编号");
                    }
                    
                    break;
                case 9:
                    System.out.println("请输入要删除的队员编号");
                    int x =scan.nextInt();
                    if(x<u1.length){
                        u1[x].tr();
                    }else {
                        System.out.println("请输入正确的对员编号");
                    }
                    
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
                    if(p<u1.length){
                        System.out.println("请选择要修改的角色信息：1.解除武器，2.佩戴武器");
                        int y=scan.nextInt();
                        if(y==1){
                            u1[p].te();
                        }else {
                            u1[p].ae();
                        }
                    }else {
                        System.out.println("请输入正确的对员编号");
                    }
                    
                    break;
                default:
                    System.out.println("请输入正确的命令");
                    
                
            }

            System.out.println("选择菜单：7.查看队伍；8.增加队员；9.删除队员；10.计算输出;11.修改队内角色;-1.退出");
        }
        
       
       
        
        
    }
}
