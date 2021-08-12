package dev.cammiescorner.arcanus.common.entities;

import dev.cammiescorner.arcanus.core.registry.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

public class MagicMissileEntity extends PersistentProjectileEntity {
	public MagicMissileEntity(LivingEntity owner, World world) {
		super(ModEntities.MAGIC_MISSILE, owner, world);
		setNoGravity(true);
		setDamage(2D);
	}

	public MagicMissileEntity(World world, double x, double y, double z) {
		super(ModEntities.MAGIC_MISSILE, x, y, z, world);
		setNoGravity(true);
		setDamage(2D);
	}

	public MagicMissileEntity(EntityType type, World world) {
		super(type, world);
		setNoGravity(true);
		setDamage(2D);
	}

	@Override
	protected SoundEvent getHitSound() {
		return SoundEvents.ENTITY_VILLAGER_NO;
	}

	@Override
	protected void onBlockHit(BlockHitResult blockHitResult) {
		super.onBlockHit(blockHitResult);
		kill();
	}

	@Override
	protected ItemStack asItemStack() {
		return null;
	}
}