package org.springframework.learning.bean;

/**
 * @author Neo-HJ.Niu
 * @created 2024/03/31  18:32
 * @slogan 千里之行始于足下
 */
public class UserBean {

	private String name;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserBean{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
