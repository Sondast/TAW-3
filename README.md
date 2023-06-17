# TAW-3
Projekt zaliczeniowy z TAW - Java Server + Stream Boot + Postman
Zbigniew Slota

1. Wpisywanie przedmiotów
Metoda: POST
Adres zasobu: http://localhost:8080/subject
Nagłówki: Content-Type: application/json
Request Body:
[
    {
        "name": "Metodologie obiektowe",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": true
    },
    {
        "name": "Testowanie oprogramowania",
        "ectsPoints": 1,
        "classroom": "216",
        "hasExam": false
    },
    {
        "name": "Technologie i aplikacje webowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "name": "Zarządzanie projektem informatycznym",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": false
    },
    {
        "name": "Zaawansowane technologie bazodanowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "name": "Technologie komponentowe i sieciowe",
        "ectsPoints": 2,
        "classroom": "208",
        "hasExam": true
    }
    ]
Odpowiedź:HTTP Code: 200 OK
Body: Added subjects

2. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/subject
Nagłówki: 
Request Body: BRAK
Odpowiedź:
HTTP Code: 200 OK
Body: 
[
    {
        "id": 1,
        "name": "Metodologie obiektowe",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": true
    },
    {
        "id": 2,
        "name": "Testowanie oprogramowania",
        "ectsPoints": 1,
        "classroom": "216",
        "hasExam": false
    },
    {
        "id": 3,
        "name": "Technologie i aplikacje webowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "id": 4,
        "name": "Zarządzanie projektem informatycznym",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": false
    },
    {
        "id": 5,
        "name": "Zaawansowane technologie bazodanowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "id": 6,
        "name": "Technologie komponentowe i sieciowe",
        "ectsPoints": 2,
        "classroom": "208",
        "hasExam": true
    }
]

3. Pobranie przedmiotów, które mają egzamin
Metoda: GET
Adres zasobu: http://localhost:8080/subject?hasExam=true
Nagłówki: 
Request Body: BRAK
Odpowiedź:
HTTP Code: 200 OK
Body: 
[
    {
        "id": 1,
        "name": "Metodologie obiektowe",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": true
    },
    {
        "id": 6,
        "name": "Technologie komponentowe i sieciowe",
        "ectsPoints": 2,
        "classroom": "208",
        "hasExam": true
    }
]

4. Pobranie przedmiotów, które odbywają się w sali 216
Metoda: GET
Adres zasobu: http://localhost:8080/subject?classroom=216
Nagłówki: 
Request Body:
Odpowiedź: HTTP Code: 200 OK
Body: 
[
    {
        "id": 1,
        "name": "Metodologie obiektowe",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": true
    },
    {
        "id": 2,
        "name": "Testowanie oprogramowania",
        "ectsPoints": 1,
        "classroom": "216",
        "hasExam": false
    },
    {
        "id": 4,
        "name": "Zarządzanie projektem informatycznym",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": false
    }
]

5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208
Metoda: GET
Adres zasobu: http://localhost:8080/subject?classroom=208&hasExam=false
Nagłówki: 
Request Body:BRAK
Odpowiedź:HTTP Code: 200 OK
Body: 
[
    {
        "id": 3,
        "name": "Technologie i aplikacje webowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "id": 5,
        "name": "Zaawansowane technologie bazodanowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    }
]

6. Pobranie przedmiotu o identyfikatorze 3
Metoda: GET
Adres zasobu: http://localhost:8080/subject/3
Nagłówki: 
Request Body: BRAK
Odpowiedź: HTTP Code: 200 OK
Body: 
{
    "id": 3,
    "name": "Technologie i aplikacje webowe",
    "ectsPoints": 3,
    "classroom": "208",
    "hasExam": false
}

7. Pobranie przedmiotu o identyfikatorze 15
Metoda: GET
Adres zasobu: http://localhost:8080/subject/15
Nagłówki: 
Request Body: BRAK
Odpowiedź: HTTP Code: 200 OK
Body: BRAK

8. Usunięcie przedmiotu o identyfikatorze 2
Metoda: DELETE
Adres zasobu: http://localhost:8080/subject/2
Nagłówki: 
Request Body: BRAK
Odpowiedź: HTTP Code: 200 OK
Body: Deleted subject with ID: 2

9. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/subject
Nagłówki: 
Request Body: BRAK
Odpowiedź: HTTP Code: 200 OK
Body: 
[
    {
        "id": 1,
        "name": "Metodologie obiektowe",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": true
    },
    {
        "id": 3,
        "name": "Technologie i aplikacje webowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "id": 4,
        "name": "Zarządzanie projektem informatycznym",
        "ectsPoints": 2,
        "classroom": "216",
        "hasExam": false
    },
    {
        "id": 5,
        "name": "Zaawansowane technologie bazodanowe",
        "ectsPoints": 3,
        "classroom": "208",
        "hasExam": false
    },
    {
        "id": 6,
        "name": "Technologie komponentowe i sieciowe",
        "ectsPoints": 2,
        "classroom": "208",
        "hasExam": true
    }
]

10. Usunięcie wszystkich przedmiotów
Metoda: DELETE
Adres zasobu: http://localhost:8080/subject
Nagłówki: 
Request Body: BRAK
Odpowiedź: HTTP Code: 200 OK
Body: Deleted all subjects

11. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/subject
Nagłówki: 
Request Body: BRAK
Odpowiedź:HTTP Code: 200 OK
Body: []
