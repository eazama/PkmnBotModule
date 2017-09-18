/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.pkmn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.TreeMap;
import java.util.TreeSet;
import ytt.dijidori.discordbot.core.ConfigCore;

/**
 *
 * @author Eric
 */
public class Level {

    int exp;
    Group group;

    public int getLevel(){
        return 100;
    }
    
    public Level(Group group) {
        this(0, group);
    }

    public Level(int exp, Group group) {
        this.exp = exp;
        this.group = group;
    }
/*
    private static List<TreeMap<Object, Object>> expVals = new ArrayList<>(
            Arrays.asList(
                    new TreeMap<>(ConfigUtils.loadProperties("data/pkmn/Erratic.txt")),
                    new TreeMap<>(ConfigUtils.loadProperties("data/pkmn/Fast.txt")),
                    new TreeMap<>(ConfigUtils.loadProperties("data/pkmn/MediumFast.txt")),
                    new TreeMap<>(ConfigUtils.loadProperties("data/pkmn/MediumSlow.txt")),
                    new TreeMap<>(ConfigUtils.loadProperties("data/pkmn/Slow.txt")),
                    new TreeMap<>(ConfigUtils.loadProperties("data/pkmn/Fluctuating.txt")))
    );
*/
    public enum Group {
        Erratic(0),
        Fast(1),
        MediumFast(2),
        MediumSlow(3),
        Slow(4),
        Fluctuating(5);

        private Group(int i) {
            value = i;
        }
        private final int value;

        public int value() {
            return value;
        }
    }
}
