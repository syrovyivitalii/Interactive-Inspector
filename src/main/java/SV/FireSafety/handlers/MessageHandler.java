package SV.FireSafety.handlers;

import SV.FireSafety.messagesender.MessageSender;
import SV.FireSafety.services.InlineButton;
import SV.FireSafety.services.InstructionExtinguisher;
import SV.FireSafety.services.Variables;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;

import java.util.Optional;
import java.util.Scanner;

@Component
public class MessageHandler implements Handler<Message> {
    //конструктор класу MessageSender
    private final MessageSender messageSender;
    public MessageHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    //екземпляри класів
    InstructionExtinguisher instructionExtinguisher = new InstructionExtinguisher();
    InlineButton inlineButton = new InlineButton();
    Variables variables = new Variables();

    @Override
    public void choose(Message message) {
        System.out.println(message.getText());
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        if (message.hasText() && message.hasEntities()) {
            Optional<MessageEntity> comandEntity = message.getEntities().stream()
                    .filter(e -> "bot_command".equals(e.getType())).findFirst();
            if (comandEntity.isPresent()) {
                String command = message.getText().substring(comandEntity.get().getOffset(),
                        comandEntity.get().getLength());
                switch (command) {
                    case "/start":
                        String text = "Вітаю! Я чат-бот Fire Safety Bot \uD83C\uDDFA\uD83C\uDDE6 \n Для початку роботи скористайтеся командами бота👇";
                        sendMessage.setText(text);
                        messageSender.sendMessage(sendMessage);
                        return;
                    case "/on_start":
                        sendMessage.setText("🇺🇦 Для початку роботи повторно скористайтеся командами бота Fire Safety Bot 👇");
                        messageSender.sendMessage(sendMessage);
                        return;
                    // розпочинає роботу вогнегасника + виводить інструкцію
                    case "/type_number_fire_extinguishers":
                        variables.setComandOfMenu("/type_number_fire_extinguishers");
                        sendMessage.setText("Я підсистема Extinguisher Bot \uD83C\uDDFA\uD83C\uDDE6 \n Допоможу вибрати тип та необхідну кількість вогнегасників \uD83E\uDDEF \n\n Для початку роботи натисніть <Розпочати> \n\n \uD83D\uDCDA Для ознайомлення з інструкцією користувача скористайтесь відповідним меню");
                        sendMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherStartKeyboard());
                        messageSender.sendMessage(sendMessage);
                        variables.data.clear();
                        variables.setTypePremises(null);
                        variables.setCategoryPremises(null);
                        variables.setClassFire(null);
                        variables.setTypeExtinguisher(null);
                        variables.setTypeSpacesBuild(null);
                        variables.setB1(false);
                        variables.setB2(false);
                        variables.setCharacteristicsObject(null);
                        variables.setTypeObjectOfRisk(null);
                        variables.setTypeStateOwnedObject(null);
                        variables.setTypeCulturalObject(null);
                        variables.setTypeIndustrialStorageFacility(null);
                        variables.setLevelEmergency(null);
                        variables.setTypeResultDegreeRisk(null);
                        return;
                    // визначення ступення ризику
                    case "/degree_of_risk_from_activities":
                        variables.setComandOfMenu("/degree_of_risk_from_activities");
                        sendMessage.setText("Я підсистема Degree of subject risk Bot \uD83C\uDDFA\uD83C\uDDE6 \n Допоможу визначити ступніть ризику від провадження господарської діяльності \uD83D\uDD25 \n\n Для початку роботи натисніть <Розпочати> \n\n \uD83D\uDCDA Для ознайомлення з інструкцією користувача скористайтесь відповідним меню");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskStartKeyboard());
                        messageSender.sendMessage(sendMessage);
                        variables.data.clear();
                        variables.setTypePremises(null);
                        variables.setCategoryPremises(null);
                        variables.setClassFire(null);
                        variables.setTypeExtinguisher(null);
                        variables.setTypeSpacesBuild(null);
                        variables.setB1(false);
                        variables.setB2(false);
                        variables.setCharacteristicsObject(null);
                        variables.setTypeObjectOfRisk(null);
                        variables.setTypeStateOwnedObject(null);
                        variables.setTypeCulturalObject(null);
                        variables.setTypeIndustrialStorageFacility(null);
                        variables.setLevelEmergency(null);
                        variables.setTypeResultDegreeRisk(null);
                        return;
                    case "/feedback_info":
                        sendMessage.setText(instructionExtinguisher.feedback());
                        messageSender.sendMessage(sendMessage);
                        return;
                    default:
                        sendMessage.setText("Зазначено не коректні дані: " + message.getText() + " Спробуйте ще раз!");
                        messageSender.sendMessage(sendMessage);
                }
                }
        }
        if (message.hasText()){ //якщо введено текст, перевірка чи це значення
            String messageText = message.getText();

            Scanner sc = new Scanner(message.getText());
            if (sc.hasNextDouble()) {
                sendMessage.setText("Надіслані дані збережено: " + messageText);
                variables.data.add(messageText);
                messageSender.sendMessage(sendMessage);
            }else{
                sendMessage.setText("Зазначено не коректні дані: " + messageText + " Спробуйте ще раз!");
                messageSender.sendMessage(sendMessage);
            }
        }else {
            sendMessage.setText("Помилка");
            messageSender.sendMessage(sendMessage);
        }

    }
}
