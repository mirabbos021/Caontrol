package org.example.bot;


import org.example.repository.UserRepository;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Controle extends TelegramLongPollingBot {
    private UserRepository userRepository;
    String step="/start";

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            Message message = update.getMessage();
            Long chatId = update.getMessage().getChatId();

            if (message.hasText()){
                String text = message.getText();
                if (text.equals(BotStep.BOT_START)){

                }
            }


        }
    }


    @Override
    public String getBotUsername() {
        return "kelish_ketish_bot";
    }

    @Override
    public String getBotToken() {
        return "6421915909:AAFsY1PhJsb9denUaZrJzQ3ghAWsM3Vfh8M";
    }
}
