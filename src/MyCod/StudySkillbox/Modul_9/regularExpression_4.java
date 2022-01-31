package MyCod.StudySkillbox.Modul_9;

public class regularExpression_4 {
    public static void main(String[] args) {
        String phone1 = "+7 903 710-37-54";
        String phone2 = "7 (903) 968-69-45";
        String phone3 = "7999-555-55-55";
        String phone4 = "7(903)9686945";
        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
    }
    //79039995555 // формат номера к которому всех надо привести
    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]"; // регулярное выражение
        return phone.replaceAll(regex, ""); // метод замены части выражения отвечающего требованиям
        // регулярного выражения regex на второй элемент (здесь "")
    }
}

