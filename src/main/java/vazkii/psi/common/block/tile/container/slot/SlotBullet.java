/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Psi Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: http://psi.vazkii.us/license.php
 *
 * File Created @ [10/01/2016, 17:30:17 (GMT)]
 */
package vazkii.psi.common.block.tile.container.slot;

import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import vazkii.psi.api.cad.ICAD;
import vazkii.psi.api.spell.ISpellContainer;
import vazkii.psi.common.block.tile.TileCADAssembler;

public class SlotBullet extends Slot {

	TileCADAssembler assembler;
	int socketSlot;

	public SlotBullet(TileCADAssembler inventoryIn, int index, int xPosition, int yPosition, int socketSlot) {
		super(inventoryIn, index, xPosition, yPosition);
		assembler = inventoryIn;
		this.socketSlot = socketSlot;
	}

	@Override
	public boolean isItemValid(ItemStack stack) {
		if(stack.getItem() instanceof ISpellContainer) {
			ISpellContainer container = (ISpellContainer) stack.getItem();
			if(container.containsSpell(stack) && assembler.isBulletSlotEnabled(socketSlot)) {
				ItemStack socketableStack = assembler.getStackInSlot(6);
				if(container.isCADOnlyContainer(stack))
					return socketableStack.getItem() instanceof ICAD;
				return true;
			}
		}

		return false;
	}

}
