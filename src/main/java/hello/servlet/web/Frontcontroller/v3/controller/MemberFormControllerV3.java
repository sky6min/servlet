package hello.servlet.web.Frontcontroller.v3.controller;

import hello.servlet.web.Frontcontroller.ModelView;
import hello.servlet.web.Frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
