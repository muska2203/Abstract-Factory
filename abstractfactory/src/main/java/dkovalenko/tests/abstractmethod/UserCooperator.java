package dkovalenko.tests.abstractmethod;

import java.io.Closeable;
import java.util.List;

/**
 * Интерфейс взаимодействия с пользователем.
 */
public interface UserCooperator extends Closeable {

    /**
     * Дать пользователю возможность выбрать фабрику.
     *
     * @return выбранная фабрика.
     */
    DeviceFactory chooseFurnitureFactory();


    /**
     * Вывести пользователю информацию об указанных девайсах.
     */
    void showChoice(Nameable... devices);
}
