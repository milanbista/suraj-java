package advanced;

public class T {

    public static void main(String[] args) {

        Earth a = new Earth();
    }
}


abstract class Planet{
    protected void revolve(){}

    abstract void rotate();
}

class Earth extends Planet{

    void resolve(){

    }

    protected void rotate() {

    }
}
