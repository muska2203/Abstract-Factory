package dkovalenko.tests.abstractmethod;

public interface DeviceFactory {

    Computer createComputer();

    Laptop createLaptop();

    Phone createPhone();

    Watch createWatch();
}
