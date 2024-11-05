 final int VANILLA_PRICE = 80;
 final int CHOCOLATE_PRICE = 41;
 final int STRAWBERRY_PRICE = 80;
 final int CONE_PRICE = 100;
 void processOrder(String flavor, int scoops) { if ("v".equals(flavor)) { double totalCost = CONE_PRICE + VANILLA_PRICE * scoops; System.out.printf("That will be %.2f please.", totalCost);} else if ("c".equals(flavor)) { double totalCost = CONE_PRICE + CHOCOLATE_PRICE * scoops; System.out.printf("That will be %.2f please.", totalCost);} else if ("s".equals(flavor)) { double totalCost = CONE_PRICE + STRAWBERRY_PRICE * scoops; System.out.printf("That will be %.2f please.", totalCost);} else { System.out.println("We don't have that flavor.");}}
processOrder("w",1)
processOrder("c",3)