package DB;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Optional;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class table extends Application {

	TextArea textArea;
	TextField userName;
	
		
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		DBConnection dbc = new DBConnection();
		PreparedStatementTest ins = new PreparedStatementTest();
		OracleTest slc = new OracleTest();
		Update upd = new Update();
		Delete del = new Delete();
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		
		// 상단 HBox topHBox (닉네임, IP, PORT TextField와 접속 Button)
		HBox topHBox = new HBox();
		topHBox.setPrefWidth(350);
		topHBox.setPrefHeight(30);
		topHBox.setSpacing(10);
		topHBox.setAlignment(Pos.TOP_CENTER);
		
		VBox leftVBox = new VBox();
		leftVBox.setPrefWidth(200);
		leftVBox.setPrefHeight(30);
		
		// 여백
		leftVBox.setPadding(new Insets(10));
		leftVBox.setSpacing(10);
		
//		leftHBox.setAlignment(Pos.LEFT_CENTER);

		//하단 HBox bottomHBox (텍스트 입력란, 전송 버튼, 종료 버튼)  --접속되었습니다 칸
		HBox bottomHBox = new HBox();
		bottomHBox.setPrefWidth(350);
		bottomHBox.setPrefHeight(30);
		bottomHBox.setSpacing(10);
		bottomHBox.setAlignment(Pos.BOTTOM_CENTER);

		// 윈도우창 닫기 버튼 이벤트 (종료 버튼과 같은 이벤트)
//		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
//			@Override
//			public void handle(WindowEvent e) {
//				Alert alert = new Alert(AlertType.CONFIRMATION);
//				alert.setTitle("BitChat 종료");
//				alert.setHeaderText("BitChat을 종료하시겠습니까?");
//				alert.setContentText("대화 내용은 저장되지 않습니다.");
//				Optional<ButtonType> result = alert.showAndWait();
//				if (result.get() == ButtonType.OK) {
//					stopClient();
//					primaryStage.close();
//				} else if (result.get() == ButtonType.CANCEL) {
//					e.consume();
//				}
//			}
//		});

		// 닉네임 입력 텍스트 --> ID 입력
		userName = new TextField();
		userName.setPrefWidth(150);
		userName.setPromptText("ID를 입력하세요.");
//		HBox.setHgrow(userName, Priority.ALWAYS); // 윈도우 창을 늘리면 자동으로 늘어남
		root.setTop(userName);

		// IP 텍스트필드 --> PW 입력
		TextField ipText = new TextField();
		ipText.setPromptText("PW를 입력하세요.");
		ipText.setPrefWidth(150);
		root.setTop(ipText);

		// Port 텍스트필드 --> URL 입력
		TextField portText = new TextField("");
		portText.setPromptText("URL");
		portText.setPrefWidth(300);
		root.setTop(portText);

		// 텍스트 출력 공간 --> 테이블 보여줌
		textArea = new TextArea();
		textArea.getClass();
		textArea.setPrefHeight(50);
		textArea.setPrefWidth(500);
		textArea.setEditable(false);
		//root.setCenter(textArea);
		root.setCenter(textArea);
		
		//이름 입력
		TextField nameText = new TextField();
		nameText.setPromptText("이름을 입력하세요");
		nameText.setPrefWidth(10);
		nameText.setPrefHeight(40);
		//root.setLeft(nameText);
		
		//나이 입력
		TextField ageText = new TextField();
		ageText.setPromptText("나이를 입력하세요.");
		ageText.setPrefWidth(30);
		ageText.setPrefHeight(40);
		//root.setLeft(ageText);
		
		//급여 입력
		TextField salaryText = new TextField();
		salaryText.setPromptText("급여를 입력하세요.");
		salaryText.setPrefWidth(30);
		salaryText.setPrefHeight(40);
		//root.setLeft(salaryText);
		

		// 텍스트 입력 공간 --밑에꺼(보내고싶은말) -->접속되었습니다 보여주는 칸
		TextField inputText = new TextField();
		inputText.setPrefWidth(200); // Double.MAX_VALUE
//		HBox.setHgrow(inputText, Priority.ALWAYS); // 윈도우 창을 늘리면 자동으로 늘어남
		inputText.setDisable(true);

		// 텍스트 입력 액션 설정 (나중에 써야됨 입력칸)
//		inputText.setOnAction(event -> {
//			// 텍스트 입력 공간에 내용이 있을 때만 실행, 즉, 아무것도 입력이 안되어 있으면 전송하지 않음
//			if (!inputText.getText().trim().isEmpty()) {
//				send(userName.getText() + ": " + inputText.getText() + "\n"); 
//				inputText.clear();
//				inputText.requestFocus();
//			}
//		});

		// 전송 버튼
//		Button sendButton = new Button("전송");
//		sendButton.setDisable(true);

		// 전송 버튼 액션 설정
//		sendButton.setOnAction(event -> {
//			inputText.requestFocus();
//			// 텍스트 입력 공간에 내용이 있을 때만 실행, 즉, 아무것도 입력이 안되어 있으면 전송하지 않음
//			if (!inputText.getText().trim().isEmpty()) {
//				send(userName.getText() + ": " + inputText.getText() + "\n");
//				inputText.clear();
//				inputText.requestFocus();
//			}
//
//		});

		// 접속, CRUD 버튼
		Button connectionButton = new Button("접속");
//		dbc.getConnection();
		
		Button cButton = new Button("추\t가");
		cButton.setPrefHeight(50);
		cButton.setPrefWidth(80);

		Button rButton = new Button("조\t회");
		rButton.setPrefHeight(50);
		rButton.setPrefWidth(80);

		Button uButton = new Button("갱\t신");
		uButton.setPrefHeight(50);
		uButton.setPrefWidth(80);

		Button dButton = new Button("삭\t제");
		dButton.setPrefHeight(50);
		dButton.setPrefWidth(80);

		//추가 버튼
		cButton.setOnAction(event -> {
			if (cButton.getText().equals("추가")) {
//				int port = 9855;
				ins.insert();
//				try {
//					port = Integer.parseInt(portText.getText());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				// 서버 연결 시작
//				startClient(ipText.getText(), port);
				Platform.runLater(() -> {
					inputText.setText("접속되었습니다.");
					inputText.setStyle("-fx-text-fill: red;");
				});
				connectionButton.setText("끊기");
				userName.setDisable(true);
				ipText.setDisable(true);
				portText.setDisable(true);
//				inputText.setDisable(false);
//				sendButton.setDisable(false);
				inputText.requestFocus();

			}
		});
		

		// 접속 버튼 액션 설정
		connectionButton.setOnAction(event1 -> {
			if (connectionButton.getText().equals("접속")) {
//				int port = 9855;
				dbc.getConnection();
//				try {
//					port = Integer.parseInt(portText.getText());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				// 서버 연결 시작
//				startClient(ipText.getText(), port);
				Platform.runLater(() -> {
					inputText.setText("접속되었습니다.");
					inputText.setStyle("-fx-text-fill: red;");
				});
				connectionButton.setText("끊기");
				userName.setDisable(true);
				ipText.setDisable(true);
				portText.setDisable(true);
//				inputText.setDisable(false);
//				sendButton.setDisable(false);
				inputText.requestFocus();

			} else { // 끊기 버튼 이벤트
//				stopClient();
				Platform.runLater(() -> {
					inputText.setText("접속이 해제되었습니다.");
//					inputText.appendText("접속이 해제되었습니다.");
					inputText.setStyle("-fx-text-fill: black;");
				});
				connectionButton.setText("접속");
				userName.setDisable(false);
				ipText.setDisable(false);
				portText.setDisable(false);
//				inputText.setDisable(true);
//				sendButton.setDisable(true);
			}
		});

		
		
		
		topHBox.getChildren().addAll(userName, ipText, portText, connectionButton);
		root.setTop(topHBox);

		leftVBox.getChildren().addAll(nameText, ageText, salaryText, cButton, rButton, uButton, dButton);
		root.setLeft(leftVBox);
		
		bottomHBox.getChildren().addAll(inputText);
		root.setBottom(bottomHBox);
		
		Scene scene = new Scene(root, 700, 600);

		primaryStage.setTitle("사원정보 관리");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}