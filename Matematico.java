


/**
 * Write a description of class Matematico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matematico
{
    private double n1,n2,n3;
    public String indicarMayor(double n1,double n2, double n3){
        double mayor,menor,medio;
        String reporte;
        if (n1>=n2){
            if(n2>=n3){
                mayor=n1;
                medio=n2;
                menor=n3;
            }else{
                if(n1<=n3){
                    mayor=n3;
                    medio=n1;
                    menor=n2;
                }else{
                    mayor=n1;
                    medio=n3;
                    menor=n2;
                }
            }
           
        }else{
            if (n3>=n2){
                mayor=n3;
                medio=n2;
                menor=n1;
            }else{
                mayor=n2;
                if (n3>=n1){
                    medio=n3;
                    menor=n1;
                }else{
                    medio=n1;
                    menor=n3;
                }
            }
        }
        reporte="Mayor "+ mayor+",medio "+medio+",menor "+menor;
        return reporte;
    }
    
    public double distaciaPuntos(Punto punto1, Punto punto2){
        double distancia;
        distancia=Math.sqrt(Math.pow((punto2.getX()-punto1.getX()),2)+ Math.pow((punto2.getY()-punto1.getY()),2));
        return distancia;
    }
    public double areaRectangulo(double a,double b){
        double area;
        if (a>0 && b>0){
            area= a*b;
        }else{
            area=0.0;
        }
        return area;
    }
    public String cuadrante(Punto punto){
        String cuadran;
        if (punto.getX()!=0 && punto.getY()!=0){
            if (punto.getX()<0 && punto.getY()<0){
                  cuadran="III Cuadrante";
            }else{
                if (punto.getX()<0){
                    cuadran="II Cuadrante";
                }
                else{
                    cuadran="IV Cuadrante";
                }if (punto.getX()>0 && punto.getY()>0){
                    cuadran="I Cuadrante";
                }
            }
        }else{
            cuadran="Eje";
        }
        return cuadran;
    }
    
}
