package com.imooc.oa.controller;

import com.imooc.oa.manufacturer.entity.Manufacturer;
import com.imooc.oa.seller.dao.SellerDao;
import com.imooc.oa.seller.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 销售商信息的增删改查
 */
    @EnableAutoConfiguration
    @RestController

    public class SellerController {
        @Autowired
        private SellerDao sellerDao;

    /**
     * 查询库存的销售商信息
     * 返回的是一个销售商信息的List
     ** @return
     */
        @RequestMapping(value = "/listseller", method = RequestMethod.GET)
        List<Seller> listSeller() {
            List<Seller> list = sellerDao.findAll();
            //  list = materielService.getMaterielList();
            return list;
        }

    /**
     * 添加新的销售商，如果已经存在则不能继续添加
     * @param seller
     * @return
     */
        @RequestMapping(value = "/addseller", method = RequestMethod.POST,consumes = "application/json")
        public boolean addSeller(Seller seller) {
            Seller oldSeller = sellerDao.findBySellerName(seller.getSellerName());
            if(oldSeller==null)
                try {
                    sellerDao.save(seller);
                    return true;
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                    throw new RuntimeException("插入信息失败");
                }
            else
                throw new RuntimeException("已经存在这个销售商的信息，若需修改请在修改处");

        }

    /**
     *根据传入的信息进行销售商信息的修改
     *  @param list
     * @return
     */
        @RequestMapping(value = "/updateseller", method = RequestMethod.POST,consumes = "application/json")
        public boolean updateSeller(Seller list) {
            try {
                sellerDao.updatesellerNameBysellerId(list.getSellerId(),list.getSellerAddress(),list.getSellerName());
                return true;
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException("更新销售商信息失败");
            }
        }

    /**
     * 根据传入的Id进行库存销售商的删除
     * @param sellerId
     * @return
     */
        @RequestMapping(value = "/deleteseller", method = RequestMethod.POST,consumes = "application/json")
        public boolean deleteSeller(Integer sellerId) {
            try {
                sellerDao.delete(sellerId);
                return true;
            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException("删除销售商失败");
            }
        }

    }
