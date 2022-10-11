
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
	 * Intializes this TimeOfDay with an hour and a minute variable.
	 * @pre there hours must not be higher then 23.
	 * | hours < 24
	 * 
	 * @pre the minutes must not be higher then 59.
	 * | minutes < 59 
	 * 
	 * @post the minutes past midnight equals the formula. 
	 * | getMinutesPastMidnight() == hours * 60 + minutes
	 * 
	 */
	public TimeOfDay(int hours,int minutes) {
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
	 * set the seconds past midnight to the given value 
	 * @pre minutesPastMidnight must be lower then 1440
	 * | minutesPastMidnight < 1440
	 * @post minutes past midnight must be the same as the given value
	 * | getMinutesPastMidnight() < minutesPastMidnight
	 */
	public void setSecondsPastMidnight(int minutesPastMidnight) {
		this.minutesPastMidnight = minutesPastMidnight;
	}
	
	public void setHoursPastMidnight(int hoursPastMidnight) {
		int remainingMinutes = getRemainingMinutes();
		this.minutesPastMidnight = hoursPastMidnight*60 + remainingMinutes;
	}
	
	public void setRemainingMinutes(int RemainingMinutes){
		int hours = getHoursPastMidnight();
		this.minutesPastMidnight = hours*60 + RemainingMinutes;
	}
	
}
