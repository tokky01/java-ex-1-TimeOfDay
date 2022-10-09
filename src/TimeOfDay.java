
public class TimeOfDay {
	private int minutesPastMidnight;
	
	public TimeOfDay(int hours,int minutes) {
		this.minutesPastMidnight = hours*60 + minutes;	
	}
	

	public int getSecondsPastMidnight() {
		return minutesPastMidnight;
	}
	
	public int getHoursPastMidnight() {
		return minutesPastMidnight/60;
	}
	
	public int getRemainingMinutes() {
		return minutesPastMidnight%60;
	}

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
