package com.zlf.utils.java.tools.contrast_object;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 比较两个Bean的内容
 */
public class ContrastObjUtils<T> {

	public String contrastObj(Object oldBean, Object newBean) {
		String str = "{";
		T pojo1 = (T) oldBean;
		T pojo2 = (T) newBean;
		try {
			Class clazz = pojo1.getClass();
			Field[] fields = pojo1.getClass().getDeclaredFields();
			int i = 1;
			for (Field field : fields) {
				if ("serialVersionUID".equals(field.getName())) {
					continue;
				}
				PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
				Method getMethod = pd.getReadMethod();
				Object o1 = getMethod.invoke(pojo1);
				Object o2 = getMethod.invoke(pojo2);
				if (o1 == null || o2 == null) {
					continue;
				}
				if (!o1.toString().equals(o2.toString())) {
					if (i != 1) {
						str += ", ";
					}

					// 要显示的字段名
					String fieldName = field.getName();

					str += fieldName + "字段从\"" + o1 + "\"修改为\"" + o2+"\"";
					i++;
				}
			}
			str += "}";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return str;
	}

	public static void main(String[] args) {
		SkuVo vo1 = new SkuVo();
		vo1.setColor("color1");
		vo1.setSaleStatus(1);
		vo1.setOption1("option1");
		vo1.setSku("1234");

		SkuVo vo2 = new SkuVo();
		vo2.setColor("color2");
		vo2.setSaleStatus(1);
		vo2.setOption1("option2");
		vo2.setSku("1234");

		ContrastObjUtils<SkuVo> utils = new ContrastObjUtils<>();
		String s = utils.contrastObj(vo1, vo2);
		System.out.println(s);
	}
}