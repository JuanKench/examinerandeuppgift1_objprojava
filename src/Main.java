import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String configtext = "vad heter din planta (du har 4 val på 1: Laura 2: Meatloaf 3: Iggy 4: Olof) ";
        String plantName = JOptionPane.showInputDialog(configtext);

        //här andvänds interfacet
        Waterble plant = null;

        if (plantName.equalsIgnoreCase("Laura")){
            //polymorfism är här
            plant = new Palmtree(plantName, 5);
        }else if (plantName.equalsIgnoreCase("Meatloaf")){
            plant = new CarnivorusPlant(plantName, 0.7);
        }else if (plantName.equalsIgnoreCase("Iggy")){
            plant = new Cactus(plantName, 0.2);
        }else if (plantName.equalsIgnoreCase("Olof")){
            plant = new Palmtree(plantName, 1);
        } else{
            JOptionPane.showMessageDialog(null, "whomp whomp fel namn");
            System.exit(0);
        }
        String result = plant.getWaterNeeds();
        JOptionPane.showMessageDialog(null, result," vattnet som behöves ", JOptionPane.INFORMATION_MESSAGE);
    }
}