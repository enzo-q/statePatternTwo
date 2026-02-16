public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item selected.");
        vendingMachine.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please select an item and insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine is now Out of Order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}