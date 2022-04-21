/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at_prova2;

import java.util.Scanner;
public class at_prova2 {

    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);

   
    String vendedor;
    int Quantidade;
    float PrecoProduto, Calc;
    Double Comissao;
    Double PorcentagemComissao= 0.10;

    //nome
    System.out.print("\nNome do vendedor:");
    vendedor = entrada.next();


    System.out.print("Digite o preço unitário da peça: ");
     PrecoProduto = entrada.nextFloat();

    System.out.print("Digite a quantidade de peças vendidas: ");
    Quantidade = entrada.nextInt();

    Comissao=((PrecoProduto*Quantidade)+(PorcentagemComissao+Quantidade)); 

    System.out.printf("O vendedor "+vendedor+"\n Valor da venda mais a comissão é de "+ Comissao +"Reais");

    }

}