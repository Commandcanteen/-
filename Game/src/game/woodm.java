package game;

public class woodm extends user implements arms{

    public woodm(){
        super(143,45,"小木");
    }
    
    //返回弓
    public String element() {
        return "bow";
    }
}
