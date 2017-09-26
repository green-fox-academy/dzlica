public class Aircraft {
    int ammo;
    int baseDamage;
    int maxAmmo;
    String name;

    public Aircraft() {

    }

    public int fight() {
        int damage = this.baseDamage * this.ammo;
        this.ammo = 0;
        return damage;
    }

    public int refill(int fillIt) {
        int result = 0;
        int used = this.maxAmmo - this.ammo;
        if (used <= fillIt) {
            result = fillIt - used;
            this.ammo = this.maxAmmo;
        } else {
            result = 0;
            this.ammo = this.ammo + fillIt;
        }
        return result;
    }

    public String getType() {
        return this.name;
    }

    public void getStatus() {
        System.out.println("Type" + this.name + ", Ammo: 10" + this.ammo + ", Base Damage" + this.baseDamage + ", All Damage" + (this.baseDamage * this.ammo));
    }
}
