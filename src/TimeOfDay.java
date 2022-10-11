
public class TimeOfDay {
	
	/**
	 * minutes that have past since midnight
	 * @invar this integer must not be higher then 1440 
	 * | minutesPastMidnight < 1440
	 * 
	 * @invar this integer must be higher then zero
	 * | minutesPastMidnight >= 0
	 */
	private int minutesPastMidnight;
	
	/**
	 * 
	 * this method is and example of a defensive implementation
	 * 
	 * Intializes this TimeOfDay with an hour and a minute variable.
	 * @throws IllegalArgumentException | !(0 <= hours && hours <= 24)
	 * @throws IllegalArgumentException | !(0 <= minutes && minutes <= 59)
	 * @post | getHoursPastMidnight() == hours
	 * @post | getRemainingMinutes() == minutes
	 * 
	 */
	public TimeOfDay(int hours,int minutes) {
		if (!(0 <= hours && hours <= 24))
			throw new IllegalArgumentException("'hours' should be between 0 and 23");
		if (!(0 <= minutes && minutes <= 24))
			throw new IllegalArgumentException("'minutes' should be between 0 and 59");
		
		this.minutesPastMidnight = hours * 60 + minutes;	
	}
	
	public int getMinutesPastMidnight() {
		return minutesPastMidnight;
	}
	
	public int getHoursPastMidnight() {
		return minutesPastMidnight/60;
	}
	
	public int getRemainingMinutes() {
		return minutesPastMidnight%60;
	}

	/**
	 * 
	 * the method is an example of a contractual implementenation 
	 * 
	 * set the seconds past midnight to the given value 
	 * @pre minutesPastMidnight must be lower then 1440
	 * | minutesPastMidnight < 1440
	 * @post minutes past midnight must be the same as the given value
	 * | getMinutesPastMidnight() < minutesPastMidnight
	 */
	public void setSecondsPastMidnight(int minutesPastMidnight) {
		this.minutesPastMidnight = minutesPastMidnight;
	}
	
	/**
	 * set the hours past midnight to the given value 
	 * @pre hoursPastMidnight must be lower then 24
	 * | hoursPastMidnight < 24
	 * @post hours past midnight must be the same as the given value
	 * | getHoursPastMidnight() < hoursPastMidnight
	 */
	public void setHoursPastMidnight(int hoursPastMidnight) {
		int remainingMinutes = getRemainingMinutes();
		this.minutesPastMidnight = hoursPastMidnight*60 + remainingMinutes;
	}
	
	
	/**
	 * set the hours past midnight to the given value 
	 * @pre hoursPastMidnight must be lower then 60
	 * | RemainingMinutes < 60
	 * @post hours past midnight must be the same as the given value
	 * | getRemainingMinutes() < RemainingMinutes
	 */
	public void setRemainingMinutes(int RemainingMinutes){
		int hours = getHoursPastMidnight();
		this.minutesPastMidnight = hours*60 + RemainingMinutes;
	}
	
}
