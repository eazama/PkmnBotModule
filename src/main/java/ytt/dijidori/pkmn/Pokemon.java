/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.pkmn;

/**
 *
 * @author Eric
 */
public class Pokemon {
    private Stat[] stats;
    private Type type1;
    private Type type2;
    private Level level;
    
    public Pokemon(Stat[] stats, Type type1, Type type2, Level level){
        if(stats.length != 6){
            throw new IllegalArgumentException("There must be six stats");
        }
        this.stats = stats;
        this.type1 = type1;
        this.type2 = type2;
        this.level = level;
    }
    
    public int getStat(Stat.Type type){
        return stats[type.value()].getValue(type, 0, 0);
    }
    
    public String displayString(){
        String formatString = "```\nType: %s%s\nHP: %3d\nAtk:   %3d  Def:   %3d\nSpAtk: %3d  SpDef: %3d\nSpd:   %3d```";
        return String.format(formatString, type1.toString(),
                type2.equals(Type.None)?"":"/"+type2.toString(),
                stats[0].getValue(Stat.Type.HP, 100, 0),
                stats[1].getValue(Stat.Type.ATK, 100, 0),
                stats[2].getValue(Stat.Type.DEF, 100, 0),
                stats[3].getValue(Stat.Type.SPATK, 100, 0),
                stats[4].getValue(Stat.Type.SPDEF, 100, 0),
                stats[5].getValue(Stat.Type.SPD, 100, 0));
    }
}
