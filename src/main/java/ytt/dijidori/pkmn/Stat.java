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
public class Stat {

    private int base;
    private int IV;
    private int EV;

    public Stat(int base, int iv) {
        this(base, iv, 0);
    }

    public Stat(int base, int iv, int ev) {
        this.base = base;
        this.IV = iv;
        this.EV = ev;
    }

    public static enum Type {
        HP(0),
        ATK(1),
        DEF(2),
        SPATK(3),
        SPDEF(4),
        SPD(5);

        Type(int i) {
            value = i;
        }

        private final int value;

        public int value() {
            return value;
        }
    }

    public int getValue(Type type, int level, int nature) {
        return type.equals(Type.HP) ? calcHP(level) : calcOther(level, nature);
    }

    public void setIV(int val) {
        if (val < 0 || val > 31) {
            throw new IllegalArgumentException("IVs must be between 0 and 31");
        }
        IV = val;
    }

    public int getIV() {
        return IV;
    }

    public int getEV() {
        return EV;
    }

    public void setEV(int val) {
        if (val < 0 || val > 252) {
            throw new IllegalArgumentException("IVs must be between 0 and 252");
        }
        EV = val;
    }

    public void addEV(int val) {
        EV = (EV + val) % 253;
    }

    private int calcHP(int level) {
        return calcCore(level) + level + 10;
    }

    private int calcOther(int level, int nature) {
        return (int) ((calcCore(level) + 5) * (1.0 + .1 * nature));
    }

    private int calcCore(int level) {
        return (2 * base + IV + (EV / 4)) * level / 100;
    }
}
