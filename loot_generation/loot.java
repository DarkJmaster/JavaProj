package loot_generation;
import java.util.Random;


public class loot
{   
    public void lowTier()
    {
        String[] low_tier = {"Worn polearm", "Worn Blaster", "Worn Knife", "Worn Rifle", "Worn Sword", "Rusty Blade"};
        Random loot_generation_low = new Random();
        if (getRandomBool())
        {
        int index = loot_generation_low.nextInt(low_tier.length);
        System.out.println("You looted a " +low_tier[index]);
        }
    }

    public boolean getRandomBool()
    {
        Random loot_chance = new Random();
        int chance_bool = loot_chance.nextInt(4);
        if ( chance_bool == 1 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

