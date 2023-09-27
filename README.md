## Необходимо реализовать:
1. Интерфейс ActorBehavoir, который будет содержать описание возможных
действий актора в очереди/магазине 
2. Абстрактный класс Actor, который хранит в себе параметры актора, включая
состояние готовности сделать заказ и факт получения заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract
3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

Необходимо реализовать строение классов, без конкретной реализации:
1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа
2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей,
обновление состояния магазина
3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах

## HW
Реализовать класс Market и все методы, которые он обязан реализовывать.
Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)

Формат сдачи: ссылка на гитхаб проект


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
