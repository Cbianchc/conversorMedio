package ConvertirMonedas;


public class ConvertMonedas {
    //String tenes = "Tenes: $";
    //String en$ = " en pesos";
//---------Cotizaciones fijas (Valores tomados de https://www.xe.com/ - el dia 21-07-2023
    Double valorDolar = 267.50; 
    Double valorEuro = 299.72;
    Double valorMex = 15.80;
    Double valorReales = 56.40;

	
    //----------------------------------------------------De pesos Arg a otras
    public double ConvertirArgDolares(double valor) {		
	double monedaDolar = valor / valorDolar;
	monedaDolar = (double)Math.round(monedaDolar * 100d) /100;
	return monedaDolar;
    }
    public double ConvertirArgEuros(double valor) {
	double monedaEuro = valor / valorEuro;
	monedaEuro = (double)Math.round(monedaEuro * 100d) /100;
        return monedaEuro;
    }
    public double ConvertirArgPesoMex(double valor) {
	double monedaMex = valor / valorMex;
	monedaMex = (double)Math.round(monedaMex * 100d) /100 ;
	return monedaMex;
    }
    public double ConvertirArgReales(double valor) {
	double monedaReales = valor / valorReales;
	monedaReales = (double)Math.round(monedaReales * 100d) /100 ;
	return monedaReales;
    }
    public double ConvertirArgYuanes(double valor) {
        double monedaYuan = valor / 1.90;
        monedaYuan = (double)Math.round(monedaYuan * 100d) /100;
        return monedaYuan;
    }
    public double ConvertirArgWon(double valor) {
        double monedaWon = valor / 0.20;
        monedaWon = (double)Math.round(monedaWon * 100d) /100;
        return monedaWon;
    }
    public double ConvertirArgLibra (double valor) {
        double monedaLibra = valor / 346.45;
        monedaLibra = (double)Math.round(monedaLibra * 100d) /100;
        return monedaLibra;
    }
	
//-----------------------------------------------------------De dolar a otras
    double usaEuro = 1.11;
    double usaMex = 0.058;
    double usaReales = 0.20;
    double usaArg = 0.0037;
    public double ConvertirDolaresAPesos(double valor) {
	double desdeDolar = valor / usaArg;
	desdeDolar = (double)Math.round(desdeDolar * 100d) /100 ;
	return desdeDolar;
    }
    public double ConvertirDolaresAEuros(double valor) {
	double desdeDolar = valor / usaEuro;
	desdeDolar = (double)Math.round(desdeDolar * 100d) /100 ;
	return desdeDolar;
    }
    public double ConvertirDolaresAPesosMex(double valor) {
	double desdeDolar = valor / usaMex;
	desdeDolar = (double)Math.round(desdeDolar * 100d) /100 ;
	return desdeDolar;
    }
    public double ConvertirDolaresAReales(double valor) {
	double desdeDolar = valor / usaReales;
	desdeDolar = (double)Math.round(desdeDolar * 100d) /100 ;
	return desdeDolar;
    }
    public double ConvertirDolarYuanes(double valor) {
        double desdeDolar = valor / 0.0070;
        desdeDolar = (double)Math.round(desdeDolar * 100d) /100;
        return desdeDolar;
    }
    public double ConvertirDolarWon(double valor) {
        double desdeDolar = valor / 0.00077;
        desdeDolar = (double)Math.round(desdeDolar * 100d) /100;
        return desdeDolar;
    }
    public double ConvertirDolarLibra (double valor) {
        double desdeDolar = valor / 1.28;
        desdeDolar = (double)Math.round(desdeDolar * 100d) /100;
        return desdeDolar;
    }
    
    //---------------------------------------------------------De Euro a otras
    double euroUSA = 0.89;
    double euroMex = 0.053;
    double euroReales = 0.18;
    double euroArg = 0.0033;
   
