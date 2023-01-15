package org.tyoda.wurm.shorterfemalesleeves;

import org.gotti.wurmunlimited.modloader.interfaces.Versioned;
import org.gotti.wurmunlimited.modloader.interfaces.WurmServerMod;

public class Boop implements WurmServerMod, Versioned {
    public static final String version = "ty1.0";
    @Override
    public String getVersion(){
        return version;
    }
}
