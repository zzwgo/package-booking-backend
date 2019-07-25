package com.oocl.packagebooking.service.impl;

import com.oocl.packagebooking.model.Package;
import com.oocl.packagebooking.repository.PackageRepository;
import com.oocl.packagebooking.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    PackageRepository packageRepository;

    @Override
    public List<Package> getAllPackage() {
        return packageRepository.findAll();
    }

    @Override
    public Package addPackage(Package postpackage) {
        return packageRepository.save(postpackage);
    }

    @Override
    public Package updatePackage(Long id, Package patchPackage) {
        Package currentPackage=packageRepository.findById(id).orElse(null);
        currentPackage.setStatus(patchPackage.getStatus());
        packageRepository.save(currentPackage);
        return currentPackage;
    }
}
