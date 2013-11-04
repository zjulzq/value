package zju.lzq.learn;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.faces.event.PhaseId;

public class MyActionListener implements ActionListener {

	public PhaseId getPhaseId() {
		System.out.println("getPhaseId called");
		return PhaseId.APPLY_REQUEST_VALUES;
	}

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("processAction called");
		UIComponent component = event.getComponent();
		System.out.println("The id of the component that fired the action event: " + component.getId());
		FacesContext facesContext = FacesContext.getCurrentInstance();
		UIViewRoot root = facesContext.getViewRoot();
		System.out.println(root.getId());
	}

}
