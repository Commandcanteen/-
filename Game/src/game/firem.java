package game;

public class firem extends user implements arms{

    public firem(){
        super(233,49,"小火");
    }
    
    //返回刀
    public String element() {
        return "knife";
    }
}
