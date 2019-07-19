package com.test.ysu.Controller;
//所以说我要在这里修改你能看见吗？
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.ysu.entity.Student;

//接口/类/注解/配置
@Controller
@RequestMapping("test")
public class SpringmvcController {

	@RequestMapping(value="welcome")
	public String welcome() {	
		return "success";
	}
	@RequestMapping(value="request/{shuzi}")
	public String getStudentInfo(@PathVariable("shuzi") Integer shhzi,Student stu) {
		System.out.println(shhzi);
		System.out.println("id"+stu.getId()+"name"+stu.getName());
		return "success";
	}
	@RequestMapping(value="testmodelandview")
	public ModelAndView testmodelandview(Student stu)
	{
		ModelAndView mv=new ModelAndView("success");
		mv.addObject("student", stu);
		return mv;
	}
	
	
	@ModelAttribute//执行所有的请求之前执行此请求
	public void getStudentinfobyId(Map<String, Object>map)
	{
		Student stu1 =new Student();
		stu1.setId(12);
		stu1.setAge("23");
		stu1.setName("xiaoming");
		map.put("stu", stu1);
	}
	@RequestMapping("testgetinfo")
	public ModelAndView testgetinfo(@ModelAttribute("stu")Student stu2)
	{	
		ModelAndView mv=new ModelAndView("success");
		stu2.setName("21wdas");
		mv.addObject("stu23", stu2);
		return mv;
	}
}
