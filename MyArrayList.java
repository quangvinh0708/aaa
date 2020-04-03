package arrayoffraction;
import arrayoffraction.Fraction;
public class MyArrayList <E> {
	private E []a ;
	private int n ;
	
	
	public MyArrayList() {
		this.n = 0 ;
		a = (E[])new Object[10] ;
	}
	
	
	public MyArrayList(int capacity) {
		a = (E[])new Object[capacity] ;
		this.n = 0 ;
	}
		
	
		
	public void add(E element) {
		//case 1 : array is full - array is not full
		if(n == a.length) {
			// new array 
			E []b = (E[])new Object[n*2] ;
			//copy old array to new array
			for(int i = 0 ; i < n ; i++) 
				b[i] = a[i] ;
			a = b ;
		}
		a[n] = element ;
		n++ ;
	}

	
	
	public void output() {
		for(int i  = 0 ; i < n ; i++)
			System.out.print(a[i].toString()+"  ");
		System.out.println();
	}
	
	
	
	public void remove(int index) {
		System.out.print("Remove : ");
		if(index < 0 || index > n) System.out.println("Out of Index");
		else if(n == 0) System.out.println("Empty");
		else {
			for(int i = index ; i < n-1 ; i++) 
				a[i] = a[i+1] ;
			n-- ;
		}
	}
	
	
	
	public void add(E element,int index) {
		System.out.print("Add 2 : ");
		if(index < 0 || index >= n) System.out.println("Out of Index");
		else {
			if(n == a.length) {
				E []b = (E[])new Object[n*2] ;
				System.arraycopy(a,0,b,0,n);
				a = b ;
			}
			for(int i = n-1 ; i >= index ; i--) 
				a[i+1] = a[i] ;
			a[index] = element ;
			n++ ;
		}
	}
	
	
	//If Array contain the element , return true ; not if return false
	public boolean contain(E element) {
		System.out.print("Contain : ");
		for(int i = 0 ; i < n ; i++) 
			if(a[i].equals(element)) return true ;
		return false ;
	}
	
	
	//If Array contain the number , return index ; not if return -1
	public int indexOf(E element) {
		System.out.print("Index Of : ");
		for(int i = 0 ; i < n ; i++)
			if(a[i].equals(element)) return i ;
		return -1 ;
	}
	
	
	//size return the maximum element in array
	public int size() {
		return n ;
	}
	
	
	//get() return the element at index 
	public E get(int index) {
		if(index < 0 || index >= n) {
			System.out.println("Out of Intefer;");
			return null ;
		}
		return a[index] ;
	}
	
	
	//set() is to change this element at index into that element
	public void set(E element,int index) {
		if(index < 0 || index >= n) System.out.println("Out of Index");
		a[index] = element ;
	}
	
	
	
	public static void main(String arg[]) {
		MyArrayList<Fraction> f = new MyArrayList<Fraction>() ;
		
		f.add(new Fraction(2,3));
		f.add(new Fraction(6,5));
		f.add(new Fraction(9,4));
		f.add(new Fraction(3,8));
		
		f.output();
		
		if(f.contain(new Fraction(2,3)) == true) System.out.println("It has this number");
		else System.out.println("It doesn't has this number");
		
		f.remove(1);
		f.output();
		
		System.out.println(f.get(2));
		
		f.set(new Fraction(8,5),1);
		f.output();
		
		System.out.println(f.indexOf(new Fraction(2,3)));
	}
	
	
}