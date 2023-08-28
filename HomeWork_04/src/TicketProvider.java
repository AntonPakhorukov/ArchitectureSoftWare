import java.util.ArrayList;
import java.util.List;

/**
 * Класс поставщика билетов.
 * Имеет два метода - получить билет и обновить данные по билетам
 */
public class TicketProvider {
    List<Ticket> ticketList = new ArrayList<>();
    /**
     * Метод получения билета
     * @param rootNumber на вход принимает номер билета
     * @return возвращает билет
     */
    public Ticket getTicket(long rootNumber){
        for (Ticket t : ticketList) {
            if (t.rootNumber == rootNumber) {
                return t;
            }
        }
        return null;
    }
    /**
     * Метод обновления информации по билетам
     * @param ticket на вход принимает купленный билет
     * @return возвращает true/false, произведено ли изменения списка
     * свободных билетов с учетом покупки
     *
     * Необходимости в данном методе нет, так как
     */
//    public boolean updateTicketStatus(Ticket ticket) {
//        for (Ticket t : ticketList) {
//            if (t.rootNumber == ticket.rootNumber) {
//                t.isValid = false;
//                t.nameCustomer = ticket.nameCustomer;
//                return true;
//            }
//        }
//        return false;
//    }
}
