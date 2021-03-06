package com.astralsmp.plugin.data.item;

import com.astralsmp.plugin.data.CustomItem;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.plugin.Plugin;

public class ItAventurineOre extends CustomItem {

    public ItAventurineOre(Plugin plugin) {
        super(plugin);
    }

    @Override
    public void init() {
        setInstrument(Instrument.BANJO);
        setNote(new Note(1));
        setPlaceable(true);
        setPlaceSound("block.stone.place");
        setItemName("Авантюриновая руда");
        setCustomModelDataID(9600);
        setNmsName("aventurine_ore");
        setLore(null);
    }
}
