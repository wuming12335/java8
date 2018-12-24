package chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��ע���ʾ�Ľӿڻᱻ��Ƴ�Ϊһ������ʽ�ӿ�
 */
@FunctionalInterface
interface Predicate<T> {
	boolean test(T t);
}

public class Chapter3_4_1 {
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				results.add(t);
			}
		}
		return results;
	}
	
	public static void main(String[] args) {
		Predicate<String> nonEmptyStringPredicate = s -> !s.isEmpty();
		List<String> listOfStrings = Arrays.asList("", "123", "abc");
		List<String> list = filter(listOfStrings, nonEmptyStringPredicate);
		System.out.println(list);
	}
}
