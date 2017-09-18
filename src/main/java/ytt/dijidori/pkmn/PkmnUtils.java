/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.pkmn;

import java.util.Random;
import ytt.dijidori.multitool.EnumUtils;

/**
 *
 * @author Eric
 */
public class PkmnUtils {

    public static Pokemon randomPkmn(Object seed) {
        Random rand = new Random(seed.hashCode());
        
        Type main = EnumUtils.getRandom(Type.class, rand);
        while (main.equals(Type.None)) {
            main = EnumUtils.getRandom(Type.class, rand);
        }

        return new Pokemon(
                new Stat[]{
                    randomStat(rand), randomStat(rand),
                    randomStat(rand), randomStat(rand),
                    randomStat(rand), randomStat(rand)},
                main,
                Math.random() > .5 ? EnumUtils.getRandom(Type.class, rand) : Type.None,
                new Level(EnumUtils.getRandom(Level.Group.class, rand))
        );
    }

    public static Stat randomStat(){
        return randomStat(new Random());
    }
    
    public static Stat randomStat(Random rand) {
        return new Stat(rand.nextInt(151), rand.nextInt(32));
    }
}
