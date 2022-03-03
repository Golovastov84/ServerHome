package Learn.function;

abstract class MetalGearCharacter {
    abstract void useWeapon(String weapon);
}
class BigBoss extends MetalGearCharacter {
    @Override
    void useWeapon(String weapon) {
        System.out.println("Big Boss is using a " + weapon);
    }
    void giveOrderToTheArmy(String orderMessage) {
        System.out.println(orderMessage);
    }
}
class SolidSnake extends MetalGearCharacter {
    void useWeapon(String weapon) {
        System.out.println("Solid Snake is using a " + weapon);
    }
}
class UseSpecificMethod {
    public static void executeActionWith(MetalGearCharacter metalGearCharacter) {
        metalGearCharacter.useWeapon("SOCOM");
        // Следующая строка не будет работать
        // metalGearCharacter.giveOrderToTheArmy("Attack!");
        if (metalGearCharacter instanceof BigBoss) {
            ((BigBoss) metalGearCharacter).giveOrderToTheArmy("Attack!");
        }
    }
    public static void main(String... specificPolymorphismInvocation) {
        executeActionWith(new SolidSnake());
        executeActionWith(new BigBoss());
    }
}