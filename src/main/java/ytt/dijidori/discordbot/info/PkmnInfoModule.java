/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.discordbot.info;

import java.sql.ResultSet;
import net.dv8tion.jda.entities.User;
import ytt.dijidori.discordbot.core.Core;
import ytt.dijidori.pkmn.PkmnUtils;
import ytt.dijidori.pkmn.Pokemon;

/**
 *
 * @author Eric
 */
public class PkmnInfoModule extends AbstractInfoModule {

    @Override
    public String getModuleName() {
        return "PkmnInfo";
    }

    @Override
    public String getInfo(User u) {
        return PkmnUtils.randomPkmn(u).displayString();
    }
}
