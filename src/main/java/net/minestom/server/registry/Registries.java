package net.minestom.server.registry;

import net.minestom.server.entity.damage.DamageType;
import net.minestom.server.entity.metadata.animal.tameable.WolfMeta;
import net.minestom.server.instance.block.banner.BannerPattern;
import net.minestom.server.item.armor.TrimMaterial;
import net.minestom.server.item.armor.TrimPattern;
import net.minestom.server.message.ChatType;
import net.minestom.server.world.DimensionType;
import net.minestom.server.world.biome.Biome;
import org.jetbrains.annotations.NotNull;

/**
 * <p>Provides access to all the dynamic registries. {@link net.minestom.server.ServerProcess} is the most relevant
 * implementation of this interface.</p>
 *
 * @see net.minestom.server.MinecraftServer for static access to these
 */
public interface Registries {

    @NotNull DynamicRegistry<ChatType> chatType();

    @NotNull DynamicRegistry<DimensionType> dimensionType();

    @NotNull DynamicRegistry<Biome> biome();

    @NotNull DynamicRegistry<DamageType> damageType();

    @NotNull DynamicRegistry<TrimMaterial> trimMaterial();

    @NotNull DynamicRegistry<TrimPattern> trimPattern();

    @NotNull DynamicRegistry<BannerPattern> bannerPattern();

    @NotNull DynamicRegistry<WolfMeta.Variant> wolfVariant();

}
