public class VendingMachine {
    private VendingMachineState currentState;
    private int inventory;
    private int balance;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0;
        // Initial state based on inventory
        if (inventory > 0) {
            this.currentState = new IdleState();
        } else {
            this.currentState = new OutOfOrderState();
        }
    }
    
    // State transition methods
    public void selectItem() {
        currentState.selectItem(this);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    // Getters and setters for state, inventory, and balance
    public void setState(VendingMachineState newState) {
        this.currentState = newState;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void consumeBalance() {
        this.balance = 0;
    }

    public int getInventory() {
        return inventory;
    }

    public void decreaseInventory() {
        this.inventory--;
    }

    public int getItemPrice() {
        return 50; // Assuming a fixed price
    }
}