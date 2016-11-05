package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

public class RecupUser {
    private UserData ud;


    public void setUd(UserData ud) {
        this.ud = ud;
    }

    public UserData getUd() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
        ud = (UserData) session.getAttribute("user");
        ud.setEstadmin(true);
        //infouser iu = new infouser();
        //ud=iu.getUsr();
        return ud;
    }
}
