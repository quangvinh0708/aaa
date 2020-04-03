package arrayoffraction;

import java.util.Scanner;

public class Fraction 
{
	
	private int numerator,denominator ;
	
	
	public Fraction(){
		setDenominator(1) ;
	}
	public Fraction(int n,int d) 
	{
		setNumerator(n);
		setDenominator(d);
	}
	
	
	
	public int getNumerator() {
		return numerator ;
	}
	public void setNumerator(int n) {
		numerator = n ;
	}

	
	
	public int getDenominator() {
		return denominator ;
	}
	public void setDenominator(int d) {
		if(d == 0) denominator = 1 ;
		else denominator = d ;
	}

	
	
	public void output()
	{
		System.out.println(this.toString()) ;
	}
	
	
	@Override
	public String toString() {
		return this.numerator + "/" + this.denominator ;
	}
	
	
	@Override
	public boolean equals(Object f) {
		if(this.numerator == ((Fraction)f).numerator && this.denominator == ((Fraction)f).denominator)
			return true ;
		return false ;
	}

	
	
	public void input()
	{
		Scanner kb = new Scanner(System.in) ;
		System.out.println("Enter Numerator : ");
		numerator = kb.nextInt() ;
		System.out.println("Enter Denominator :") ;
		denominator = kb.nextInt() ;	
		
	}
	
	
	
	public void plus(Fraction a,Fraction b) 
	{
		this.setNumerator(a.getNumerator()*b.getDenominator() + b.getNumerator()*a.getNumerator()) ; 
		this.setDenominator(a.getDenominator()*b.getDenominator()) ; 
	}
	
	public void sub(Fraction a,Fraction b) 
	{
		setNumerator(a.getNumerator()*b.getDenominator() - b.getNumerator()*a.getDenominator()) ; 
		setDenominator(a.getDenominator()*b.getDenominator()) ;
	}
	
	public void multi(Fraction a,Fraction b) 
	{
		setNumerator(a.getNumerator()*b.getNumerator()) ; 
		setDenominator(a.getDenominator()*b.getDenominator()) ;
	}
	
	public void div(Fraction a,Fraction b) 
	{
		setNumerator(a.getNumerator()*b.getDenominator()) ; 
		setDenominator(a.getDenominator()*b.getNumerator()) ;
	}
	
	public double divide() {
		return 1.0*this.getNumerator()/this.getNumerator() ;
	}
	

	public Fraction plus(Fraction a) 
	{
		Fraction f = new Fraction() ;
		f.setNumerator(a.getNumerator()*this.getDenominator() + this.getNumerator()*a.getNumerator()) ; 
		f.setDenominator(a.getDenominator()*this.getDenominator()) ; 
		return f; 
	}
	
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,5) ;
		System.out.println(f1.toString());
		Fraction f2 = new Fraction(2,5) ;
		System.out.println(f2.toString());
	    
		//	System.out.println(f1.numerator+"/"+f1.denominator+a+f2.numerator+"/"+f2.denominator+"="+f3.numerator+"/"+f3.denominator) ;
		
		System.out.println(f1.equals(f2));
	}

}