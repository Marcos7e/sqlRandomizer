/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimesarandomizer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RAUL
 */
public class CamposBD {
    public final String[] costoEquipoCampos ={"Id_costo_equipo","costo"};
    public final String[]  empleadoCampos = {"IdEmpleado","NombreEmpleado","ApellidoEmpleado","Cargo","Costo_hora"};
    public final String[]  equipoCampos = {"Pla_dimesa","Num_Serie","Marca_equipo","Modelo_equipo","Nomb_equipo","Observ_eq","Empresa_responsable","Imagen","fecha_registro"};
    public final String[]  eventoCampos = {"num_dimesa","Pla_dimesa","Id_costo_equipo","Tbl_equipo_pla_dimesa","Servicio","Fecha_inicio","Fecha_fin","Unidad","Falla"};
    public final String[]  servicioCampos = {"id_servicios","nombre"};
    public final String[] supervisorcampos = {"Id_supervisor","IdEmpleado","nombre","apellido"};
    
    
    public String ruta = "C:\\Users\\RAUL\\Documents\\Marcos SQL\\SQL.txt";
    public File archivo = new File(ruta);
    
    public final String[] nombres = {"Daniel","Darío","Diego" ,"Damian" ,"Eloy" ,"Gonzalo","Rodrigo" ,"Jacobo" ,"Martín" ,"Mateo" ,"Hugo" ,"Liberto" ,"Simon" ,"Samuel" ,"Ferran","Joel ", "Sauln" ,"Aaron " ,"Aitor " ,"Lucas " ,"Nicolas ", "Gabriel " ,"Román " ,"Alvaro"};
    public String[] apellidos = {"Babb", "Babar", "Baca", "Bacca", "Bacigalupo", "Badilla", "Bado", "Báez", "Baeza", "Baidal", "Bairnales", "Baizan", "Bajarano", "Balarezo", "Baldares", "Balday", "Baldelomar", "Balderas", "Balderrama", "Balderramos", "Baldí"};
    public String[] cargos = {"Supervisor","Gerente","usuario","Tecnico"};
    
    public String[]marcaEquipos = {"Marca1","Marca2","Marca3","Marca4","Marca5","Marca4","Marca5","Marca6","Marca7","Marca8","Marca9","Marca10","Marca11","Marca12"};
    public String[]modeloequipo = {"MODELO1","MODELO2","MODELO3","MODELO4","MODELO5","MODELO6","MODELO7","MODELO8","MODELO9","MODELO10","MODELO11","MODELO12"};
    public String[]nombreEquipo = {"Nombre1","Nombre2","Nombre3","Nombre4","Nombre5","Nombre6","Nombre7","Nombre8","Nombre9","Nombre10","Nombre11","Nombre12","Nombre13","Nombre14","Nombre15","Nombre16","Nombre17","Nombre18"};
    public String[]observacion = {"Observacion1","Observacion2","Observacion3","Observacion4","Observacion5","Observacion6","Observacion7","Observacion8","Observacion9","Observacion10","Observacion11","Observacion12","Observacion13","Observacion14"};
    public String[]EmpresaResponsable = {"Empresa1","Empresa2","Empresa3"};
    public String[] fechas = {"10-10-1992","11-11-2000","1-1-2000"};
    public String[] fechasFinales = {"10-10-1993","11-11-2001","1-1-2001"};
    public String[] servicios = {"Servicio1","Servicio2","Servicio3","Servicio4","Servicio5","Servicio6","Servicio7","Servicio8"};
    public String[] unidad = {"Cuidados Intensivos","Emergencias","Pediatria","Oftalmologia","unidad2"};
    public String[] falla = {"falla1","falla2","falla3","falla4"};    
    
      Random rCosto = new Random();
      public int costoHora;

    public CamposBD(String ruta) throws IOException {
        
       this.ruta = ruta;
       this.archivo = new File(ruta);
        BufferedWriter bw;
            if(archivo.exists()) {
    
        } else {
     bw = new BufferedWriter(new FileWriter(archivo));
     bw.close();
        }

 
    }
    
