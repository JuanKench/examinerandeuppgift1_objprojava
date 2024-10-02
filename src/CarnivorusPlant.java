class CarnivorusPlant extends Mathwater implements Waterble {
    //inkapsling
    private String namn;
    private double height;
    private double watering;
    // enums här
    private WaterType waterType;

    public CarnivorusPlant(String namn, double height){
        this.namn = namn;
        this.height = height;
        this.watering = calculateCarnivorusPlantwater(height);
        // enums här
        this.waterType = WaterType.proteinWater;
    }
    public String getWaterNeeds(){
        return namn + " (köttätande växten) behöver " + watering + " liter " + waterType.getWater() + " per dag";
    }
    public String getNamn(){
        return  namn;
    }
    public double getHeight(){
        return height;
    }
    public double getWatering() {
        return watering;
    }
    public WaterType getWaterType(){
        return waterType;
    }
}
