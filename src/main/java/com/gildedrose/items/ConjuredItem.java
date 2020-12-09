package com.gildedrose.items;

import com.gildedrose.core.Item;

public class ConjuredItem extends Item {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int factor;
        if (this.sellIn > 5) factor = -1;
        else if (this.sellIn  <5 && this.sellIn >= 0) factor = -2;
        else if (this.sellIn < 0) factor = -4;
        else factor = 4;
        this.quality = Math.max(this.quality - factor, 0);
    }
}
//selling > 5 factor -1 tussen 0 en 5 -2 onder 0 -4
