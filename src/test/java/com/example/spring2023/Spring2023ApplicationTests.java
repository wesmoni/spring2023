package com.example.spring2023;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.library.Architectures;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

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

    @Test
    @DisplayName("Соблюдены требования слоеной архитектуры")
    void testLayeredArchitecture(){
        Architectures.layeredArchitecture().consideringOnlyDependenciesInLayers()
                .layer("domain").definedBy("..domain..")
                .layer("app").definedBy("..app..")
                .layer("extern").definedBy("..extern..")
                .whereLayer("domain").mayNotAccessAnyLayer()
                .whereLayer("app").mayOnlyAccessLayers("domain")
                .whereLayer("extern").mayOnlyAccessLayers("app", "domain")
                .check(CLASSES);
    }

}
