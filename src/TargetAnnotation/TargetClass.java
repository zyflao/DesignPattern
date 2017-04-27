package TargetAnnotation;

import java.lang.reflect.Method;

/**
 * @author yunfeng.zang
 * @createTime 2017年4月19日下午6:04:24
 * 
 *             创建一个自定义标签，判断类或者方法上面释放有标签注释
 */

public class TargetClass {

	@Filter(Filter.print.YES)
	void print() {
		System.out.println("Im print");
	}

	@Filter(desc = "method2")
	void noPrint() {
		print();
	}

	public static void main(String[] args) {

		// 此处要用反射将字段中的注解解析出来
		Class<TargetClass> clz = TargetClass.class;
		// 判断类上是否有次注解
		boolean clzHasAnno = TargetClass.class
				.isAnnotationPresent(Filter.class);

		System.out.println("类上有注释？:" + clzHasAnno);

		Method[] methods = clz.getDeclaredMethods();
		for (Method method : methods) {
			boolean methodHasAnno = method.isAnnotationPresent(Filter.class);
			if (methodHasAnno) {
				// 拿到注释
				Filter methodAnno = method.getAnnotation(Filter.class);
				// 输出注解属性
				String desc = methodAnno.desc();
				System.out.println(method.getName() + " desc = " + desc);
				System.out.println("method上有注释？:" + methodHasAnno);
			}
		}
		// 得到注解

	}
}