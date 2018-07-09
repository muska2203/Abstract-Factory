package dkovalenko.tests.abstractmethod.microsoft;

import dkovalenko.tests.abstractmethod.Computer;
import dkovalenko.tests.abstractmethod.DeviceFactory;
import dkovalenko.tests.abstractmethod.Laptop;
import dkovalenko.tests.abstractmethod.Phone;
import dkovalenko.tests.abstractmethod.Watch;

public class MicrosoftDeviceFactory implements DeviceFactory {

    public Computer createComputer() {
        return new MicrosoftComputer();
    }

    public Laptop createLaptop() {
        return new MicrosoftLaptop();
    }

    public Phone createPhone() {
        return new MicrosoftPhone();
    }

    public Watch createWatch() {
        return new MicrosoftWatch();
    }
}
