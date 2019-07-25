package com.oocl.packagebooking.service;

import com.oocl.packagebooking.model.Package;

import java.util.List;

public interface PackageService {
    List<Package> getAllPackage();

    Package addPackage(Package postpackage);

    Package updatePackage(Long id, Package patchPackage);
}
