package com.ailliushchenia.patterns.builder;

public class Director {
    DocumentBlankBuilder blankBuilder;

    public Director(DocumentBlankBuilder blankBuilder) {
        this.blankBuilder = blankBuilder;
    }

    public void changeBuilder(DocumentBlankBuilder blankBuilder){
        this.blankBuilder = blankBuilder;
    }

    public void make(DocumentBlankType documentBlankType){
        switch (documentBlankType){
            case DECLARATION:makeDeclaration(); return;
            case EXPLANATORY:makeExplanatory();
        }
    }

    private void makeDeclaration(){
        blankBuilder.reset();
        blankBuilder.setHeader("Header\n\n\n\n\n", Position.RIGHT);
        blankBuilder.setDocumentName("Declaration", Position.CENTER);
        blankBuilder.setBody("\n\n\n\n\n\n\n\n\n\n");
        blankBuilder.setDateAndSignature("Date:", "Signature");
    }

    private void makeExplanatory(){
        blankBuilder.reset();
        blankBuilder.setDocumentName("Explanatory", Position.CENTER);
        blankBuilder.setBody("\n\n\n\n\n\n\n\n\n\n");
        blankBuilder.setDateAndSignature("Date:", "Signature");
    }
}
