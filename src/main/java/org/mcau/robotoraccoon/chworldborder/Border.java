package org.mcau.robotoraccoon.chworldborder;

import com.laytonsmith.abstraction.MCLocation;
import com.laytonsmith.abstraction.StaticLayer;
import com.laytonsmith.annotations.api;
import com.laytonsmith.core.CHVersion;
import com.laytonsmith.core.ObjectGenerator;
import com.laytonsmith.core.Static;
import com.laytonsmith.core.constructs.*;
import com.laytonsmith.core.environments.Environment;
import com.laytonsmith.core.exceptions.CRE.CREInvalidWorldException;
import com.laytonsmith.core.exceptions.CRE.CREThrowable;
import com.laytonsmith.core.exceptions.ConfigRuntimeException;
import com.laytonsmith.core.functions.AbstractFunction;
import com.laytonsmith.core.functions.Exceptions;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

public class Border {

    public static String docs() {
        return "Provides functions to hook into the server's World Border";
    }

    public static World myGetWorld(Construct... args) {
        return Bukkit.getWorlds().get(0);
        // Currently pointless as all worlds have the same border...
        //return Bukkit.getWorld(args[0].toString());
    }

    public static MCLocation myGetLocation(Target t, Location loc, Construct... args) {
        return StaticLayer.GetLocation(
                Static.getWorld(Bukkit.getWorlds().get(0).getName(), t),
                loc.getX(),
                loc.getY(),
                loc.getZ());
    }

    @api
    public static class border_get_center extends AbstractFunction {

        @Override
        public String getName() {
            return "border_get_center";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "locationArray {[world]} Gets the current border center.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            Location loc = myGetWorld(args).getWorldBorder().getCenter();
            return ObjectGenerator.GetGenerator().location( myGetLocation(t, loc, args) );
        }
    }

    @api
    public static class border_get_damage_amount extends AbstractFunction {

        @Override
        public String getName() {
            return "border_get_damage_amount";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "double {[world]} Gets the current border damage amount.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            return new CDouble(myGetWorld(args).getWorldBorder().getDamageAmount(), t);
        }
    }

    @api
    public static class border_get_damage_buffer extends AbstractFunction {

        @Override
        public String getName() {
            return "border_get_damage_buffer";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "double {[world]} Gets the current border damage buffer.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            return new CDouble(myGetWorld(args).getWorldBorder().getDamageBuffer(), t);
        }
    }

    @api
    public static class border_get_size extends AbstractFunction {

        @Override
        public String getName() {
            return "border_get_size";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "double {[world]} Gets the current border size.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            return new CDouble(myGetWorld(args).getWorldBorder().getSize(), t);
        }
    }

    @api
    public static class border_get_warning_distance extends AbstractFunction {

        @Override
        public String getName() {
            return "border_get_warning_distance";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "int {[world]} Gets the current border warning distance.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            return new CInt(myGetWorld(args).getWorldBorder().getWarningDistance(), t);
        }
    }

    @api
    public static class border_get_warning_time extends AbstractFunction {

        @Override
        public String getName() {
            return "border_get_warning_time";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "int {[world]} Gets the current border warning time in seconds.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            return new CInt(myGetWorld(args).getWorldBorder().getWarningTime(), t);
        }
    }

    @api
    public static class border_reset extends AbstractFunction {

        @Override
        public String getName() {
            return "border_reset";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{0,1};
        }

        @Override
        public String docs() {
            return "void {[world]} Resets the border to default values.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().reset();
            return CVoid.VOID;
        }
    }

    @api
    public static class border_set_center extends AbstractFunction {

        @Override
        public String getName() {
            return "border_set_center";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{2,3};
        }

        @Override
        public String docs() {
            return "void {x, z, [world]} Sets the new border center.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().setCenter(
                    Static.getDouble(args[0], t),
                    Static.getDouble(args[1], t)
            );
            return CVoid.VOID;
        }
    }

    @api
    public static class border_set_damage_amount extends AbstractFunction {

        @Override
        public String getName() {
            return "border_set_damage_amount";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{1,2};
        }

        @Override
        public String docs() {
            return "void {damage, [world]} Sets the amount of damage a player takes when outside the border plus the border buffer.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().setDamageAmount(
                    Static.getDouble(args[0], t)
            );
            return CVoid.VOID;
        }
    }

    @api
    public static class border_set_damage_buffer extends AbstractFunction {

        @Override
        public String getName() {
            return "border_set_damage_buffer";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{1,2};
        }

        @Override
        public String docs() {
            return "void {blocks, [world]} Sets the amount of blocks a player may safely be outside the border before taking damage.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().setDamageBuffer(
                    Static.getDouble(args[0], t)
            );
            return CVoid.VOID;
        }
    }

    @api
    public static class border_set_size extends AbstractFunction {

        @Override
        public String getName() {
            return "border_set_size";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{2,3};
        }

        @Override
        public String docs() {
            return "void {blocks, seconds, [world]} Sets the border to a square region with the specified size in blocks.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().setSize(
                    Static.getDouble(args[0], t),
                    Static.getInt(args[1], t)
            );
            return CVoid.VOID;
        }
    }

    @api
    public static class border_set_warning_distance extends AbstractFunction {

        @Override
        public String getName() {
            return "border_set_warning_distance";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{1,2};
        }

        @Override
        public String docs() {
            return "void {blocks, [world]} Sets the warning distance that causes the screen to be " +
                    "tinted red when the player is within the specified number of blocks from the border.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().setWarningDistance(
                    Static.getInt32(args[0], t)
            );
            return CVoid.VOID;
        }
    }

    @api
    public static class border_set_warning_time extends AbstractFunction {

        @Override
        public String getName() {
            return "border_set_warning_time";
        }

        @Override
        public Integer[] numArgs() {
            return new Integer[]{1,2};
        }

        @Override
        public String docs() {
            return "void {seconds, [world]} Sets the warning time that causes the screen to be " +
                    "tinted red when a contracting border will reach the player within the specified time.";
        }

        @Override
        public Class<? extends CREThrowable>[] thrown() {
            return new Class[]{
                    CREInvalidWorldException.class
            };
        }

        @Override
        public boolean isRestricted() {
            return true;
        }

        @Override
        public CHVersion since() {
            return CHVersion.V3_3_1;
        }

        @Override
        public Boolean runAsync() {
            return null;
        }

        @Override
        public Construct exec(Target t, Environment env, Construct... args) throws ConfigRuntimeException {
            myGetWorld(args).getWorldBorder().setWarningTime(
                    Static.getInt32(args[0], t)
            );
            return CVoid.VOID;
        }
    }
}
