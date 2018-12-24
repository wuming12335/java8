package chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 该注解表示改接口会被设计成为一个函数式接口
 */
@FunctionalInterface
interface Function<T,R> {
	R apply(T t);
}


public class Chapter3_4_3 {
	public static <T,R> List<R> map(List<T> list, Function<T,R> c) {
		List<R> results = new ArrayList<R>();
		for (T t : list) {
			results.add(c.apply(t));
		}
		return results;
	}
	
	public static void main(String[] args) {
		List<Integer> l = map(Arrays.asList("asdas","in"), s->s.length());
		System.out.println(l);
	}
}
