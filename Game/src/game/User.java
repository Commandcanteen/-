package game;
/**
 * @author tedu
 */
public class User implements Arms {
    /**
     * @para   等级
     */
    protected int level;
    /**
     * @para 武力值
     */
    protected int attack;
    /**
     * @para   名称
     */
    protected String name;
    /**
     * @para 无武器
     */
    public static final int NONE=0;
    /**
     * @para 有武器
     */
    public static final int HAVE=1;
    
    
    /**
     * @para 有无武器
     */
    public int equipment ;
    /**
     * @para     在队伍中
     */
    public static final int TEAM= 0;
    /**
     * @para   未在队伍中
     */
    public static final int SINGLE= 1; 
    public int state ;

    

    /**
     * 
     * @return 判断是否在队伍中
     */
    public boolean inTeam(){
        return state == TEAM; 
    }
    public boolean isAlone(){
        return state == SINGLE; 
    }
    
    /**
     * 
     * @return 判断是否拥有武器
     */
    public boolean he(){ //拥有武器
        return equipment == HAVE;
    }
    public boolean ne(){ //没有武器
        return equipment == NONE;
    }
    


    public User(int level, int attack, String name){
        this.attack =attack;
        this.level=level;
        this.name=name;
       
    }

    public int  num1(){ //输出武力值
        int num=0;
        if (inTeam()){
            if(equipment==0){
                num = (level * 3) + attack;
            }
            if(equipment==1){
                num = 2*((level*3)+attack);
            } 
        }
        if(isAlone()){
            num =0;
        }
        return num;
    }
    
    public void show(){
        //信息介绍
        if (inTeam()){
            if(equipment==0){
                System.out.println("等级："+level+" 角色名称："+name+"武器：无");
            }
            if(equipment==1){
                System.out.println("等级："+level+" 角色名称："+name+"武器"+element());


            }
        }
        if(isAlone()){
            System.out.println("角色待定");
        }
    }

    
    public  void add_user(){

        if(this.inTeam()){
            System.out.println("该队员已在队伍中");
        }
        else {
            state=0;
            System.out.println("该队员已加入队伍");

        }
    }
    
    public void tr(){

        if(this.inTeam()){
            state=1;
            System.out.println("该队员已退出");
        }
        else{
            System.out.println("该队员没在队伍中");

        }
    }

    public  void ae(){

        if(this.he()){
            System.out.println("该队员已拥有武器");
        }
        else{
            equipment=1;
            System.out.println("角色已佩戴武器");

        }
    }

    public void te(){

        if(this.he()){
           equipment=0;
            System.out.println("角色已解除武器");
        }
        else{
            System.out.println("该队员没有武器");

        }
    }


    @Override
    public String element() {
        return null;
    }
}
