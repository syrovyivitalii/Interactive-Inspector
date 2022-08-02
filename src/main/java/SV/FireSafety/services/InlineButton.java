package SV.FireSafety.services;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InlineButton {
    //тип та необхідність вогнегасників
    public InlineKeyboardMarkup inlineFireExtinguisherStartKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Розпочати").callbackData("Розпочати").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Інструкція").callbackData("Інструкція").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу об'єкта
    public InlineKeyboardMarkup inlineFireExtinguisherTypesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Виробничі/складські").callbackData("Виробничі/складські").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Громадські").callbackData("Громадські").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Житлові").callbackData("Житлові").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Гаражі/автомайстерні").callbackData("Гаражі/автомайстерні").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // вибір категорії приміщення в окремому методі
    public InlineKeyboardMarkup inlineFireExtinguisherCategoryPremissesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Категорія А").callbackData("Категорія А").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Категорія Б").callbackData("Категорія Б").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Категорія В").callbackData("Категорія В").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Категорія Г").callbackData("Категорія Г").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Категорія Д").callbackData("Категорія Д").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // вибір типу громадської будівлі в окремому методі
    public InlineKeyboardMarkup inlineFireExtinguisherTypeSpacesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Адміністративні будівлі").callbackData("Адміністративні будівлі").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Будівлі побутового призначення").callbackData("Будівлі побутового призначення").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Підприємства торгівлі").callbackData("Підприємства торгівлі").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Офісні приміщення").callbackData("Офісні приміщення").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Архіви, бібліотеки, музеї").callbackData("Архіви, бібліотеки, музеї").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу житлової будівлі
    public InlineKeyboardMarkup inlineFireExtinguisherTypesLivingKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Квартири").callbackData("Квартири").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Гуртожитки").callbackData("Гуртожитки").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Будинки індивідуальної забудови").callbackData("Будинки індивідуальної забудови").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу гаражної будівлі
    public InlineKeyboardMarkup inlineFireExtinguisherCalculateKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Розрахувати").callbackData("Розрахувати").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір класу ймовірної пожежі для категорій A, Б, В1, Г
    public InlineKeyboardMarkup inlineFireExtinguisherFireClassForA_Б_В1_ГKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі A").callbackData("Клас ймовірної пожежі A").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі B").callbackData("Клас ймовірної пожежі B").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі C").callbackData("Клас ймовірної пожежі C").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі D").callbackData("Клас ймовірної пожежі D").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі F").callbackData("Клас ймовірної пожежі F").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі E").callbackData("Клас ймовірної пожежі E").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір класу ймовірної пожежі для категорії В
    public InlineKeyboardMarkup inlineFireExtinguisherFireClassForBKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("наявні горючі рідини та гази").callbackData("наявні горючі рідини та гази").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("відсутні горючі рідини та гази").callbackData("відсутні горючі рідини та гази").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір класу ймовірної пожежі для категорій В2, Д
    public InlineKeyboardMarkup inlineFireExtinguisherFireClassForB2_ДKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі A").callbackData("Клас ймовірної пожежі A").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі D").callbackData("Клас ймовірної пожежі D").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі F").callbackData("Клас ймовірної пожежі F").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Клас ймовірної пожежі E").callbackData("Клас ймовірної пожежі E").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу вогнегасника для класу А
    public InlineKeyboardMarkup inlineFireExtinguisherTypeExtinguisherForClassAKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Порошковий").callbackData("Порошковий").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водопінний").callbackData("Водопінний").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водяний").callbackData("Водяний").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу вогнегасника для класу В
    public InlineKeyboardMarkup inlineFireExtinguisherTypeExtinguisherForClassВKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Порошковий").callbackData("Порошковий").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водопінний").callbackData("Водопінний").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водяний").callbackData("Водяний").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Газовий").callbackData("Газовий").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу вогнегасника для класу С, D
    public InlineKeyboardMarkup inlineFireExtinguisherTypeExtinguisherForClassC_DKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Порошковий").callbackData("Порошковий").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу вогнегасника для класу E
    public InlineKeyboardMarkup inlineFireExtinguisherTypeExtinguisherForClassEKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Порошковий").callbackData("Порошковий").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Газовий").callbackData("Газовий").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу вогнегасника для класу E, категорія B2,Д
    public InlineKeyboardMarkup inlineFireExtinguisherTypeExtinguisherForClassE_category_В2_ДKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Порошковий").callbackData("Порошковий").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //вибір типу вогнегасника для класу F
    public InlineKeyboardMarkup inlineFireExtinguisherTypeExtinguisherForClassFKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водяний").callbackData("Водяний").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // встановлюється чи використовується в приміщеннях оргтехніка
    public InlineKeyboardMarkup inlineFireExtinguisherOfficeEquipmentKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Так, використовується").callbackData("Так, використовується").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Ні, не використовується").callbackData("Ні, не використовується").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // чи в побутових приміщеннях є приміщення приготування їжі
    public InlineKeyboardMarkup inlineFireExtinguisherPreparingFoodKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Приміщення для приготування їжі").callbackData("Приміщення для приготування їжі").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Інші побутові приміщення").callbackData("Інші побутові приміщення").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // вибір типу вогнегасника для громадських будівель
    public InlineKeyboardMarkup inlineFireExtinguisherForPublicPremisesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Порошковий").callbackData("Порошковий").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водопінний").callbackData("Водопінний").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водяний").callbackData("Водяний").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // вибір типу вогнегасника для побутових приміщень приготування їжі
    public InlineKeyboardMarkup inlineFireExtinguisherForKitchenKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Водяний").callbackData("Водяний для кухні").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // встановлення чи є технічні приміщення
    public InlineKeyboardMarkup inlineFireExtinguisherTechnicalАcilitiesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Так, передбачені").callbackData("Так, передбачені").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Ні, не передбачені").callbackData("Ні, не передбачені").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }


    // розпочинає роботу бот по визначенню ступеня ризику
    public InlineKeyboardMarkup inlineDegreeOfRiskStartKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Розпочати").callbackData("Розпочати").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }

    // встановлення чи є технічні приміщення
    public InlineKeyboardMarkup inlineDegreeOfRiskTechnicalPremisesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Об’єкт що експлуатується").callbackData("Об’єкт що експлуатується").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Об’єкт на стадії будівництва").callbackData("Об’єкт на стадії будівництва").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // обираємо тип об'єкту для визначення ступеня ризику (спочатку для об'єктів, що експлуатуються)
    public InlineKeyboardMarkup inlineDegreeOfRiskDataEntryKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("2.1").callbackData("2.1").build(),
                InlineKeyboardButton.builder().text("2.2").callbackData("2.2").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("2.3").callbackData("2.3").build(),
                InlineKeyboardButton.builder().text("2.4").callbackData("2.4").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("2.5").callbackData("2.5").build(),
                InlineKeyboardButton.builder().text("2.6").callbackData("2.6").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // метод збору даних про небезпечні події, які траплялись на об'єкті
    public InlineKeyboardMarkup inlineDegreeOfRiskDangerousEventsKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 3.1").callbackData("🔥 3.1").build(),
                InlineKeyboardButton.builder().text("🔥 3.2").callbackData("🔥 3.2").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 3.3").callbackData("🔥 3.3").build(),
                InlineKeyboardButton.builder().text("🔥 3.4").callbackData("🔥 3.4").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 3.5").callbackData("🔥 3.5").build(),
                InlineKeyboardButton.builder().text("🔥 3.6").callbackData("🔥 3.6").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // метод викликає сповіщення щоб ввести площу об'єкта і натиснути кнопку далі
    public InlineKeyboardMarkup inlineDegreeOfRiskObjectAreaKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Далі").callbackData("Далі").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // якщо обрані об'єкти державної власності, що експлуатуються, то цей метод викинає наступне меню з вибором конкретного типу
    public InlineKeyboardMarkup inlineDegreeOfRiskStateOwnedObjectKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.1").callbackData("🏢 3.1").build(),
                InlineKeyboardButton.builder().text("🏢 3.2").callbackData("🏢 3.2").build(),
                InlineKeyboardButton.builder().text("🏢 3.3").callbackData("🏢 3.3").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.4").callbackData("🏢 3.4").build(),
                InlineKeyboardButton.builder().text("🏢 3.5").callbackData("🏢 3.5").build(),
                InlineKeyboardButton.builder().text("🏢 3.6").callbackData("🏢 3.6").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.7").callbackData("🏢 3.7").build(),
                InlineKeyboardButton.builder().text("🏢 3.8").callbackData("🏢 3.8").build(),
                InlineKeyboardButton.builder().text("🏢 3.9").callbackData("🏢 3.9").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.10").callbackData("🏢 3.10").build(),
                InlineKeyboardButton.builder().text("🏢 3.11").callbackData("🏢 3.11").build(),
                InlineKeyboardButton.builder().text("🏢 3.12").callbackData("🏢 3.12").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.13").callbackData("🏢 3.13").build(),
                InlineKeyboardButton.builder().text("🏢 3.14").callbackData("🏢 3.14").build(),
                InlineKeyboardButton.builder().text("🏢 3.15").callbackData("🏢 3.15").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.16").callbackData("🏢 3.16").build(),
                InlineKeyboardButton.builder().text("🏢 3.17").callbackData("🏢 3.17").build(),
                InlineKeyboardButton.builder().text("🏢 3.18").callbackData("🏢 3.18").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏢 3.19").callbackData("🏢 3.19").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // якщо обрані об'єкти культурної спадщини, то цей метод викидає наступне меню з вибором рівня спадщини
    public InlineKeyboardMarkup inlineDegreeOfRiskObjectsCulturalHeritageKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🏛 3.1").callbackData("🏛 3.1").build(),
                InlineKeyboardButton.builder().text("🏛 3.2").callbackData("🏛 3.2").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    // якщо обрані промислові чи складські об'єкти то цей метод надає можливість обрати: промислові або складські
    public InlineKeyboardMarkup inlineDegreeOfRiskIndustrialWarehouseObjectsKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Промисловий об’єкт").callbackData("Промисловий об’єкт").build()));
        keyboard.add(Collections.singletonList(InlineKeyboardButton.builder().text("Складський об’єкт").callbackData("Складський об’єкт").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //масштаб небезпечних подій протягом останніх 5 років на стратегічному об'єкті
    public InlineKeyboardMarkup inlineDegreeOfRiskScaleOfEmergenciesStrategicKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 4.1").callbackData("🔥 4.1").build(),
                InlineKeyboardButton.builder().text("🔥 4.2").callbackData("🔥 4.2").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 4.3").callbackData("🔥 4.3").build(),
                InlineKeyboardButton.builder().text("🔥 4.4").callbackData("🔥 4.4").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 4.5").callbackData("🔥 4.5").build(),
                InlineKeyboardButton.builder().text("🔥 4.6").callbackData("🔥 4.6").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //масштаб небезпечних подій протягом останніх 5 років на промисловому об'єкті
    public InlineKeyboardMarkup inlineDegreeOfRiskScaleOfEmergenciesIndustrialKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 5.1").callbackData("🔥 5.1").build(),
                InlineKeyboardButton.builder().text("🔥 5.2").callbackData("🔥 5.2").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 5.3").callbackData("🔥 5.3").build(),
                InlineKeyboardButton.builder().text("🔥 5.4").callbackData("🔥 5.4").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 5.5").callbackData("🔥 5.5").build(),
                InlineKeyboardButton.builder().text("🔥 5.6").callbackData("🔥 5.6").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //масштаб небезпечних подій протягом останніх 5 років на етапі проектування та будівництва
    public InlineKeyboardMarkup inlineDegreeOfRiskScaleOfEmergenciesDesigningBuildingKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 2.1").callbackData("🔥 2.1").build(),
                InlineKeyboardButton.builder().text("🔥 2.2").callbackData("🔥 2.2").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 2.3").callbackData("🔥 2.3").build(),
                InlineKeyboardButton.builder().text("🔥 2.4").callbackData("🔥 2.4").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("🔥 2.5").callbackData("🔥 2.5").build(),
                InlineKeyboardButton.builder().text("🔥 2.6").callbackData("🔥 2.6").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //масштаб небезпечних подій протягом останніх 5 років на етапі проектування
    public InlineKeyboardMarkup inlineDegreeOfRiskConstructionConsequencesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("⚡️ 3.1").callbackData("⚡️ 3.1").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("⚡️ 3.2").callbackData("⚡️ 3.2").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("⚡️ 3.3").callbackData("⚡️ 3.3").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }
    //категорія приміщення за вибухопожежною та пожежною небезпекою
    public InlineKeyboardMarkup inlineDegreeOfRiskCategoryPremisesKeyboard(){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("Категорія А").callbackData("Категорія приміщення А").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("Категорія Б").callbackData("Категорія приміщення Б").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("Категорія В").callbackData("Категорія приміщення В").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("Категорія Г").callbackData("Категорія приміщення Г").build()));
        keyboard.add(Arrays.asList(InlineKeyboardButton.builder().text("Категорія Д").callbackData("Категорія приміщення Д").build()));
        inlineKeyboardMarkup.setKeyboard(keyboard);
        return inlineKeyboardMarkup;
    }




}
