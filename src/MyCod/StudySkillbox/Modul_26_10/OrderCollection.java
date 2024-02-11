package MyCod.StudySkillbox.Modul_26_10;

public interface OrderCollection {
    void addOrder(Order order);
    void removeOrder(Order order);
    OrderIterator iterator(DeliveryType deliveryType);


}
