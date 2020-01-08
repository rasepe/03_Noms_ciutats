import java.util.Arrays;
import java.util.Scanner;

public class NomsCiutats {
	public static void main(String[] args) {
		//FASE 1
		/*
		 * Crea sis variables tipu string buides. (0,5 punts)
		 * Demana per consola que sâ€™introdueixin els noms. (0,5 punts)
		 * Introdueix els segÃ¼ents noms de ciutats (Barcelona, Madrid, Valencia, Malaga, Cadis, Santander) per
		 * teclat. (0,5 punts)
		 * Mostra per consola el nom de les 6 ciutats. (0,5 punts)
		 */
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		 Scanner sc = new Scanner(System.in);
System.out.println("Introdueix ciutat 1:");
		 ciutat1 = sc.nextLine();
		 System.out.println("Introdueix ciutat 2:");
		 ciutat2 = sc.nextLine();
		 System.out.println("Introdueix ciutat 3:");
		 ciutat3 = sc.nextLine();
		 System.out.println("Introdueix ciutat 4:");
		 ciutat4 = sc.nextLine();
		 System.out.println("Introdueix ciutat 5:");
		 ciutat5 = sc.nextLine();
		 System.out.println("Introdueix ciutat 6:");
		 ciutat6 = sc.nextLine();
		 System.out.println("Nom de les 6 ciutats:");
		 System.out.println(ciutat1);
		 System.out.println(ciutat2);
		 System.out.println(ciutat3);
		 System.out.println(ciutat4);
		 System.out.println(ciutat5);
		 System.out.println(ciutat6);
		 //FASE 2
		/*
		 * Un cop tenim els noms de les ciutats guardats en variables haurem de pasar
		 * lâ€™informacio a un array (arrayCiutats). (1 punt) â—� Quan tinguem lâ€™array ple,
		 * haurem de mostrar per consola el nom de les ciutats ordenadas per ordre
		 * alfabetic. (1 punt)
		 */
		 String[] arrayCiutats = new String[6];
		 arrayCiutats[0]=ciutat1;
		 arrayCiutats[1]=ciutat2;
		 arrayCiutats[2]=ciutat3;
		 arrayCiutats[3]=ciutat4;
		 arrayCiutats[4]=ciutat5;
		 arrayCiutats[5]=ciutat6;
		 
		 Arrays.sort(arrayCiutats);
		 
		 System.out.println("Nom de les 6 ciutats ordenades alfabèticament:");
		 for (int i=0; i<arrayCiutats.length ; i++) {
			 System.out.println(arrayCiutats[i]);
		 }
		 //FASE 3:
		/*
		 * Cambieu les vocals â€œaâ€� dels noms de les ciutats per el numero 4 i guardeu
		 * els noms modificats en un nou array(ArrayCiutatsModificades). (2 punts) â—�
		 * Mostreu per consola lâ€™array modificat i ordenat per ordre alfabetic. (1 punt)
		 */
		 for (int i=0; i<arrayCiutats.length ; i++) {
			 arrayCiutats[i] = arrayCiutats[i].replace('a', '4');
			 //System.out.println(arrayCiutats[i]);
		 }
		 Arrays.sort(arrayCiutats);
		 System.out.println("Nom de les 6 ciutats amb el caràcter \'a\' canviat per \'4\' i reordenat alfabèticament");
		 for (int i=0; i<arrayCiutats.length ; i++) {
			 System.out.println(arrayCiutats[i]);
		 }
		 //FASE 4 
		/*
		 * Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous
		 * arrays sera la llargada de cada string ( string nomCiutat.Length). (0,5
		 * punts) ● Ompliu els nous arrays lletra per lletra.(2 punts) ● Mostreu per
		 * consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).
		 * (0,5 punts)
		 */
		 char[] arrayCiutat1 = new char[arrayCiutats[0].length()];
		 char[] arrayCiutat2 = new char[arrayCiutats[1].length()];
		 char[] arrayCiutat3 = new char[arrayCiutats[2].length()];
		 char[] arrayCiutat4 = new char[arrayCiutats[3].length()];
		 char[] arrayCiutat5 = new char[arrayCiutats[4].length()];
		 char[] arrayCiutat6 = new char[arrayCiutats[5].length()];
		 
		 System.out.println("Els mateixos noms invertits");
		 for (int i=0; i<arrayCiutat1.length ; i++) {
			 arrayCiutat1[i] = arrayCiutats[0].charAt(i);
		 }
		 reverse(arrayCiutat1, arrayCiutat1.length); 
		 System.out.print("\n");
		 
		 for (int i=0; i<arrayCiutat2.length ; i++) {
			 arrayCiutat2[i] = arrayCiutats[1].charAt(i);
		 }
		 reverse(arrayCiutat2, arrayCiutat2.length); 
		 System.out.print("\n");
		 
		 for (int i=0; i<arrayCiutat3.length ; i++) {
			 arrayCiutat3[i] = arrayCiutats[2].charAt(i);
		 }
		 reverse(arrayCiutat3, arrayCiutat3.length); 
		 System.out.print("\n");
		 
		 for (int i=0; i<arrayCiutat4.length ; i++) {
			 arrayCiutat4[i] = arrayCiutats[3].charAt(i);
		 }
		 reverse(arrayCiutat4, arrayCiutat4.length);
		 System.out.print("\n");
		 
		 for (int i=0; i<arrayCiutat5.length ; i++) {
			 arrayCiutat5[i] = arrayCiutats[4].charAt(i);
		 }
		 reverse(arrayCiutat5, arrayCiutat5.length); 
		 System.out.print("\n");
		 
		 for (int i=0; i<arrayCiutat6.length ; i++) {
			 arrayCiutat6[i] = arrayCiutats[5].charAt(i);
		 }
		 reverse(arrayCiutat6, arrayCiutat6.length); 
		 
	}
	
	static void reverse(char a[], int n) 
    { 
        char[] b = new char[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
       // System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.print(b[k]); 
        } 
    } 
	
}
