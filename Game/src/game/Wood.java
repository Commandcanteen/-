package game;

/**
 * @author tedu
 */
public class Wood extends User implements Arms {

    public Wood(){
        super(143,45,"小木");
    }

    /**
     @para//返回弓
     */
    @Override
    public String element() {
        return "bow";
    }
}
