class Mathwater {

    // Palmer behöver 0.5 liter kranvatten åer dag * sin längd i meter. 0.5 * X = vatten
    public double calculatePalmtreewater(int height){
        return 0.5 * height;
    }

    /*
    Köttötande växter behöver alltid en basnivå av 0.1 liter proteindryck per dag och sedan ett extra tillskot
    med 0.2 liter proteindryck * sin längdi meter. 0.1 + (0.2X) = proteindryck
     */
    public double calculateCarnivorusPlantwater(double height){
        return 0.1 + (0.2 * height);
    }

    //kaktusar varje kaktus ska ha 2 cl mineralvatten/dag oberoende av kaktusens storlek
    public double calculateCactuswater(double height){
        return 0.02; //cl till L
    }
}