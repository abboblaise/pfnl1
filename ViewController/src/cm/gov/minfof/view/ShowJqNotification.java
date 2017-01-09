package cm.gov.minfof.view;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.el.ValueExpression;

import javax.faces.application.Application;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.BindingContainer;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class ShowJqNotification {
    public ShowJqNotification() {
        super();
    }
    
    /**Helper method to execute javascript
     * @param script
     */
    public void calljqHelper(String script) {
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
        erks.addScript(context, script);
    }

    /**Method to invoke Error Message
     * @param actionEvent
     */
    public void showErrMessageAction(String message) {
        calljqHelper("$.growl.error({ message: \"Hi this is error message! This message is too long to read, Just read it and see how it looks\" });");

    }

    /**Method to invoke Warnign Message
     * @param actionEvent
     */
    public void showWarningMessageAction(String message) {
        calljqHelper("$.growl.warning({ message: \"Hi this is Warning! This message is too long to read, Just read it and see how it looks\" });");
    }

    /**Method to invoke Info Message
     * @param actionEvent
     */
    public void showNoticeMessageAction(String message) {
        calljqHelper("$.growl.notice({ message: \" " + message +  " \"});");
    }
    
    public MethodExpression getMethodExpression(String name) {  
     Class [] argtypes = new Class[1];  
     argtypes[0] = ActionEvent.class;  
     FacesContext facesCtx = FacesContext.getCurrentInstance();  
     Application app = facesCtx.getApplication();  
     ExpressionFactory elFactory = app.getExpressionFactory();  
     ELContext elContext = facesCtx.getELContext();  
     return elFactory.createMethodExpression(elContext,name,null,argtypes);  
    }  
    
    public ValueExpression getValueExpression(String name) {  
     FacesContext facesCtx = FacesContext.getCurrentInstance();  
     Application app = facesCtx.getApplication();  
     ExpressionFactory elFactory = app.getExpressionFactory();  
     ELContext elContext = facesCtx.getELContext();  
     return  elFactory.createValueExpression(elContext, name, Object.class);  
    } 
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public String getValueOfField(String iteratorName, String attributeName) {
        DCIteratorBinding iterator = (DCIteratorBinding)getBindings().get(iteratorName); 
        String attribute = (String) iterator.getCurrentRow().getAttribute(attributeName);
        return attribute;
    }
}
