package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.model.Package;
import com.oocl.packagebooking.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {

    @Autowired
    private PackageService packageService;

    @GetMapping
    public List<Package> getAllPackage() {
        return  packageService.getAllPackage();
    }

    @PostMapping
    public Package addPackage(@RequestBody Package postPackage){
        return packageService.addPackage(postPackage);
    }

    @PatchMapping("/{id}")
    public Package updatePackage(@PathVariable Long id,@RequestBody Package patchPackage){
        return packageService.updatePackage(id,patchPackage);
    }


}
