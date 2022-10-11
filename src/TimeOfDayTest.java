import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	@Test
	void test() {
		TimeOfDay timeOfDay = new TimeOfDay(25, 10);
		assertEquals(10, timeOfDay.getRemainingMinutes());
		assertEquals(25, timeOfDay.getHoursPastMidnight());
		assertEquals(625, timeOfDay.getMinutesPastMidnight());
		
		timeOfDay.setHoursPastMidnight(11);
		assertEquals(11, timeOfDay.getHoursPastMidnight());
		assertEquals(25, timeOfDay.getRemainingMinutes());
		assertEquals(685, timeOfDay.getMinutesPastMidnight());
		
		timeOfDay.setRemainingMinutes(45);
		assertEquals(11, timeOfDay.getHoursPastMidnight());
		assertEquals(45, timeOfDay.getRemainingMinutes());
		assertEquals(705, timeOfDay.getMinutesPastMidnight());
		
		
		timeOfDay.setHoursPastMidnight(90);
		assertEquals(1, timeOfDay.getHoursPastMidnight());
		assertEquals(30, timeOfDay.getRemainingMinutes());
		assertEquals(90, timeOfDay.getMinutesPastMidnight());
	}
}
