package codenamed.flavored.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Equipment;

public class WearableCarvedCauliflowerBlock extends CarvedCauliflowerBlock implements Equipment {
    public WearableCarvedCauliflowerBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }
}