package aJSF22_202403280259.pkgs.managedBeans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Teste01ManagedBean implements Serializable {

	private static final long serialVersionUID = 20240328032700L;

	static {
		System.out.println("Teste01ManagedBean.static");
	}

	public Teste01ManagedBean() {
		System.out.println("Teste01ManagedBean.()[" + (this) + "]");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01ManagedBean.postConstruct()[" + (this) + "]");
	}

	public long getSerialversionuid() {
		return serialVersionUID;
	}

	public void method01() {
		System.out.println("Teste01ManagedBean.method01()[" + (this) + "]");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01ManagedBean.preDestroy()[" + (this) + "]");
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Teste01ManagedBean.finalize()[" + (this) + "]");
		super.finalize();
	}

}
