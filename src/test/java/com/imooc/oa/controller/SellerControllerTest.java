package com.imooc.oa.controller;

import com.imooc.oa.seller.dao.SellerDao;
import com.imooc.oa.seller.entity.Seller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
public class SellerControllerTest {


    @Autowired
    private SellerDao sellerDao;
    @Autowired
    private SellerController sellerController;
    @Test
    public void addSeller() throws Exception {
        Seller seller=new Seller();
        seller.setSellerAddress("城市E加");
        seller.setSellerName("电子销售");
        sellerController.addSeller(seller);
    }
    @Test
    public void updateSeller() throws Exception {
        Seller seller=new Seller();
        seller.setSellerId(1);
        seller.setSellerAddress("城市E");
        seller.setSellerName("电子销售1");
        sellerController.addSeller(seller);
    }
    @Test
    public void deleteSeller() throws Exception {
        sellerController.deleteSeller(1);
    }

}