/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginhash;

import com.mycompany.loginhash.dao.UsuarioDAO;
import com.mycompany.loginhash.database.ConnectionSQL;
import com.mycompany.loginhash.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author NATHALIAMINOSSIOLIVE
 */
public class LoginHash {

    public static void main(String[] args) {
        ConnectionSQL.conectar();
        
         Usuario fulano = new Usuario("ana@mail.com", "12345");
         Usuario fulano1 = new Usuario("julia@mail.com", "12345");
         
        
     UsuarioDAO usuarioDAO = new UsuarioDAO();
     
    // usuarioDAO.registrarUsuario(fulano);
    
    // usuarioDAO.registrarUsuario(fulano1);
     
     //usuarioDAO.validarLogin(fulano);
    
    // System.out.println(
    // usuarioDAO.buscarUsuarioPorEmail("leo@mail").getEmail()
   //  );
     
         usuarioDAO.atualizarSenha("leo@maili", "goibada");
    }
  
}
