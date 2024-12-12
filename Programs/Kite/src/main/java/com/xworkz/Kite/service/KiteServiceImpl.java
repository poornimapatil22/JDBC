package com.xworkz.Kite.service;

import com.xworkz.Kite.dto.KiteDto;
import com.xworkz.Kite.entity.KiteEntity;
import com.xworkz.Kite.repository.KiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KiteServiceImpl implements KiteService{
    @Autowired
    KiteRepository kiteRepository;
    @Override
    public boolean validAndSave(KiteDto kiteDto) {
        KiteEntity kiteEntity=new KiteEntity();
        kiteEntity.setKiteColour( kiteDto.getKiteColour());
        kiteEntity.setKiteCount(kiteDto.getKiteCount());
        kiteEntity.setKiteType(kiteDto.getKiteType());
        kiteRepository.save(kiteEntity);
        return false;
    }

//    private KiteEntity copyDtoToEntity(KiteDto kiteDto,KiteEntity kiteEntity){
//        kiteEntity.setKiteColour( kiteDto.getKiteColour());
//        kiteEntity.setKiteCount(kiteDto.getKiteCount());
//        kiteEntity.setKiteType(kiteDto.getKiteType());
//        return kiteEntity;
//    }
//        KiteEntity kiteEntity=copyDtoToEntity(kiteDto,new KiteEntity());
}
