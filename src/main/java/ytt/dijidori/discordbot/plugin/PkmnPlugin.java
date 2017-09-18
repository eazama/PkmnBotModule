/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytt.dijidori.discordbot.plugin;

import ytt.dijidori.discordbot.command.InfoCommand;
import ytt.dijidori.discordbot.command.RespawnCommand;
import ytt.dijidori.discordbot.core.Core;
import ytt.dijidori.discordbot.info.PkmnInfoModule;

/**
 *
 * @author Eric
 */
public class PkmnPlugin implements DiscordBotPlugin{

    @Override
    public void init() {
        //Core.getInstance().registerCommand("General", new RespawnCommand());
        InfoCommand.registerInfoModule(new PkmnInfoModule());
    }
    
}
