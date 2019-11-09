package com.example.burgerking;

public class MainBurger {

    private int BurgerCalculate;
    private int CheeseCalculate;
    private int OnionsCalculate;
    private int SauceCalculate;

    static final int BeefBurger = 50;
    static final int ChickenBurger = 100;
    static final int TurkeyBurger = 150;
    static final int BlueCheese = 40;
    static final int CheddarCheese = 60;
    static final int CaramelizedOnions = 20;

    public int getBurgerCalculate() {
        return BurgerCalculate;
    }

    public void setBurgerCalculate(int burgerCalculate) {
        BurgerCalculate = burgerCalculate;
    }

    public int getCheeseCalculate() {
        return CheeseCalculate;
    }

    public void setCheeseCalculate(int cheeseCalculate) {
        CheeseCalculate = cheeseCalculate;
    }

    public int getOnionsCalculate() {
        return OnionsCalculate;
    }

    public void setOnionsCalculate(int onionsCalculate) {
        OnionsCalculate = onionsCalculate;
    }

    public int getSauecCalculate() {
        return SauceCalculate;
    }

    public void setSauecCalculate(int sauecCalculate) {
        SauceCalculate = sauecCalculate;
    }

    public MainBurger() {
        BurgerCalculate = BeefBurger;
        CheeseCalculate = CheddarCheese;
        OnionsCalculate = 0;
        SauceCalculate = 0; }


    public void Burger (int Choice) {
        if(Choice == 1){
            BurgerCalculate = BeefBurger;
        }
        else if(Choice == 2){
            BurgerCalculate = ChickenBurger;
        }
        else if(Choice == 3){
            BurgerCalculate = TurkeyBurger;
        }
    }

    public void Cheese(int Choice)
    {
        if(Choice == 1){
            CheeseCalculate = CheddarCheese;
        }
        else{
            CheeseCalculate = BlueCheese;
        }
    }

    public void Onions(boolean Checked)
    {
        if(Checked == true) {
            OnionsCalculate = CaramelizedOnions;
        }
        else{
            OnionsCalculate = 0;
        }
    }

    public int CalculateCalories() {
        return BurgerCalculate + CheeseCalculate + OnionsCalculate + SauceCalculate; //  Calculate Total Calories By Adding All Ingredients Together.
    }
}

