package com.company;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		String ret = "";
		for(int i = 0; i < n; i ++)
		{
			ret = ret + c;
		}
		return ret;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lPad(String s, int n, char c)
	{
		int curLeng = s.length();

		return replicate(c,n-curLeng) + s;
		/*if(curLeng > n)
		{
			return s;
		}
		while (curLeng < 3)
		{
			s = s + c;
		}
		return s;*/
	}

	public static String rPad(String s, int n, char c)
	{
		int curLeng = s.length();

		return s + replicate(c,n-curLeng);

	}


	public static String lTrim(String s)
	{
		boolean LEFT = true;
		return trimOnSide(s, LEFT);
	}

	public static String rTrim(String s)
	{
		boolean LEFT = false;
		return trimOnSide(s, LEFT);
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		int leng = arr.length;
		String[] sArr = new String[leng];

		for(int i =0; i < leng; i++)
		{
			sArr[i] = Integer.toString(arr[i]);
		}

		return sArr;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int leng = arr.length;
		int[] iArr = new int[leng];

		for(int i =0; i < leng; i++)
		{
			iArr[i] = Integer.parseInt(arr[i]);
		}

		return iArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLeng = 0;
		for(String str: arr)
		{
			if(str.length() > maxLeng)
			{
				maxLeng = str.length();
			}
		}
		return maxLeng;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxLeng = maxLength(arr);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = lPad(arr[i],maxLeng,c);
		}
	}
	public static String trimOnSide(String s, boolean left)
	{
		if(left){
			while(s.length() > 0 && s.charAt(0) == ' ')
				s = s.substring(1);
		}else{
			while(s.length() > 0 && s.charAt(s.length()-1) == ' ')
				s = s.substring(0, s.length()-1);
		}

		return s;
	}
	public static int indexOfN(String s,char c,int n){
		int apariciones = 0;
		for(int i = 0; i < s.length(); i++){
			if (s.charAt(i) == c){
				apariciones++;
				if (apariciones == n) return i;
			}
		}
		return -1;
	};
}
