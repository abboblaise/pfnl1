package cm.gov.minfof.view;

import oracle.adf.model.BindingContext;

import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class PostecBean {
    ShowJqNotification notifObj = new ShowJqNotification();
    public PostecBean() {
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

    public String CreerPoste() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        executemethode("Commit"); //pour permettre de g??n??rer les ids facilement
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String EnregistrerPoste() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        String nomPoste = notifObj.getValueOfField("PostecontroleView1Iterator", "Intituleposte");
        notifObj.showNoticeMessageAction("Enregistrement effectué! Le poste <b>"+ nomPoste +" </b>a été enregistré avec succès");
        return null;
    }

    public String SupprimerPoste() {
        String nomPoste = notifObj.getValueOfField("PostecontroleView1Iterator", "Intituleposte");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Delete");
        Object result = operationBinding.execute();
        executemethode("Commit");
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        notifObj.showNoticeMessageAction("Suppression effectuée! Le poste <b>"+ nomPoste +" </b>a été supprimé avec succès");
        return null;
    }

    public void onDelete(DialogEvent dialogEvent) {
        if (dialogEvent.getOutcome() == DialogEvent.Outcome.ok) {
            SupprimerPoste();
        }
    }

    public String annulerPoste() {
        notifObj.annulerParent("PostecontroleView1Iterator");
        return null;
    }
}
