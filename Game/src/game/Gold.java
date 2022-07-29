package game;

/**
 * @author tedu
 */
public class Gold extends User implements Arms {

    public Gold(){
        
        super(12,54,"小金");
    }
   
    /**
     @para返回书籍做武器
        
     */
    @Override
    public String element() {
        return "book";
    }
    
    
}
