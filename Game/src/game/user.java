package game;
import java.util.Arrays;
import java.util.Random;

public abstract class user implements arms{
    
    protected int level; //等级
    protected int attack; //武力值
    protected String name; //名称
    
    public static final int none=0; //无武器
    public static final int have=1; //有武器
    public int Equipment ;//有无武器
    public static final int TEAM= 0; //在队伍中
    public static final int SINGLE= 1; //未在队伍中
    public int State ;

    //判断是否在队伍中
    public boolean inteam(){
        return State == TEAM; 
    }
    public boolean isalone(){
        return State == SINGLE; 
    }
    
    //判断是否拥有武器
    public boolean he(){ //拥有武器
        return Equipment == have;
    }
    public boolean ne(){ //没有武器
        return Equipment == none;
    }
    


    public user(int level, int attack, String name){
        this.attack =attack;
        this.level=level;
        this.name=name;
       
    }

    public int  num1(){ //输出武力值
        int num=0;
        if (inteam()){
            if(Equipment==0){
                num = (level * 3) + attack;
            }
            if(Equipment==1){
                num = 2*((level*3)+attack);
            } 
        }
        if(isalone()){
            num =0;
        }
        return num;
    }
    
    public void show(){
        //信息介绍
        if (inteam()){
            if(Equipment==0){
                System.out.println("等级："+level+" 角色名称："+name+"武器：无");
            }
            if(Equipment==1){
                System.out.println("等级："+level+" 角色名称："+name+"武器"+element());


            }
        }
        if(isalone()){
            System.out.println("角色待定");
        }
    }

    
    public  void adduser(){

        if(this.inteam()){
            System.out.println("该队员已在队伍中");
        }
        else {
            State=0;
            System.out.println("该队员已加入队伍");

        }
    }
    
    public void tuser(){

        if(this.inteam()){
            State=1;
            System.out.println("该队员已退出");
        }
        else{
            System.out.println("该队员没在队伍中");

        }
    }

    public  void adde(){

        if(this.he()){
            System.out.println("该队员已拥有武器");
        }
        else{
            Equipment=1;
            System.out.println("角色已佩戴武器");

        }
    }

    public void te(){

        if(this.he()){
           Equipment=0;
            System.out.println("角色已解除武器");
        }
        else{
            System.out.println("该队员没有武器");

        }
    }
    

}
