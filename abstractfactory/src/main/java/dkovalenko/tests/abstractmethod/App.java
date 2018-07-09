package dkovalenko.tests.abstractmethod;


import dkovalenko.tests.abstractmethod.console.ConsoleUserCooperator;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        UserCooperator userCooperator = new ConsoleUserCooperator();
        DeviceFactory deviceFactory = userCooperator.chooseFurnitureFactory();

        Laptop laptop = deviceFactory.createLaptop();
        Computer computer = deviceFactory.createComputer();
        Watch watch = deviceFactory.createWatch();
        Phone phone = deviceFactory.createPhone();

        userCooperator.showChoice(laptop, computer, watch, phone);
        userCooperator.close();
    }
}
