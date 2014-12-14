package br.com.wpattern.frameworks.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.wpattern.frameworks.jsf.IData;
import br.com.wpattern.frameworks.jsf.model.utils.BaseBean;

@RequestScoped
@Named(value = "bbProject")
@ManagedBean(name = "bbProject")
public class BbProjectBean extends BaseBean {

	private static final long serialVersionUID = 201311100320L;

	@Inject
	private IData data;

	public String getProjectName() {
		return this.data.projectName();
	}

}
