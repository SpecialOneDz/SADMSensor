package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Separator;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.TabPane;

import javafx.scene.control.MenuBar;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

import javafx.scene.layout.AnchorPane;

import javafx.scene.control.Tab;

import javafx.scene.control.Menu;

public class sadmController {
	@FXML
	private AnchorPane pan1;
	@FXML
	private Button btn;
	@FXML
	private TextArea txtLog;
	@FXML
	private TabPane tabPan1;
	@FXML
	private Tab tempTab;
	
	@FXML
	private LineChart<Number, Number> temGraph;
	@FXML
    private NumberAxis xAxis1 ;
    @FXML
    private NumberAxis yAxis1 ;
    XYChart.Series series = new XYChart.Series();
    
    @FXML
	private Tab humTab;
	@FXML
	private LineChart temGraph1;
	@FXML
	private Tab wtTab;
	@FXML
	private LineChart temGraph2;
	@FXML
	private Tab preTab;
	@FXML
	private LineChart temGraph3;
	@FXML
	private Tab winTab;
	@FXML
	private LineChart temGraph4;
	@FXML
	private Tab rainTab;
	@FXML
	private LineChart temGraph5;
	@FXML
	private Separator sepBottom;
	@FXML
	private MenuBar menuBar;
	@FXML
	private Menu mbFile;
	@FXML
	private Menu mbHelp;
	@FXML
	private Menu mbAbour;
	@FXML
	private TextField locTxt;
	@FXML
	private TextField idTxt;
	@FXML
	private TextField valueTxt;
	@FXML
	private Label locLabel;
	@FXML
	private Label idLabel;
	@FXML
	private Label valueLabel;
	@FXML
	private Separator sepBottom1;
	@FXML
	private Label logLabel;

	
	public void initialize() {

	    // ...
		xAxis1.setLabel("Time (hh:mm)");
	    xAxis1.setAutoRanging(false);
	   // String xMin = "12:30:12";
	  //  String xMax = "13:21:01";
	//    double xminDouble = Double.parseDouble(xMin);
	  //  double xmaxDouble = Double.parseDouble(xMax);
	  //  xAxis.setLowerBound(xminDouble);
	 //   xAxis.setUpperBound(xmaxDouble);
	    xAxis1.setLowerBound(09.00);
	    xAxis1.setUpperBound(09.55);
	    xAxis1.setTickUnit(0.05);
	    yAxis1.setLabel("Temperature (Celsius)");
	    yAxis1.setAutoRanging(false);
	    yAxis1.setLowerBound(0);
	    yAxis1.setUpperBound(50);
	    yAxis1.setTickUnit(1);

	    // ...
	    series.setName("urn:epc:id:signin:3333333.111111.0001" );
	    series.getData().add(new XYChart.Data(9.00, 25.5));
	    series.getData().add(new XYChart.Data(9.05, 27.5));
	    series.getData().add(new XYChart.Data(9.10, 27.7));
	    series.getData().add(new XYChart.Data(9.15, 28.8));
	    series.getData().add(new XYChart.Data(9.20, 28.95));
	    series.getData().add(new XYChart.Data(9.25, 29.99));
	    series.getData().add(new XYChart.Data(9.30, 30.10));
	    series.getData().add(new XYChart.Data(9.35, 30.30));
	    series.getData().add(new XYChart.Data(9.40, 30.4));
	    series.getData().add(new XYChart.Data(9.45, 31.2));
	    series.getData().add(new XYChart.Data(9.50, 31.8));
	    series.getData().add(new XYChart.Data(9.55, 32.3));
	    temGraph.getData().add(series);
	    
	}
	
	// Event Listener on Button[#btn].onAction
	@FXML
	public void click(ActionEvent event) {
		txtLog.setText("AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentTemp :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-06-16 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.142 : data recieved !\r\n"
				+ "AgentReason1 :: 2022-06-16 16:07:59.143 : data recieved !\r\n"
				+ "AgentReason1 :: Send the first solution\r\n"
				+ "AgentReason2 :: 2022-06-16 16:08:04.083 : Reason recieved !");
	}
}
