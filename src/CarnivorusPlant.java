class CarnivorusPlant extends Mathwater implements Waterble {
    private String namn;
    private double height;
    private double watering;
    private WaterType waterType;

    public CarnivorusPlant(String namn, double height){
        this.namn = namn;
        this.height = height;
        this.watering = calculateCarnivorusPlantwater(height);
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
