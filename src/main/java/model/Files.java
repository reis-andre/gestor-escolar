/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
    Adrian Machado - 201965001AB
    André Reis - 201965511B
    Mário José - 201965507B
*/ 
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
   //leitura
   public static ArrayList read(String path){
       ArrayList leitura = new ArrayList();
        try{
        File arquivo = new File(path);
        Scanner leitor = new Scanner(arquivo);
        while (leitor.hasNextLine()) {              
              leitura.add((leitor.nextLine()));
         }
        }
        catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado!" + path);
        }
        return leitura;
   }
    //escrita
    public static void write(String path,String content){
        FileWriter fw;
        BufferedWriter bw;
        try {
            File arquivo = new File(path);
            //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
            fw = new FileWriter(arquivo, true);
            //fwArquivo.append(conteudo + "\r\n");
            bw = new BufferedWriter(fw);
            // escrevendo String no arquivo e adicionando caracter para criar nova linha
            bw.write(content + "\r\n");
            // fechando o arquivo
            bw.close();
            fw.close();
        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.toString());
            System.out.println(path);
            System.out.println(content);
        }
    }
}