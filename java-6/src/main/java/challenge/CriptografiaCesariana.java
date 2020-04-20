package challenge;

import java.util.ArrayList;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if(texto.trim().equals("")) {
            throw new IllegalArgumentException("texto esta vazio");
        }
        if(texto == null){
            throw new IllegalArgumentException("texto esta vazio");
        }

        int chave = 3;
        String alfab = "abcdefghijklmnopqrstuvwxyz";
        String textoCifrado = texto.toLowerCase();
        List<Character> cifrado = new ArrayList<Character>();
        List<Character> alfabeto = new ArrayList<Character>();
        List<Character> decifrado = new ArrayList<Character>();

        for (char caracter : textoCifrado.toCharArray()) {
            cifrado.add(caracter);
        }

        for (char caracter : alfab.toCharArray()) {
            alfabeto.add(caracter);
        }

        for (int i = 0; i < cifrado.size(); i++) {
            for (int j = 0; j <= alfabeto.size(); j++) {
                if (cifrado.get(i) == alfabeto.get(j)) {
                    int valor = j + chave;
                    if (valor < 0) {
                        valor = alfabeto.size() + (valor);
                        char a = alfabeto.get(valor);
                        decifrado.add(a);
                        break;
                    } else {
                        char a = alfabeto.get(valor);
                        decifrado.add(a);
                        break;
                    }
                }
                if (cifrado.get(i) == ' ') {
                    decifrado.add(cifrado.get(i));
                    break;
                }
                if (cifrado.get(i) >= '0' && cifrado.get(i) <= '9') {
                    decifrado.add(cifrado.get(i));
                    break;
                }
            }
        }

        String palavraDecifrada = "";
        for (char item : decifrado) {
            palavraDecifrada = palavraDecifrada + item;
        }
        return palavraDecifrada;
    }




    @Override
    public String descriptografar(String texto) {
        if (texto.trim().equals("")) {
            throw new IllegalArgumentException("Sem texto");
        }
        if(texto == null){
            throw new IllegalArgumentException("Texto Nulo");
        }

        int chave = 3;
        String alfab = "abcdefghijklmnopqrstuvwxyz";
        String textoCifrado = texto.toLowerCase();

        List<Character> cifrado = new ArrayList<Character>();
        List<Character> alfabeto = new ArrayList<Character>();
        List<Character> decifrado = new ArrayList<Character>();

        for (char caracter : textoCifrado.toCharArray()) {
            cifrado.add(caracter);
        }

        //separando alfabeto
        for (char caracter : alfab.toCharArray()) {
            alfabeto.add(caracter);
        }


        for (int i = 0; i < cifrado.size(); i++) {
            for (int j = 0; j <= alfabeto.size(); j++) {
                if (cifrado.get(i) == alfabeto.get(j)) {
                    int valor = j - chave;
                    if (valor < 0) {
                        valor = alfabeto.size() + (valor);
                        char a = alfabeto.get(valor);
                        decifrado.add(a);
                        break;
                    } else {
                        char a = alfabeto.get(valor);
                        decifrado.add(a);
                        break;
                    }
                }
                if (cifrado.get(i) == ' ') {
                    decifrado.add(cifrado.get(i));
                    break;
                }
                if (cifrado.get(i) >= '0' && cifrado.get(i) <= '9') {
                    decifrado.add(cifrado.get(i));
                    break;
                }
            }
        }

        String palavraDecifrada = "";
        for (char item : decifrado) {
            palavraDecifrada = palavraDecifrada + item;
        }

        return palavraDecifrada;

    }



}
