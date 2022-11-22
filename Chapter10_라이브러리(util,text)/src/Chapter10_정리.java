/*
 * 날짜 / 시간 (10장)
 *    Date => 저장용 (현재 시스템의 날짜 시간을 읽어온다) => 기능이 거의 없다
 *    Calendar => Date클래스 확장 => 제어가 쉽게 만들어 준 클래스(추상 클래스)
 *    --------
 *    생성 : Calendar cal=Calendar.getInstance()
 *    읽기 : cal.get(Calendar.YEAR)
 *          cal.get(Calendar.MONTH)
 *          cal.get(Calendar.DATE)
 *          cal.get(Calendar.DAY_OF_WEEK)
 *    쓰기 :
 *          cal.set(Calendar.YEAR,2022)
 *          cal.set(Calendar.MONTH,11-1)//0~11
 *          cal.set(Calendar.DATE,22)
 *          cal.getActualMaximum(Calendar.DATE) ==> 설정된 달의 마지막 날짜
 *    SimpleDateFormat
 *      년도 : yyyy
 *      월 : MM, M
 *      일 : dd, d
 *      시간 : hh
 *      분 : mm, m
 *      초 : ss,s
 *    DecimalFormat
 *      DecimalFormat df=new DecimalFormat("###,###,###")
 *    
 *    MessageFormat : 출력형식을 만든다
 *     String pattern="{0},{1},{2}...";
 *     Object[] obj={};
 *     MessageFormat.format(pattern,obj)
 *    
 *    LocalDate : 날짜
 *      LocalDate.now() : 현재 날짜
 *      LocalDate.of(년,월,일) : 날짜 설정
 *    LocalTime : 시간
 *      LocalTime.now() : 현재 시간
 *      LocalTime.of(시간,분,초)
 *    LocalDateTime : 
 *      LocalDate_LocalTime
 *      
 *    ==========> isAfter(), isBefore(), isEqual()
 *    ==========> between()
 *    
 */
public class Chapter10_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
