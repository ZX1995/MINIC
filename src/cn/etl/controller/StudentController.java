package cn.etl.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.etl.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController extends BaseController<Student>{
	
}