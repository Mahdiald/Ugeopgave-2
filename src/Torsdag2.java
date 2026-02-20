void main() {
// opgave 1
/*
    double totalPrice = 1200;
    double finalPrice = 0;
    if (totalPrice>1000){
        finalPrice = totalPrice*0.80;
        System.out.println(finalPrice + " Discount applied");
    }else{System.out.println(totalPrice);}
*/

//Opgave 2
    /*
    double weight = 120; //kg
    double height = 1.60; //meter
    double BMI = weight/(height * height);
    if (BMI >= 25) {
        System.out.println("Over vægtig");
    } else {
        System.out.println("Ikke overvægtig");


    }
*/

//opgave 3
  /*
    int hour = 14;
    if (hour>=5 && hour<=11){
        System.out.println("Good morning");
    } else if (hour>=12 && hour<=17) {
        System.out.println("Good evening");
    } else if (hour>=18 && hour<=21) {
        System.out.println("Good afternoon");
    }else {
        System.out.println("Good night");
    }
    */

//opgave 4
   /*
    int score = 60;
    String grade;
    String status;
    String comment;

    if (score >= 90) {
        grade = "A";
        comment = "Excellent";
    } else if (score >= 80) {
        grade = "B";
        comment = "Good";
    } else if (score >= 70) {
        grade = "C";
        comment = "Satisfactory";
    } else if (score >= 60) {
        grade = "D";
        comment = "Needs improvement";
    } else {
        grade = "F";
        comment = "Failing";
    }

    if (score >= 60){
        status = "PASS";
    }else{
        status = "FAIL";
    }
    System.out.println("Student Report");
    System.out.println("Score: " + score);
    System.out.println("Grade: " + grade);
    System.out.println("Status: " + status);
    System.out.println("Comment: " + comment);
    */

//Opgave 5
    /*
    double totalPrice = 299;
    boolean isMember = false;
    double shipping;

    if(totalPrice>500||(isMember==true && totalPrice>200)){
        shipping = 0;
        System.out.println("Free shipping");
    } else {
        shipping = 50;
    }
    double finalPrice = totalPrice + shipping;
    System.out.println("Total: " + finalPrice + "kr");
    System.out.println(isMember);
    */

//Opgave 10
    /*String item = "pizza";
    int quantity = 2;
    double price;
    switch (item){
        case "burger":
            price = 89;
            break;
        case "pizza":
            price = 95;
            break;
        case "salad":
            price = 65;
            break;
        case "pasta":
            price = 79;
            break;
        case "steak":
            price = 145;
            break;
        default:
            price = 0;
            System.out.println("Item not on the menu");



    }
    double order = price * quantity;
    System.out.println("Your order: " + quantity + " " + item);
    System.out.println("Your total: " + order);

     */

// opgave 11
    /*String zone = "National";
    int kg = 7;
    int delivery;
    int weight;
    switch(zone){
        case "Local":
            delivery = 50;
            break;
        case "Regional":
            delivery = 100;
            break;
        case "National":
            delivery = 150;
            break;
        case "International":
            delivery = 300;
            break;
        default:
            delivery = 0;
            System.out.println("The zone was not found");
    }
    if (kg>5){
        weight = 20;
        System.out.println("Your parcel is to heavy, an additional 20kr has been added");
    }else{
        weight = 0;
    }
    System.out.println("Your requested zone: " + zone);
    System.out.println("Zone delivery price: " + delivery + "kr");
    System.out.println("Delivery cost: " + (weight + delivery) + "kr");
     */

//opgave 12
    /*double balance = 5000;
    double amount = 1000;
    String operation = "withdraw";
    boolean complete = true;

    switch (operation){
        case "withdraw":
            if (amount <= balance){
                balance = balance - amount;
                System.out.println("Withdrawl complete: " + amount + "kr");
            }else{
                System.out.println("Insufficient balance");
                complete = false;
            }
            break;
        case "deposit":
            if (amount > 0){
                balance = balance + amount;
                System.out.println("Deposite complete: " + amount + "kr");
            }else{
                System.out.println("Insufficient balance");
                complete = false;
            }
            break;
        case "balance":
            System.out.println("Your current balance is: " + balance + "kr");
            break;
        case "transfer":
            if (amount <= balance){
                balance = balance - amount;
                System.out.println("Transfer complete: " + amount + "kr");
            }else{
                System.out.println("Insufficient balance");
                complete = false;
            }
            break;
        default:
            System.out.println("Invalid operation");
            complete = false;
    }
    if (complete && !operation.equals("balance")){
        System.out.println("Your new balance is: " + balance + "kr");
    }
     */

//opgave 15
   /* double savings = 0;
    double monthlyDeposit = 500;
    double goal = 10000;
    int months = 0;
    while (savings < goal){
        savings += monthlyDeposit;
        months ++;
        System.out.println("Month " + months + ": " + savings + " kr");
    }
    System.out.println("You've reached your goal. It took " + months + " months");
    */

//opgave 17
    /*double celsius = 0;
    double fahrenheit;
    while (celsius <= 100){
        fahrenheit = celsius*9/5+32;
        System.out.println(celsius + " = " + fahrenheit);
        celsius += 10;
    }
     */

//opgave 19
    String password = "secret123";
    Scanner scan = new Scanner(System.in);
    boolean correct = false;
    int maxAttempts = 3;
    int attempts = 0;

    while (attempts < maxAttempts && !correct){
        System.out.println("Type password: ");
        String input = scan.nextLine();
        attempts ++;

        if (input.equals(password)){
            System.out.println("Welcome");
            correct = true;
        }else{
            System.out.println("Access Denied!");
            System.out.println("Attempts left: " + attempts + "/" + maxAttempts);
            System.out.println(" ");
        }
        if (attempts == maxAttempts){
            System.out.println("SYSTEM LOCKED OUT!");
        }

    }

}
