package MyCod.StudySkillbox.Modul_10;

public class ArrayIteration {
    public static void main(String[] args) {
        int [] ticketNumbers = new int[1000]; // создаётся массив из 10000 пустых элементов
        int [] winTicket = new int[10]; // создаётся массив из 10 пустых элементов
        for( int i = 0; i < ticketNumbers.length; i++) {
            int value = 1000_000 + (int) Math.round(1000_000 * Math.random());
            // 1000 раз к переменной присваиваеся значение от 1000_000 до 2000_000
            ticketNumbers[i] = value;
            if(i % 100 == 0) { // каждый 100 выполняет следующий код
                winTicket[i / 100] = value; // значение присваивается элементу массива
            }
        }
        for(int winTicketNumber : winTicket) { // перебор значений массива через присваивание
            // значений переменной winTicketNumber
            System.out.println(winTicketNumber);
        }
        System.out.println("+++++++");
        for(int i = 0; i < winTicket.length; i++) {
            System.out.println(winTicket[i]);
        }
    }
}
