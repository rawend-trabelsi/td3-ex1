import java.util.Scanner;

public class Tab {
    static final int NMAX = 40;
    Scanner scanner = new Scanner(System.in);
    float t[];

    public static void remplire(float t[]) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <t.length; i++) {
            System.out.println("Entrer élément du tableau : ");
            t[i] = scanner.nextFloat();
        }
    }

    public static float somme_element(float t[]) {
        float s = 0;
        for (int i = 0; i < t.length; i++) {
            s = s + t[i];
        }
        return s;
    }

    public static float[] additionner(float t1[], float t2[]) {
    	System.out.println("additionne de deux tableau");
        if (t1.length != t2.length) {
            System.out.println("can't.");
            return null;
        }
        float t3[] = new float[t1.length];
        for (int i = 0; i < t1.length; i++) {
            t3[i] = t1[i] + t2[i];
        }
        return t3;
    }
    public static float[]  produit (float x, float t[])
    {
    	System.out.println("entrer le x");
    	Scanner scanner = new Scanner(System.in);
    	x = scanner.nextFloat();
    	
    	for (int i=0;i<t.length;i++)
    	{
    		 t[i]*=x;
    		
    	}
    	return t;
    }
    public static void lister (float t[])
    {
    	System.out.println("voila tableau");
    	for (int i=0;i<t.length;i++)
    	{
    		System.out.println(t[i]);
    	
    	}
    	}}
    	
