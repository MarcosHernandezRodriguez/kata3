/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Marcos
 */
public class HistogramDisplay extends ApplicationFrame{
    
    public  HistogramDisplay(){
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    public JPanel createPanel(){
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset()));
        chartpanel.setPreferredSize(new Dimension(500, 400));
        return chartpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma de emails", 
                "dominios email", 
                "nº de emails recibidos", 
                dataSet, 
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", "ulpgc.es");
        dataSet.addValue(11, "", "ull.es");
        dataSet.addValue(2, "", "hotmail.com");
        dataSet.addValue(8, "", "gmail.com");
        return dataSet;
    }
    public static void CreateChart(){} 
    public static void CreateDataset(){}  
    
}
