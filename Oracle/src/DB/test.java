package DB;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class test extends JDialog {
	String[] fieldname = { "name", "age", "salary" };
	DefaultTableModel dt = new DefaultTableModel(fieldname, 0);

	JTable jt = new JTable(dt);

	JScrollPane jsp = new JScrollPane(jt);

	public static void main(String[] args) {
		new test();
	}
	public test() {
		add(jsp, "Center");
		setSize(600, 500);
		setVisible(true);
	}

}

   
    
