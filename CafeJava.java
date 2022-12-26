public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 9.5;
        double dripCoffePrice = 8.5;
        double lattePrice = 7.5;
        double cappuccinoPrice = 2.5;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3= true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri
        if (isReadyOrder1 == true) {
        System.out.println(customer1 + readyMessage);
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }
        //=====================================
        if (isReadyOrder4 == true) {
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage +cappuccinoPrice );
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(displayTotalMessage +lattePrice*2 );
        if (isReadyOrder2 == true) {
        System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }
        // jimmy's order
        System.out.println(displayTotalMessage + (dripCoffePrice-lattePrice));
}
}