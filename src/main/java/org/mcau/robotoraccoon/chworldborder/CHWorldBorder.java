package org.mcau.robotoraccoon.chworldborder;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;

import java.lang.Override;
import java.lang.System;

@MSExtension("CHWorldBorder")
public class CHWorldBorder extends AbstractExtension {
    @Override
    public void onStartup() {
        System.out.println("CHWorldBorder " + getVersion() + " loaded.");
    }
    
    @Override
    public void onShutdown() {
        System.out.println("CHWorldBorder " + getVersion() + " unloaded.");
    }

    @Override
    public Version getVersion() {
        return new SimpleVersion(2,0,0);
    }
}
