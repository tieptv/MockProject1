package com.cmc.mockproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.mockproject1.entity.WhyCMC;
import com.cmc.mockproject1.service.impl.WhyCMCServiceImpl;

@RestController
public class WhyCMCController {
@Autowired
WhyCMCServiceImpl service;
@RequestMapping(value = "/api/slogan", //
method = RequestMethod.GET, //
produces = { MediaType.APPLICATION_JSON_VALUE, //
        MediaType.APPLICATION_XML_VALUE })
@ResponseBody
public List<WhyCMC> showSlogan(){
	return service.getSlogan();

}
@RequestMapping(value = "/api/title", //
method = RequestMethod.GET, //
produces = { MediaType.APPLICATION_JSON_VALUE, //
        MediaType.APPLICATION_XML_VALUE })
@ResponseBody
public WhyCMC showTitle(){
	return service.getTitle();

}

}
