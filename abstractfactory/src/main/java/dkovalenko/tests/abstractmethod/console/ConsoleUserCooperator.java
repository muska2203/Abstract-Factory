package dkovalenko.tests.abstractmethod.console;

import dkovalenko.tests.abstractmethod.DeviceFactory;
import dkovalenko.tests.abstractmethod.Nameable;
import dkovalenko.tests.abstractmethod.UserCooperator;
import dkovalenko.tests.abstractmethod.microsoft.MicrosoftDeviceFactory;
import dkovalenko.tests.abstractmethod.apple.AppleDeviceFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Интерфейс взаимодействия с пользователем посредством консоли.
 */
public class ConsoleUserCooperator implements UserCooperator {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void close() throws IOException {
        bufferedReader.close();
    }

    @Override
    public DeviceFactory chooseFurnitureFactory() {
        while (true) {
            System.out.println("Выберите вашу любимую корпарацию : \n1 - Apple. \n2 - Microsoft.");
            try {
                int choose = Integer.parseInt(bufferedReader.readLine());
                switch (choose) {
                    case 1:
                        return new AppleDeviceFactory();
                    case 2:
                        return new MicrosoftDeviceFactory();
                    default:
                        System.out.println("Выберите один из предложенных вариантов.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Введены не верные символы.");
            }
        }
    }

    @Override
    public void showChoice(Nameable... devices) {
        System.out.println("Вам подойдут следующие девайсы: ");
        for (Nameable device : devices) {
            System.out.println(device.getName());
        }
    }
}
