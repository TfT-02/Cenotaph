package com.MoofIT.Minecraft.Cenotaph;

import org.bukkit.block.Block;
import org.bukkit.block.Sign;

public class TombBlock {
	private Block block;
	private Block lBlock;
	private Block sign;
	private Sign LocketteSign;
	private long time;
	private String owner;
	private int ownerLevel;
	private boolean lwcEnabled = false;

	TombBlock(Block block, Block lBlock, Block sign, String owner, int ownerLevel, long time) {
		this.block = block;
		this.lBlock = lBlock;
		this.sign = sign;
		this.owner = owner;
		this.ownerLevel = ownerLevel;
		this.time = time;
	}
	TombBlock(Block block, Block lBlock, Block sign, String owner, int ownerLevel, long time, boolean lwc) {
		this.block = block;
		this.lBlock = lBlock;
		this.sign = sign;
		this.owner = owner;
		this.ownerLevel = ownerLevel;
		this.time = time;
		this.lwcEnabled = lwc;
	}

	long getTime() {
		return time;
	}
	Block getBlock() {
		return block;
	}
	Block getLBlock() {
		return lBlock;
	}
	Block getSign() {
		return sign;
	}
	Sign getLocketteSign() {
		return LocketteSign;
	}
	String getOwner() {
		return owner;
	}
	int getOwnerLevel() {
		return ownerLevel;
	}
	boolean getLwcEnabled() {
		return lwcEnabled;
	}
	void setLwcEnabled(boolean val) {
		lwcEnabled = val;
	}
	void setLocketteSign(Sign sign) {
		this.LocketteSign = sign;
	}
	void removeLocketteSign() {
		this.LocketteSign = null;
	}
}
