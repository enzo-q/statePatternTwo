public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected. Please insert coins.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        vendingMachine.addBalance(amount);
        System.out.println("Inserted " + amount + " cents. Current balance: " + vendingMachine.getBalance() + " cents.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        // Check if the balance is sufficient to dispense the item
        if (vendingMachine.getBalance() >= vendingMachine.getItemPrice()) {
            vendingMachine.setState(new DispensingState());
            vendingMachine.dispenseItem();
        } else {
            System.out.println("Insufficient amount. Needed amount is " + vendingMachine.getItemPrice() + " cents.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine is now Out of Order. Refunding amount.");
        vendingMachine.setState(new OutOfOrderState());
        vendingMachine.consumeBalance(); // Refund amount
        vendingMachine.setState(new OutOfOrderState());
    }
}