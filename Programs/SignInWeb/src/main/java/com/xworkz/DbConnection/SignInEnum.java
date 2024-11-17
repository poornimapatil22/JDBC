package com.xworkz.DbConnection;

public enum SignInEnum {



        URL("jdbc:mysql://localhost:3306/signInWeb"), USERNAME("root"), PASSWORD("Poornima!22");

        private String value;

        private SignInEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

