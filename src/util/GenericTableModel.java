package util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public abstract class GenericTableModel<T> 
	extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	public abstract void setData(List<T> list);

	public abstract T getValueAt(int row);

	public abstract int indexOf(T entity);

	public abstract void clear();
 
	public abstract void remove(T entity);

	public abstract void add(T entity);

	public abstract boolean contains(T entity);

	public abstract List<T> list();

	public abstract void updateItem(int idx, T entity);

}