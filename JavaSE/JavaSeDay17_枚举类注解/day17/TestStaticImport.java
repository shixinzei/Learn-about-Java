package day17;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.lang.annotation.ElementType;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

import static java.lang.Math.*;

/**
 * 
 * @author wydxry
 * @date 2020Äê7ÔÂ15ÈÕ
 */
public class TestStaticImport {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(PI);
		System.out.println(sqrt(6));
		System.out.println(ceil(9.2));
		
	}
}

@Target({METHOD,FIELD,TYPE,LOCAL_VARIABLE})
@interface C{
	
}