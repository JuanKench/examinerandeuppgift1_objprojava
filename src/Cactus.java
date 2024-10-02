class Cactus extends Mathwater implements Waterble{
    //inkapsling
    private String namn;
    private double watering;
    private double height;
    // enums här
    private WaterType waterType;

    public Cactus(String namn, double height){
        this.namn = namn;
        this.height = height;
        this.watering = calculateCactuswater(height);
        // enums här
        this.waterType = WaterType.mineralWater;
    }
    public String getWaterNeeds(){
        return namn + " (kaktus) behöver " + watering + " liter av " + waterType.getWater() + "varje dag";
    }

}
