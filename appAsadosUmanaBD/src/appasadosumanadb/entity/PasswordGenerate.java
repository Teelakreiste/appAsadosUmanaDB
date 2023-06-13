/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appasadosumanadb.entity;

import java.util.Random;

/**
 *
 * @author osmel
 */
public class PasswordGenerate {

    public PasswordGenerate() {
    }
    
    public String passwordGenerate() {
        String password = "12345678";
        int[] pwdindex = {0, 1, 2, 3, 4, 5, 6, 7};
        char[] specialCharacters = {'@', '#', '.', '!', '$'};
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] upperLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowerLetters = {'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'};
        char[] allCharacters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
            'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'};
        // 1. Genere caracteres especiales al azar y colóquelos al azar en la posición de contraseña 2-7 (los caracteres especiales no aparecen al principio o al final)
        //System.out.println(" genera aleatoriamente caracteres especiales, colocados aleatoriamente en la posición de contraseña 2-7 ");
        int aindex = new Random().nextInt(5);
        //System.out.println(specialCharacters[aindex]);
        int aposition = new Random().nextInt(6) + 1;
        //System.out.println(password.charAt(aposition));
        password = password.replace(password.charAt(aposition), specialCharacters[aindex]);
        //System.out.println(password);
        // 2. Genere datos aleatoriamente y colóquelos aleatoriamente en las posiciones 1-8 (excluyendo la posición ocupada por el paso 1)
        int bindex = new Random().nextInt(10);
        //System.out.println(numbers[bindex]);
        int bposition = 0;
        do {
            bposition = new Random().nextInt(8);
        } while (bposition == aposition);
        //System.out.println(password.charAt(bposition));
        password = password.replace(password.charAt(bposition), numbers[bindex]);
        //System.out.println(password);
        // 3. Genere letras mayúsculas al azar y colóquelas al azar en las posiciones 1-8 (excluyendo las posiciones ocupadas por los pasos 1 y 2)
        int cindex = new Random().nextInt(26);
        //System.out.println(upperLetters[cindex]);
        int cposition = 0;
        do {
            cposition = new Random().nextInt(8);
        } while (cposition == aposition || cposition == bposition);
        //System.out.println(password.charAt(bposition));
        password = password.replace(password.charAt(cposition), upperLetters[cindex]);
        // System.out.println(password);
        // 4. Genere aleatoriamente letras minúsculas y colóquelas aleatoriamente en las posiciones 1-8 (excluyendo las posiciones ocupadas por los pasos 1, 2 y 3)
        int dindex = new Random().nextInt(26);
        //System.out.println(lowerLetters[dindex]);
        int dposition = 0;
        do {
            dposition = new Random().nextInt(8);
        } while (dposition == aposition || dposition == cposition || dposition == bposition);
        //System.out.println(password.charAt(bposition));
        password = password.replace(password.charAt(dposition), lowerLetters[dindex]);
        //System.out.println(password);
        // Los primeros 4 pasos aseguran que la contraseña contenga (caracteres especiales y letras mayúsculas y minúsculas y números y las posiciones son aleatorias)
        // 5. Genere números al azar en mayúsculas y minúsculas y colóquelos al azar en las posiciones 1-8 (excluyendo las posiciones ocupadas por los pasos 1, 2, 3, 4 y los cuatro dígitos restantes)
        for (int i = 0; i < pwdindex.length; i++) {
            if (pwdindex[i] != aposition && pwdindex[i] != bposition
                    && pwdindex[i] != cposition && pwdindex[i] != dposition) {
                int eindex = new Random().nextInt(62);
                password = password.replace(password.charAt(pwdindex[i]), allCharacters[eindex]);
            }
        }
       // System.out.println(password);
        return password;
    }
}
