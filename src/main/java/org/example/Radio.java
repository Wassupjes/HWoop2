package org.example;

public class Radio {
    private int numStation;
    private int volume;
    private int numberOfStations;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public Radio() {

        this.numberOfStations = 10;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getNumStation() {

        return numStation;
    }

    public void setNumStation(int newNumStation) {
        if (newNumStation <= numberOfStations - 1) {
            if (newNumStation >= 0) {
                this.numStation = newNumStation;
            }
        }
    }

    public void next() {
        if (numStation == numberOfStations - 1) {
            numStation = 0;
        } else {
            numStation++;
        }

    }

    public void prev() {
        if (numStation == 0) {
            numStation = numberOfStations - 1;
        } else {
            numStation--;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        } else {
            volume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = minVolume;
        }
    }
}
