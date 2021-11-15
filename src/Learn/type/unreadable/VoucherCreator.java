package Learn.type.unreadable;


public class VoucherCreator {
    public static Voucher createVoucher (String inputData) { // считывание типов данных Voucher в строке
        Voucher voucher = null;
        String[] params = inputData.split(":"); // Разделение строки по : и формирование массива
        String dataType = params[0].toUpperCase().trim().replaceAll(" ", "_"); //
        // params[0].toUpperCase() - переведен верхний регистр
        //trim() - уберает пробелы
        // replaceAll(" ", "_") - замена " " на "_"
        VoucherType type = VoucherType.valueOf(dataType); // valueOf - преобразует в нужный тип данных
        return new Voucher(type); // создание объекта и передача туда типа ваучера
    }
}
