package nyc.c4q;

/**
 * Created by amyquispe on 5/19/15.
 */
public abstract class AbstractAwesomeClass implements AwesomeInterface {


    AbstractAwesomeClass aweSomeObject = new ConcreteAwesomeClass(5);


    @Override
    public int getData() {
        return 5;
    }

    @Override
    public  void setData(int someData) {
        someData = 5;
    }
}
