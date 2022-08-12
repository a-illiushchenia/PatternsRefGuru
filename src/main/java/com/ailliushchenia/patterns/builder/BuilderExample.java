package com.ailliushchenia.patterns.builder;

public class BuilderExample {
    public void showBuilder(){

        System.out.println("Hello, Builder pattern!");

        DocumentBlankBuilder documentBlankBuilder = new RegularDocumentBlankBuilder();
        Director director = new Director(documentBlankBuilder);

        director.make(DocumentBlankType.DECLARATION);

        System.out.println("---   " + DocumentBlankType.DECLARATION + "   ---");
        System.out.println(documentBlankBuilder.getResult());

        director.make(DocumentBlankType.EXPLANATORY);

        System.out.println("---   " + DocumentBlankType.EXPLANATORY + "   ---");
        System.out.println(documentBlankBuilder.getResult());
    }
}
