package br.com.codenation.calculadora;


public class CalculadoraSalario {

	final double INSS_TAXA_A =0.08 ,INSS_TAXA_B = 0.09,INSS_TAXA_C=0.11;
	final double IRFF_TAXA_A =0.00 ,IRFF_TAXA_B = 0.075,IRFF_TAXA_C=0.15;
	final double salarioMinimo = 1039.00;



	public long calcularSalarioLiquido(double salarioBase) {
		if(salarioBase > salarioMinimo) {
			double salarioBaseComDescontoInss = calcularInss(salarioBase);
			double salarioliquido = calcularIrff(salarioBaseComDescontoInss);
			return Math.round(salarioliquido);
		}
		return (long) 0.0;
	}
	

	private double calcularInss(double salarioBase) {
		if (salarioBase <= 1500.00) {
			return salarioBase -= salarioBase * INSS_TAXA_A;
		} else if (salarioBase <= 4000.00) {
			return salarioBase -= salarioBase * INSS_TAXA_B;
		} else {
			return salarioBase -= salarioBase * INSS_TAXA_C;
		}
	}

	private double calcularIrff(double salarioBase) {
		if (salarioBase <= 3000.00) {
			return salarioBase -= salarioBase * IRFF_TAXA_A;
		} else if (salarioBase <= 6000.00) {
			return salarioBase -= salarioBase * IRFF_TAXA_B;
		} else {
			return salarioBase -= salarioBase * IRFF_TAXA_C;
		}

	}

}
// meajuda@codenation.dev que iremos te ajudar!
