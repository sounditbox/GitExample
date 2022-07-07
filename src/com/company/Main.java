package com.company;

public class Main {

    public static void main(String[] args) {
        // красный - not tracked файл не отслеживается для коммита
        // зелёный - new         файл (строчка) был добавлен
        // синий   - changed     файл (строчка) был изменён
        // жёлтый  - ignored     файл игнорируется
        Greeter.talk();
    }
}
