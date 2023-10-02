package com.example.spring2023;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@SpringBootTest
class Spring2023ApplicationTests {

    private static final String PACKAGE_NAME = "com.example.spring2023";
    private static final JavaClasses CLASSES = new ClassFileImporter().importPackages(PACKAGE_NAME);
    @Test
    @DisplayName("Check package app")
    void testAppPackage() {
        layeredArchitecture()
                .consideringOnlyDependenciesInLayers()
                .layer("app").definedBy(PACKAGE_NAME + ".app")
                .check(CLASSES);
    }

    @Test
    @DisplayName("Check package domain")
    void testDomainPackage() {
        layeredArchitecture()
                .consideringOnlyDependenciesInLayers()
                .layer("domain").definedBy(PACKAGE_NAME + ".domain")
                .check(CLASSES);
    }

    @Test
    @DisplayName("Check package extern")
    void testExternPackage() {
        layeredArchitecture()
                .consideringOnlyDependenciesInLayers()
                .layer("extern").definedBy(PACKAGE_NAME + ".extern")
                .check(CLASSES);
    }

    @Test
    @DisplayName("Check package controller")
    void testControllerPackage() {
        layeredArchitecture()
                .consideringOnlyDependenciesInLayers()
                .layer("controller").definedBy(PACKAGE_NAME + ".controller")
                .check(CLASSES);
    }


}
