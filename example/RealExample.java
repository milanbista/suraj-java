package example;

public class RealExample {


}

class Controller implements ControllerInterface{


    @Override
    public void acceptRequest() {

    }
}

interface ControllerInterface{
    void acceptRequest();
}


interface Service{
    void accept();
}


class ServiceImpl implements Service{
    @Override
    public void accept() {

    }
}


