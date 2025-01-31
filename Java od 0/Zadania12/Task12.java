import java.io.*;
import java.util.ArrayList;
import java.util.List;

interface PojazdInfo {
    void pokazInformacje();
}


interface Silnikowy {
    void uruchomSilnik();
}


class Pojazd implements PojazdInfo {