package Lab3;

import java.util.Calendar;

public class Clock
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Time time = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		int startingMinute = time.getMinute();
		long previousTick = System.currentTimeMillis();

		while (time.getMinute() == startingMinute)
		{
			long now = System.currentTimeMillis();
			if (now - previousTick >= 1000)
			{
				time.tick();
				System.out.println(time);
				previousTick = now;
			}
		}
	}
}
