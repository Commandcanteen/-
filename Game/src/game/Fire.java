package game;
/**
 * @author tedu
 */

public class Fire extends User implements Arms {

    public Fire(){
        super(233,49,"小火");
    }
    
  
    /**
     @para返回刀

     */
    @Override
    public String element() {
        
        return "knife";
    }
}
