package com.bridgelabz.moodAnalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.moodAnalyser.InvalidEntryException.ExceptionType;

public class UserRegistrationTest {
	@Test
	public void whenGivenFirstNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.firstNameValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.firstNameValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenFirstNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.firstNameValidator("pooja");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenLastNameEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.lastNameValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenLastNameNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.lastNameValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenLastNameWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.lastNameValidator("avhad");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.mobileNumberValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.mobileNumberValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenMobileNumberWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.mobileNumberValidator("7653892");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenEmailEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.emailValidator("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenEmailNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.emailValidator(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenEmailWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.emailValidator("puja@gmail@.com.com");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

	@Test
	public void whenGivenPasswordEMPTY_ShouldThrowCustomException_WithTypeENTERED_EMPTY() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.passwordValidation("");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

	@Test
	public void whenGivenPasswordNULL_ShouldThrowCustomException_WithTypeENTERED_NULL() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.passwordValidation(null);
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void whenGivenPasswordWRONG_ShouldThrowCustomException_WithTypeENTERED_WRONG() {
		UserRegistration validator = new UserRegistration();
		try {
			validator.passwordValidation("pooja12");
		} catch (InvalidEntryException e) {
			assertEquals(ExceptionType.ENTERED_WRONG, e.type);
		}
	}

}
