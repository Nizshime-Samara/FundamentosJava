package menus;

import dao.Dao;
import dao.DaoArrayList;
import io.Leitor;

public abstract class ItemDeMenu {
	
	protected Leitor leitor;
	protected Dao dao;
	
	public ItemDeMenu() {
		leitor = new Leitor();
		dao = new DaoArrayList();
	}
	
	public abstract String getDescricao();

	public abstract boolean executar();

}
