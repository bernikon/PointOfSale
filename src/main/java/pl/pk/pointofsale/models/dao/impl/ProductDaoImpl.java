package pl.pk.pointofsale.models.dao.impl;

import pl.pk.pointofsale.models.MysqlConnector;
import pl.pk.pointofsale.models.ProductModel;
import pl.pk.pointofsale.models.dao.ProductDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    private MysqlConnector connector = MysqlConnector.getInstance();

    @Override
    public boolean getProductByBarcode(String barcode) {
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
              "SELECT * FROM 'product' WHERE 'barcode' = ?"
            );
            preparedStatement.setString(1,"5111222333444");
            ResultSet resultSet = preparedStatement.executeQuery();
            //return resultSet.getString("name")
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;
    }

//    @Override
//    public boolean isProductInStore(String barcode) {
//        try {
//            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
//                    "SELECT * FROM product WHERE barcode = ?"
//            );
//            //preparedStatement.setString(1, barcode);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if (!resultSet.next()) {
//                return false;
//            }
//            return resultSet.getString("price").equals("barcode");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    @Override
//    public List<String> getProductList(String barcode) {
//
//        List<String> productList = new ArrayList<>();
//        try {
//            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(
//                    "SELECT name, price FROM product WHERE barcode = ?"
//            );
//            preparedStatement.setString(1, barcode);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                productList.add(resultSet.getString("name"));
//                productList.add(resultSet.getString("price"));
//
//            }
//            preparedStatement.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return productList;
//    }
}
