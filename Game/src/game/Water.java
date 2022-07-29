package game;
/**
 * @author tedu
 */
public class Water extends User implements Arms {

    public Water(){
        super(243,46,"小水");
    }
    
    
    /**
     @para返回琴

     */
    @Override
    public String element() {
        return "Piano";
    }
}
