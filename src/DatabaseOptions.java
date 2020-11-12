
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Copyright (C) 2020 Dalton
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Dalton
 */
public class DatabaseOptions {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedstatement = null;
    
    public DatabaseOptions(){
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:WarThunderVehicle.db");
            System.out.println("Connection is successful");
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int RP_Value(){
        int RP_TO_EAGLE = 45;
        return RP_TO_EAGLE;  
    }
    
    public ArrayList<Vehicle> viewVehicle(int CountryID, int VehicleTypeID) {
        if(CountryID == 0){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from AMERICA where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 1){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from GERMANY where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 2){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from UNITED_KINGDOM where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 3){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from RUSSIAN where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 4){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from JAPAN where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 5){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from CHINA where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 6){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from ITALY where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 7){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from SWEDEN where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 8){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from FRANCE where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public ArrayList<Vehicle> viewEndVehicle(int CountryID, int VehicleTypeID, int LineID) {
        if(CountryID == 0){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from AMERICA where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 1){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from GERMANY where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 2){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from UNITED_KINGDOM where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 3){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from RUSSIAN where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 4){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from JAPAN where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 5){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from CHINA where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 6){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from ITALY where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 7){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from SWEDEN where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else if(CountryID == 8){
            try {
                ArrayList <Vehicle> vehicle = new ArrayList <>();
                String query = "select * from FRANCE where VEHICLETYPE_ID= '"+ VehicleTypeID+ "' order by LINETYPE_ID ASC, LINEPROGRESSION_ID ASC, FOLDER_VALUE ASC;";
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(query);
                while(rs.next()){
                    int vehicle_ID = rs.getInt("VEHICLE_ID");
                    int vehicleTypeID = rs.getInt("VEHICLETYPE_ID");
                    String vehicleName = rs.getString("VEHICLE_NAME");
                    int linetype_ID = rs.getInt("LINETYPE_ID");
                    int lineProgressionID = rs.getInt("LINEPROGRESSION_ID");
                    String tier = rs.getString("TIER");
                    int rpCost = rs.getInt("RP_COST");
                    int lionCost = rs.getInt("LION_COST");
                    String imageFileName = rs.getString("IMAGE_FILE_NAME");
                    int folderValue = rs.getInt("FOLDER_VALUE");
                    String progressionString = rs.getString("PROGRESSION_STRING");

                    vehicle.add(new Vehicle(vehicle_ID, vehicleTypeID, vehicleName, linetype_ID, lineProgressionID, tier, rpCost, lionCost, imageFileName, folderValue, progressionString));
                }
                return vehicle;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        else{
            return null;
        }
    }
    
    public long RP_Cost_finder(int StartVehicle, int EndVehicle, int LineID, int CountryID, int VehicleTypeID){
        long total = 0;
        
        for(int i = StartVehicle; i<= EndVehicle; i++){
            switch (CountryID) {
                case 0:
                    try {
                        String query = "select RP_COST from AMERICA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE<'1';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 1:
                    try {
                        String query = "select RP_COST from GERMANY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 2:
                    try {
                        String query = "select RP_COST from UNITED_KINGDOM where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 3:
                    try {
                        String query = "select RP_COST from RUSSIAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 4:
                    try {
                        String query = "select RP_COST from JAPAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 5:
                    try {
                        String query = "select RP_COST from CHINA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 6:
                    try {
                        String query = "select RP_COST from ITALY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 7:
                    try {
                        String query = "select RP_COST from SWEDEN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 8:
                    try {
                        String query = "select RP_COST from FRANCE where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
            //Leftover from other code
                default:
                    break;
            }
            
        }
        
        return total;
    }
    
    public long LION_Cost_finder(int StartVehicle, int EndVehicle, int LineID, int CountryID, int VehicleTypeID){
        long total = 0;
        
        for(int i = StartVehicle; i<= EndVehicle; i++){
            if(CountryID == 0){
                try {
                    String query = "select LION_COST from AMERICA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 1){
                try {
                    String query = "select LION_COST from GERMANY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 2){
                try {
                    String query = "select LION_COST from UNITED_KINGDOM where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 3){
                try {
                    String query = "select LION_COST from RUSSIAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 4){
                try {
                    String query = "select LION_COST from JAPAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 5){
                try {
                    String query = "select LION_COST from CHINA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 6){
                try {
                    String query = "select LION_COST from ITALY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 7){
                try {
                    String query = "select LION_COST from SWEDEN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 8){
                try {
                    String query = "select LION_COST from FRANCE where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "' and FOLDER_VALUE='0';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                //Leftover from other code
            }
            
        }
        
        return total;
    }
    
    public long RP_Cost_finder2(int StartVehicle, int EndVehicle, int LineID, int CountryID, int VehicleTypeID){
        //Needs a fix for both tanks and aircraft
        
        long total = 0;
        
        for(int i = StartVehicle; i<= EndVehicle; i++){
            switch (CountryID) {
                case 0:
                    try {
                        String query = "select RP_COST from AMERICA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 1:
                    try {
                        String query = "select RP_COST from GERMANY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 2:
                    try {
                        String query = "select RP_COST from UNITED_KINGDOM where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 3:
                    try {
                        String query = "select RP_COST from RUSSIAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 4:
                    try {
                        String query = "select RP_COST from JAPAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 5:
                    try {
                        String query = "select RP_COST from CHINA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 6:
                    try {
                        String query = "select RP_COST from ITALY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 7:
                    try {
                        String query = "select RP_COST from SWEDEN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 8:
                    try {
                        String query = "select RP_COST from FRANCE where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
            //Leftover from other code
                default:
                    break;
            }
            
        }
        
        return total;
    }
    
    public long LION_Cost_finder2(int StartVehicle, int EndVehicle, int LineID, int CountryID, int VehicleTypeID){
        long total = 0;
        
        for(int i = StartVehicle; i<= EndVehicle; i++){
            if(CountryID == 0){
                try {
                    String query = "select LION_COST from AMERICA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 1){
                try {
                    String query = "select LION_COST from GERMANY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 2){
                try {
                    String query = "select LION_COST from UNITED_KINGDOM where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 3){
                try {
                    String query = "select LION_COST from RUSSIAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 4){
                try {
                    String query = "select LION_COST from JAPAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 5){
                try {
                    String query = "select LION_COST from CHINA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 6){
                try {
                    String query = "select LION_COST from ITALY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 7){
                try {
                    String query = "select LION_COST from SWEDEN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(CountryID == 8){
                try {
                    String query = "select LION_COST from FRANCE where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and LINEPROGRESSION_ID='" + i + "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        total += rs.getInt("LION_COST");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                //Leftover from other code
            }
            
        }
        
        return total;
    }
    
    public ArrayList<Integer> VehicleLineIDFinder(String StartVehicle, String EndVehicle,int CountryID){
        ArrayList<Integer> Range = new ArrayList<>();
        
        switch (CountryID) {
            case 0:
                try {
                    String query = "select LINEPROGRESSION_ID from AMERICA where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from AMERICA where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 1:
                try {
                    String query = "select LINEPROGRESSION_ID from GERMANY where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from GERMANY where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 2:
                try {
                    String query = "select LINEPROGRESSION_ID from UNITED_KINGDOM where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from UNITED_KINGDOM where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 3:
                try {
                    String query = "select LINEPROGRESSION_ID from RUSSIAN where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from RUSSIAN where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 4:
                try {
                    String query = "select LINEPROGRESSION_ID from JAPAN where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from JAPAN where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 5:
                try {
                    String query = "select LINEPROGRESSION_ID from CHINA where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from CHINA where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 6:
                try {
                    String query = "select LINEPROGRESSION_ID from ITALY where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from ITALY where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 7:
                try {
                    String query = "select LINEPROGRESSION_ID from SWEDEN where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from SWEDEN where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 8:
                try {
                    String query = "select LINEPROGRESSION_ID from FRANCE where VEHICLE_NAME= '"+ StartVehicle+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    String query2 = "select LINEPROGRESSION_ID from FRANCE where VEHICLE_NAME= '"+ EndVehicle+ "';";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query2);
                    while(rs.next()){
                        int LineID = rs.getInt("LINEPROGRESSION_ID");
                        
                        Range.add(LineID);
                    }
                    
                    return Range;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            default:
                return null;
        }
    }
    
    public ArrayList<String> vehicleInformation(int CountryID, String vehicleName){
        ArrayList<String> data = new ArrayList<>();
        switch (CountryID) {
            case 0:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from AMERICA where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 1:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from GERMANY where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 2:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from UNITED_KINGDOM where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 3:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from RUSSIAN where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 4:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from JAPAN where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 5:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from CHINA where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 6:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from ITALY where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 7:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from SWEDEN where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            case 8:
                try {
                    String query = "select TIER, RP_COST, LION_COST, IMAGE_FILE_NAME from FRANCE where VEHICLE_NAME= '"+ vehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        String tier = rs.getString("TIER");
                        int rpCost = rs.getInt("RP_COST");
                        int lionCost = rs.getInt("LION_COST");
                        String imageFileName = rs.getString("IMAGE_FILE_NAME");
                        
                        data.add(tier);
                        data.add(Integer.toString(rpCost));
                        data.add(Integer.toString(lionCost));
                        data.add(imageFileName);
                    }
                    return data;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                }
            default:
                return null;
        }
    }
    
    public int FolderFinder(int CountryID, String VehicleName){
        int FolderValue = 0;
        switch (CountryID) {
            case 0:
                try {
                    String query = "select FOLDER_VALUE from AMERICA where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 1:
                try {
                    String query = "select FOLDER_VALUE from GERMANY where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 2:
                try {
                    String query = "select FOLDER_VALUE from UNITED_KINGDOM where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 3:
                try {
                    String query = "select FOLDER_VALUE from RUSSIAN where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 4:
                try {
                    String query = "select FOLDER_VALUE from JAPAN where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 5:
                try {
                    String query = "select FOLDER_VALUE from CHINA where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 6:
                try {
                    String query = "select FOLDER_VALUE from ITALY where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 7:
                try {
                    String query = "select FOLDER_VALUE from SWEDEN where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            case 8:
                try {
                    String query = "select FOLDER_VALUE from FRANCE where VEHICLE_NAME= '"+ VehicleName+ "';";
                    statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery(query);
                    while(rs.next()){
                        FolderValue = rs.getInt("FOLDER_VALUE");
                    }
                    
                    return FolderValue;
                } catch (SQLException ex) {
                    Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    return 0;
                }
            default:
                return 0;
        }
    }
    
    public long FolderRPCalculator(int CountryID, int VehicleTypeID, int FolderStopValue, int ProgressionID, int LineID){
        long total = 0;
        
        for(int i = 1; i <= FolderStopValue; i++){
            switch (CountryID) {
                case 0:
                    try {
                        String query = "select RP_COST from AMERICA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 1:
                    try {
                        String query = "select RP_COST from GERMANY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 2:
                    try {
                        String query = "select RP_COST from UNITED_KINGDOM where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 3:
                    try {
                        String query = "select RP_COST from RUSSIAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 4:
                    try {
                        String query = "select RP_COST from JAPAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 5:
                    try {
                        String query = "select RP_COST from CHINA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 6:
                    try {
                        String query = "select RP_COST from ITALY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 7:
                    try {
                        String query = "select RP_COST from SWEDEN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 8:
                    try {
                        String query = "select RP_COST from FRANCE where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("RP_COST");
                            break;
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
            //Leftover from other code
                default:
                    break;
            }
            
        }
        
        return total;
    }
    
    public long FolderLionCalculator(int CountryID, int VehicleTypeID, int FolderStopValue, int ProgressionID, int LineID){
        long total = 0;
        
        for(int i = 1; i<= FolderStopValue; i++){
            switch (CountryID) {
                case 0:
                    try {
                        String query = "select LION_COST from AMERICA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 1:
                    try {
                        String query = "select LION_COST from GERMANY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 2:
                    try {
                        String query = "select LION_COST from UNITED_KINGDOM where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 3:
                    try {
                        String query = "select LION_COST from RUSSIAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 4:
                    try {
                        String query = "select LION_COST from JAPAN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 5:
                    try {
                        String query = "select LION_COST from CHINA where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 6:
                    try {
                        String query = "select LION_COST from ITALY where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 7:
                    try {
                        String query = "select LION_COST from SWEDEN where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
                case 8:
                    try {
                        String query = "select LION_COST from FRANCE where VEHICLETYPE_ID='" + VehicleTypeID + "' and LINETYPE_ID= '"+ LineID+ "'and FOLDER_VALUE='" + i + "' and LINEPROGRESSION_ID='"+ ProgressionID + "';";
                        statement = connection.createStatement();
                        ResultSet rs = statement.executeQuery(query);
                        while(rs.next()){
                            total += rs.getInt("LION_COST");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
                    }   break;
            //Leftover from other code
                default:
                    break;
            }
            
        }
        
        return total;
    }
    
    //For the database creator/editing
    
    public void tableCreator(){
        try {
            System.out.println("Building tables for the database to read");
            Statement state2 = connection.createStatement();
            state2.execute("CREATE TABLE AMERICA(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                
            state2.execute("CREATE TABLE GERMANY(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                
            state2.execute("CREATE TABLE UNITED_KINGDOM(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                    
            state2.execute("CREATE TABLE RUSSIAN(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                    
            state2.execute("CREATE TABLE JAPAN(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                    
            state2.execute("CREATE TABLE CHINA(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                    
            state2.execute("CREATE TABLE ITALY(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                    
            state2.execute("CREATE TABLE SWEDEN(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ");"
            );
                    
            state2.execute("CREATE TABLE FRANCE(\n" +
                "VEHICLE_ID		INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "VEHICLETYPE_ID 	INT(6),\n" +
                "VEHICLE_NAME           char(36),\n" +
                "LINETYPE_ID		INT(6),\n" +
                "LINEPROGRESSION_ID     INT(6),\n"+
                "TIER			char(3),\n" +
                "RP_COST		int(10),\n" +
                "LION_COST		INT(10),\n" +
                "IMAGE_FILE_NAME	char(36)" +
                ")"
            );
                
            System.out.println("Finished Building tables");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void alterTable(){
        try {
            System.out.println("Building tables for the database to read");
            Statement state2 = connection.createStatement();
//            state2.execute("ALTER TABLE AMERICA	ADD COLUMN FOLDER_VALUE	INT;");
            state2.execute("ALTER TABLE AMERICA ADD COLUMN PROGRESSION_STRING char(36);");
//            state2.execute("ALTER TABLE GERMANY add column FOLDER_VALUE INT(6);");
            state2.execute("ALTER TABLE GERMANY add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE UNITED_KINGDOM add column FOLDER_VALUE	INT(6);");
            state2.execute("ALTER TABLE UNITED_KINGDOM add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE RUSSIAN add column FOLDER_VALUE INT(6);");
            state2.execute("ALTER TABLE RUSSIAN add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE JAPAN add column FOLDER_VALUE	INT(6);");
            state2.execute("ALTER TABLE JAPAN add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE CHINA add column FOLDER_VALUE	INT(6);");
            state2.execute("ALTER TABLE CHINA add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE ITALY add column FOLDER_VALUE	INT(6);");
            state2.execute("ALTER TABLE ITALY add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE SWEDEN add column FOLDER_VALUE	INT(6);");
            state2.execute("ALTER TABLE SWEDEN add column PROGRESSION_STRING	char(36);");
//            state2.execute("ALTER TABLE FRANCE add column FOLDER_VALUE	INT(6);");
            state2.execute("ALTER TABLE FRANCE add column PROGRESSION_STRING	char(36);");
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addVehicle(int CountryTableType, int vehicleTypeID, String name, int lineID, int LineProgressionID, String tier, int rp_Cost, int Lion_cost, String Image_file_name, int FolderValue, String Progression){
        if(CountryTableType == 0){
            //American Vehicles
            try {
                String query = "insert into AMERICA(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 1){
            try {
                String query = "insert into GERMANY(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 2){
            try {
                String query = "insert into UNITED_KINGDOM(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 3){
            try {
                String query = "insert into RUSSIAN(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 4){
            try {
                String query = "insert into JAPAN(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 5){
            try {
                String query = "insert into CHINA(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 6){
            try {
                String query = "insert into ITALY(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 7){
            try {
                String query = "insert into SWEDEN(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 8){
            try {
                String query = "insert into FRANCE(VEHICLETYPE_ID, VEHICLE_NAME, LINETYPE_ID, LINEPROGRESSION_ID, TIER, RP_COST, LION_COST, IMAGE_FILE_NAME, FOLDER_VALUE, PROGRESSION_STRING) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setString(2, name);
                preparedstatement.setInt(3, lineID);
                preparedstatement.setInt(4, LineProgressionID);
                preparedstatement.setString(5, tier);
                preparedstatement.setInt(6, rp_Cost);
                preparedstatement.setInt(7, Lion_cost);
                preparedstatement.setString(8, Image_file_name);
                preparedstatement.setInt(9, FolderValue);
                preparedstatement.setString(10, Progression);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteVehicle(int CountryTableType, int vehicleTypeID, int VehicleID){
        if(CountryTableType == 0){
            //American Vehicles
            try {
                String query = "delete from AMERICA where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 1){
            //Germany Vehicles
            try {
                String query = "delete from GERMANY where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 2){
            //United Kingdom Vehicles
            try {
                String query = "delete from UNITED_KINGDOM where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 3){
            //Russian Vehicles
            try {
                String query = "delete from RUSSIAN where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 4){
            //Japan Vehicles
            try {
                String query = "delete from JAPAN where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 5){
            //China Vehicles
            try {
                String query = "delete from CHINA where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 6){
            try {
                String query = "delete from ITALY where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 7){
            try {
                String query = "delete from SWEDEN where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(CountryTableType == 8){
            try {
                String query = "delete from FRANCE where VEHICLETYPE_ID=? and VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, vehicleTypeID);
                preparedstatement.setInt(2, VehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void updateVehicle(int CountryTableType, int vehicleTypeID, int vehicleID, String name, int lineID, int lineProgressionID, String tier, int rp_Cost, int Lion_cost, String Image_file_name, int FolderValue, String Progression){
        if(CountryTableType == 0){
            try {
                String query = "update AMERICA set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=? , FOLDER_VALUE=?, PROGRESSION_STRING=? where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 1){
            try {
                String query = "update GERMANY set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=? where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 2){
            try {
                String query = "update UNITED_KINGDOM set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 3){
            try {
                String query = "update RUSSIAN set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 4){
            try {
                String query = "update JAPAN set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 5){
            try {
                String query = "update CHINA set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 6){
            try {
                String query = "update ITALY set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 7){
            try {
                String query = "update SWEDEN set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(CountryTableType == 8){
            try {
                String query = "update FRANCE set LINETYPE_ID=?, LINEPROGRESSION_ID=?, VEHICLE_NAME=?, TIER=?, RP_COST=?, LION_COST=?, IMAGE_FILE_NAME=?, FOLDER_VALUE=?, PROGRESSION_STRING=?  where VEHICLETYPE_ID=? AND VEHICLE_ID=?";

                preparedstatement = connection.prepareStatement(query);
                preparedstatement.setInt(1, lineID);
                preparedstatement.setInt(2, lineProgressionID);
                preparedstatement.setString(3, name);
                preparedstatement.setString(4, tier);
                preparedstatement.setInt(5, rp_Cost);
                preparedstatement.setInt(6, Lion_cost);
                preparedstatement.setString(7, Image_file_name);
                preparedstatement.setInt(8, FolderValue);
                preparedstatement.setString(9, Progression);
                preparedstatement.setInt(10, vehicleTypeID);
                preparedstatement.setInt(11, vehicleID);
                preparedstatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteTables(){
        try {
            String query = "DELETE FROM AMERICA";
            System.out.println("Deleting tables from the database");
            Statement state2 = connection.createStatement();
            state2.execute(query);
            System.out.println("All tables have been deleted");
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
