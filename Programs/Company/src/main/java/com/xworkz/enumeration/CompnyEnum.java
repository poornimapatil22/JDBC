package com.xworkz.enumeration;

public enum CompnyEnum {
    URL("jdbc:mysql://localhost:3306/company"),USERNAME("root"),PASSWORD("Poornima!22");



     private final String value;

     private CompnyEnum(String value){
         this.value=value;
     }

     public String getValue(){
         return  value;
     }

}
