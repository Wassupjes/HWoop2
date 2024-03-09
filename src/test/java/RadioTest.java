import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumStation() {
        Radio radio = new Radio();

        radio.setNumStation(3);

        int expected = 3;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStationBelowZero() {
        Radio radio = new Radio();

        radio.setNumStation(-1);

        int expected = 0;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumStationAboveNine() {
        Radio radio = new Radio();

        radio.setNumStation(10);

        int expected = 0;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lastSetNumStation() {
        Radio radio = new Radio();

        radio.setNumStation(9);

        int expected = 9;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void initialSetNumStation() {
        Radio radio = new Radio();

        radio.setNumStation(0);

        int expected = 0;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumStation() {
        Radio radio = new Radio();
        radio.setNumStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumStationFromNineToZero() {
        Radio radio = new Radio();
        radio.setNumStation(9);

        for (int i = 0; i < 1; i++) {
            radio.next();
        }

        int expected = 0;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumStation() {
        Radio radio = new Radio();
        radio.setNumStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumStationFromZeroToNine() {
        Radio radio = new Radio();
        radio.setNumStation(0);

        for (int i = 0; i < 1; i++) {
            radio.prev();
        }

        int expected = 9;
        int actual = radio.getNumStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToOne() {
        Radio radio = new Radio();

        for (int i = 0; i < 1; i++) {
            radio.increaseVolume();
        }

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToNintyNine() {
        Radio radio = new Radio();

        for (int i = 0; i < 99; i++) {
            radio.increaseVolume();
        }

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveHundred() {
        Radio radio = new Radio();

        for (int i = 0; i < 101; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowZero() {
        Radio radio = new Radio();

        for (int i = 0; i < 1; i++) {
            radio.decreaseVolume();
        }

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeByTen() {
        Radio radio = new Radio();

        for (int i = 0; i < 15; i++) {
            radio.increaseVolume();
        }

        for (int i = 0; i < 10; i++) {
            radio.decreaseVolume();
        }

        int expected = 5;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMinVolume() {
        Radio radio = new Radio();

        radio.getMinVolume();

        int expected = 0;
        int actual = radio.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxVolume() {
        Radio radio = new Radio();

        radio.getMaxVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberOfStations() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(10, radio.getNumberOfStations());
    }
}

