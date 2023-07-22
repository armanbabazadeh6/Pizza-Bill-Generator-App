public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraTopingsPrice = 150;
    private int backPack = 20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }


    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraTopingsPrice;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Base pizza cost "+ this.basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+= "Extra cheese added: "+ extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra toppings added: "+ extraTopingsPrice+ "\n";
        }
        if(isOptedForTakeAway){
            bill+= "Extra cheese added: "+ backPack+ "\n";
        }

        bill+= "Bill: "+this.price+ "\n";
        System.out.println(bill);
    }
  

}
