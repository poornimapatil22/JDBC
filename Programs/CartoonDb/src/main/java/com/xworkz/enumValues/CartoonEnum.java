package com.xworkz.enumValues;


    public enum CartoonEnum {
        URL("jdbc:mysql://localhost:3306/dbofcartoon"),
        USERNAME("root"),
        PASSWORD("Poornima!22");

        private final String value;

        CartoonEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


