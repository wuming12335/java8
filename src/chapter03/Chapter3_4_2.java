package chapter03;

import java.util.Arrays;
import java.util.List;

/**
 * 该注解表示改接口会被设计成为一个函数式接口
 */
@FunctionalInterface
interface Consumer<T> {
	void accept(T t);
}


public class Chapter3_4_2 {
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for (T t : list) {
			c.accept(t);
		}
	}
	
	public static void main(String[] args) {
		forEach(Arrays.asList(1,2,3,4,5), s->System.out.println(s));
		
	}
}
