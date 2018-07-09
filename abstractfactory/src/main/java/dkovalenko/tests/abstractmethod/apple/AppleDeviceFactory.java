package dkovalenko.tests.abstractmethod.apple;

import dkovalenko.tests.abstractmethod.Computer;
import dkovalenko.tests.abstractmethod.DeviceFactory;
import dkovalenko.tests.abstractmethod.Laptop;
import dkovalenko.tests.abstractmethod.Phone;
import dkovalenko.tests.abstractmethod.Watch;

public class AppleDeviceFactory implements DeviceFactory {

    public Computer createComputer() {
        return new AppleComputer();
    }

    public Laptop createLaptop() {
        return new AppleLaptop();
    }

    public Phone createPhone() {
        return new ApplePhone();
    }

    public Watch createWatch() {
        return new AppleWatch();
    }
}
