package Creational.Factories.ExerciseV2;

import Creational.Factories.ExerciseV2.Chair.Chair;
import Creational.Factories.ExerciseV2.CoffeeTable.CoffeeTable;
import Creational.Factories.ExerciseV2.Factories.ClassicFactory;
import Creational.Factories.ExerciseV2.Factories.ModernFactory;
import Creational.Factories.ExerciseV2.Sofa.Sofa;

public class Demo {
    public static void main(String[] args) {
        final ClassicFactory classicFactory = new ClassicFactory(Wood.OAK);
        Chair classicChair = classicFactory.chair();
        CoffeeTable classicCoffeeTable = classicFactory.coffeeTable();
        Sofa classicSofa = classicFactory.sofa();
        
        final ModernFactory modernFactory = new ModernFactory(Wood.MAPLE);
        Chair modernChair = modernFactory.chair();
        CoffeeTable modernCoffeeTable = modernFactory.coffeeTable();
        Sofa modernSofa = modernFactory.sofa();
        
        System.out.println(modernChair);
        System.out.println(modernCoffeeTable);
        System.out.println(modernSofa);
        System.out.println();
        System.out.println(classicChair);
        System.out.println(classicCoffeeTable);
        System.out.println(classicSofa);
        System.out.println();
        
        classicSofa.rest();
        modernSofa.rest();
        
        //Furniture machine
        final FurnitureMachine furnitureMachine = new FurnitureMachine(new ClassicFactory(Wood.MAPLE), Wood.OAK);
        Chair machineChair = furnitureMachine.chair();
        System.out.println(machineChair);
    }
}
