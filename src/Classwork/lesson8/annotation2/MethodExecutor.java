package classwork.lesson8.annotation2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExecutor {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		executeAutoexecutableMethods(new Class1());
		executeAutoexecutableMethods(new Class2());
	}

	private static void executeAutoexecutableMethods(Object object)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<? extends Object> clazz = object.getClass();

		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(ClassAnnotation.class)) {
				method.invoke(object);
			}
		}
	}
}