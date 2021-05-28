public class Hero extends Player implements Fight {
    
    public Hero(float power, float energy)
    {
        setPower(power + 0.2f * power);
        setEnergy(energy);
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
