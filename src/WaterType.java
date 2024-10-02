public enum WaterType {


    tapWater("kran vatten"),
    mineralWater("mineral vatten"),
    proteinWater("protein dryck");

    private String water;
    WaterType(String water){
        this.water = water;
    }
    public String getWater(){
        return water;
    }
}
