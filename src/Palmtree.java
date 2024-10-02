class Palmtree extends Mathwater implements Waterble{
    private String namn;
    private int height;
    private double watering;
    private WaterType waterType;

    public Palmtree(String namn, int height){
        this.namn = namn;
        this.height = height;
        this.watering = calculatePalmtreewater(height);
        this.waterType = WaterType.tapWater;
    }
    public String getWaterNeeds(){
        return namn + "(Palmen) behöver " + watering + " Liter " + waterType.getWater() +  " per dag";
    }
    public String getNamn(){
        return namn;
    }
    public int getHeight(){
        return height;
    }
    public double getWatering(){
        return watering;
    }
    public WaterType getWaterType(){
        return waterType;
    }
}