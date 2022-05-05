package dev.cammiescorner.arcanus.common.spells;

import dev.cammiescorner.arcanus.api.spells.AuraType;
import dev.cammiescorner.arcanus.api.spells.Spell;
import dev.cammiescorner.arcanus.api.spells.SpellComplexity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AnimateArmourSpell extends Spell {
	public AnimateArmourSpell() {
		super(AuraType.MANIPULATOR, SpellComplexity.COMPLEX, 200, true);
	}

	@Override
	public void cast(World world, LivingEntity entity, Vec3d pos) {

	}
}
