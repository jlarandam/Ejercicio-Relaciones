package fechaNacimiento;

public class Date {
	
	private int _day;
	private int _month;
	private int _year;
	private static final String[] _namesDay = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	private static final String[] _namesMonths= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	public Date(int _day, int _month, int _year){
		this._day = _day;
		this._month = _month;
		this._year = _year;
	}
	
	public static Boolean isLeapYear(int year){
		if (year%4 == 0 && year%100 != 0 || year%400 == 0)
			return true;
		else 
			return false;
		
	}
	
	public static int getDaysMonth(int month, int year){
		int days = 30;
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			days = 31;
		else if (month==2)
			days = (isLeapYear(year))?29:28;
		return days;
	}
	
	public static int getFirstDay(int year){
		int dayYear = 0;
		final int iYear = year -1900;
		for(int i = 1; i <= iYear; i++){
			dayYear ++;
			dayYear = (dayYear==7)?0:dayYear;
		}
		if(iYear<13){
			final int stack = iYear/5;
			for(int i = 0; i < stack; i++){
				dayYear++;
				dayYear = (dayYear==7)?0:dayYear;
			}
		}
		else{
			final int stack = iYear/4;
			for(int i = 0; i < stack; i++){
				dayYear++;
				dayYear = (dayYear==7)?0:dayYear;
			}
		}
		return dayYear;
	}
	
	public static int getDayWeek(int day, int month, int year){
		int daysInMonth = 0;
		int dayWeek = getFirstDay(year);
		for(int i = 1; i < month; i++){
			daysInMonth += getDaysMonth(i, year);
		}
		daysInMonth += day;
		for(int i = 0; i < daysInMonth - 1; i++){
			dayWeek ++;
			dayWeek = (dayWeek==7)?0:dayWeek;			
		}
		return dayWeek;
	}
	
	public String getDate(){
		return (isLeapYear(_year))?"Dia: "+_day+" "+_namesDay[getDayWeek(_day, _month, _year)]+"."+"\nMes: "+_month+" "+_namesMonths[_month-1]+"."+"\nAño: "+_year+" es biciesto.":"Dia: "+_day+" "+_namesDay[getDayWeek(_day, _month, _year)]+"\nMes: "+_month+" "+_namesMonths[_month-1]+"."+"\nAño: "+_year+" no es biciesto.";
	}

}
