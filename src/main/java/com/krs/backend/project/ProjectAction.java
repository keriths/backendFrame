package com.krs.backend.project;

import com.krs.backend.dto.AjaxResultDTO;
import com.krs.backend.dto.ProjectVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Object projectList(){
        AjaxResultDTO resultDTO = new AjaxResultDTO();
        List<ProjectVO> voList = new ArrayList<ProjectVO>();
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        voList.add(new ProjectVO());
        Map m = new HashMap();
        m.put("rows",voList);
        m.put("total",10000);
        resultDTO.setValue("page", m);
        resultDTO.setValues(m);
        return m;
    }

}
