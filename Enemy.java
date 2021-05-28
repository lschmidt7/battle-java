public class Enemy extends Player implements Fight {
    
    public Enemy(float power, float energy)
    {
        setPower(power);
        setEnergy(energy + 0.15f * energy);
    }

    public float attack()
    {
        return getPower() * Item.random();
    }

    public void defend(float damage)
    {
        setEnergy(getEnergy() - damage);
    }

}
