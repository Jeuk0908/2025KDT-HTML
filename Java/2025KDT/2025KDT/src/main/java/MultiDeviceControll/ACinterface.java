package MultiDeviceControll;

public interface ACinterface {

    abstract void powerToggle();
    abstract void tempUp();
    abstract void tempDown();
    abstract void windUp();
    abstract void windDown();

    default void defaultMethod(){
    }
}
