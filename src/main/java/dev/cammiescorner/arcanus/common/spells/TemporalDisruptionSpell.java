package dev.cammiescorner.arcanus.common.spells;

import dev.cammiescorner.arcanus.api.spells.AuraType;
import dev.cammiescorner.arcanus.api.spells.Spell;
import dev.cammiescorner.arcanus.api.spells.SpellComplexity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TemporalDisruptionSpell extends Spell {
	public TemporalDisruptionSpell() {
		super(AuraType.SPECIALIST, SpellComplexity.UNIQUE, 400, true);
	}

	@Override
	public void cast(World world, LivingEntity entity, Vec3d pos) {

	}
}