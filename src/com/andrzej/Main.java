package com.andrzej;

public class Main {

    public static void main(String[] args) {


//create new vehicles based on for loop


    }
}

/*
    Zadanie polega na obiektowym zamodelowaniu i implementacji rdzenia systemu który mógłby zostać łatwo
        rozwinięty i użyty w praktyce. Oto wymagania dotyczące tego projektu - zwróćcie uwagę na brzmienie
        tych wymagań z naciskiem na to co jest opisane, a nie to co nie jest rzeczywistym wymaganiem (nawiązuję
        do przykładu biblioteki, gdzie funkcje dodawania/usuwania książek nie były rzeczywistymi wymaganiami
        opisanymi na początku).

        A więc - tzw. "biznes" przychodzi z "nową wspaniałą wizją" systemu, który będzie:

        - zarządzał flotą pojazdów samochodowych typu:
        - samochód osobowy
        - ciężarówka
        - autobus

        - zarządzanie polegać ma na tym, że system przechowuje wszystkie te pojazdy w swojej
        wewnętrznej bazie danych [hint: nie używamy bazy danych ale listy albo tablice] i
        pozwala poznac szczegoly dotyczace pojazdu przez podanie numeru rejestracyjnego.
        - przez szczegoly pojazdu rozumiemy jego podstawowe parametry, w prototypowym
        systemie bedzie to marka, ciezar i przebieg.
        - pojazdy mozemy do systemu dodawac oraz usuwac
        - mamy możliwość uzyskania informacji o liczbie pojazdów
        - całkowitej
        - w trasie
        - aktualnie w bazie

        - każdy pojazd ma transmiter GSM który podaje aktualną pozycję pojazdu pobraną z
        odbiornika GPS. Informacje pozycyjne z całej floty mają być dostępne dla operatora
        systemu. Załóżmy, że w prototypowym systemie pozycja pojazdu jest wyrażona parą liczb
        (latitude, longitude).
        - chcielibyśmy mieć możliwość uzyskania informacji o adresie pod którym przebywa
        pojazd.

        - każdy pojazd posiada kierowcę
        - system powinien posiadać funkcję odnalezienia aktualnej pozycji pojazdu przez podanie nazwiska
        jego kierowcy.


        Skupcie się na stworzeniu działającego szkieletu - wymyśleniu najbardziej adekwatnych klas
        opisujących naszą domenę i powiązaniu ich ze sobą. Zwróćcie uwagę na to jak podnosicie
        system do pamięci - w jakiej kolejności, jak przekazujecie parametry i czy odbija to dobrze
        rzeczywistość. Bardzo ważne jest nazewnictwo klas oraz struktura pakietów. Prawidłowe użycie
        git'a będzie dużym plusem i umożliwi przekazanie projektu innym zespołom do dalszego rozwijania.
        Nie ma w tym systemie ciężkiej algorytmiki - są przeszukiwania liniowe (ale można zrobić to
        znacznie lepiej i efektywniej!).
        Wysiłek potrzebny szacuję na około 4 godziny.

        Powodzenia!
*/