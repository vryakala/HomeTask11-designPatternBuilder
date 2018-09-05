package designPatternBuilder;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Person person = new Person().builder("FIRSTNAME", "LASTNAME", "ADDRESSONE", "ADDRESSTWO",
				LocalDate.parse("2014-01-01"), "Male", true, true).build();
	}
}
