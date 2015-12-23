package io.hedwig.dp.creational.prototype;

public class ElfAdams extends Adams {

	public ElfAdams() {
    }

	public ElfAdams(ElfAdams warlord) {
	}

	@Override
	public Adams clone() throws CloneNotSupportedException {
		return new ElfAdams(this);
	}

	@Override
	public String toString() {
		return "Elven Adams";
	}

}