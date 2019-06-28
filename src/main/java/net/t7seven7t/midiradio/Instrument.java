/**
 * Copyright (C) 2012 t7seven7t
 */
package net.t7seven7t.midiradio;

import org.bukkit.Sound;
import org.mineacademy.remain.model.CompSound;

/**
 * @author t7seven7t
 */
public class Instrument {
	
	public static Sound getInstrument(int patch, int channel) {
		
		if (channel == 9) { // Drums - should actually be 10 but for some reason java makes it 9...
			return CompSound.NOTE_BASS_DRUM.getSound();
		}
		
		if ((patch >= 28 && patch <= 40) || (patch >= 44 && patch <= 46)) { // Guitars & bass
			return CompSound.NOTE_BASS_GUITAR.getSound();
		}
		
		if (patch >= 113 && patch <= 119) { // Percussive
			return CompSound.NOTE_BASS_DRUM.getSound();
		}
		
		if (patch >= 120 && patch <= 127) { // Misc.
			return CompSound.NOTE_SNARE_DRUM.getSound();
		}
		
		return CompSound.NOTE_PIANO.getSound();
		
	}
	
}
