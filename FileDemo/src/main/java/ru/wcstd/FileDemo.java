package ru.wcstd;

import java.io.File;

class FileDemo {
        static void p(String s){
                System.out.println(s);
        }
        public static void main(String args[]){
                File f1 = new File("/Java/COPYRIGHT");
                p("Имя файла: " + f1.getName());
                p("Путь: " + f1.getPath());
                p("Аболютный путь: " + f1.getAbsolutePath());
                p("Родительский каталог: " + f1.getParent());
                p(f1.exists() ? "Существует" : " Не существует");
                p(f1.canWrite() ? "Доступен для записи" : " Не доступен для записи");
                p(f1.canRead() ? " Доступен для чтения" : " Не доступен для чтения");
                p(f1.isDirectory() ? "Является каталогом" : "Неявляется каталогом");
                p(f1.isFile() ? "Является обычным файлом" : "не Является обычным файлом");
                p(f1.isAbsolute() ? "Является абсолютным" : "нк является абсолютным");
                p("Последнее изменение в файле: " + f1.lastModified());
                p("Размер: " + f1.length() + " байт");
        }
}


