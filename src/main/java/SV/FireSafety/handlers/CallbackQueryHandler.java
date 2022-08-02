package SV.FireSafety.handlers;

import SV.FireSafety.messagesender.MessageSender;
import SV.FireSafety.services.*;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.ParseMode;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;


@Component
public class CallbackQueryHandler implements Handler<CallbackQuery> {

    //конструктор класу MessageSender
    private final MessageSender messageSender;

    public CallbackQueryHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    //екземпляри класів
    InstructionExtinguisher instructionExtinguisher = new InstructionExtinguisher();
    InlineButton inlineButton = new InlineButton();
    Variables variables = new Variables();

    //
    String s2 = null;
    String s3 = null;
    String s4 = null;
    String s5 = null;
    String s7 = null;
    String s8 = null;
    String s9 = null;
    String s10 = null;

    @Override
    public void choose(CallbackQuery callbackQuery) {
        //надіслати нове повідомлення в конкретний чат
        Message message = callbackQuery.getMessage();
        SendMessage sendMessage = new SendMessage();
        sendMessage.setParseMode(ParseMode.HTML);
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        //надіслати друге повідомлення
        SendMessage sendSecondMessage = new SendMessage();
        sendSecondMessage.setParseMode(ParseMode.HTML);
        sendSecondMessage.setChatId(String.valueOf(message.getChatId()));
        //тип та необхідність вогнегасників
        switch (callbackQuery.getData()) {
            case "Розпочати":
                if (variables.getComandOfMenu() == "/type_number_fire_extinguishers") {
                    sendMessage.setText("1. Оберіть тип приміщення/об'єкту");
                    sendMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypesKeyboard());
                }else if (variables.getComandOfMenu() == "/degree_of_risk_from_activities"){
                    sendMessage.setText("1. Оберіть характеристику об’єкта");
                    sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskTechnicalPremisesKeyboard());
                }
                messageSender.sendMessage(sendMessage);
                break;
            case "Інструкція":
                sendMessage.setText(instructionExtinguisher.instruction());
                messageSender.sendMessage(sendMessage);
                break;
            case "Виробничі/складські":
                s2 = "Обрано: Виробничі (складські) приміщення";
                sendMessage.setText(s2);
                variables.setTypePremises("Виробничі_складські");
                sendSecondMessage.setText("2. Надішліть площу приміщення/поверху (м.кв.) та оберіть категорію приміщення за вибухопожежною та пожежною небезпекою (порядковість не має значення)");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherCategoryPremissesKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія А":
                s3 = "Обрано: приміщення категорії А";
                sendMessage.setText(s3);
                variables.setCategoryPremises("Категорія А");
                sendSecondMessage.setText("3. Оберіть клас можливої пожежі");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForA_Б_В1_ГKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія Б":
                s3 = "Обрано: приміщення категорії Б";
                sendMessage.setText(s3);
                variables.setCategoryPremises("Категорія Б");
                sendSecondMessage.setText("3. Оберіть клас можливої пожежі");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForA_Б_В1_ГKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія В":
                s3 = "Обрано: приміщення категорії В";
                sendMessage.setText(s3);
                variables.setCategoryPremises("Категорія В");
                sendSecondMessage.setText("2.1. Зазначте чи наявні в приміщенні виробництва (складському примішенні) горючі рідини та гази");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForBKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "наявні горючі рідини та гази":
                s3 = "Обрано: приміщення категорії В з наявністю горючих рідин та газів";
                variables.setCategoryPremises("Категорія В з ГГ");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForA_Б_В1_ГKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "відсутні горючі рідини та гази":
                s3 = "Обрано: приміщення категорії В за відсутності горючих рідин та газів";
                variables.setCategoryPremises("Категорія В без ГГ");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForB2_ДKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "Категорія Г":
                s3 = "Обрано: приміщення категорії Г";
                sendMessage.setText(s3);
                variables.setCategoryPremises("Категорія Г");
                sendSecondMessage.setText("3. Оберіть клас можливої пожежі");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForA_Б_В1_ГKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія Д":
                s3 = "Обрано: приміщення категорії Д";
                sendMessage.setText(s3);
                variables.setCategoryPremises("Категорія Д");
                sendSecondMessage.setText("3. Оберіть клас можливої пожежі");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherFireClassForB2_ДKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Клас ймовірної пожежі A":
                s4 = "Обрано: клас ймовірної пожежі A";
                sendMessage.setText(s4);
                variables.setClassFire("Клас пожежі A");
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeExtinguisherForClassAKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Клас ймовірної пожежі B":
                s4 = "Обрано: клас ймовірної пожежі B";
                sendMessage.setText(s4);
                variables.setClassFire("Клас пожежі B");
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeExtinguisherForClassВKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Клас ймовірної пожежі C":
                s4 = "Обрано: клас ймовірної пожежі C";
                sendMessage.setText(s4);
                variables.setClassFire("Клас пожежі C");
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeExtinguisherForClassC_DKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Клас ймовірної пожежі D":
                s4 = "Обрано: клас ймовірної пожежі D";
                sendMessage.setText(s4);
                variables.setClassFire("Клас пожежі D");
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeExtinguisherForClassC_DKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Клас ймовірної пожежі F":
                s4 = "Обрано: клас ймовірної пожежі F";
                sendMessage.setText(s4);
                variables.setClassFire("Клас пожежі F");
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeExtinguisherForClassFKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Клас ймовірної пожежі E":
                s4 = "Обрано: клас ймовірної пожежі E";
                sendMessage.setText(s4);
                variables.setClassFire("Клас пожежі E");
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeExtinguisherForClassEKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Порошковий":
                s5 = "Обрано: порошковий вогнегасник";
                sendMessage.setText(s5);
                variables.setTypeExtinguisher("порошковий");
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText(result());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Водопінний":
                s5 = "Обрано: водопінний вогнегасник";
                sendMessage.setText(s5);
                variables.setTypeExtinguisher("водопінний");
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText(result());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Водяний":
                s5 = "Обрано: водяний вогнегасник";
                sendMessage.setText(s5);
                variables.setTypeExtinguisher("водяний");
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText(result());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Газовий":
                s5 = "Обрано: газовий вогнегасник";
                sendMessage.setText(s5);
                variables.setTypeExtinguisher("газовий");
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText(result());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Громадські":
                s2 = "Обрано: Громадські приміщення (у т.ч. об'єкти адміністративного, побутового та торгівельного призначення)";
                sendMessage.setText(s2);
                variables.setTypePremises("Громадські");
                sendSecondMessage.setText("2. Надішліть площу приміщення/поверху (м.кв.) та оберіть тип громадської будівлі/приміщення (порядковість не має значення): ");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypeSpacesKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Адміністративні будівлі":
                s7 = "Обрано: адміністративні будівлі/приміщення";
                variables.setTypeSpacesBuild("адміністративні");
                sendMessage.setText(s7);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("3. Чи використовується в досліджуваному приміщенні оргтехніка?");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherOfficeEquipmentKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Будівлі побутового призначення":
                s7 = "Обрано: приміщення побутового призначення";
                variables.setTypeSpacesBuild("побутові");
                sendMessage.setText(s7);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("3. Оберіть тип  побутового приміщення: ");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherPreparingFoodKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Підприємства торгівлі":
                s7 = "Обрано: тогрівельні приміщення";
                variables.setTypeSpacesBuild("торгівельні");
                sendMessage.setText(s7);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("3. Чи використовується в досліджуваному приміщенні оргтехніка?");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherOfficeEquipmentKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Офісні приміщення":
                s7 = "Обрано: офісні приміщення";
                variables.setTypeSpacesBuild("офісні");
                sendMessage.setText(s7);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("3. Чи використовується в досліджуваному приміщенні оргтехніка?");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherOfficeEquipmentKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Архіви, бібліотеки, музеї":
                s7 = "Обрано: архіви, бібліотеки, музеї";
                variables.setTypeSpacesBuild("архіви");
                sendMessage.setText(s7);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("3. Чи використовується в досліджуваному приміщенні оргтехніка?");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherOfficeEquipmentKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Так, використовується":
                s8 = "Обрано: в приміщеннях використовується оргтехніка";
                variables.setB1(true);
                sendMessage.setText(s8);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherForPublicPremisesKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Ні, не використовується":
                s8 = "Обрано: в приміщеннях не використовується оргтехніка";
                variables.setB1(false);
                sendMessage.setText(s8);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherForPublicPremisesKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Приміщення для приготування їжі":
                s8 = "Обрано: приміщення для приготування їжі";
                variables.setKitchen("кухні");
                sendMessage.setText(s8);
                messageSender.sendMessage(sendMessage);
                sendMessage.setText("\"4. Вкажіть кількість окремих робочих місць де в технологічному процесі приготування їжі застосовуються рослинні або тваринні масла і жири. Пілся - оберіть тип вогнегасника \uD83E\uDDEF: \"");
                sendSecondMessage.setText("5. Оберіть необхідний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherForKitchenKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Інші побутові приміщення":
                s8 = "Обрано: в приміщеннях відсутні технологічні процеси приготування їжі";
                sendMessage.setText(s8);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("4. Оберіть бажаний/наявний тип вогнегасника");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherForPublicPremisesKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Водяний для кухні":
                sendMessage.setText("7. Чи передбачені в досліджуваних приміщеннях комори, електрощитові, вентиляційні камери або інші технічні приміщення?");
                sendMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTechnicalАcilitiesKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "Так, передбачені":
                s9 = "Обрано: наявні технічні приміщення (у т.ч. комори, електрощитові тощо)\n";
                sendMessage.setText(s9);
                variables.setB2(true);
                messageSender.sendMessage(sendMessage);
                sendSecondMessage.setText("8. Надішліть загальну площу технічних приміщень (м.кв.) після чого натисніть \"Розрахувати\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherCalculateKeyboard());
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Ні, не передбачені":
                sendMessage.setText("Технічні приміщення відсутні. Додаткового остащення вогнегасниками не потребується");
                messageSender.sendMessage(sendMessage);
                break;
            case "Розрахувати":
                if (variables.getTypePremises() == "Гаражі") {
                    sendMessage.setText(result());
                    messageSender.sendMessage(sendMessage);
                } else {
                    PublicPremises pp = new PublicPremises();
                    sendMessage.setText(pp.quantityExtinguisherTekhPrym());
                    messageSender.sendMessage(sendMessage);
                }
                break;
            case "Житлові":
                s2 = "Обрано: Житлові приміщення";
                sendMessage.setText(s2);
                variables.setTypePremises("Житлові");
                sendSecondMessage.setText("2. Оберіть різновид житлового приміщення");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherTypesLivingKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Квартири":
                s10 = "Обрано: квартири багатоквартирних житлових будинків";
                sendMessage.setText(result());
                messageSender.sendMessage(sendMessage);
                break;
            case "Гуртожитки":
                s10 = "Обрано: кімната/секція/блок гуртожитку";
                sendMessage.setText(result());
                messageSender.sendMessage(sendMessage);
                break;
            case "Будинки індивідуальної забудови":
                s10 = "Обрано: житлові будинки індивідуальної забудови";
                sendMessage.setText(result());
                messageSender.sendMessage(sendMessage);
                break;
            case "Гаражі/автомайстерні":
                s2 = "Обрано: Приміщення автогаражів, автостоянок та/або автомайстерень";
                sendMessage.setText(s2);
                variables.setTypePremises("Гаражі");
                sendSecondMessage.setText("2. Надішліть кількість місць стоянки автомобілів у боксі (гаражі, стоянці) після чого натисніть \"Розрахувати\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineFireExtinguisherCalculateKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            //кейси, що відповідають за роботу бота - визначення ступеня ризику
            case "Об’єкт що експлуатується":
                s2 = "Обрано: об'єкт експлуатується";
                sendMessage.setText(s2);
                variables.setCharacteristicsObject("експлуатується");
                sendSecondMessage.setText("2. Оберіть тип об’єкта (з запропонованого переліку):\n" +
                        "\n" +
                        "2.1. Об’єкт підвищеної небезпеки\n" +
                        "2.2. Об’єкт державної власності, що має стратегічне значення для економіки і безпеки держави\n" +
                        "2.3. Об’єкт метрополітену\n" +
                        "2.4. Об’єкт, включений до Державного реєстру нерухомих пам’яток\n" +
                        "2.5. Промисловий або складський об’єкт\n" +
                        "2.6. Інший об’єкт");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskDataEntryKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Об’єкт на стадії будівництва":
                s2 = "Обрано: об'єкт на стадії будівництва";
                variables.setCharacteristicsObject("проєктується");
                sendMessage.setText(s2);
                sendSecondMessage.setText("2. Вкажіть масштаб небезпечних подій, надзвичайних ситуацій, які сталися на об’єкті протягом останніх п’ять років:\n" +
                        "\n" +
                        "2.1. Надзвичайна ситуація державного рівня\n" +
                        "2.2. Надзвичайна ситуація регіонального рівня\n" +
                        "2.3. Надзвичайна ситуація місцевого рівня\n" +
                        "2.4. Надзвичайна ситуація об’єктового рівня\n" +
                        "2.5. Небезпечна подія, що не класифікується як надзвичайна ситуація\n" +
                        "2.6. Надзвичайних ситуацій та небезпечних подій за останні 5 років не виникало");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskScaleOfEmergenciesDesigningBuildingKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "2.1":
                s3 = "Обрано: Об’єкт підвищеної небезпеки";
                variables.setTypeObjectOfRisk("об'єкт підвищеної небезпеки");
                sendMessage.setText(s3);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "2.2":
                s3 = "Обрано: Об’єкт державної власності, що має стратегічне значення для економіки і безпеки держави";
                variables.setTypeObjectOfRisk("об'єкт стратегічного значення");
                sendMessage.setText(s3);
                sendSecondMessage.setText("3. Оберіть різновид об’єкта (з запропонованого переліку):\n" +
                        "\n" +
                        "3.1. Об’єкт сфери оборони \n" +
                        "3.2. Об’єкт паливно-енергетичного комплексу\n" +
                        "3.3. Об’єкт транспортної галузі \n" +
                        "3.4. Об’єкт підприємств, що забезпечують розміщення і зберігання матеріальних цінностей державного резерву \n" +
                        "3.5. Об’єкт агропромислового комплексу \n" +
                        "3.6. Об’єкт сфери електронних комунікацій та зв’язку \n" +
                        "3.7. Об’єкт авіаційної та ракетно-космічної промисловості \n" +
                        "3.8. Об’єкт машинобудівної промисловості \n" +
                        "3.9. Об’єкт металургійного комплексу \n" +
                        "3.10. Об’єкт хімічного комплексу \n" +
                        "3.11. Об’єкт наукової діяльності \n" +
                        "3.12. Об’єкт сфери стандартизації, метрології та сертифікації \n" +
                        "3.13. Об’єкт гідрометеорологічної діяльності \n" +
                        "3.14. Об’єкт промисловості будівельних матеріалів \n" +
                        "3.15. Об’єкт фінансово-бюджетної сфери \n" +
                        "3.16. Об’єкт харчової промисловості \n" +
                        "3.17. Об’єкт легкої промисловості \n" +
                        "3.18. Об’єкт поліграфії \n" +
                        "3.19. Об’єкт геологорозвідувальної галузі");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskStateOwnedObjectKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "2.3":
                s3 = "Обрано: Об’єкт метрополітену";
                variables.setTypeObjectOfRisk("об’єкт метрополітену");
                sendMessage.setText(s3);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\"\n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "2.4":
                s3 = "Обрано: Об’єкт, включений до Державного реєстру нерухомих пам’яток";
                variables.setTypeObjectOfRisk("нерухома пам’ятка");
                sendMessage.setText(s3);
                sendSecondMessage.setText("3. Оберіть різновид об’єкта (з запропонованого переліку):\n" +
                        "\n" +
                        "3.1. Пам’ятка культурної спадщини національного значення \n" +
                        "3.2. Пам’ятка культурної спадщини місцевого значення");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectsCulturalHeritageKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "2.5":
                s3 = "Обрано: Промисловий або складський об’єкт";
                variables.setTypeObjectOfRisk("промисловий або складський об’єкт");
                sendMessage.setText(s3);
                sendSecondMessage.setText("3. Оберіть різновид об’єкта:");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskIndustrialWarehouseObjectsKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Промисловий об’єкт":
                s4 = "Обрано: Промисловий об’єкт";
                variables.setTypeIndustrialStorageFacility("промисловий об'єкт");
                sendMessage.setText("4. Оберіть категорію приміщення за вибухопожежною та пожежною небезпекою");
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskCategoryPremisesKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "Складський об’єкт":
                s4 = "Обрано: Складський об’єкт";
                variables.setTypeIndustrialStorageFacility("складський об’єкт");
                sendMessage.setText("4. Оберіть категорію приміщення за вибухопожежною та пожежною небезпекою");
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskCategoryPremisesKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "Категорія приміщення А":
                s3 = "Обрано: приміщення категорії А";
                variables.setCategoryPremises("Категорія А");
                sendMessage.setText(s3);
                sendSecondMessage.setText("\"Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія приміщення Б":
                s3 = "Обрано: приміщення категорії Б";
                variables.setCategoryPremises("Категорія Б");
                sendMessage.setText(s3);
                sendSecondMessage.setText("\"Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія приміщення В":
                s3 = "Обрано: приміщення категорії В";
                variables.setCategoryPremises("Категорія В");
                sendMessage.setText(s3);
                sendSecondMessage.setText("\"Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія приміщення Г":
                s3 = "Обрано: приміщення категорії Г";
                variables.setCategoryPremises("Категорія Г");
                sendMessage.setText(s3);
                sendSecondMessage.setText("\"Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Категорія приміщення Д":
                s3 = "Обрано: приміщення категорії Д";
                variables.setCategoryPremises("Категорія Д");
                sendMessage.setText(s3);
                sendSecondMessage.setText("\"Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "2.6":
                s3 = "Обрано: Інші об’єкти";
                variables.setTypeObjectOfRisk("інші об’єкти");
                sendMessage.setText(s3);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\"\n" +
                        "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "Далі":
                if (variables.getCharacteristicsObject() == "експлуатується") {
                    if ((variables.getData().size() == 4 && variables.getLevelEmergency() == "НС державного рівня") // приймає порушення які були усунуті
                            || (variables.getData().size() == 5 && variables.getLevelEmergency() == "НС регіонального рівня")
                            || (variables.getData().size() == 7 && variables.getLevelEmergency() == "НС місцевого рівня")
                            || (variables.getData().size() == 8
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС"))
                            || (variables.getData().size() == 4 && variables.getLevelEmergency() == "без НС")) {
                        sendMessage.setText("Введіть кількість порушень вимог законодавства у сфері техногенної та пожежної безпеки пов’язаних з експлуатацією об’єкта \n" +
                                "УСУНЕНИХ за останніх 5 років. Натисніть \"Далі\" \n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                    if ((variables.getData().size() == 5 && variables.getLevelEmergency() == "НС державного рівня") // приймає порушення які НЕ були усунуті
                            || (variables.getData().size() == 6 && variables.getLevelEmergency() == "НС регіонального рівня")
                            || (variables.getData().size() == 8 && variables.getLevelEmergency() == "НС місцевого рівня")
                            || (variables.getData().size() == 9
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС"))
                            || (variables.getData().size() == 5 && variables.getLevelEmergency() == "без НС")) {
                        sendMessage.setText("Введіть кількість порушень вимог законодавства у сфері техногенної та пожежної безпеки пов’язаних з експлуатацією \n" +
                                "об’єкта, які НЕ БУЛО УСУНЕНО за останніх 5 років . Натисніть \"Далі\" \n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                    if ((variables.getData().size() == 6 && variables.getLevelEmergency() == "НС державного рівня") // перевірє умову для виклику на виконання методу з результатом
                            || (variables.getData().size() == 7 && variables.getLevelEmergency() == "НС регіонального рівня")
                            || (variables.getData().size() == 9 && variables.getLevelEmergency() == "НС місцевого рівня")
                            || (variables.getData().size() == 10
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС"))
                            || (variables.getData().size() == 6 && variables.getLevelEmergency() == "без НС")) {

                        sendMessage.setText(resultDegreeRisk());
                        messageSender.sendMessage(sendMessage);
                    }
                    if (variables.getData().size() == 1) {
                        sendMessage.setText("Введіть максимальну розрахункову (проектну) кількість людей, які ПОСТІЙНО перебувають на об’єкті (осіб) та натисніть \"Далі\" \n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    } else if (variables.getData().size() == 2) {
                        sendMessage.setText("Введіть максимальну розрахункову (проектну) кількість людей, які ПЕРІОДИЧНО перебувають на об’єкті (осіб) та натисніть \"Далі\" \n"
                                + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    } else if (variables.getData().size() == 3) {
                        sendMessage.setText("Введіть значення умовної висоти об’єкта (м.) (визначається різницею позначок найнижчого рівня проїзду (встановлення)"
                                + " пожежних автодрабин (автопідйомників) і підлоги верхнього поверху без урахування верхніх технічних поверхів, "
                                + "якщо на технічних поверхах розміщено лише інженерні обладнання та комунікації будинку). Натисніть \"Далі\" \n"
                                + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                    if (variables.getData().size() == 4 && variables.getLevelEmergency() == null && variables.getCharacteristicsObject() == "експлуатується") {
                        // виводить меню із введенням значень небезпечних подій (ситуацій), що ставались на об'єкті
                        if (variables.getTypeObjectOfRisk() == "об'єкт підвищеної небезпеки" || variables.getTypeObjectOfRisk() == "об’єкт метрополітену"
                                || variables.getTypeObjectOfRisk() == "інші об’єкти") {
                            sendMessage.setText("3. Вкажіть масштаб небезпечних подій, надзвичайних ситуацій, які сталися на об’єкті протягом останніх п’ять років:\n" +
                                    "\n" +
                                    "3.1. Надзвичайна ситуація державного рівня\n" +
                                    "3.2. Надзвичайна ситуація регіонального рівня\n" +
                                    "3.3. Надзвичайна ситуація місцевого рівня\n" +
                                    "3.4. Надзвичайна ситуація об’єктового рівня\n" +
                                    "3.5. Небезпечна подія, що не класифікується як надзвичайна ситуація\n" +
                                    "3.6. Надзвичайних ситуацій та небезпечних подій за останні 5 років не виникало");
                            sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskDangerousEventsKeyboard());
                            messageSender.sendMessage(sendMessage);
                        } else if (variables.getTypeObjectOfRisk() == "об'єкт стратегічного значення" || variables.getTypeObjectOfRisk() == "нерухома пам’ятка") {
                            sendMessage.setText("4. Вкажіть масштаб небезпечних подій, надзвичайних ситуацій, які сталися на об’єкті протягом останніх п’ять років:\n\n" +
                                    "4.1. Надзвичайна ситуація державного рівня\n" +
                                    "4.2. Надзвичайна ситуація регіонального рівня\n" +
                                    "4.3. Надзвичайна ситуація місцевого рівня\n" +
                                    "4.4. Надзвичайна ситуація об’єктового рівня\n" +
                                    "4.5. Небезпечна подія, що не класифікується як надзвичайна ситуація\n" +
                                    "4.6. Надзвичайних ситуацій та небезпечних подій за останні 5 років не виникало\n");
                            sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskScaleOfEmergenciesStrategicKeyboard());
                            messageSender.sendMessage(sendMessage);
                        } else if (variables.getTypeObjectOfRisk() == "промисловий або складський об’єкт") {
                            sendMessage.setText("5. Вкажіть масштаб небезпечних подій, надзвичайних ситуацій, які сталися на об’єкті протягом останніх п’ять років:\n\n"
                                    + "5.1. Надзвичайна ситуація державного рівня\n"
                                    + "5.2. Надзвичайна ситуація регіонального рівня\n"
                                    + "5.3. Надзвичайна ситуація місцевого рівня\n"
                                    + "5.4. Надзвичайна ситуація об’єктового рівня\n"
                                    + "5.5. Небезпечна подія, що не класифікується як надзвичайна ситуація\n"
                                    + "5.6. Надзвичайних ситуацій та небезпечних подій за останні 5 років не виникало\n");
                            sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskScaleOfEmergenciesIndustrialKeyboard());
                            messageSender.sendMessage(sendMessage);
                        } else if (variables.getCharacteristicsObject() == "проєктується") {
                            sendMessage.setText("2. Вкажіть масштаб небезпечних подій, надзвичайних ситуацій, які сталися на об’єкті протягом останніх п’ять років:\n\n"
                                    + "2.1. Надзвичайна ситуація державного рівня\n"
                                    + "2.2. Надзвичайна ситуація регіонального рівня\n"
                                    + "2.3. Надзвичайна ситуація місцевого рівня\n"
                                    + "2.4. Надзвичайна ситуація об’єктового рівня\n"
                                    + "2.5. Небезпечна подія, що не класифікується як надзвичайна ситуація\n"
                                    + "2.6. Надзвичайних ситуацій та небезпечних подій за останні 5 років не виникало\n");
                            sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskScaleOfEmergenciesDesigningBuildingKeyboard());
                            messageSender.sendMessage(sendMessage);
                        }
                    }else if ((variables.getData().size() == 4 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getData().size() == 0 && variables.getCharacteristicsObject() == "проєктується") && (variables.getLevelEmergency() == "НС регіонального рівня" || variables.getLevelEmergency() == "НС місцевого рівня"
                            || variables.getLevelEmergency() == "НС об’єктового рівня"
                            || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть загальну кількість загиблих в наслідок виникнення надзвичайної/них сиутації/цій (осіб). Натисніть \"Далі\" \n"
                                + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }else if ((variables.getData().size() == 5 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "НС регіонального рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getCharacteristicsObject() == "проєктується" && variables.getData().size() == 1)
                            && (variables.getLevelEmergency() == "НС місцевого рівня" || variables.getLevelEmergency() == "НС об’єктового рівня"
                            || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть кількість збитків в наслідок виникнення надзвичайної/них сиутації/цій (грн). Натисніть \"Далі\"\n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }else if ((variables.getData().size() == 6 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "НС регіонального рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getCharacteristicsObject() == "проєктується" && variables.getData().size() == 2)
                            && (variables.getLevelEmergency() == "НС місцевого рівня" || variables.getLevelEmergency() == "НС об’єктового рівня"
                            || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть розмір неоподаткованого мінімуму доходів громадян (грн.) Натисніть \"Далі\" \n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }else if ((variables.getData().size() == 7 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "НС регіонального рівня" && variables.getLevelEmergency() != "НС місцевого рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getCharacteristicsObject() == "проєктується" && variables.getData().size() == 3)
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть кількість травмованих осіб в наслідок виникнення надзвичайної/них ситуації/цій (події). Натисніть \"Далі\" " +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                }
                else if (variables.getCharacteristicsObject() == "проєктується") {
                    if ((variables.getData().size() == 0 && variables.getLevelEmergency() == "НС державного рівня") // приймає порушення які були усунуті
                            || (variables.getData().size() == 1 && variables.getLevelEmergency() == "НС регіонального рівня")
                            || (variables.getData().size() == 3 && variables.getLevelEmergency() == "НС місцевого рівня")
                            || (variables.getData().size() == 4
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС"))
                            || (variables.getData().size() == 0 && variables.getLevelEmergency() == "без НС")) {
                        sendMessage.setText("Введіть кількість порушень вимог законодавства у сфері техногенної та пожежної безпеки під час будівництва\n" +
                                " об’єкта УСУНЕНИХ за останніх 5 років. Натисніть \"Далі\"\n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47\"");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                    if ((variables.getData().size() == 1 && variables.getLevelEmergency() == "НС державного рівня") // приймає порушення які НЕ були усунуті
                            || (variables.getData().size() == 2 && variables.getLevelEmergency() == "НС регіонального рівня")
                            || (variables.getData().size() == 4 && variables.getLevelEmergency() == "НС місцевого рівня")
                            || (variables.getData().size() == 5
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС"))
                            || (variables.getData().size() == 1 && variables.getLevelEmergency() == "без НС")) {
                        sendMessage.setText("Введіть кількість порушень вимог законодавства у сфері техногенної та пожежної безпеки під час будівництва "
                                + "об’єкта, які НЕ БУЛО УСУНЕНО за останніх 5 років. Натисніть \"Далі\" \n"
                                + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                    if ((variables.getData().size() == 2 && variables.getLevelEmergency() == "НС державного рівня") // перевірє умову для виклику на виконання наступного методу для визначення ступеня ризику за класом наслідків
                            || (variables.getData().size() == 3 && variables.getLevelEmergency() == "НС регіонального рівня")
                            || (variables.getData().size() == 5 && variables.getLevelEmergency() == "НС місцевого рівня")
                            || (variables.getData().size() == 6
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС"))
                            || (variables.getData().size() == 2 && variables.getLevelEmergency() == "без НС")) {
                        sendMessage.setText("3. Оберіть тип об'єкта для встановлення показників ступеня ризику за класом наслідків (відповідальності) під час будівництва (з запропонованого переліку):\n" +
                                "3.1. Об’єкт із значними наслідками (СС3)\n" +
                                "3.2. Об’єкт із середніми наслідками (СС2)\n" +
                                "3.3. Об’єкт із незначними наслідками (СС1)");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskConstructionConsequencesKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                    if ((variables.getData().size() == 0 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getData().size() == 0 && variables.getCharacteristicsObject() == "проєктується") && (variables.getLevelEmergency() == "НС регіонального рівня" || variables.getLevelEmergency() == "НС місцевого рівня"
                            || variables.getLevelEmergency() == "НС об’єктового рівня"
                            || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть загальну кількість загиблих в наслідок виникнення надзвичайної/них сиутації/цій (осіб). Натисніть \"Далі\" \n"
                                + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    } else if ((variables.getData().size() == 1 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "НС регіонального рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getCharacteristicsObject() == "проєктується" && variables.getData().size() == 1)
                            && (variables.getLevelEmergency() == "НС місцевого рівня" || variables.getLevelEmergency() == "НС об’єктового рівня"
                            || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть кількість збитків в наслідок виникнення надзвичайної/них сиутації/цій (грн). Натисніть \"Далі\"\n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    } else if ((variables.getData().size() == 2 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "НС регіонального рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getCharacteristicsObject() == "проєктується" && variables.getData().size() == 2)
                            && (variables.getLevelEmergency() == "НС місцевого рівня" || variables.getLevelEmergency() == "НС об’єктового рівня"
                            || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть розмір неоподаткованого мінімуму доходів громадян (грн.) Натисніть \"Далі\" \n" +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    } else if ((variables.getData().size() == 3 && variables.getLevelEmergency() != "НС державного рівня" && variables.getLevelEmergency() != "НС регіонального рівня" && variables.getLevelEmergency() != "НС місцевого рівня" && variables.getLevelEmergency() != "без НС")
                            || (variables.getCharacteristicsObject() == "проєктується" && variables.getData().size() == 3)
                            && (variables.getLevelEmergency() == "НС об’єктового рівня" || variables.getLevelEmergency() == "не класифікована НС")) {
                        sendMessage.setText("Введіть кількість травмованих осіб в наслідок виникнення надзвичайної/них ситуації/цій (події). Натисніть \"Далі\" " +
                                "Якщо введено помилкові дані - скористайтесь меню \"На початок\" \uD83D\uDC47");
                        sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                        messageSender.sendMessage(sendMessage);
                    }
                }
                break;
            case "🏢 3.1":
                s4 = "Обрано: Об’єкт сфери оборони";
                variables.setTypeStateOwnedObject("об’єкт оборони");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.2":
                s4 = "Обрано: Об’єкт паливно-енергетичного комплексу";
                variables.setTypeStateOwnedObject("об’єкт енергетичного комплексу");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.3":
                s4 = "Обрано: Об’єкт транспортної галузі";
                variables.setTypeStateOwnedObject("об’єкт транспорту");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.4":
                s4 = "Обрано: Об’єкт підприємств, що забезпечують розміщення і зберігання матеріальних цінностей державного резерву";
                variables.setTypeStateOwnedObject("об’єкт держрезерву");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.5":
                s4 = "Обрано: Об’єкт агропромислового комплексу";
                variables.setTypeStateOwnedObject("об’єкт аграрного комплексу");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.6":
                s4 = "Обрано: Об’єкт сфери електронних комунікацій та зв’язку";
                variables.setTypeStateOwnedObject("об’єкт зв'язку");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.7":
                s4 = "Обрано: Об’єкт авіаційної та ракетно-космічної промисловості";
                variables.setTypeStateOwnedObject("об’єкт авіації");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.8":
                s4 = "Обрано: Об’єкт машинобудівної промисловості";
                variables.setTypeStateOwnedObject("об’єкт машинобувної промисловості");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.9":
                s4 = "Обрано: Об’єкт металургійного комплексу";
                variables.setTypeStateOwnedObject("об’єкт металургії");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.10":
                s4 = "Обрано: Об’єкт хімічного комплексу";
                variables.setTypeStateOwnedObject("об’єкт хімпрому");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.11":
                s4 = "Обрано: Об’єкт наукової діяльності";
                variables.setTypeStateOwnedObject("об’єкт науки");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.12":
                s4 = "Обрано: Об’єкт сфери стандартизації, метрології та сертифікації";
                variables.setTypeStateOwnedObject("об’єкт метрології");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.13":
                s4 = "Обрано: Об’єкт гідрометеорологічної діяльності";
                variables.setTypeStateOwnedObject("об’єкт гідрометеорології");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.14":
                s4 = "Обрано: Об’єкт промисловості будівельних матеріалів";
                variables.setTypeStateOwnedObject("об’єкт будматеріалів");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.15":
                s4 = "Обрано: Об’єкт фінансово-бюджетної сфери";
                variables.setTypeStateOwnedObject("об’єкт фінансово-бюджетний");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.16":
                s4 = "Обрано: Об’єкт харчової промисловості";
                variables.setTypeStateOwnedObject("об’єкт харчовий");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.17":
                s4 = "Обрано: Об’єкт легкої промисловості";
                variables.setTypeStateOwnedObject("об’єкт легкої промисловості");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.18":
                s4 = "Обрано: Об’єкт поліграфії";
                variables.setTypeStateOwnedObject("об’єкт поліграфії");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏢 3.19":
                s4 = "Обрано: Об’єкт геологорозвідувальної галузі";
                variables.setTypeStateOwnedObject("об’єкт геологорозвідувальний");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏛 3.1":
                s4 = "Обрано: Пам’ятка культурної спадщини національного значення";
                variables.setTypeCulturalObject("пам'ятка національного значення");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🏛 3.2":
                s4 = "Обрано: Пам’ятка культурної спадщини місцевого значення";
                variables.setTypeCulturalObject("пам'ятка місцевого значення");
                sendMessage.setText(s4);
                sendSecondMessage.setText("Надішліть загальну площу об'єкта (м.кв.) та натисніть \"Далі\" \n"
                        + "Якщо введено помилкові дані - скористайтесь меню \"На початок\" 👇");
                sendSecondMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "🔥 5.1":
            case "🔥 4.1":
            case "🔥 3.1":
            case "🔥 2.1":
                s3 = "Обрано: надзвичайна ситуація державного рівня";
                variables.setLevelEmergency("НС державного рівня");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "🔥 5.2":
            case "🔥 4.2":
            case "🔥 3.2":
            case "🔥 2.2":
                s3 = "Обрано: надзвичайна ситуація регіонального рівня";
                variables.setLevelEmergency("НС регіонального рівня");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "🔥 5.3":
            case "🔥 4.3":
            case "🔥 3.3":
            case "🔥 2.3":
                s3 = "Обрано: надзвичайна ситуація місцевого рівня";
                variables.setLevelEmergency("НС місцевого рівня");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "🔥 5.4":
            case "🔥 4.4":
            case "🔥 3.4":
            case "🔥 2.4":
                s3 = "Обрано: надзвичайна ситуація об’єктового рівня";
                variables.setLevelEmergency("НС об’єктового рівня");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "🔥 5.5":
            case "🔥 4.5":
            case "🔥 3.5":
            case "🔥 2.5":
                s3 = "Обрано: небезпечна подія, що не класифікується як надзвичайна ситуація";
                variables.setLevelEmergency("не класифікована НС");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "🔥 5.6":
            case "🔥 4.6":
            case "🔥 3.6":
            case "🔥 2.6":
                s3 = "Обрано: надзвичайних ситуацій та небезпечних подій за останні 5 років не виникало";
                variables.setLevelEmergency("без НС");
                sendMessage.setText(s3);
                sendMessage.setReplyMarkup(inlineButton.inlineDegreeOfRiskObjectAreaKeyboard());
                messageSender.sendMessage(sendMessage);
                break;
            case "⚡️ 3.1":
                s4 = "Обрано: Об’єкт із значними наслідками (СС3)";
                variables.setTypeResultDegreeRisk("об’єкт із значними наслідками");
                sendMessage.setText(s4);
                sendSecondMessage.setText(resultDegreeRisk());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "⚡️ 3.2":
                s4 = "Обрано: Об’єкт із середніми наслідками (СС2)";
                variables.setTypeResultDegreeRisk("об’єкт із середніми наслідками");
                sendMessage.setText(s4);
                sendSecondMessage.setText(resultDegreeRisk());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
            case "⚡️ 3.3":
                s4 = "Обрано: Об’єкт із незначними наслідками (СС1)";
                variables.setTypeResultDegreeRisk("об’єкт із незначними наслідками");
                sendMessage.setText(s4);
                sendSecondMessage.setText(resultDegreeRisk());
                messageSender.sendMessage(sendMessage);
                messageSender.sendMessage(sendSecondMessage);
                break;
        }
    }
    String result() { // виводить результат для вогнегасника
        String s6 = null;
        if (variables.getTypePremises() == "Виробничі_складські") {
            IndustrialPremises ip = new IndustrialPremises();
            if (variables.getTypeExtinguisher() == "порошковий") {
                s6 = ip.quantityExtinguisherPoroshok();
            } else if (variables.getTypeExtinguisher() == "водопінний") {
                s6 = ip.quantityExtinguisherVodopinni();
            } else if (variables.getTypeExtinguisher() == "водяний") {
                s6 = ip.quantityExtinguisherVodiani();
            } else if (variables.getTypeExtinguisher() == "газовий") {
                s6 = ip.quantityExtinguisherGazovyi();
            }
        } else if (variables.getTypePremises() == "Громадські") {
            PublicPremises pp = new PublicPremises();
            if (variables.getTypeExtinguisher() == "порошковий") {
                s6 = pp.quantityExtinguisherPoroshok();
            }
            if (variables.getTypeExtinguisher() == "водопінний") {
                s6 = pp.quantityExtinguisherVodopinni();
            }
            if (variables.getTypeExtinguisher() == "водяний") {
                s6 = pp.quantityExtinguisherVodiani();
            }
        } else if (variables.getTypePremises() == "Житлові") {
            TypesLivingSpace lp = new TypesLivingSpace();
            s6 = lp.quantityExtinguisherLivingSpace();
        }else if (variables.getTypePremises() == "Гаражі") {
            Garages gg = new Garages();
            s6 = gg.quantityExtinguisherGarages();
        }
        return s6;
    }
    String resultDegreeRisk() { // виводить результат для ступеня ризику
        String s6 = null;
        DegreeRiskObject dro = new DegreeRiskObject();
        if (variables.getCharacteristicsObject() == "експлуатується") {
            s6 = dro.degreeRiskObjectExploited();
        }
        if (variables.getCharacteristicsObject() == "проєктується") {
            s6 = dro.degreeRiskObjectProjected();
        }
        return s6;
    }
}
