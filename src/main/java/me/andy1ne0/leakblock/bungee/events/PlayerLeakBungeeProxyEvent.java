package me.andy1ne0.leakblock.bungee.events;

import net.md_5.bungee.api.plugin.Event;

import java.net.InetAddress;
import java.util.UUID;

/**
 * All contents of this file, except where specified elsewhere, is the copyrighted property of Andrew Petersen.
 * Any works derived from this must only be done so if permission is given beforehand by the author (Andrew Petersen).
 * Failure to receive proper permission to use the works provided will result in termination of any agreements between the third party and Andrew Petersen.
 * If permission to use the contents of this file are granted to you, the client party, you must not take credit and/or claim these works as your own.
 * Doing so will void any contracts, or permission given, by Andrew Petersen, unless notified otherwise.
 * This file is provided as-is, with absolutely no warranty provided. By using this file, you understand this
 * - regardless of if you have been warned or not prior to using this file, any liabilities or harm caused by this file is your problem.
 * If this file is available for public download, by intention of the author, derirative works without the consent of Andrew Petersen are allowed.
 * However, once again, you must give credit to the author of the code.
 * If this has been downloaded or distributed without the permission of the author, all permissions granted above are voided.
 * It is also required that in these circumstances, you cease to use the file/contents.
 * Crated: Year: 2016, Month: 04, Day: 02, 11:31
 * Package Name: me.andy1ne0.leakblock.bungee.events
 * Project Name: LeakBlock
 *
 * @author Andrew Petersen
 */
public class PlayerLeakBungeeProxyEvent extends Event {

    private final String name;
    private final UUID uuid;
    private final InetAddress address;

    public PlayerLeakBungeeProxyEvent(String name, UUID uuid, InetAddress ip){
        this.name = name;
        this.address = ip;
        this.uuid = uuid;
    }

    public UUID getUuid(){
        return uuid;
    }

    public InetAddress getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }

}
