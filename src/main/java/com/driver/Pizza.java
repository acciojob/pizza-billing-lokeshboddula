package com.driver;

public class Pizza {

    private int basePrice;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int bagPrice;
    private int totalPrice;
    public boolean isCheeseAdded;
    public boolean isToppingsAdded;
    public boolean paperBagAdded;
    public boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        if(isVeg) {
            basePrice = 300;
            toppingsPrice = 70;
        } else {
            basePrice = 400;
            toppingsPrice = 120;
        }
        bagPrice = 20;
        cheesePrice = 80;
        isCheeseAdded = false;
        isToppingsAdded = false;
        paperBagAdded = false;
        isBillGenerated = false;
        totalPrice = basePrice;
        bill = "Base Price Of The Pizza: " + basePrice + "\n";
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded) {
            this.totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!isToppingsAdded) {
            this.totalPrice += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!paperBagAdded) {
            this.totalPrice += bagPrice;
            paperBagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if(isCheeseAdded) {
                bill += "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if (isToppingsAdded) {
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }
            if(paperBagAdded) {
                bill+= "Paperbag Added: " + bagPrice + "\n";
            }

            bill += "Total Price: " + totalPrice + "\n";

            isBillGenerated = true;
        }

        return bill;
    }
}
