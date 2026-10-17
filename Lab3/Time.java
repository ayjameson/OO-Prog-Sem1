package Lab3;


public class Time 
{ 
private int hour;     // 0 - 23
private int minute;   // 0 - 59
private int second;   // 0 - 59

public Time() 
{ 
		setTime( 0, 0, 0 ); 
}

// constructor with hour supplied
public Time( int h ) 
{ 
		setTime( h, 0, 0 ); 
}

//constructor with hour and minute supplied
public Time( int h, int m ) 
{ 
		setTime( h, m, 0 ); 
}

// constructor with hour, minute and second supplied.
public Time( int h, int m, int s ) 
{ 
		setTime( h, m, s ); 
}

public void setTime( int h, int m, int s )
{
		setHour( h );    
		setMinute( m );  
		setSecond( s ); 
}



// set the hour 
public void setHour( int h ) 
{ 	
	if ( h >= 0 && h < 24 )
	{
		hour = h;
	}
	else
	{
		hour = 0;
	}
}


//set the minute 
public void setMinute( int m ) 
{ 
	if ( m >= 0 && m < 60 )
	{
		minute = m;
	}
	else
	{
		minute = 0;
	}
}

// set the second 
public void setSecond( int s ) 
{ 
	if ( s >= 0 && s < 60 )
	{
		second = s;
	}
	else
	{
		second = 0;
	}
}

public int getHour() 
{
	 return hour;
}

public int getMinute()
 { 
	return minute;
 }

public int getSecond()
 {
	 return second;
 }

// Convert Time to String in 24-hour time format
public String to24HourString()
{
   String time24Hour = "";

   if ( hour < 10 )
   {
      time24Hour += "0";
   }
   time24Hour += hour;

   if ( minute < 10 )
   {
      time24Hour += "0";
   }
   time24Hour += minute;

   return time24Hour;
}

// Convert Time to String in standard time format
public String toString()
{
   String standardTime = "";

   if ( hour == 12 || hour == 0 )
   {
      standardTime += 12;
   }
   else
   {
      standardTime += hour % 12;
   }

   standardTime += ":";

   if ( minute < 10 )
   {
      standardTime += "0";
   }
   standardTime += minute;

   standardTime += ":";

   if ( second < 10 )
   {
      standardTime += "0";
   }
   standardTime += second;

   if ( hour < 12 )
   {
      standardTime += " AM";
   }
   else
   {
      standardTime += " PM";
   }

   return standardTime;
}

// Tick the time by one second
public void tick()
{
   setSecond( second + 1 );

   if ( second == 0 )
      incrementMinute();
}

public void incrementMinute()
{
   setMinute( minute + 1 );

   if ( minute == 0 )
      incrementHour();
}

public void incrementHour()
{ 
	setHour( hour + 1 );
}
} 
