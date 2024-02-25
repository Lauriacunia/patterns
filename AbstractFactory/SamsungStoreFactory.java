package AbstractFactory;

public class SamsungStoreFactory implements IAbstractFactory{

        public IComputadora crearComputadora() {
            return new SamsungGalaxyBook();
        }

        public ITablet crearTablet() {
            return new SamsungGalaxyTab();
        }
}
