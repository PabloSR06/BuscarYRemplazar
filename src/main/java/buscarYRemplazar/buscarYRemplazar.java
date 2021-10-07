package buscarYRemplazar;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class buscarYRemplazar extends Application {
	
	private Button buscarButton, remplazarButton,
	remplazarTodoButton, cerrarButton, ayudaButton;
	
	private CheckBox mayusCheck, atrasCheck, regularCheck, resaltarCheck;
	
	private TextField buscarText, remplazarText;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		buscarText = new TextField();
		remplazarText = new TextField();
 
		buscarButton = new Button("Buscar");
		remplazarButton = new Button("Remplazar");
		remplazarTodoButton = new Button("Remplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setAlignment(Pos.CENTER);
		buscarButton.setPrefWidth(100);
		
		remplazarButton.setAlignment(Pos.CENTER);
		remplazarButton.setPrefWidth(100);
		
		remplazarTodoButton.setAlignment(Pos.CENTER);
		remplazarTodoButton.setPrefWidth(100);
		
		cerrarButton.setAlignment(Pos.CENTER);
		cerrarButton.setPrefWidth(100);
		
		ayudaButton.setAlignment(Pos.CENTER);
		ayudaButton.setPrefWidth(100);

		
		mayusCheck = new CheckBox("Mayusculas y minusculas");
		atrasCheck = new CheckBox("Buscar hacia atras");
		regularCheck = new CheckBox("Expresion regular");
		resaltarCheck = new CheckBox("Resaltar resultados");
		
		GridPane formPane = new GridPane();
		formPane.setGridLinesVisible(false);
		formPane.setHgap(7);
		formPane.setVgap(7);
		formPane.setPadding(new Insets(5));
		formPane.addRow(0, new Label("Buscar: "), buscarText);
		formPane.addRow(1, new Label("Remplazar con: "), remplazarText);
		//formPane.addColumn(3,buscarButton, remplazarButton,remplazarTodoButton, cerrarButton, ayudaButton);

		formPane.add(mayusCheck, 1, 2);
		formPane.add(atrasCheck, 2, 2);
		formPane.add(regularCheck, 1, 3);
		formPane.add(resaltarCheck, 2, 3);
		
		GridPane.setColumnSpan(buscarText, 2);
		GridPane.setColumnSpan(remplazarText, 2);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),	
				new ColumnConstraints(),	
				new ColumnConstraints(),
			};
		formPane.getColumnConstraints().setAll(cols);
		
		cols[2].setHgrow(Priority.ALWAYS);
		
		
		VBox buttonVbox = new VBox(5);
		buttonVbox.getChildren().addAll(buscarButton, remplazarButton,
	remplazarTodoButton, cerrarButton, ayudaButton);
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		root.setCenter(formPane);
		root.setRight(buttonVbox);
		
		Scene scene = new Scene(root, 500, 185);

		primaryStage.setTitle("Buscar Y Remplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
