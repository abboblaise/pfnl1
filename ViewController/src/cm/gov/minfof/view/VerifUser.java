package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import javax.servlet.http.HttpSession;

import oracle.adf.share.ADFContext;

public class VerifUser implements PhaseListener {
    //@Override
    public void afterPhase(PhaseEvent phaseEvent) {
        // TODO Implement this method
        if (!ADFContext.getCurrent().isDesignTime()){
            FacesContext fc = phaseEvent.getFacesContext();

            HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
            UserData u = (UserData) session.getAttribute("user");
            boolean loginpage = fc.getViewRoot()
                                  .getViewId()
                                  .lastIndexOf("login") > -1 ? true : false;
            if (!loginpage && u == null) {
                NavigationHandler nh = fc.getApplication().getNavigationHandler();
                nh.handleNavigation(fc, null, "logout");
            }
        }
        
    }

    //@Override
    public void beforePhase(PhaseEvent phaseEvent) {
        // TODO Implement this method
    }

    //@Override
    public PhaseId getPhaseId() {
        // TODO Implement this method
        return PhaseId.RESTORE_VIEW;
    }
}
