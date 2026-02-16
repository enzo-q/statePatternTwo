public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Machine is Out of Order. Cannot select item.");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount) {
        System.out.println("Machine is Out of Order. Cannot insert coins.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Machine is Out of Order. Cannot dispense item.");
    }

    @Override
    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Machine is already Out of Order.");
    }
}