public class UseMachine {
    public static void main(String[] args) {
        VendingMachine newMachine = new VendingMachine(2); // Initialize with 2 items

        newMachine.selectItem(); // Selected an item
        newMachine.insertCoin(50); // Insert coins
        newMachine.dispenseItem(); // Dispense the item

        System.out.println();

        newMachine.selectItem();
        newMachine.insertCoin(50);
        newMachine.dispenseItem(); // Last item dispensed, machine should be empty now and will transition to Out of Order state

        System.out.println();

        newMachine.selectItem(); // This and the following actions should indicate that the machine is out of order
        newMachine.insertCoin(50);
        newMachine.dispenseItem();

        System.out.println();

        newMachine.setOutOfOrder(); // Try setting the machine to Out of Order when it's already out of order
    }
}