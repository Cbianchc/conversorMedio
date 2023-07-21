package ConvertirTempes;


public class ConversorTempe {
    public double ConvCelFahren(double valor) {
	double CelFahren = (valor * 1.8) + 32;
	CelFahren = (double)Math.round(CelFahren * 100d) /100 ;
	return CelFahren;
    }
    public double ConvCelKelvin(double valor) {
	double CelKelvin = valor + 273.15;
	CelKelvin = (double)Math.round(CelKelvin * 100d) /100 ;
	return CelKelvin;
    }
    public double ConvCelRankine(double valor) {
	double CelRankine = (valor * 1.8) + 491.67;
	CelRankine = (double)Math.round(CelRankine * 100d) /100 ;
	return CelRankine;
    }
    //----------------------------------------------------De far a otras
    public double ConvFaCelsius(double valor) {
	double FaCelsius = (valor - 32) * ( 0.556 );
	FaCelsius = (double)Math.round(FaCelsius * 100d) /100 ;
	return FaCelsius;
    }
    public double ConvFaKelvin(double valor) {
	double FaKelvin = (valor + 459.67)*(0.556);
	FaKelvin = (double)Math.round(FaKelvin * 100d) /100 ;
	return FaKelvin;
    }   
    public double ConvFaRankine(double valor) {
	double FaRankine = valor + 459.67;
	FaRankine = (double)Math.round(FaRankine * 100d) /100 ;
	return FaRankine;
    } 
    //----------------------------------------------------De kel a otras
    public double ConvKeCelsius(double valor) {
	double KeCelsius = valor - 273.15;
	KeCelsius = (double)Math.round(KeCelsius * 100d) /100 ;
	return KeCelsius;
    }
    public double ConvKeFahre(double valor) {
	double KeFahre = ((valor - 273.15) * (1.8)) + 32;
	KeFahre = (double)Math.round(KeFahre * 100d) /100 ;
	return KeFahre;
    }
    public double ConvKeRankine(double valor) {
	double KeRankine = valor * 1.8 ;
	KeRankine = (double)Math.round(KeRankine * 100d) /100 ;
	return KeRankine;
    }
    //----------------------------------------------------De rankie a otras
    public double ConvRankCelcius(double valor) {
	double RankCelcius = (valor - 491.67) * (0.556);
	RankCelcius = (double)Math.round(RankCelcius * 100d) /100 ;
	return RankCelcius;
    }
    public double ConvRankFahre(double valor) {
	double RankFahre = valor - 459.67;
	RankFahre = (double)Math.round(RankFahre * 100d) /100 ;
	return RankFahre;
    }
    public double ConvRankKelvin(double valor) {
	double RankKelvin = valor * (0.556);
	RankKelvin = (double)Math.round(RankKelvin * 100d) /100 ;
	return RankKelvin;
    }        
            
            
}
