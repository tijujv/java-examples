package test.fing;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<User> users = Arrays.asList(
				new User(1, "John", "James", "john@juju.com"),
				new User(2, "thomas", "miller", "thomas@juju.com"), 
				new User(3, "james", "moriaty", "james@juju.com"),
				new User(4, "John", "joseph", "john@juju.com"));

		System.out.println("---------------1----------------");
		returnFirstName(users).stream().forEach(user -> System.out.println(user));
		System.out.println("---------------2----------------");
		removeDuplicates(users).stream().forEach(user -> System.out.println(user));
		System.out.println("---------------3----------------");
		removeDuplicatesUsingStreams(users).stream().forEach(user -> System.out.println(user));
		System.out.println("---------------4----------------");
		removeDuplicatesUsingStreamsAsMap(users).entrySet().stream().forEach(user -> System.out.println(user));
		System.out.println("---------------5----------------");
		removeDuplicatesUsingStreamsAsGroupBy(users).entrySet().stream().forEach(user -> System.out.println(user));
	}

	public static List<String> returnFirstName(List<User> users) {
		return users.stream().map(user -> user.getFirstName()).collect(Collectors.toList());

	}

	public static Collection<User> removeDuplicates(List<User> users) {
		return new HashSet<>(users);

	}

	public static Collection<User> removeDuplicatesUsingStreams(List<User> users) {
		return users.stream().distinct().collect(Collectors.toList());

	}
	
	public static Map<String,User> removeDuplicatesUsingStreamsAsMap(List<User> users) {
		return users.stream().distinct().collect(Collectors.toMap(user -> user.getFirstName(), user -> user));

	}
	
	public static Map<String,List<User>> removeDuplicatesUsingStreamsAsGroupBy(List<User> users) {
		return users.stream().collect(Collectors.groupingBy(user -> user.getFirstName()));

	}

}
