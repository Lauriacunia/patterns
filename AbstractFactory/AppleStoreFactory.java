package AbstractFactory;

public class AppleStoreFactory implements IAbstractFactory{

    public IComputadora crearComputadora() {
        return new MacbookPro();
    }

    public ITablet crearTablet() {
        return new IPad();
    }
}
