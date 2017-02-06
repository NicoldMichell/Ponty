
public class Ejemplo1 {
    public static int Sumar (int a[])
                {   int x=0;
                    for (int i=0; i<=4; i++)
                    {
                        int b = a[i] + x;
                        x = b;
                        
                    }
                    return x;
                }
    
    
    public static void main (String[]arg)
		{   
                    java.util.Scanner teclado=new java.util.Scanner(System.in);
                    int a[]=new int[5];
                    int c;
                    for (int i=0;i<=4;i++)
                    {
                         System.out.println("Ingrese el valor de la casilla " + (i+1));
                         a[i]=teclado.nextInt();
                    }
                    c = Sumar (a);
                    System.out.println("el valor es " + (c));
                    
                    
		}
    
}
