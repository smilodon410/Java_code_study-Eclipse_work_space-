package Pack;

import java.sql.Connection;
import java.sql.PreparedStatement;

import database.Dbconn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Person;
import javafx.scene.control.TableView;

public class testController {
	
	private static Connection con;
	private PreparedStatement pstmt;
	private static ObservableList<Person> data  = FXCollections.observableArrayList();
	private Dao dao;
	
	private int num;
	private boolean canSave=false;
	private boolean canEdit=false;
	
	@FXML
	private Button Connect;
	@FXML
	private TextField No;
	@FXML
	private TextField UserId;
	@FXML
	private TextField Password;
	@FXML
	private TextField Url;
	@FXML
	private TableView Table;
	@FXML
	private TableColumn colNo;
	@FXML
	private TableColumn colName;
	@FXML
	private TableColumn colAge;
	@FXML
	private TableColumn colSalary;
	@FXML
	private TextField Age;
	@FXML
	private TextField Name;
	@FXML
	private TextField Salary;
	@FXML
	private Button Select;
	@FXML
	private Button Insert;
	@FXML
	private Button Update;
	@FXML
	private Button Delete;
	@FXML
//	private void Initialize() {
//		dao = new Dao();
//
//		showOverView();
//
//	}
	
	private void showOverView() {
		
		try {
			dao = new Dao();
			
			data = dao.getData();
			colNo.setCellValueFactory(new PropertyValueFactory<Person,String>("No"));
			colName.setCellValueFactory(new PropertyValueFactory<Person,String>("name"));
			colAge.setCellValueFactory(new PropertyValueFactory<Person,String>("age"));
			colSalary.setCellValueFactory(new PropertyValueFactory<Person,String>("salary"));

			Table.setItems(data);

		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Data를 테이블에 가져올 수 없습니다.");
		}
	}
	
	public boolean isCanSave() {
		return canSave;
	}
	public void setCanSave(boolean canSave) {
		this.canSave = canSave;
	}
	
	public boolean isCanEdit() {
		return canEdit;
	}
	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}
	
	@FXML
	public void handleQuery(ActionEvent event) {
		showOverView();
	}
	
	@FXML
	public void handleIns(ActionEvent event) {
		
		if( isCanSave() == false ) {
			
			Name.requestFocus();
			No.setEditable(false);
			Name.setEditable(true); 
			Age.setEditable(true);
			Salary.setEditable(true);
			
			setCanSave(true);
			Insert.setStyle("-fx-base: #33ccff;");
			Insert.setText("Save");
			return;
		}
		Person person = new Person();
		
		person.setName(Name.getText());
		person.setAge(Age.getText());
		person.setSalary(Salary.getText());
		
		try {
			if( dao.insertPerson(person)) {
				setCanSave(false);
				showOverView();
				Insert.setStyle("-fx-base: #abd5e8");
				Insert.setText("Insert");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void handleConnect(ActionEvent event) {

		Dbconn connect =  new Dbconn();

		if( con == null ) {
			con = connect.getConnection();
		}
	}
	@FXML
	public void handleEdit(ActionEvent event) {
		int selectedIndex = Table.getSelectionModel().getSelectedIndex();
		if(selectedIndex < 0 ) {
			alertAll("테이블에서 수정하려는 사람을 선택해주세요!");
			
			return;
		}
		No.setEditable(false);
		
		if( isCanEdit() == false && No.isEditable() == false ) {
			No.setEditable(true); No.requestFocus();
			Name.setEditable(true);
			Age.setEditable(true); 
			Salary.setEditable(true);
			setCanEdit(true);
			Update.setStyle("-fx-base: #33ccff;");
			Update.setText("Save");
			return;
		}
		if( confirm() == false ) {
			return;
		}
		
		Person person = new Person();
		
		person.setNo(Integer.parseInt(No.getText()));
		person.setName(Name.getText());
		person.setAge(Age.getText());
		person.setSalary(Salary.getText());
		
		try {
			if(dao.editPerson(person)) {
				setCanEdit(false);
				No.setEditable(false);
				Name.setEditable(false);
				Age.setEditable(false);
				Salary.setEditable(false);
				
				showOverView();
				
				Update.setStyle("-fx-base: #abd5e8;");
				Update.setText("Update");
			} else {
				alertAll("저장 도중 문제 발생!!");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			alertAll("저장 도중 문제 발생!!");
		}
		
	}
	
	@FXML
	public void handleDel(ActionEvent event) {

		int selectedIndex = Table.getSelectionModel().getSelectedIndex();
		int deletedata = (int) colNo.getCellData(selectedIndex);

		if(selectedIndex >= 0) {
			try {
				Alert confirmDialog = new Alert(AlertType.CONFIRMATION);
				dao.deleteData(deletedata);
			} catch(Exception e) {
				e.printStackTrace();
			}
			Table.getItems().remove(selectedIndex);

			} else {
			alertAll("누굴 지워드릴까요^^?");
		}

	}
	
	
	
	private void alertAll(String msg) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("DB Management");
		alert.setHeaderText("띠롱!");
		alert.setContentText(msg);
		alert.showAndWait();
	}
	
	private boolean confirm() {
		Alert alert = new Alert(AlertType.WARNING);
		if( colName.getText().length() < 1 ) {
			alertAll("No Name!!");
			setCanSave(true);
			return false;
		}
		if( colAge.getText().length() < 1 ) {
			alertAll("나이가 입력되지않았습니다.");
			setCanSave(true);
			return false;
		}
		if( colSalary.getText().length() < 1 ) {
			alertAll("월급이 입력되지 않았습니다.");
			setCanSave(true);
			return false;
		}
		return true;
	}
	
	
		
}
