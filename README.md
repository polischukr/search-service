# search-service (Сервис поиска постов)

#### ESB -> search-service

### ==Запрос последних постов по интересам==

Параметр запроса interests есть строка из списка интересов,  
перечисленных через запятую без пробелов. Параметры limit и offset отвечают за пагинацию.

req: GET {endpoint}/posts?interests="interest1,interest2,...,interestN"&limit=limit&offset=offset

res: 
```JSON
    [  
        {  
            "id": "postId",  
            "content": "postHTMLContent" 
        },  
        {}  
    ]
```

#### search-service -> ESB (-> content-archive (сервис архива постов))

### ==Запрос постов из архива, если количество требуемых постов в запросе выше больше, чем имеется в elasticsearch==

req: GET {endpoint}/posts?limit=limit&offset=offset

res: 
```JSON
    [  
        {  
            "id": "postId",  
            "content": "postHTMLContent" 
        },  
        {}  
    ]
```