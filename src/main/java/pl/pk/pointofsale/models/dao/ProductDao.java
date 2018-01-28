package pl.pk.pointofsale.models.dao;

import java.util.List;

public interface ProductDao {
    boolean isProductInStore(String barcode);

    List<String> getProductList(String barcode);
}
