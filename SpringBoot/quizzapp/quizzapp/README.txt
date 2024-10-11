# Spring Boot Docker Application - quizzapp

## Proje Hakkında
Bu proje, Spring Boot ile geliştirilmiş bir uygulamadır ve Docker kullanılarak konteynerleştirilmiştir. Uygulama, question-quiz methodları ile soru yazma-quiz hazırlama gibi özellikler sağlamaktadır. 
PostgreSql kullanılarak entegre edilmiştir.

## Özellikler
- RESTful API
- Veritabanı entegrasyonu
- Docker ile dağıtım

## Gereksinimler
- Docker (en az 20.10)
- Docker Compose (isteğe bağlı)
- Detaylar için requirement.txt dosyası incelenmelidir.

## Kurulum
- docker pull halilyildiz/quizapp
- docker run -d -p 8109:8080 halilyildiz/quizapp:v1.0 #8080 portunda çalışmazsa 8108 portu denemelidir.


##Postman sorguları
- http://localhost:8109/question7/allQuestions (GET)
- http://localhost:8109/question7/add (POST)
- http://localhost:8109/question7/category/{category} (POST)
- http://localhost:8106/quiz/create?category=General&numQ=5&title=JQuiz (GET)

- Örnek add fonksiyonu body si "{
  "category": "General Knowledge",
  "difficultylevel": "Easy",
  "option1": "Option A",
  "option2": "Option B",
  "option3": "Option C",
  "option4": "Option D",
  "question_title": "What is the capital of France?",
  "right_answer": "Option B"
}
"

