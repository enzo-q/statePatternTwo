public class Character {
    private DefenseStrategy defenseStrategy;
    private AttackStrategy attackStrategy;

    public Character(DefenseStrategy defenseStrategy, AttackStrategy attackStrategy) {
        this.defenseStrategy = defenseStrategy;
        this.attackStrategy = attackStrategy;
    }

    public void performDefense() {
        defenseStrategy.defend();
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}