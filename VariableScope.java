public class VariableScope {

    // Step 2: Declare the global variable
    static int globalCount = 100;

    // Step 3: Start the main method
    public static void main(String[] args) {
        // Step 4: Print the globalCount in main method
        System.out.println("Global Count (from main): " + globalCount);

        // Step 6: Call showScope method from main
        showScope();
    }

    // Step 5: Create the showScope method
    public static void showScope() {
        // Declare the local variable
        int localCount = 50;

        // Print both global and local counts
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
