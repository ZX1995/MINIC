package cn.etl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.etl.entity.Post;
@Controller
@RequestMapping("/post")
public class PostController extends BaseController<Post> {
	
}