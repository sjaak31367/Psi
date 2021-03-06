/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Psi Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 * 
 * Psi is Open Source and distributed under the
 * Psi License: http://psi.vazkii.us/license.php
 * 
 * File Created @ [14/03/2016, 16:30:00 (GMT)]
 */
package vazkii.psi.common.core.handler;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import vazkii.arl.util.ProxyRegistry;
import vazkii.psi.common.lib.LibResources;

public final class PsiSoundHandler {

	public static SoundEvent bulletCreate;
	public static SoundEvent cadCreate;
	public static SoundEvent cadShoot;
	public static SoundEvent compileError;
	public static SoundEvent levelUp;
	public static SoundEvent loopcast;
	
	public static void init() {
		bulletCreate = register("bullet_create");
		cadCreate = register("cad_create");
		cadShoot = register("cad_shoot");
		compileError = register("compile_error");
		levelUp = register("level_up");
		loopcast = register("loopcast");
	}
	
	public static SoundEvent register(String name) {
		ResourceLocation loc = new ResourceLocation(LibResources.PREFIX_MOD + name);
		SoundEvent e = new SoundEvent(loc).setRegistryName(loc);
		
		ProxyRegistry.register(e);
		
		return e;
	}
	
}
