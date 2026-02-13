public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new Shield(), new SwingSword());
        Character wizard = new Character(new CreateMagic(), new CastSpell());
        Character archer = new Character(new Dodge(), new ShootArrow());

        knight.performAttack();
        knight.performDefense();

        System.out.println();

        wizard.performAttack();
        wizard.performDefense();
        
        System.out.println();

        archer.performAttack();
        archer.performDefense();
    }
}