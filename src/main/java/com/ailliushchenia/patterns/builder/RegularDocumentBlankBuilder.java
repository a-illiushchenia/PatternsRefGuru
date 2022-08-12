package com.ailliushchenia.patterns.builder;

public class RegularDocumentBlankBuilder implements DocumentBlankBuilder {
    StringBuilder resultBuilder;
    
    @Override
    public void reset(){
        resultBuilder = new StringBuilder();
    }
    
    
    @Override
    public void setHeader(String text, Position position) {
        StringBuilder builder = addTextInPosition(text, position);
        resultBuilder.append(builder);
    }

    @Override
    public void setDocumentName(String text, Position position) {
        StringBuilder builder = addTextInPosition(text, position);
        resultBuilder.append(builder);
    }

    @Override
    public void setBody(String text) {
        resultBuilder.append(text);
    }

    @Override
    public void setDateAndSignature(String date, String signature) {
        resultBuilder.append(date).append("         ").append(signature);
    }

    @Override
    public String getResult(){
        return  resultBuilder.toString();
    }

    private static StringBuilder addTextInPosition(String text, Position position) {
        StringBuilder builder = new StringBuilder();
        switch (position){
            case LEFT:
            case CENTER: builder.append("   ");
            case RIGHT: builder.append("      ");
        }

        builder.append(text).append("\n");
        return builder;
    }
}
