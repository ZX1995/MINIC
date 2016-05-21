package cn.etl.settting;

import java.util.HashMap;
import java.util.Map;


public class Constant {
	   public static final  Map<String, Integer>PAGE_SIZE=new HashMap<String, Integer>();
	   static{
		   PAGE_SIZE.put("Admin",8);
		   PAGE_SIZE.put("Student", 8);
		   PAGE_SIZE.put("Teacher", 8);
		   PAGE_SIZE.put("Post", 8);
		   PAGE_SIZE.put("News", 8);
		   PAGE_SIZE.put("Course", 8);
		   PAGE_SIZE.put("Unit", 8);

	   }
	   public static final String RESULT="/result.jsp",LOGIN="/login.jsp",HOME ="/home.jsp";
	   public static final String projectTitle = "英语教学平台";
}
