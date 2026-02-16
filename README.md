# statePatternTwo
<h3>Software Engineering 2 | Lab Assignment 2</h3>

<h3>Problem:</h3>
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.
Requirements:
<ol>
<li>
<strong>Idle State:</strong>
<ul>
<li>Allow item selection.</li>
<li>Disallow dispensing items and inserting coins.</li>
</ul>
</li>
<li>
<strong>ItemSelected State:</strong>
<ul>
<li>Allow inserting coins and dispensing items.</li>
<li>Disallow item selection.</li>
</ul>
</li>
<li>
<strong>Dispensing State:</strong>
<ul>
<li>Allow no operations.</li>
<li>Automatically transition back to the "Idle" state after dispensing is complete.</li>
</ul>
</li>
<li>
<strong>OutOfOrder State:</strong>
<ul>
<li>Disallow all operations.</li>
</ul>
</li>
</ol>

<strong>Current System:</strong> The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</br>

<strong>Implement the State Pattern to improve code maintainability and flexibility:</strong>
<ol>
<li>
<strong>Define VendingMachine States:</strong>
<ul>
<li>Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.</li>
</ul>
</li>
<li>
<strong>Implement State Interface:</strong>
</li>
<ul>
<li>Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.</li>
</ul>
<li>
<strong>Implement State Behaviors:</strong>
</li>
<ul>
<li>Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.</li>
</ul>
<li>
<strong>Update VendingMachine Class:</strong>
</li>
<ul>
<li>Include attributes for item inventory and balance.</li>
<li>Remove state-specific logic from the VendingMachine class.</li>
<li>Introduce a reference to the current VendingMachineState object.</li>
<li>Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.</li>
</ul>
</li>
</ol>

<h3>UML Class Diagram:</h3>
