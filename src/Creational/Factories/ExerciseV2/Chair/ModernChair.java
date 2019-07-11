package Creational.Factories.ExerciseV2.Chair;

import Creational.Factories.ExerciseV2.Wood;

public class ModernChair extends Chair {

    public ModernChair(Wood wood) {
        this.wood = wood;
    }

    @Override
    public void sitOn() {
        System.out.println("You have sitted in a Modern Chair");
    }
    
    @Override
    public String toString() {
        return "ModernChair{" + "wood=" + wood + '}';
    }
}
