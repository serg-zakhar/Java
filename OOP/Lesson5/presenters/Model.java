package OOP.Lesson5.presenters;

import OOP.Lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    /**
     * Получение всех доступных столиков
     * @return столики
     */
    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

}
