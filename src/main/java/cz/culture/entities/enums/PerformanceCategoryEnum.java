package cz.culture.entities.enums;

/**
 * Created by jvalenta on 11.9.16.
 */

public enum PerformanceCategoryEnum {

    TYPE_DRAMA("Činohra"),
    TYPE_BALLET("Balet"),
    TYPE_OPERA("Opera"),
    TYPE_MUSICAL("Muzikál"),
    TYPE_CONCERT("Koncert");

    private String value;

    PerformanceCategoryEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
