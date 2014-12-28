package com.bonson.back;

import com.ibatis.CommonDBImpl;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author: HuangYan
 * Time:   2014-12-25 15:09
 */
public class HelloAction extends DispatchAction {

    private Logger logger = Logger.getLogger(HelloAction.class);
    private CommonDBImpl db;

    public ActionForward say(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String account = (String)db.object("hello_map.get",1);
        logger.info("Account:" + account);
        return new ActionForward("/back/index.jsp");
    }

    public void setDb(CommonDBImpl db) {
        this.db = db;
    }
}