    public double ConvertirEuroAUsa(double valor) {
	double desdeEuro = valor / euroUSA;
	desdeEuro = (double)Math.round(desdeEuro * 100d) /100 ;
	return desdeEuro;
    }
    public double ConvertirEuroAMex(double valor) {
	double desdeEuro = valor / euroMex;
	desdeEuro = (double)Math.round(desdeEuro * 100d) /100 ;
	return desdeEuro;
    }
    public double ConvertirEuroAReales(double valor) {
	double desdeEuro = valor /euroReales;
	desdeEuro = (double)Math.round(desdeEuro * 100d) /100 ;
	return desdeEuro;
    }
    public double ConvertirEuroAArg(double valor) {
	double desdeEuro = valor / euroArg;
	desdeEuro = (double)Math.round(desdeEuro * 100d) /100 ;
	return desdeEuro;
    }  
    public double ConvertirEuroYuanes(double valor) {
        double desdeEuro = valor / 0.0063;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    public double ConvertirEuroWon(double valor) {
        double desdeEuro = valor / 0.00069;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    public double ConvertirEuroLibra (double valor) {
        double desdeEuro = valor / 1.15;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    

    //----------------------------------------------------------De MEX a otras
    double mesUsa = 16.95;
    double mexEuro = 18.86;
    double mexReales = 3.55;
    double mexArg = 0.0629;
    
    public double ConvertirMexAUsa(double valor) {
	double desdeMex = valor * mesUsa;
	desdeMex = (double)Math.round(desdeMex * 100d) /100 ;
	return desdeMex;
    }
    public double ConvertirMexAEuro(double valor) {
	double desdeMex = valor * mexEuro;
	desdeMex = (double)Math.round(desdeMex * 100d) /100 ;
	return desdeMex;
    }
    public double ConvertirMexAReales(double valor) {
	double desdeMex = valor * mexReales;
	desdeMex = (double)Math.round(desdeMex * 100d) /100 ;
	return desdeMex;
    }
    public double ConvertirMexAArg(double valor) {
	double desdeMex = valor * mexArg;
	desdeMex = (double)Math.round(desdeMex * 100d) /100 ;
	return desdeMex;
    }
    public double ConvertirMexYuanes(double valor) {
        double desdeEuro = valor / 0.1196;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    public double ConvertirMexWon(double valor) {
        double desdeEuro = valor / 0.013;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    public double ConvertirMexLibra (double valor) {
        double desdeEuro = valor / 21.80;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    
    //------------------------------------------------------De REALES a otras
    double realUsa = 4.77;
    double realEuro = 5.31;
    double realMex = 0.28;
    double realArg = 0.017;
    
    public double ConvertirRealAUsa(double valor) {
	double desdeReales = valor / realUsa;
	desdeReales = (double)Math.round(desdeReales * 100d) /100 ;
	return desdeReales;
    }
    public double ConvertirRealAEuro(double valor) {
	double desdeReales = valor / realEuro;
	desdeReales = (double)Math.round(desdeReales * 100d) /100 ;
	return desdeReales;
    }
    public double ConvertirRealAMex(double valor) {
	double desdeReales = valor / realMex;
	desdeReales = (double)Math.round(desdeReales * 100d) /100 ;
	return desdeReales;
    }
    public double ConvertirRealArg(double valor) {
	double desdeReales = valor / realArg;
	desdeReales = (double)Math.round(desdeReales * 100d) /100 ;
	return desdeReales;
    } 
    public double ConvertirRealesYuanes(double valor) {
        double desdeEuro = valor / 0.0336;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    public double ConvertirRealesWon(double valor) {
        double desdeEuro = valor / 0.0037;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    public double ConvertirRealesLibra (double valor) {
        double desdeEuro = valor / 6.139;
        desdeEuro = (double)Math.round(desdeEuro * 100d) /100;
        return desdeEuro;
    }
    //------------------------------------------------------De Yuan a otras
    public double ConvertirYuanAUsa(double valor) {
	double desdeYuan = valor / 141.680;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirYuanAEuro(double valor) {
	double desdeYuan = valor / 157.622;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirYuanAMex(double valor) {
	double desdeYuan = valor / 8.357;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirYuanAArg(double valor) {
	double desdeYuan = valor / 0.525;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirYuanReal(double valor) {
	double desdeYuan = valor / 29.688;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirYuanLibra(double valor) {
	double desdeYuan = valor / 182.193;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirYuanWon(double valor) {
	double desdeYuan = valor / 0.110;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    
    //---------------------------------------------------De Won a otras
    public double ConvertirWonAUsa(double valor) {
	double desdeYuan = valor / 1286.70;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirWonAEuro(double valor) {
	double desdeYuan = valor / 1431.43;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirWonAMex(double valor) {
	double desdeYuan = valor / 75.915;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirWonAArg(double valor) {
	double desdeYuan = valor / 4.775;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirWonAReal(double valor) {
	double desdeYuan = valor / 269.752;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirWonALibra(double valor) {
	double desdeYuan = valor / 1654.74;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    public double ConvertirWonAYen (double valor) {
	double desdeYuan = valor * 9.082;
	desdeYuan = (double)Math.round(desdeYuan * 100d) /100 ;
	return desdeYuan;
    }
    
        //---------------------------------------------------De Libra a otras
    public double ConvertirLibraAUsa(double valor) {
	double desdeLibra = valor / 0.777;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
    public double ConvertirLibraAEuro(double valor) {
	double desdeLibra = valor / 0.865;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
    public double ConvertirLibraAMex(double valor) {
	double desdeLibra = valor / 0.0458;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
    public double ConvertirLibraAArg(double valor) {
	double desdeLibra = valor / 0.00288;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
    public double ConvertirLibraAReal(double valor) {
	double desdeLibra = valor / 0.163;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
    public double ConvertirLibraAWon(double valor) {
	double desdeLibra = valor / 0.000604;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
    public double ConvertirLibraAYen (double valor) {
	double desdeLibra = valor / 0.00548;
	desdeLibra = (double)Math.round(desdeLibra * 100d) /100 ;
	return desdeLibra;
    }
}
