package org.example;

public class Radio {
    private int numStation;
    private int volume;

    public int getNumStation() {

        return numStation;
    }

    public void setNumStation(int newNumStation) {
        if (newNumStation <= 9) {
            if (newNumStation >= 0) {
                this.numStation = newNumStation;
            }
        }
    }

    public void next() {
        if (numStation == 9) {
            numStation = 0;
        } else {
            numStation++;
        }

    }

    public void prev() {
        if (numStation == 0) {
            numStation = 9;
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
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
