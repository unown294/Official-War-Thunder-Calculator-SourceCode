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
public class Vehicle {
    
    
    private int vehicle_ID;
    private int vehicleTypeID;
    private String vehicleName;
    private int linetype_ID;
    private int lineProgressionID;
    private String tier;
    private int rpCost;
    private int lionCost;
    private String imageFileName;
    private int folderValue;
    private String progressionString;

    public Vehicle(int vehicle_ID, int vehicleTypeID, String vehicleName, int linetype_ID, int lineProgressionID, String tier, int rpCost, int lionCost, String imageFileName, int folderValue, String progressionString) {
        this.vehicle_ID = vehicle_ID;
        this.vehicleTypeID = vehicleTypeID;
        this.vehicleName = vehicleName;
        this.linetype_ID = linetype_ID;
        this.lineProgressionID = lineProgressionID;
        this.tier = tier;
        this.rpCost = rpCost;
        this.lionCost = lionCost;
        this.imageFileName = imageFileName;
        this.folderValue = folderValue;
        this.progressionString = progressionString;
    }

    public int getVehicle_ID() {
        return vehicle_ID;
    }

    public int getVehicleTypeID() {
        return vehicleTypeID;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getLinetype_ID() {
        return linetype_ID;
    }

    public int getLineProgressionID() {
        return lineProgressionID;
    }

    public String getTier() {
        return tier;
    }

    public int getRpCost() {
        return rpCost;
    }

    public int getLionCost() {
        return lionCost;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public int getFolderValue() {
        return folderValue;
    }

    public String getProgressionString() {
        return progressionString;
    }
    
    public void setVehicle_ID(int vehicle_ID) {
        this.vehicle_ID = vehicle_ID;
    }

    public void setVehicleTypeID(int vehicleTypeID) {
        this.vehicleTypeID = vehicleTypeID;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setLinetype_ID(int linetype_ID) {
        this.linetype_ID = linetype_ID;
    }

    public void setLineProgressionID(int lineProgressionID) {
        this.lineProgressionID = lineProgressionID;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public void setRpCost(int rpCost) {
        this.rpCost = rpCost;
    }

    public void setLionCost(int lionCost) {
        this.lionCost = lionCost;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public void setFolderValue(int folderValue) {
        this.folderValue = folderValue;
    }

    public void setProgressionString(String progressionString) {
        this.progressionString = progressionString;
    }

}