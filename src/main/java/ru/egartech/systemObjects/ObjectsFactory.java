package ru.egartech.systemObjects;

public class ObjectsFactory {
    public BaseObjects createObject(Integer codeSystem) {
        switch (codeSystem) {
        case 1:
            return new objectFromSystemA("1", "info1_ObjectSystemA", "info1_ObjectSystemA");
        case 2:
            return new objectFromSystemB();
        case 3:
            return new objectFromSystemC();
        default:
            throw new RuntimeException("нет данных для обработки");
        }

    }
}
