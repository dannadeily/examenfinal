package com.entity;


import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Reporte {




    public Reporte(){
        
        try{
        
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource(""));
            JasperPrint jprint = JasperFillManager.fillReport(report, null, DataSource.getDataSource());
            
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
            
        }catch(JRException ex){
            ex.getMessage();
        }
        
    
    
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Reporte jasper = new Reporte();
        

    }
    
}