class Cactus extends Mathwater implements Waterble{
    private String namn;
    private double watering;
    private double height;
    private WaterType waterType;

    public Cactus(String namn, double height){
        this.namn = namn;
        this.height = height;
        this.watering = calculateCactuswater(height);
        this.waterType = WaterType.mineralWater;
    }
    public String getWaterNeeds(){
        return namn + " (kaktus) behöver " + watering + " liter av " + waterType.getWater() + "varje dag";
    }

}
