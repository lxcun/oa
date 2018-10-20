package com.imooc.oa.seller.dao;

import com.imooc.oa.seller.dao.SellerDao;
import com.imooc.oa.seller.entity.Seller;
import com.imooc.oa.seller.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Transactional//执行修改方法时一定要添加这个注解和@Modifying注解
public interface SellerDao extends JpaRepository<Seller, Integer> {
    /**
     * 通过销售商ID修改销售商信息
     * @param sellerId
     * @param sellerAddress
     * @param sellerName
     */
    @Modifying
    @Query(value = "update Seller  s set s.sellerName = :sellerName ,s.sellerAddress=:sellerAddress where sellerId = :sellerId")
    void updatesellerNameBysellerId(@Param("sellerId")  Integer sellerId, @Param("sellerAddress") String sellerAddress, @Param("sellerName") String sellerName);

    /**
     * 通过销售商名字查看销售商信息
     * @param sellerName
     * @return
     */
   public Seller findBySellerName(String sellerName);
}
