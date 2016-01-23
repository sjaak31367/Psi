/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Psi Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 * 
 * Psi is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 * 
 * File Created @ [13/01/2016, 17:06:45 (GMT)]
 */
package vazkii.psi.common.core.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import vazkii.psi.api.internal.IInternalMethodHandler;
import vazkii.psi.api.internal.IPlayerData;
import vazkii.psi.api.spell.ISpellCache;
import vazkii.psi.api.spell.ISpellCompiler;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.client.gui.GuiProgrammer;
import vazkii.psi.common.spell.SpellCache;
import vazkii.psi.common.spell.SpellCompiler;

public final class InternalMethodHandler implements IInternalMethodHandler {

	@Override
	public IPlayerData getDataForPlayer(EntityPlayer player) {
		return PlayerDataHandler.get(player);
	}

	@Override
	public ResourceLocation getProgrammerTexture() {
		return GuiProgrammer.texture;
	}

	@Override
	public ISpellCompiler getCompiler(Spell spell) {
		return new SpellCompiler(spell);
	}

	@Override
	public ISpellCache getSpellCache() {
		return SpellCache.instance;
	}

}
