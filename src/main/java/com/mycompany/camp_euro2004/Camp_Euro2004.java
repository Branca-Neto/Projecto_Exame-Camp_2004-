/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.camp_euro2004;

/**
 *
 * @author User
 */
public class Camp_Euro2004 {

    public static void main(String[] args) {
       Connection conexao = null;
        try
        {        
            class.forName("com.postegresql-42.7.3.jar");
            conexao = Driver.Manager.getConnection("jdbc:postgresql://ep-tiny-union-a538wt4z.us-east-2.aws.neon.tech/euro_campeonato?user=euro_campeonato_owner&password=f1hYci5RVQDW&sslmode=require","root",""); 
            ResultSet rsJogadores = conexao.createStatement().executeQuery("SELECT * FROM JOGADORES");
            while(rsJogadores.next())
            {
                System.out.println("Nome: " + rsJogadores.getString("nome"));
            }
        }
        catch (classNoFoundException ex)
        {
            System.out.println("Driver Systemdo banco de dados nao localizada");
        } 
        catch (SQLException ex)
        {
             System.out.println("Ocorreu um erro ao acessar o banco de dados " + ex.getMessage());
        } 
        finally
        {
            if(conexao != null){
                conexao.close();
            }
        }
    }
}
