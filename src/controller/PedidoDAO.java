/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdbc.ModuloConexao;
import model.Cliente;
import model.Pedido;

/**
 *
 * @author Cleber
 */
public class PedidoDAO {

    Connection con;

    public PedidoDAO() {
        con = ModuloConexao.conectar();
    }

    /**
     * Método responsável por adicionar um novo Pedido
     */
    public void adicionarPedido(Pedido obj) {

        try {
            //1 passo - criar o sql
            String sql = "insert into pedidos(id_cliente, status, valor_total, observacoes ) values(?,?,?,?)";
            //2 passo o conectar o banco de dados e organizar o comando sql
            con = ModuloConexao.conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCliente().getId());
            stmt.setString(2, obj.getStatus());
            stmt.setDouble(3, obj.getTotal());
            stmt.setString(4, obj.getObservacoes());

            //3 passo - executar o comando sql
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!!");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    /**
     * Método Listar Todos Pedidos
     *
     * @param Pedido
     * @return Lista de Usuários Cadastrados na Base de Dados.
     */
    /*
    public List<Pedido> listarPedidos() {
       try {

            //1 passo criar a lista
            List<Pedido> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from pedidos";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pedido obj = new Pedido();

                obj.setId(rs.getInt("id_pedido"));
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id_cliente"));
                obj.setCliente(cliente);
                obj.setDocumento(rs.getString("documento"));
                obj.setTipoCliente(rs.getString("tipo_cliente"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getString("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                obj.setCep(rs.getString("cep"));
                obj.setDataCadastro(rs.getDate("data_cadastro"));
                obj.setObservacoes(rs.getString("observacoes"));

                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }
   
     */
    /**
     * Método responsável pela pesquisa de clientes pelo nome com filtro
     * @param id
     * @return pedido
     */
    public Pedido listarPedidoId(int id) {
        try {
            //1 passo - criar o sql , organizar e executar.
            String sql = "select * from pedidos where id_pedido = ?";
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Pedido pedido = new Pedido();
            if(rs.next()){
            Cliente obj = new Cliente();
            obj.setId(rs.getInt("id_cliente"));
            pedido = new Pedido();
            
            pedido.setId(rs.getInt("id_pedido"));
            pedido.setCliente(obj);
            pedido.setData(rs.getDate("data_pedido"));
            pedido.setStatus(rs.getString("status"));
            pedido.setTotal(rs.getDouble("valor_total"));
            pedido.setObservacoes(rs.getString("observacoes"));
            
            
            }
            
            return pedido;
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }
    }
}
