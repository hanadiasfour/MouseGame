package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.robot.Robot;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

//	Polyline a = new Polyline(10, 60, 70, 60, 70, 100, 200, 100, 200, 30, 340, 30, 340, 250, 100, 250, 100, 300, 390, 300);

	Line a = new Line(0, 60, 70, 60);
	Line ab = new Line(70, 60, 70, 100);
	Line b = new Line(70, 100, 200, 100);
	Line bc = new Line(200, 100, 200, 30);
	Line c = new Line(200, 30, 340, 30);
	Line cd = new Line(340, 30, 340, 250);
	Line d = new Line(340, 250, 100, 250);
	Line de = new Line(100, 250, 100, 300);
	Line e = new Line(100, 300, 390, 300);

	Line f = new Line(0, 85, 40, 85);
	Line fg = new Line(40, 85, 40, 130);
	Line g = new Line(40, 130, 240, 130);
	Line gh = new Line(240, 130, 240, 60);
	Line h = new Line(240, 60, 305, 60);
	Line hi = new Line(305, 60, 305, 220);
	Line i = new Line(305, 220, 60, 220);
	Line ij = new Line(60, 220, 60, 330);
	Line j = new Line(60, 330, 390, 330);
	Line end = new Line(390, 300, 390, 330);

//	Polyline b = new Polyline(10, 85, 40, 85, 40, 130, 240, 130, 240, 60, 305, 60, 305, 220, 60, 220, 60, 330, 390, 330);

	@Override
	public void start(Stage primaryStage) {
		Text txt = new Text(9, 50, "START");
		Text txt2 = new Text(370, 350, "END");

		Pane playGround = new Pane();

		playGround.getChildren().addAll(txt, txt2, a, ab, b, bc, c, cd, d, de, e, f, fg, g, gh, h, hi, i, ij, j, end);

		Robot robot = new Robot();
		robot.mouseMove(580, 221);
		Text over = new Text(170, 190, "WINNER !!");
		over.setScaleX(4);
		over.setScaleY(4);

		over.setStrokeWidth(150);
		over.setFill(Color.GREEN);

		end.setOnMouseEntered(e -> {

			Scene scene = new Scene(new Pane(over), 400, 400);
			primaryStage.setScene(scene);

		});

		playGround.setOnMouseMoved(s -> {

			check(a);
			check(ab);
			check(b);
			check(bc);
			check(c);
			check(cd);
			check(d);
			check(de);
			check(e);
			check(f);
			check(fg);
			check(g);
			check(gh);
			check(h);
			check(hi);
			check(i);
			check(ij);
			check(j);

		});

		BorderPane root = new BorderPane();
		root.setCenter(playGround);
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public void check(Shape r) {
		r.setOnMouseEntered(e -> {

			Robot robot = new Robot();
			robot.mouseMove(580, 221);
			System.out.println("FAIL");

		});

	}

	public static void main(String[] args) {
		launch(args);
	}
}
