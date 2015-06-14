/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimesarandomizer;
import dimesarandomizer.CamposBD;
import java.io.IOException;

/**
 *
 * @author RAUL
 */
public class DimesaRandomizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
         CamposBD ob = new CamposBD("C:\\Users\\RAUL\\Documents\\Marcos SQL\\SQL.txt");
         
         
      // ob.insertForCostoEquipo(2000);
        //ob.insertForEmpleados(2000);
     //    ob.insertForEquipos(2000);
         //  ob.insertForEvento(2000);
      //   ob.insertForServicios(2000);
         ob.insertForSupervisor(1000);
        
    
        
    }
    
}
