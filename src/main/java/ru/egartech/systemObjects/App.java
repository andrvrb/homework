package ru.egartech.systemObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        // список для хранения сообщений из внешних систем
        List<BaseObjects> baseObjectsList = new ArrayList<>();
        // заполняем список генерируемыми данными
        for (int i=0; i<6; i++) {
            baseObjectsList.add(new ObjectsFactory().createObject(getCodeSystem()));
        }
        // выводим в консоль элементы списка
        for (int i=0; i<baseObjectsList.size(); i++) {
            BaseObjects baseObjects = baseObjectsList.get(i);
            System.out.println("Элемент списка №" + (i+1) + " " + baseObjects.getMarker());
            System.out.println("Название системы: " + baseObjects.nameSystem);
            System.out.println("Тип документа: " + baseObjects.codeTypeDocument);
            System.out.println("Название документа: " + baseObjects.nameDocument);
            System.out.println("Количество страниц документа: " + baseObjects.countPage);
            }
        }
// ----------------------------------------------------------------------------------
    // список для хранения записей Реестра

    // тут надо реализовать хранение обработанных записей из систем А, B, C

// ----------------------------------------------------------------------------------
        /**
         * Генерация кода системы-источника данных (случайное число от 1 до 3)
         * */
        static Integer getCodeSystem() {
            int max = 3, min = 1;
            return new Random().nextInt(max - min + 1) + min;
        }
    }

