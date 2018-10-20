package com.imooc.oa.controller;

import com.imooc.oa.encapsulation.entity.Encapsulation;
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
public class EncapsulationControllerTest {
    @Autowired
    private EncapsulationController encapsulationController;
    @Test
    public void addEncapsulation() throws Exception {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setEncapsulationName("PCB");
        encapsulationController.addEncapsulation(encapsulation);
    }

    @Test
    public void updateEncapsulation() throws Exception {
        Encapsulation encapsulation=new Encapsulation();
        encapsulation.setEncapsulationId(2);
        encapsulation.setEncapsulationName("贴片式");
        encapsulationController.updateEncapsulation(encapsulation);
    }

    @Test
    public void deleteEncapsulation() throws Exception {
        encapsulationController.deleteEncapsulation(1);

    }

}