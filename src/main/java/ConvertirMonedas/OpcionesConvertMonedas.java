package ConvertirMonedas;

public class OpcionesConvertMonedas {
    //Variables para recibir los datos del conversor
    public double valor;
    public String monedaOrgien;
    public String monedaHacia;
    public double resultado;
    
    //Traigo la clase de calculos
    ConvertMonedas operacionesMoneda = new ConvertMonedas();

    //getter y setter
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMonedaOrgien() {
        return monedaOrgien;
    }

    public void setMonedaOrgien(String monedaOrgien) {
        this.monedaOrgien = monedaOrgien;
    }

    public String getMonedaHacia() {
        return monedaHacia;
    }

    public void setMonedaHacia(String monedaHacia) {
        this.monedaHacia = monedaHacia;
    }
    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    //constructor
    public OpcionesConvertMonedas() {
    }
    
    public double convertir() {   
        
        switch (monedaOrgien) {
            case "Pesos ARG" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirArgReales(valor);
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirArgDolares(valor);
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirArgEuros(valor);
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirArgPesoMex(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirArgLibra(valor);
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirArgWon(valor);
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirArgYuanes(valor);
                    case "Pesos ARG" -> resultado = 1111.1111;
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Dolar USA" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirDolaresAReales(valor);
                    case "Dolar USA" -> resultado = 1111.1111;
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirDolaresAEuros(valor);
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirDolaresAPesosMex(valor);
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirDolaresAPesos(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirDolarLibra(valor);
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirDolarWon(valor);
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirDolarYuanes(valor);
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Euro EU" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirEuroAReales(valor);
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirEuroAUsa(valor);
                    case "Euro EU" -> resultado = 1111.1111;
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirEuroAMex(valor);
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirEuroAArg(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirEuroLibra(valor);
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirEuroWon(valor);
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirEuroYuanes(valor);
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Pesos MEX" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirMexAReales(valor);
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirMexAUsa(valor);
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirMexAEuro(valor);
                    case "Pesos MEX" -> resultado = 1111.1111;
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirMexAArg(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirMexLibra(valor);
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirMexWon(valor);
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirMexYuanes(valor);
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Reales BRA" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = 1111.1111;
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirRealAUsa(valor);
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirRealAEuro(valor);
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirRealAMex(valor);
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirRealArg(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirRealesLibra(valor);
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirRealesWon(valor);
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirRealesYuanes(valor);
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Libra ENG" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirLibraAReal(valor);
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirLibraAUsa(valor);
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirLibraAEuro(valor);
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirLibraAMex(valor);
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirLibraAArg(valor);
                    case "Libra ENG" -> resultado = 1111.1111;
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirLibraAWon(valor);
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirLibraAYen(valor);
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Won SUR-COREA" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirWonAReal(valor);
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirWonAUsa(valor);
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirWonAEuro(valor);
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirWonAMex(valor);
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirWonAArg(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirWonALibra(valor);
                    case "Won SUR-COREA" -> resultado = 1111.1111;
                    case "Yen JAPON" -> resultado = operacionesMoneda.ConvertirWonAYen(valor);
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            case "Yen JAPON" -> {
                switch (monedaHacia) {
                    case "Reales BRA" -> resultado = operacionesMoneda.ConvertirYuanReal(valor);
                    case "Dolar USA" -> resultado = operacionesMoneda.ConvertirYuanAUsa(valor);
                    case "Euro EU" -> resultado = operacionesMoneda.ConvertirYuanAEuro(valor);
                    case "Pesos MEX" -> resultado = operacionesMoneda.ConvertirYuanAMex(valor);
                    case "Pesos ARG" -> resultado = operacionesMoneda.ConvertirYuanAArg(valor);
                    case "Libra ENG" -> resultado = operacionesMoneda.ConvertirYuanLibra(valor);
                    case "Won SUR-COREA" -> resultado = operacionesMoneda.ConvertirYuanWon(valor);
                    case "Yen JAPON" -> resultado = 1111.1111;
                    default -> {
                        resultado = 2222222.222222;
                    }
                }
            }
            default -> throw new AssertionError();
        }
        return resultado;
    }
   
}
