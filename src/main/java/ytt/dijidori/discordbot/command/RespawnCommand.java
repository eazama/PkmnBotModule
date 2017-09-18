/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.discordbot.command;

import net.dv8tion.jda.events.message.MessageReceivedEvent;
import ytt.dijidori.pkmn.PkmnUtils;
import ytt.dijidori.pkmn.Pokemon;

/**
 *
 * @author Eric
 */
public class RespawnCommand extends AbstractCommand{

    @Override
    public String getKeyword() {
        return "HatchPkmn";
    }

    @Override
    public String getHelp() {
        return "Usage: Command only, no arguments";
    }

    @Override
    public void runCommand(MessageReceivedEvent e) {
        Pokemon pkmn = PkmnUtils.randomPkmn(e.getAuthor().getId());
        e.getChannel().sendMessage(pkmn.displayString());
    }
    
}
