package io.hedwig.dp.creational.prototype;

public class ElfSam extends Sam{

	public ElfSam() {
    }

	public ElfSam(ElfSam mage) {
	}

	@Override
	public Sam clone() throws CloneNotSupportedException {
		return new ElfSam(this);
	}

	@Override
	public String toString() {
		return "Elven Sam";
	}

}
