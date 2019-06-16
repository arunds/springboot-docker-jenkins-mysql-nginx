package com.techinstance.cicd.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techinstance.cicd.model.Post;
import com.techinstance.cicd.repository.PostRepository;

@Controller
public class IndexController {

	@Autowired
	PostRepository postRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showIndex(final Model model) {
		model.addAttribute("name", "Arun S");
		return "index";
	}

	@RequestMapping(value = "/createPost", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody 
	public Post createNote(@Valid @RequestBody Post post) {
		return postRepository.save(post);
	}
}
