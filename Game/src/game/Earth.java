package game;
/**
 * @author tedu
 */
public class Earth extends User implements Arms {


    public Earth(){
        super(23,4,"小土");
    }


    /**
     @para返回盾

     */
    @Override
    public String element() {
        return "shield";
    }
    
    
}
