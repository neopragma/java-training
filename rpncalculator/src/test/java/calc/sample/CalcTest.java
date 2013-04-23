package calc.sample;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private Calc calc;
	private static final double INTEGER_ERROR_TOLERANCE = 0.5;
	private static final double FLOATING_POINT_ERROR_TOLERANCE = 0.0005;
	
	@Before
	public void before_each() {
		calc = new Calc();
	}

	@Test
	public void it_adds_two_integers() {
		calc.enter("5");
		calc.enter("3");
		calc.enter("+");
		assertThat(calc.result(), equalTo("8"));
	}

	@Test
	public void it_subtracts_two_integers() {
		calc.enter("5");
		calc.enter("3");
		calc.enter("-");
		assertThat(calc.result(), equalTo("2"));
	}

	@Test
	public void it_multiplies_two_integers() {
		calc.enter("5");
		calc.enter("3");
		calc.enter("*");
		assertThat(calc.result(), equalTo("15"));
	}

	@Test
	public void it_divides_one_integer_by_another() {
		calc.enter("54");
		calc.enter("13");
		calc.enter("/");
		assertThat(Double.parseDouble(calc.result()), closeTo(4d, INTEGER_ERROR_TOLERANCE));
	}

	@Test
	public void it_finds_the_modulus_of_an_integer() {
		calc.enter("54");
		calc.enter("13");
		calc.enter("%");
		assertThat(calc.result(), equalTo("2"));
	}

	@Test
	public void it_finds_the_exponent_of_an_integer() {
		calc.enter("4");
		calc.enter("3");
		calc.enter("^");
		assertThat(calc.result(), equalTo("64"));
	}

	@Test
	public void it_adds_two_real_numbers() {
		calc.enter("5.3");
		calc.enter("3.6");
		calc.enter("+");
		assertThat(calc.result(), equalTo("8.9"));
	}

	@Test
	public void it_subtracts_two_real_numbers() {
		calc.enter("5.3");
		calc.enter("3.6");
		calc.enter("-");
		assertThat(calc.result(), equalTo("1.7"));
	}

	@Test
	public void it_multiplies_two_real_numbers() {
		calc.enter("5.3");
		calc.enter("3.6");
		calc.enter("*");
		assertThat(calc.result(), equalTo("19.08"));
	}

	@Test
	public void it_divides_one_real_number_by_another() {
		calc.enter("54.75");
		calc.enter("13.6");
		calc.enter("/");
		assertThat(Double.parseDouble(calc.result()), closeTo(4.0257d, FLOATING_POINT_ERROR_TOLERANCE));
	}

	@Test
	public void it_finds_the_exponent_of_a_real_number() {
		calc.enter("5.5");
		calc.enter("3");
		calc.enter("^");
		assertThat(Double.parseDouble(calc.result()), closeTo(166.375d, FLOATING_POINT_ERROR_TOLERANCE));
	}
	
	@Test
	public void it_clears_its_memory_when_requested() {
		calc.enter("2");
		assertThat(calc.result(), equalTo("2"));
		calc.clear();
		assertThat(calc.result(), equalTo(""));
	}
	
	@Test
	public void it_ignores_null_entries() {
		calc.enter("2");
		calc.enter(null);
		calc.enter("6");
		calc.enter("*");
		assertThat(calc.result(), equalTo("12"));
	}
	
	@Test
	public void it_ignores_empty_entries() {
		calc.enter("2");
		calc.enter("");
		calc.enter("6");
		calc.enter("*");
		assertThat(calc.result(), equalTo("12"));
	}

}
