/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
    import java.io.*;

/**
 *
 * @author Afif
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            
            String number;
            Double bilangan1,bilangan2,hasil;
            int operator;
            
            System.out.print(" [1] pertambahan \n"
                    + " [2] pengurangan \n"
                    + " [3] perkalian \n"
                    + " [4] pembagian \n");
            System.out.print(" angka: ");
                number = input.readLine();
            System.out.print(" operator ");
                operator = Integer.parseInt(input.readLine());
                    bilangan1 = Double.parseDouble(number);
            System.out.print(" angka: ");
                number = input.readLine();
                
            switch(operator){
                case 1:
                    bilangan2 = Double.parseDouble(number);
                        hasil = bilangan1+bilangan2;
                        System.out.println(" = "+hasil);
                    break;
                case 2:
                    bilangan2 = Double.parseDouble(number);
                        hasil = bilangan1-bilangan2;
                        System.out.println(" = "+hasil);
                    break;
                case 3:
                    bilangan2 = Double.parseDouble(number);
                        hasil = bilangan1*bilangan2;
                        System.out.println(" = "+hasil);
                    break;
                case 4:
                    bilangan2 = Double.parseDouble(number);
                        hasil = bilangan1/bilangan2;
                        System.out.println(" = "+hasil);
                    break;
                default:
                    System.out.println(" Error !!");
            }    
            
    }
    
}
