//Kevin Faucher PS2
package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		return MyInteger.isEven(iValue); 
	}

	public boolean isOdd() {
		return MyInteger.isOdd(iValue);
	}

	public boolean isPrime() {
		return MyInteger.isPrime(iValue);
	}

	public static boolean isEven(int x) {
		return (x % 2 == 0);
	}

	public static boolean isOdd(int x) {
		return (x % 2 != 0);
	}

	public static boolean isPrime(int x) {
		if (x < 2)
			return false;
		if (x == 2 || x == 3)
			return true;
		if (x % 2 == 0)
			return false;
		int root = (int) (Math.sqrt(x) + 1);
		for (int i = 2; i < root; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
		
	public static boolean isEven(MyInteger myInt) {
		return MyInteger.isEven(myInt.getiValue()); 
	}

	public static boolean isOdd(MyInteger myInt) {
		return MyInteger.isOdd(myInt.getiValue());
	}

	public static boolean isPrime(MyInteger myInt) {
		return MyInteger.isPrime(myInt.getiValue());
	}

	public boolean equals(int x) {
		return (x == iValue); 

	}

	public boolean equals(MyInteger myInt) {
		return (myInt.getiValue() == iValue);

	}
}