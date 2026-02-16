public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Dispensing in progress. Cannot select item now.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Dispensing in progress. Cannot insert coins now.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        // Simulate dispensing the item
        System.out.println("Dispensing item... Thank you for your purchase!");
        vendingMachine.decreaseInventory();
        vendingMachine.consumeBalance();

        // After dispensing, check inventory and transition to the appropriate state
        if (vendingMachine.getInventory() > 0) {
            vendingMachine.setState(new IdleState());
        } else {
            System.out.println("Inventory empty. Machine will now be Out of Order.");
            vendingMachine.setState(new OutOfOrderState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Dispensing in progress. Cannot set to Out of Order.");
    }
}