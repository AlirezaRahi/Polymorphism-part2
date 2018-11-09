package org.studyeasy;

import org.studyeasy.phone.Nokia;
import org.studyeasy.phone.Phone;
import org.studyeasy.phone.Samsung;

public class Hello {

	public static void main(String[] args) {

		/*
		 * Phone phone =new Phone("Nokia 3310"); System.out.println(phone.getModel());
		 * phone.features();
		 * 
		 * SamsungNote8 not8 = new SamsungNote8("Not8") ;
		 * System.out.println(not8.getModel()); not8.features();
		 */

		/*
		 * Phone nokia3310 = new Nokia("Nokia 3310");
		 * System.out.println(nokia3310.getModel()); nokia3310.features();
		 */

		/*
		 * Phone not8 = new Samsung("Not8"); System.out.println(not8.getModel());
		 * not8.features();
		 */

		Phone nokia3310 = new Hello().phone(1);
		System.out.println(nokia3310.getModel());
		nokia3310.features();

		Phone not8 = new Hello().phone(2);
		System.out.println(not8.getModel());
		not8.features();

	}

	public Phone phone(int dailyDriver) {

		switch (dailyDriver) {
		case 1:
			return new Nokia("3310");
		case 2:
			return new Samsung("Note 5");

		}
		return null;

	}

}
