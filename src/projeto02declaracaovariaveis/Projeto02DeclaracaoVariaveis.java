/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto02declaracaovariaveis;

/**
 *
 * @author aluno
 */
public class Projeto02DeclaracaoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Comentarios linha simples
        /*
        Comentario de varias linhas
        123 123
        */
        
        // Definir uma variável em java (TIPO NOME;)
        int idade; // declaração da variável.
        idade = 30; // inicializa variavel.
        int novaIdade = 35; // declara e inicializa.
        
        // Operadores + - / *
        idade = idade + 10;
        int divisao = 11 / 2;
        int modulo = 11 % 2;
        
        System.out.println("Idade:" + idade);
        System.out.println("Divisao:" + divisao);
        System.out.println("Modulo:" + modulo);
        // sout + tab atalho .
        
        // double e float (float 8 bytes e double 16 bytes)
        
        double pi = 3.14;
        int X = 20;
        X = X / 3;
        System.out.println("Valor de X: " + X);
        
        boolean menorIdade = idade < 18; // retorna true ou false
        System.out.println("Menor idade: " + menorIdade);
        
        char letraA = 'a';
        System.out.println("Letra A: " + letraA);
    }
    
}
