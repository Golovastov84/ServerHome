package MyCod.StudySkillbox.Modul_11_2;

class King {
    King() {
        System.out.println("Call King constructor");
        speech();   //polymorphic method overriden in AerysTargaryen
    }
    public void speech() {
        System.out.println("I'm the King of the Andals!");
    }
}

class AerysTargaryen extends King {
    private String victimName;

    AerysTargaryen() {
        victimName = "Lyanna Stark";
        System.out.println("Call Aerys Targaryen constructor");
        speech();
    }

    @Override
    public void speech() {
        System.out.println("Burn " + victimName + "!");
    }
}

class Kingdom {
    public static void main(String[] args) {
        King king = new AerysTargaryen();
    }
}