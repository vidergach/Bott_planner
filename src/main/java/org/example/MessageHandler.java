package org.example;

public class MessageHandler {
    public String processUserInput(String userInput, String userId) {
    System.out.println("сообщение: " + userInput + " от: " + userId);
    String outputText = processCommand(userInput);
    System.out.println("Ответ: " + outputText);
    return outputText;
    }

    private String processCommand(String userInput) {
        if ("/start".equals(userInput)) {
            return startMessage();
        } else if ("/help".equals(userInput)) {
            return helpMessage();
        }
        return userInput;
    }

    private String startMessage() {
        return "Добро пожаловать в планировщик задач! \uD83D\uDC31 📝 \n" +
                "Я могу организовывать ваши задачи.\n" +
                "Команды: \n" +
                "/add - добавить задачу\n" +
                "/tasks - показать список задач\n" +
                "/done - отметить выполненной\n" +
                "/dTask - список выполненных задач\n" +
                "/delete - удалить задачу\n" +
                "/help - помощь\n";
    }

    private String helpMessage() {
        return "Справка по работе:\n" +
                "Я планировщик задач😊 📝\n" +
                "Мои команды: \n" +
                "/add - добавить задачу\n" +
                "/tasks - показать список задач\n" +
                "/done - отметить выполненной\n" +
                "/dTask - список выполненных задач\n" +
                "/delete - удалить задачу\n" +
                "/help - помощь\n" +
                "\n" +
                "Например: \n" +
                "/add Полить цветы\n" +
                "- Задача \"Полить цветы\" добавлена!\n\n" +
                "/add Накормить кота\n" +
                "- Задача \"Накормить кота\" добавлена!\n\n" +
                "/add Полить цветы\n" +
                "- Задача \"Полить цветы\" уже есть в списке!\n\n" +
                "/tasks\n" +
                "- Вот список ваших задач:\n" +
                "  1. Полить цветы\n" +
                "  2. Накормить кота\n\n" +
                "/done Полить цветы\n" +
                "- Задача \"Полить цветы\" отмечена выполненной!\n\n" +
                "/dTask\n" +
                "- ✅ Вот список выполненных задач:\n" +
                "  1. Полить цветы ✔\n\n" +
                "/delete Накормить кота\n" +
                "- 🗑️ Задача \"Накормить кота\" удалена из списка задач!";
    }
}

