package com.ailliushchenia.patterns.builder;

public interface DocumentBlankBuilder {
    void reset();
    void setHeader(String text, Position position);
    void setDocumentName(String text, Position position);
    void setBody(String text);
    void setDateAndSignature(String date, String signature);
    String getResult();
}