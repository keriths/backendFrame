package com.krs.backend.project;

import com.krs.backend.dto.AjaxResultDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fanshuai on 17/3/30.
 */
@Controller
@RequestMapping("/project")
public class ProjectAction {

    @RequestMapping(value = "/index")
    public ModelAndView index(){
        return new ModelAndView("/project/index");
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public AjaxResultDTO projectList(){
        return new AjaxResultDTO();
    }

}
