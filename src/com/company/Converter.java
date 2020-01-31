package com.company;

public class Converter {
    //region Properties

        //endregion

        //region Constructors

        //endregion

        //region public Methods
        public static Command convertInputToCommand(String s) {
            String[] strings = s.split(":");
            Command command = new Command();
            command.setLine(strings[0]);
            command.setColumn(Integer.valueOf(strings[1]));
            return command;
        }
        //endregion

        //region Getters and Setters

        //endregion

        //region Equals HashCode toString

        //endregion

}
