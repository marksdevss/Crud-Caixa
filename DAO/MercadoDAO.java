package DAO;

import Model.MercadoModel;
import java.sql.Connection;
import Conexaocrud.ConexaoCaixa;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MercadoDAO {

    public void CadastrarProduto(MercadoModel mercadoModel) throws Exception {

        String sql = "INSERT INTO caixa (id_caixa,produto,quantidade, preco_total,preco_unitario)";

        Connection connection = null;
        PreparedStatement ps = null;

        try {

            connection = ConexaoCaixa.ConexaoSQL();
            ps = connection.prepareStatement(sql);

            ps.setInt(1, mercadoModel.getId_caixa());
            ps.setString(2, mercadoModel.getProduto());
            ps.setInt(3, mercadoModel.getQuantidade());
            ps.setInt(4, mercadoModel.getPreco_total());
            ps.setInt(5, mercadoModel.getPreco_unitario());

            ps.execute();

        } finally {

            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }

        }

    }

    public List<MercadoModel> ShowProduto() {

        String sql = "SELECT * FROM caixa";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<MercadoModel> ems = new ArrayList<>();
        ResultSet resultSet = null;

        try {

            connection = ConexaoCaixa.ConexaoSQL();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                MercadoModel mercadoModel = new MercadoModel();

                mercadoModel.setId_caixa(resultSet.getInt("id_caixa"));
                mercadoModel.setProduto(resultSet.getString("produto"));
                mercadoModel.setQuantidade(resultSet.getInt("quantidade"));
                mercadoModel.setPreco_total(resultSet.getInt("preco_total"));
                mercadoModel.setPreco_unitario(resultSet.getInt("preco_unitario"));

                ems.add(mercadoModel);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return ems;
    }

}
