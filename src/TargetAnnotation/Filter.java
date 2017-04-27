package TargetAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
// 次注解只能作用于方法上
public @interface Filter {

	public enum print {
		YES, NO
	};

	String desc() default "method1";

	print value() default print.YES;
}
