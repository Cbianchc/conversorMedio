package ConvertirTempes;

public class OpcionesTemperatura {

   public double valorT;
   public String TempeOrgien;
   public String TempeHacia;
   public double resulTempe; 
   
   ConversorTempe operacionesTempe = new ConversorTempe();

   public double getValorTempe() {
        return valorT;
    }
   
   public void setValorTempe(double valorTempe) {
        this.valorT = valorTempe;
    }

   public String getTempeOrgien() {
        return TempeOrgien;
    }

   public void setTempeOrgien(String TempeOrgien) {
        this.TempeOrgien = TempeOrgien;
    }

   public String getTempeHacia() {
        return TempeHacia;
    }

   public void setTempeHacia(String TempeHacia) {
        this.TempeHacia = TempeHacia;
    }

   public double getResulTempe() {
        return resulTempe;
    }

   public void setResulTempe(double resulTempe) {
        this.resulTempe = resulTempe;
    }

   public OpcionesTemperatura() {
    }
   

   public double convertirTemperaturas() {
       System.out.println("ValorT es " + valorT + "|Desde es " + TempeOrgien + "|hacia es " + TempeHacia);
       
       switch (TempeOrgien) {
            case "Celsius" -> {
                switch (TempeHacia) {
                    case "Celsius" -> resulTempe = 1111.1111;
                    case "Fahrenheit" -> resulTempe = operacionesTempe.ConvCelFahren(valorT);
                    case "Kelvin" -> resulTempe = operacionesTempe.ConvCelKelvin(valorT);
                    case "Rankine" -> resulTempe = operacionesTempe.ConvCelRankine(valorT);
                    default -> {resulTempe = 2222222.222222;}
                }
            }
            case "Fahrenheit" -> {
                switch (TempeHacia) {
                    case "Celsius" -> resulTempe = operacionesTempe.ConvFaCelsius(valorT);
                    case "Fahrenheit" -> resulTempe = 1111.1111;
                    case "Kelvin" -> resulTempe = operacionesTempe.ConvFaKelvin(valorT);
                    case "Rankine" -> resulTempe = operacionesTempe.ConvFaRankine(valorT);
                    default -> {resulTempe = 2222222.222222;}
                }
            }
            case "Kelvin" -> {
                switch (TempeHacia) {
                    case "Celsius" -> resulTempe = operacionesTempe.ConvKeCelsius(valorT);
                    case "Fahrenheit" -> resulTempe = operacionesTempe.ConvKeFahre(valorT);
                    case "Kelvin" -> resulTempe = 1111.1111;
                    case "Rankine" -> resulTempe = operacionesTempe.ConvKeRankine(valorT);
                    default -> {resulTempe = 2222222.222222;}
                }
            }
            case "Rankine" -> {
                switch (TempeHacia) {
                    case "Celsius" -> resulTempe = operacionesTempe.ConvRankCelcius(valorT);
                    case "Fahrenheit" -> resulTempe = operacionesTempe.ConvRankFahre(valorT);
                    case "Kelvin" -> resulTempe = operacionesTempe.ConvRankKelvin(valorT);
                    case "Rankine" -> resulTempe = 1111.1111;
                    default -> {
                        resulTempe = 2222222.222222;
                    }
                }
            }
            default -> resulTempe = valorT;
       }
            
     return resulTempe;  
   }
}
