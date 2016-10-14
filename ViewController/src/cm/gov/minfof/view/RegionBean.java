package cm.gov.minfof.view;

import java.math.BigDecimal;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class RegionBean {
    public RegionBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String enregistreRegion() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
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

    public String supprimeRegion() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String creerInserer() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
}
