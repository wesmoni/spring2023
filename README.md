# Ворошилова Софья
Бизнес-логика
Веб-приложение платформа для продажи и покупки 3D-моделей. Онлайн-магазин, ориентированный на пользователей, которые не имеют возможности продавать свои модели и покупать другие на иностранных платформах ввиду санкций. В этом приложении буду реализованы следующие функции:

Для пользователя-продавца:
- Карточка модели. Если атвор собирается продавать свои модели, ему нужно максимально полно и понятно (как для пользователя, так и для алгоритмов приложения) описать модель. Там будет полное описание модели, о чем будет сказано ниже.
- Загрузка модели в нескольких форматах. Форматы будут варьироваться от того, какое ПО для моделирования использвует автор. Чем меньше форматов, тем хуже для автора моделей. 
- Загрузка фото для обложки товара. Это нужно для того, чтобы пользователь-покупатель точно понимал все преимущества и недостатки конкретной модели. Также это помогает уменьшить число запросов на возврат средств по причине "в карточке не было указано *вставить характеристику*". Экстра-вариант - добавить к фото еще и видео-обложку и фото с возможностью прокрутки в 360 градусов.
- Выставление цены и выбор валюты (для получения). Так как эта платформа планируется для пользователей из стран СНГ, то изначально валютой будет рубль, а затем по возможности будут добавлены и другие.
- Возможность описания модели. Краткое описание модели обычным текстом и далее заполнение некого подобия анкеты, где будут указаны соответствующие параметры: совместимость модели, полигональность, размеры и тд. Это попогает как при поиске покупателем, так и определении пожходящих моделей в блоке с похожими моделями.
  
Для пользователя-покупателя:
- Возможность поиска моделей по названию и другим характеристикам (фильтр). Это сделано для более быстрого и удобного поиска моделей. Также в карточке модели, в отдельном блоке будут указаны работы этого автора. 
- Возможность выбор валюты (для оплаты). Также из-за того, что пользователи (в основном) будут из стран СНГ, рубль будет изначальной валютой, далее будут добавлены остальныею.
- Лист с “Избранным” (понравившиеся модели). Модели, которые запали в сердце, но нет возможности купить или же нет подходящего проекта для них. Также тут возможно использования куки для определения того, какие модели нравятся пользователю и далее предложения ему же похожих моделей.
- “Корзина” для покупки. Пользователь скидывает в корзину модели, которые хочет купить, чтобы не оплачивать по одной, а купить все сразу. Это также помогает пользователю тратить больше средств на платформе. 
