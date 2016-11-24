package cm.gov.minfof.view;




import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


public class ConnectBean {
    private boolean editpwd;

    public void setEditpwd(boolean editpwd) {
        this.editpwd = editpwd;
    }

    public boolean isEditpwd() {
        return editpwd;
    }

    public ConnectBean() {
        editpwd = false;
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    public BindingContainer getBindingContainer() {
    BindingContext bindingContext = BindingContext.getCurrent();
    return bindingContext.getCurrentBindingsEntry();
    }
    
    public Object executemethode(String mthod){
        BindingContainer bds = getBindingContainer();
        OperationBinding ob = bds.getOperationBinding(mthod);
        return ob.execute();
    }
    

    public void ValideMotdepasse(FacesContext facesContext, UIComponent uIComponent, Object object) {
        // Add event code here...
        String fieldVal = (String)object;
        //System.out.println("Confirm = "+fieldVal);
        RichSelectBooleanCheckbox cb = (RichSelectBooleanCheckbox)uIComponent.findComponent("sbc1");
        boolean bb = (Boolean)cb.getValue();
        
        if (bb){
            RichInputText it = (RichInputText)uIComponent.findComponent("it2");
            String password1 = (String)it.getValue();
            //System.out.println("pwd = "+password1);
            if(!password1.equalsIgnoreCase(fieldVal)){
                FacesMessage message = new FacesMessage("Les deux mots de passe doivent être identiques");
                throw new ValidatorException(message);
            }
        }
    }

    public String EnregistrerUtilisateur() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        executemethode("Execute");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String CreerUtilisateur() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String SupprimerUtilisateur() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
}