     public void insertForEquipos(int cuantos)
    {try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            
            
            Random r = new Random();
            int rmarca = 0;
            int rmodelo = 0;
            int rnombre = 0;
            int robrs = 0;
            int rempresa =0;
            int rfechas =0;
            
            
            
            bw.write("// INSERT PARA Equipos");
            bw.newLine();
            
        for(int i=0; i<=cuantos; i++)
        {
            rmarca = r.nextInt(marcaEquipos.length);
            rmodelo = r.nextInt(modeloequipo.length);
            rnombre = r.nextInt(nombreEquipo.length);
            robrs = r.nextInt(observacion.length);
            rempresa = r.nextInt(EmpresaResponsable.length);
            rfechas = r.nextInt(fechas.length);
            
            
            bw.write("INSERT INTO equipo("+equipoCampos[0]+","+equipoCampos[1]+","+equipoCampos[2]+","+equipoCampos[3]+","+equipoCampos[4]+","+equipoCampos[5]+","+equipoCampos[6]+","+equipoCampos[8]+")"
                    + "VALUES("+i+",'"+i+"','"+marcaEquipos[rmarca]+"','"+modeloequipo[rmodelo]+"','"+nombreEquipo[rnombre]+"','"+observacion[robrs]+"','"+EmpresaResponsable[rempresa]+"','"+fechas[rfechas]+"');");
            bw.newLine();
            
            
            
        }
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(CamposBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
     public void insertForEvento(int cuantos)
    {try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            
            
            Random r = new Random();
            int rservicio = 0;
            int rfecha = 0;
            int rfechaf = 0;
            int runidad = 0;
            int rfalla =0;
          
            
            
            
            bw.write("// INSERT PARA evento");
            bw.newLine();
            
        for(int i=0; i<=cuantos; i++)
        {
            rservicio = r.nextInt(servicios.length);
            rfecha = r.nextInt(fechas.length);
            rfechaf = r.nextInt(fechasFinales.length);
            runidad = r.nextInt(unidad.length);
            rfalla = r.nextInt(falla.length);
            
            
            
            bw.write("INSERT INTO evento("+eventoCampos[0]+","+eventoCampos[1]+","+eventoCampos[2]+","+eventoCampos[3]+","+eventoCampos[4]+","+eventoCampos[5]+","+eventoCampos[6]+","+eventoCampos[7]+","+eventoCampos[8]+")"
                    + "VALUES("+i+","+i+","+i+",'"+i+"','"+servicios[rservicio]+"','"+fechas[rfecha]+"','"+fechasFinales[rfechaf]+"','"+unidad[runidad]+"','"+falla[rfalla]+"');");
            bw.newLine();
            
            
            
        }
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(CamposBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    public void insertForEmpleados(int cuantos)
    {try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            int costoHora =0;
            
            Random r = new Random();
            int rnombre = 0;
            int rapellido = 0;
            int rcargo = 0;
            int rcosto = 0;
            
            
            
            bw.write("// INSERT PARA EMPLEADOS");
            bw.newLine();
            
        for(int i=0; i<=cuantos; i++)
        {
            rnombre = r.nextInt(nombres.length);
            rapellido = r.nextInt(apellidos.length);
            rcargo = r.nextInt(cargos.length);
            rcosto = r.nextInt(1000);
            
            
            costoHora = rCosto.nextInt(31);
            bw.write("INSERT INTO empleado("+empleadoCampos[0]+","+empleadoCampos[1]+","+empleadoCampos[2]+","+empleadoCampos[3]+","+empleadoCampos[4]+") "
                    + "VALUES("+i+",'"+nombres[rnombre]+"','"+apellidos[rapellido]+"','"+cargos[rcargo]+"',"+rcosto+");");
            bw.newLine();
            
            
            
        }
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(CamposBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void insertForCostoEquipo(int cuantos)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            int costo =0;
        for(int i=0; i<=cuantos; i++)
        {
            costo = rCosto.nextInt(100000);
            bw.write("INSERT INTO costo_equipo("+costoEquipoCampos[0]+","+costoEquipoCampos[1]+") VALUES("+i+","+costo+");");
            bw.newLine();
            
            
            
        }
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(CamposBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
       public void insertForServicios(int cuantos)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            int rserv =0;
        for(int i=0; i<=cuantos; i++)
        {
           rserv = rCosto.nextInt(servicios.length);
            bw.write("INSERT INTO servicio("+servicioCampos[0]+","+servicioCampos[1]+") VALUES("+i+",'"+servicios[rserv]+"');");
            bw.newLine();
            
            
            
        }
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(CamposBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
       public void insertForSupervisor(int cuantos)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            
            int rnombre =0;
            int rapellido = 0;
            
        for(int i=0; i<=cuantos; i++)
        {
           rnombre = rCosto.nextInt(nombres.length);
           rapellido = rCosto.nextInt(apellidos.length);
            bw.write("INSERT INTO supervisor("+supervisorcampos[0]+","+supervisorcampos[1]+","+supervisorcampos[2]+","+supervisorcampos[3]+") VALUES("+i+","+i+",'"+nombres[rnombre]+"','"+apellidos[rapellido]+"');");
            bw.newLine();
            
            
            
        }
            bw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(CamposBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
