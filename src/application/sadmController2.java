package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.MenuBar;

import javafx.scene.control.Label;

import javafx.scene.control.TextArea;

import javafx.event.Event;

import javafx.scene.control.Menu;

import javafx.scene.control.Separator;

import javafx.scene.chart.LineChart;

import javafx.event.ActionEvent;

import javafx.scene.control.TabPane;

import javafx.scene.layout.AnchorPane;

import javafx.scene.control.Tab;

import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class sadmController2 {
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
	private LineChart temGraph;
	@FXML
    private NumberAxis xAxis ;
    @FXML
    private NumberAxis yAxis ;
    XYChart.Series series = new XYChart.Series();
	
    @FXML
	private Tab humTab;
	@FXML
	private LineChart temGraph1;
	@FXML
	private NumberAxis xAxis1 ;
	@FXML
	private NumberAxis yAxis1 ;
	XYChart.Series series1 = new XYChart.Series();
	
	
	@FXML
	private Tab wtTab;
	@FXML
	private LineChart temGraph2;
	@FXML
	private NumberAxis xAxis2 ;
	@FXML
	private NumberAxis yAxis2 ;
	XYChart.Series series2 = new XYChart.Series();
	XYChart.Series series22 = new XYChart.Series();
	
	@FXML
	private Tab preTab;
	@FXML
	private LineChart temGraph3;
	@FXML
	private NumberAxis xAxis3 ;
	@FXML
	private NumberAxis yAxis3 ;
	XYChart.Series series3 = new XYChart.Series();
	
	@FXML
	private Tab winTab;
	@FXML
	private LineChart temGraph4;
	@FXML
	private NumberAxis xAxis4 ;
	@FXML
	private NumberAxis yAxis4 ;
	XYChart.Series series4 = new XYChart.Series();
	
	@FXML
	private Tab rainTab;
	@FXML
	private LineChart temGraph5;
	@FXML
	private NumberAxis xAxis5 ;
	@FXML
	private NumberAxis yAxis5 ;
	XYChart.Series series5 = new XYChart.Series();
	
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
	@FXML
	private Pane alrtPan;
	@FXML
	private Circle alrtCrcl;
	@FXML
	private Label phenLabel;
	@FXML
	private Label lvlLabel;
	@FXML
	private Label valLabel;
	@FXML
	private Label phenRep;
	@FXML
	private Label lvlRep;
	@FXML
	private Label valRep;
	
	// Event Listener on Button[#btn].onAction
	@FXML
	public void clickbtn(ActionEvent event) {
		txtLog.setText("AgentReason1 :: 2022-06-16 16:07:59.141 : data recieved !\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.141 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.141 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.142 : data recieved !\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.142 : Sending new data\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.142 : Sending new data\r\n"
				+ "AgentReason1 :: 2022-01-06 16:07:59.142 : data recieved !\r\n"
				+ "AgentWaterlevel :: 2022-01-06 16:07:59.142 : Sending new data\r\n"
				+ "AgentTemp :: 2022-01-06 16:07:59.142 : Sending new data\r\n"
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
	// Event Listener on Tab[#tempTab].onSelectionChanged
	@FXML
	public void click(Event event) {
		
		if(locTxt == null || idTxt == null || valueTxt == null ) {
			
		}
		else {
		 locTxt.setText("http://DESKTOP-31HALAK.home:7778/acc");
		 idTxt.setText("AgentTemp@192.168.1.30:1099/JADE");
		 valueTxt.setText("32.3 C°");
		 }
	}
	// Event Listener on Tab[#humTab].onSelectionChanged
	@FXML
	public void click1(Event event) {
		locTxt.setText("http://DESKTOP-31HALAK.home:7778/acc");
		idTxt.setText("AgentHumid@192.168.1.30:1099/JADE");
		valueTxt.setText("26 %");
	}
	// Event Listener on Tab[#wtTab].onSelectionChanged
	@FXML
	public void click2(Event event) {
		locTxt.setText("http://DESKTOP-31HALAK.home:7778/acc");
		idTxt.setText("AgentWaterlevel@192.168.1.30:1099/JADE");
		valueTxt.setText("-0.5 m");
	}
	// Event Listener on Tab[#preTab].onSelectionChanged
	@FXML
	public void click3(Event event) {
		locTxt.setText("http://DESKTOP-31HALAK.home:7778/acc");
		idTxt.setText("AgentPres@192.168.1.30:1099/JADE");
		valueTxt.setText("");
	}
	// Event Listener on Tab[#winTab].onSelectionChanged
	@FXML
	public void click4(Event event) {
		locTxt.setText("http://DESKTOP-31HALAK.home:7778/acc");
		idTxt.setText("AgentWind@192.168.1.30:1099/JADE");
		valueTxt.setText("");
	}
	// Event Listener on Tab[#rainTab].onSelectionChanged
	@FXML
	public void click5(Event event) {
		locTxt.setText("http://DESKTOP-31HALAK.home:7778/acc");
		idTxt.setText("AgentRain@192.168.1.30:1099/JADE");
		valueTxt.setText("");
	}
	
	public void initialize() {
	
	    // TEMPERATURE //
		xAxis.setLabel("Time (hh:mm)");
	    xAxis.setAutoRanging(false);
	   // String xMin = "12:30:12";
	  //  String xMax = "13:21:01";
	//    double xminDouble = Double.parseDouble(xMin);
	  //  double xmaxDouble = Double.parseDouble(xMax);
	  //  xAxis.setLowerBound(xminDouble);
	 //   xAxis.setUpperBound(xmaxDouble);
	    xAxis.setLowerBound(09.00);
	    xAxis.setUpperBound(09.55);
	    xAxis.setTickUnit(0.05);
	    yAxis.setLabel("Temperature (Celsius)");
	    yAxis.setAutoRanging(false);
	    yAxis.setLowerBound(0);
	    yAxis.setUpperBound(50);
	    yAxis.setTickUnit(1);

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
	    
	    
	    // HUMIDITY 1 //
	    xAxis1.setLabel("Time (hh:mm)");
	    xAxis1.setAutoRanging(false);
	    xAxis1.setLowerBound(09.00);
	    xAxis1.setUpperBound(09.55);
	    xAxis1.setTickUnit(0.05);
	    yAxis1.setLabel("Humidity (%)");
	    yAxis1.setAutoRanging(false);
	    yAxis1.setLowerBound(0);
	    yAxis1.setUpperBound(100);
	    yAxis1.setTickUnit(5);
	    series1.setName("urn:epc:id:signin:3333333.111111.0001" );
	    series1.getData().add(new XYChart.Data(9.00, 29.00));
	    series1.getData().add(new XYChart.Data(9.05, 28.7));
	    series1.getData().add(new XYChart.Data(9.10, 28.5));
	    series1.getData().add(new XYChart.Data(9.15, 28.1));
	    series1.getData().add(new XYChart.Data(9.20, 28.00));
	    series1.getData().add(new XYChart.Data(9.25, 27.8));
	    series1.getData().add(new XYChart.Data(9.30, 27.6));
	    series1.getData().add(new XYChart.Data(9.35, 27.2));
	    series1.getData().add(new XYChart.Data(9.40, 27.00));
	    series1.getData().add(new XYChart.Data(9.45, 26.8));
	    series1.getData().add(new XYChart.Data(9.50, 26.2));
	    series1.getData().add(new XYChart.Data(9.55, 26.00));
	    temGraph1.getData().add(series1);
	    
	    // Water level //
	    xAxis2.setLabel("Time (hh:mm)");
	    xAxis2.setAutoRanging(false);
	    xAxis2.setLowerBound(09.00);
	    xAxis2.setUpperBound(09.55);
	    xAxis2.setTickUnit(0.05);
	    yAxis2.setLabel("S (m)");
	    yAxis2.setAutoRanging(false);
	    yAxis2.setLowerBound(-3);
	    yAxis2.setUpperBound(3);
	    yAxis2.setTickUnit(0.5);
	    series2.setName("urn:epc:id:signin:3333333.22222.0001" );
	    series2.getData().add(new XYChart.Data(9.00, 1.2));
	    series2.getData().add(new XYChart.Data(9.05, 1.2));
	    series2.getData().add(new XYChart.Data(9.10, 1.8));
	    series2.getData().add(new XYChart.Data(9.15, 1.6));
	    series2.getData().add(new XYChart.Data(9.20, 1.4));
	    series2.getData().add(new XYChart.Data(9.25, 1.5));
	    series2.getData().add(new XYChart.Data(9.30, 1.4));
	    series2.getData().add(new XYChart.Data(9.35, 1.5));
	    series2.getData().add(new XYChart.Data(9.40, 1.7));
	    series2.getData().add(new XYChart.Data(9.45, 1.6));
	    series2.getData().add(new XYChart.Data(9.50, 1.8));
	    series2.getData().add(new XYChart.Data(9.55, 1.5));
	    temGraph2.getData().add(series2);
	    
	    series22.setName("urn:epc:id:signin:3333333.22222.0002" );
	    series22.getData().add(new XYChart.Data(9.00, 0.5));
	    series22.getData().add(new XYChart.Data(9.05, 0.4));
	    series22.getData().add(new XYChart.Data(9.10, 0.6));
	    series22.getData().add(new XYChart.Data(9.15, 0.5));
	    series22.getData().add(new XYChart.Data(9.20, 0.3));
	    series22.getData().add(new XYChart.Data(9.25, 0.1));
	    series22.getData().add(new XYChart.Data(9.30, 0.1));
	    series22.getData().add(new XYChart.Data(9.35, 0.05));
	    series22.getData().add(new XYChart.Data(9.40, 0.75));
	    series22.getData().add(new XYChart.Data(9.45, 0.65));
	    series22.getData().add(new XYChart.Data(9.50, 0.7));
	    series22.getData().add(new XYChart.Data(9.55, 0.5));
	    temGraph2.getData().add(series22);
	}
	
	@FXML
	public void click(ActionEvent event) {
	
	}
	
}
