package game;

public class earthm extends user implements arms{


    public earthm(){
        super(23,4,"小土");
    }
 

    //返回盾
    public String element() {
        return "shield";
    }
    
    
}
