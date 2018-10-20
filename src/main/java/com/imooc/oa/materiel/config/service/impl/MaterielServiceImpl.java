package com.imooc.oa.materiel.config.service.impl;

import com.imooc.oa.inputmateriel.entity.InputMateriel;
import com.imooc.oa.manufacturer.dao.ManufacturerDao;
import com.imooc.oa.materiel.dao.MaterielDao;
import com.imooc.oa.materiel.dao.MaterielDaoMapper;
import com.imooc.oa.materiel.entity.Materiel;
import com.imooc.oa.materiel.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@EnableAutoConfiguration
@Service
public class MaterielServiceImpl implements MaterielService {
    @Autowired
    private MaterielDao materielDao;
    @Autowired
    private MaterielDaoMapper materielDaoMapper;

    @Override
    public List<Materiel> getMaterielList() {
        return materielDao.findAll();
    }

    @Override
    public Materiel getMaterielById(int materielId) {
        return materielDao.findOne(materielId);
    }

    @Override
    public Materiel getMaterielByMaterielCode(String materielCode) {
        return materielDao.findByMaterielCode(materielCode);
    }

    /**
     * 新增或者更新库存
     *
     * @param materiel
     * @return
     */
    @Transactional//使用事务管理
    @Override
    public boolean addNewMateriel(Materiel materiel) {
        Materiel oldMateriel = materielDao.findByMaterielCode(materiel.getMaterielCode());
        if (oldMateriel == null) {
            if (materiel.getMaterielCode() != null && !"".equals(materiel.getMaterielCode())) {
                try {
                    int effectedName = materielDaoMapper.insertnewMateriel(materiel);
                    if (effectedName > 0) {
                        return true;
                    } else {
                        throw new RuntimeException("插入信息失败");
                    }
                } catch (Exception e) {
                    throw new RuntimeException("插入信息失败：" + e.getMessage());
                }
            } else {
                throw new RuntimeException("信息不能为空或者重复");
            }
        } else if (oldMateriel.getMaterielCode() != null) {
            // 设置默认值
            try {
                // 更新信息
                int effectedNum = materielDaoMapper.addMateriel(materiel);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("信息不能为空！");
        }
    }

    /**
     * 修改库存信息
     *
     * @param materiel
     * @return
     */
    @Transactional//使用事务管理
    @Override
    public boolean modifyMateriel(Materiel materiel) {
        // 空值判断，主要是materielId不为空
        if (materiel.getMateriel_id() != null && materiel.getMateriel_id() > 0) {
            // 设置默认值
            try {
                // 更新信息
                int effectedNum = materielDaoMapper.updateMateriel(materiel);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("信息不能为空！");
        }
    }

    /**
     * 删除库存
     *
     * @param materielId
     * @return
     */
    @Transactional//使用事务管理
    @Override
    public boolean deleteMateriel(int materielId) {
        if (materielId > 0) {
            try {
                // 删除区域信息
                int effectedNum = materielDaoMapper.deleteMateriel(materielId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("Id不能为空！");
        }
    }

    /**
     * 批量增加库存
     *
     * @param materiel
     * @return

    @Transactional//使用事务管理
    @Override
    public boolean addMaterielList(List<Materiel> materiel) {
        try {
            // 批量增加库存
            int effectedNum = materielDaoMapper.insertlistMateriel(materiel);
            if (effectedNum > 0) {
                return true;
            } else {
                throw new RuntimeException("更新信息失败!");
            }
        } catch (Exception e) {
            throw new RuntimeException("更新信息失败:" + e.toString());
        }
    }
     */
    /**
     * 将入库传过来的参数进行库存更新
     *
     * @param inputMateriels
     * @return
     */
    @Override
    public boolean inputMaterielToMateriel(List<InputMateriel> inputMateriels) {
        Boolean flag = false;
        for (InputMateriel inputMateriel : inputMateriels) {
            Materiel materiel = new Materiel();
            materiel.setProductName(inputMateriel.getProductName());
            materiel.setMaterielCodingPrefix(inputMateriel.getMaterielCodingPrefix());
            materiel.setMaterielCode(inputMateriel.getMaterielCode());
            materiel.setRohs(inputMateriel.getRohs());
            materiel.setMaterielState(inputMateriel.getMaterielState());
            materiel.setDs(inputMateriel.getDs());
            materiel.setMaterielDescription(inputMateriel.getMaterielDescription());
            materiel.setEncapsulation(inputMateriel.getEncapsulation());
            materiel.setTemperature(inputMateriel.getTemperature());
            materiel.setRemarks(inputMateriel.getRemarks());
            materiel.setPn(inputMateriel.getPn());
            materiel.setBatchNumber(inputMateriel.getBatchNumber());
            materiel.setSerialNumber(inputMateriel.getSerialNumber());
            materiel.setSeller(inputMateriel.getSeller());
            materiel.setInventoryQuantity(inputMateriel.getQuantity());
            materiel.setProductPrice(inputMateriel.getProductPrice());
            materiel.setGeneralCategory(inputMateriel.getGeneralCategory());
            materiel.setSmallClass(inputMateriel.getSmallClass());
            materiel.setCodingRules(inputMateriel.getCodingRules());
            materiel.setShelfLife(inputMateriel.getShelfLife());
            materiel.setStorageData(inputMateriel.getStorageData());
            materiel.setMaterialReceivingWarehouse(inputMateriel.getMaterialReceivingWarehouse());
            materiel.setManagementPersonne(inputMateriel.getManagementPersonne());
            materiel.setManufacturer(inputMateriel.getManufacturer());
            materiel.setUnit(inputMateriel.getUnit());
            materiel.setFirstCustom(inputMateriel.getFirstCustom());
            materiel.setSecondCustom(inputMateriel.getSecondCustom());
            materiel.setThirdCustom(inputMateriel.getThirdCustom());
            materiel.setFourthCustom(inputMateriel.getFourthCustom());
            materiel.setFifthCustom(inputMateriel.getFifthCustom());
            materiel.setSixthCustom(inputMateriel.getSixthCustom());
            materiel.setSeventhCustom(inputMateriel.getSeventhCustom());
            materiel.setEighthCustom(inputMateriel.getEighthCustom());
            materiel.setNinthCustom(inputMateriel.getNinthCustom());
            materiel.setTenthCustom(inputMateriel.getTenthCustom());
            if (addNewMateriel(materiel))
                flag = true;
            else
                flag = false;
        }
        return flag;
    }
    @Override
    public boolean inputMaterielToMateriel(InputMateriel inputMateriel) {
        Boolean flag = false;
            Materiel materiel = new Materiel();
            materiel.setProductName(inputMateriel.getProductName());
            materiel.setMaterielCodingPrefix(inputMateriel.getMaterielCodingPrefix());
            materiel.setMaterielCode(inputMateriel.getMaterielCode());
            materiel.setRohs(inputMateriel.getRohs());
            materiel.setMaterielState(inputMateriel.getMaterielState());
            materiel.setDs(inputMateriel.getDs());
            materiel.setMaterielDescription(inputMateriel.getMaterielDescription());
            materiel.setEncapsulation(inputMateriel.getEncapsulation());
            materiel.setTemperature(inputMateriel.getTemperature());
            materiel.setRemarks(inputMateriel.getRemarks());
            materiel.setPn(inputMateriel.getPn());
            materiel.setBatchNumber(inputMateriel.getBatchNumber());
            materiel.setSerialNumber(inputMateriel.getSerialNumber());
            materiel.setSeller(inputMateriel.getSeller());
            materiel.setInventoryQuantity(inputMateriel.getQuantity());
            materiel.setProductPrice(inputMateriel.getProductPrice());
            materiel.setGeneralCategory(inputMateriel.getGeneralCategory());
            materiel.setSmallClass(inputMateriel.getSmallClass());
            materiel.setCodingRules(inputMateriel.getCodingRules());
            materiel.setShelfLife(inputMateriel.getShelfLife());
            materiel.setStorageData(inputMateriel.getStorageData());
            materiel.setMaterialReceivingWarehouse(inputMateriel.getMaterialReceivingWarehouse());
            materiel.setManagementPersonne(inputMateriel.getManagementPersonne());
            materiel.setManufacturer(inputMateriel.getManufacturer());
            materiel.setUnit(inputMateriel.getUnit());
            materiel.setFirstCustom(inputMateriel.getFirstCustom());
            materiel.setSecondCustom(inputMateriel.getSecondCustom());
            materiel.setThirdCustom(inputMateriel.getThirdCustom());
            materiel.setFourthCustom(inputMateriel.getFourthCustom());
            materiel.setFifthCustom(inputMateriel.getFifthCustom());
            materiel.setSixthCustom(inputMateriel.getSixthCustom());
            materiel.setSeventhCustom(inputMateriel.getSeventhCustom());
            materiel.setEighthCustom(inputMateriel.getEighthCustom());
            materiel.setNinthCustom(inputMateriel.getNinthCustom());
            materiel.setTenthCustom(inputMateriel.getTenthCustom());
            if (addNewMateriel(materiel))
                flag = true;
            else
                flag = false;
        return flag;

    }


}


