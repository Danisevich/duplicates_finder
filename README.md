# Duplicates Finder
[![Build Status](https://travis-ci.com/Danisevich/duplicates_finder.svg?branch=master)](https://travis-ci.com/Danisevich/duplicates_finder)
[![codecov](https://codecov.io/gh/Danisevich/duplicates_finder/branch/master/graph/badge.svg)](https://codecov.io/gh/Danisevich/duplicates_finder)

Программа для поска файлов-дубликатов в указанной директории.
Выводит в консоль полные адреса файлов-дубликатов, найденных в указанной во входных параметрах директории.


Установка:

1. Ввести в консоли: 
   cd путь_до_каталога_с_папкой_src
   
2. Ввести в консоли 
   mvn install

3. В папке target проекта повявится файл duplicatesFinder.jar


Использование:

1. Запустить файл командой 
   java -jar target/duplicatesFinder.jar -f=директория_для_поиска_дубликатов
   
2. Программа выведет в консоль список найденных дубликатов в указанной директории.
   Дубликаты выводятся попарно через пустую строку.

