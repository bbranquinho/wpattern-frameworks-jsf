package br.com.wpattern.frameworks.jsf.model;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.wpattern.frameworks.jsf.model.utils.BaseBean;

@SessionScoped
@ManagedBean(name = "bbUser")
public class BbUserBean extends BaseBean {

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

	public BbUserBean() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
