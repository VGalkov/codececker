package org.example.patterns;


import org.example.system.AbstractExampleClass;
import org.example.system.Craft;

public class ExamplePrototype extends AbstractExampleClass {

    @Override
    public void runContent() {
        Craft masterClone = new Craft(true, "моделька");
        System.out.println(masterClone + " - " + masterClone.hashCode());

        //no
        Craft craftClone = masterClone.getCopy();
        System.out.println(craftClone + " - " + craftClone.hashCode());

        //>>
        CraftCloner craftCloner = new CraftCloner(masterClone);
        Craft craftClone2 = craftCloner.cloneCraft();

        System.out.println(craftClone2 + " - " + craftClone2.hashCode());
    }


    private class CraftCloner {
        Craft craft;

        public CraftCloner(Craft craft) {
            this.craft = craft;
        }

        public void setCraft(Craft craft) {
            this.craft = craft;
        }

        Craft cloneCraft() {
            return craft.getCopy();
        }
    }
}
