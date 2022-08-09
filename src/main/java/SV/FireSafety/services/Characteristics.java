package SV.FireSafety.services;

public class Characteristics {
    String text;
    //характеристика горючих газів, категорія - приміщення
    private String characteristicCombustibleGasesRooms(){
        // Категорія А
        text = "2.1 Горючі гази, що можуть утворювати газоповітряні суміші з розрахунковим надлишковим тиском вибуху у приміщенні більше 5 кПа \n";
        //Категорія В
        text += "2.2 Горючі гази, що можуть вибухати і/або горіти під час взаємодії з інщшими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5кПа \n";
        // Категорія Г
        text +=  "2.3 Горючі гази, що спалюються або утилізуються як паливо";
        return text;
    }
    public String getCharacteristicCombustibleGasesRooms(){
        return characteristicCombustibleGasesRooms();
    }
    //характеристика легкозаймистих рідин, категорія - приміщення
    private String characteristicFlammableLiquidsRooms(){
        // Категорія А
        text = "2.1 Легкозаймисті рідини з температурою спалаху не вище 28°C, що можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху у приміщенні більше 5кПа \n";
        //Категорія Б
        text += "2.2 Легкозаймисті рідини з температурою спалаху вище 28°C, що можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху у приміщенні більше 5кПа \n ";
        //Категорія В
        text += "2.3 Легкозаймисті рідини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5кПа \n";
        //Категорія Г
        text += "2.4 Легкозаймисті рідини, що спалюються або утилізуються як паливо \n";
        //Категорія Д
        text += "2.5 Легкозаймисті рідини, в недостітній кількості для утворення вибухонебезпечної пароповітряної суміші з подальшим горінням \n";
        return text;
    }
    public String getCharacteristicFlammableLiquidsRooms(){
        return characteristicFlammableLiquidsRooms();
    }
    //характеристика речовин і матеріалів, які здатні вибухати і/або горіти при взаємодії з іншими речовинами, категорія - приміщення
    private String characteristicExplosiveSubstancesRooms(){
        //Категорія A
        text = "2.1 Речовини і матеріали, здатні вибухати і горіти при взаємодії з іншими речовинами, у такій кількості, що розрахунковий надлишковий тиск вибуху у приміщенні більше 5кПа \n";
        //Категорія В
        text += "2.2 Речовини і матеріали, здатні вибухати і горіти при взаємодії з іншими речовинами менше/дорівнює 5кПа \n";
        //Категорія Д
        text += "2.3 Речовини і матеріали, які здатні вибухати і/або горіти при взаємодії з іншими речовинами, в недостатній кількості для утворення вибухонебезпечної пароповітряної суміші з подальшим горінням \n";
        return text;
    }
    public String getCharacteristicExplosiveSubstancesRooms(){
        return characteristicExplosiveSubstancesRooms();
    }
    //характеристика горючих рідин, категорія - приміщення
    private String characteristicCombustibleLiquidsRooms(){
        //Категорія Б
        text = "2.1 Горючі рідини, зо можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху у приміщенні більше 5кПа \n";
        //Категорія В
        text += "2.2 Горючі рідини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5кПа \n";
        //Категорія Г
        text += "2.3 Горючі рідини, що спалюються або утилізуються як паливо\n";
        //Категорія Д
        text += "2.4 Горючі рідини, в недостатній кількості для утворення вибухонебезпечної пароповітряної суміші з подальшим горінням \n";
        return text;
    }
    public String getCharacteristicCombustibleLiquidsRooms(){
        return characteristicCombustibleLiquidsRooms();
    }
    //характеристика горючого пилу, категорія - приміщення
    private String characteristicCombustibleSawsRooms(){
        //Категорія Б
        text = "2.1 Горючий пил, що може утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху у приміщенні більше 5 кПа \n";
        //Категорія В
        text += "2.2 Горючий пил, який здатен вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5кПа \n";
        return text;
    }
    public String getCharacteristicCombustibleSawsRooms(){
        return characteristicCombustibleSawsRooms();
    }
    //характеристика горючих волокон, категорія - приміщення
    private String characteristicCombustibleFibersRooms(){
        //Категорія Б
        text = "2.1 Горючі волокна, що можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху у приміщення більше 5кПа \n";
        //Категорія В
        text += "2.2 Горючі волокна, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5кПа\n";
        return text;
    }
    public String getCharacteristicCombustibleFibersRooms(){
        return characteristicCombustibleFibersRooms();
    }
    //характеристика тверді горючі речовини, категорія - приміщення
    private String characteristicSolidСombustibleSubstancesRooms(){
        //Категорія В
        text = "Тверді горючі речовини, пожежна навантага на окремих ділянках площею не менше 10м² кожна перевищує 180 МДж/м² \n";
        //Категорія Г
        text += "Тверді горючі речовини, що спалюються або утилізуються як паливо";
        //Категорія Д
        text += "Тверді горючі речовини, пожежна навантага на окремих ділянках площею не менше 10м² кожна не перевищує 180 МДж/м² \n";
        return text;
    }
    public String getCharacteristicSolidСombustibleSubstancesRooms(){
        return characteristicSolidСombustibleSubstancesRooms();
    }
    //характеристика тверді важкогорючі речовини, категорія - приміщення
    private String characteristicSolidHighlyFlammableSubstancesRooms(){
        //Категорія В
        text = "2.1 Тверді важкогорючі речовини, пожежна навантага на окремих ділянках площею не менше 10м² кожна перевищує 180 МДж/м² \n";
        //Категорія Д
        text += "2.2 Тверді важкогорючі речовини, пожежна навантага на окремих ділянках площею не менше 10м² кожна не перевищує 180 МДж/м²";
        return text;
    }
    public String getCharacteristicSolidHighlyFlammableSubstancesRooms(){
        return characteristicSolidHighlyFlammableSubstancesRooms();
    }
    //характеристика важкогорючі рідини, категорія - приміщення
    private String characteristicHighlyFlammableLiquidRooms(){
        //Категорія В
        text = "2.1 Важкогорючі рідини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5кПа \n";
        //Категорія Д
        text += "2.2 Важкогорючі рідини, в недостатній кількості для утворення вибухонебезпечної пароповітряної суміші з подальшим горінням \n";
        return text;
    }
    public String getCharacteristicHighlyFlammableLiquidRooms(){
        return characteristicHighlyFlammableLiquidRooms();
    }
    //характеристика негорючих речовин, категорія - приміщення
    private String characteristicNonCombustibleSubstancesRooms(){
        //Категорія Г
        text = "2.1 Негорючі речовини у гарячому, розпеченому і/або розплавленому стані, процес яких супроводжується з виділенням променистого тепла, утворенням іскор і/або полум'я \n";
        //Категорія Д
        text += "2.2 Негорючі речовини в холодному стані";
        return text;
    }
    public String getCharacteristicNonCombustibleSubstancesRooms(){
        return characteristicNonCombustibleSubstancesRooms();
    }

    //характеристика горючих газів, категорія зовнішньої установки
    private String characteristicCombustibleGasesExternal(){
        //Категорія Aз
        text = "2.1 Горючі гази, що можуть утворювати газоповітряні суміші з розрахунковим надлишковим тиском вибуху більше 5кПа на відстані 30м від установки, з горизонтальним розміром зони, що обмежує газоповітряну суміш із концентрацією горючого газу вище концентраційної межі поширення полум'я більше 30м\n";
        //Категорія Вз
        text += "2.2 Горючі гази, що можуть вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5кПа інтенсивність теплового випромінювання від вогнища перевищує 4 кВт/м² на відстані 30м від зовнішньої установки\n ";
        //Категорії Гз
        text += "2.3 Горючі гази, що спалюються або утилізуються як паливо";
        return text;
    }
    public String getCharacteristicCombustibleGasesExternal(){
        return characteristicCombustibleGasesExternal();
    }
    //характеристика легкозаймистих рідин, категорія зовнішньої установки
    private String characteristicFlammableLiquidsExternal(){
        //Категорія Аз
        text = "Легкозаймисті рідини з температурою не вище 28°C, що можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху більше 5кПа на відстані 30м від установки, з горизонтальним розміром зони, що обмежує пароповітряну суміш із концентрацією легкозаймистих рідин вище концентраційної межі поширення полум'я більше 30м\n ";
        //Категорія Бз
        text += "Легкозаймисті рідини з температурою спалаху вище  28°C, що можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху більше 5кПа на відстані 30м від установки, з горизонтальним розміром зони, що обмежує пароповітряну суміш із концентрацією легкозаймистих рідин вище концентраційної межі поширення полум'я більше 30м \n";
        //Категорія Вз
        text += "Легкозаймисті рідини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5 кПа, інтенсивність теплового випромінювання від вогнища перевищує 4 кВт/м² на відстані 30м від зовнішньої установки \n";
        return text;
    }
    public String getCharacteristicFlammableLiquidsExternal(){
        return characteristicFlammableLiquidsExternal();
    }
    //характеристика речовин і матеріалів, які здатні вибухати і/або горіти при взаємодії з іншими речовинами, категорія зовнішньої установки
    private String characteristicExplosiveSubstancesExternal(){
        //Категорія Аз
        text = "2.1 Речовини і матеріали, здатні вибухати і горіти при взаємодії з іншими речовинами у такій кількості, що розрахунковий надлишковий тиск вибуху більше 5 кПа на відстані 30м від установки, з горизонтальним розміром зони, що обмежує пароповітряну суміш із концентрацією речовин вище концентраційної межі поширення полум'я більше 30м\n";
        //Категорія Вз
        text += "2.2 Речовини і матеріали, здатні вибухати і горіти при взаємодії з іншими речовинами менше/дорівнює 5 кПа, інтенсивність теплового випромінювання від вогнища перевищує 4 кВт/м² на відстані 30м від зовнішньої установки \n";
        return text;
    }
    public String getCharacteristicExplosiveSubstancesExternal(){
        return characteristicExplosiveSubstancesExternal();
    }
    // характеристика горючих рідин, категорія зовнішньої установки
    private String characteristicCombustibleLiquidsExternal(){
        //Категорія Бз
        text = "2.1 Горючі рідини, що можуть утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху більше 5 кПа на відстані 30м від установки, з горизонтальним розміром зони, що обмежує пароповітряну суміш із концентрацією горючих рідин вище концентраційної межі поширення полум'я більше 30м\n";
        //Категорія Вз
        text += "2.2 Горючі рідини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5 кПа, інтенсивність теплового випромінювання від вогнища 4 кВт/м² на відстані 30м від зовнішньої установки\n ";
        //Категорія Гз
        text += "2.3 Горючі рідини, що спалюються або утилізуються як паливо \n";
        return text;
    }
    public String getCharacteristicCombustibleLiquidsExternal(){
        return characteristicCombustibleLiquidsExternal();
    }
    // характеристика горючого пилу, категорія зовнішньої установки
    private String characteristicCombustibleSawsExternal(){
        //Категорія Бз
        text = "2.1 Горючий пил, що може утворюватися вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху більше 5 кПа на відстані 30м від установки.\n";
        //Категорія Вз
        text += "2.2 Горючі пили, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5 кПа інтенсивність теплового випромінювання від вогнища перевищує 4 кВт/м² на відстані 30м від зовнішньої від зовнішньої установки\n ";
        return text;
    }
    public String getCharacteristicCombustibleSawsExternal(){
        return characteristicCombustibleSawsExternal();
    }
    // характеристика горючих волокон, категорія зовнішньої установки
    private String characteristicCombustibleFibersExternal(){
        //Категорія Бз
        text = "2.1 Горючі волокна, що може утворювати вибухонебезпечні пароповітряні суміші з розрахунковим надлишковим тиском вибуху більше 5 кПа на відстані 30м від установки.\n";
        //Категорія Вз
        text += "2.2 Горючі волокна, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5 кПа, інтенсивність теплового випромінювання від вогнища перевищує 4 кВт/м² на відстані 30м від зовнішньої установки \n";
        return text;
    }
    public String getCharacteristicCombustibleFibersExternal(){
        return characteristicCombustibleFibersExternal();
    }
    // характеристика тверді горючі речовини, категорія зовнішньої установки
    private String characteristicSolidСombustibleSubstancesExternal(){
        //Категорія Вз
        text = "2.1 Тверді горючі речовини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5 кПа, інтенсивність теплоовго випромінювання від вогнища перевищує 4 кВт/м² на відстані 30 м від зовнішньої установки\n ";
        //Категорія Гз
        text += "2.2 Тверді горючі речовини, що спалюються або утилізовуюються як паливо\n";
        return text;
    }
    public String getCharacteristicSolidСombustibleSubstancesExternal(){
        return characteristicSolidСombustibleSubstancesExternal();
    }
    // характеристика тверді важкогорючі речовини, категорія зовнішньої установки
    private String characteristicSolidHighlyFlammableSubstancesExternal(){
        //Категорія Вз
        text = "2.1 Тверді важкогорючі речовини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху менше/дорівнює 5 кПа, інтенсивність теплоовго випромінювання від вогнища перевищує 4 кВт/м² на відстані 30м від зовнішньої установки \n";
        //Категорія Дз
        text += "2.2 Лише тверді важкогорючі речовини\n";
        return text;
    }
    public String getCharacteristicSolidHighlyFlammableSubstancesExternal(){
        return characteristicSolidHighlyFlammableSubstancesExternal();
    }
    // характеристика важкогорючі рідини, категорія зовнішньої установки
    private String characteristicHighlyFlammableLiquidExternal(){
        //Категорія Вз
        text = "2.1 Важкогорючі рідини, які здатні вибухати і/або горіти під час взаємодії з іншими речовинами з розрахунковим надлишковим тиском вибуху у приміщенні менше/дорівнює 5 кПа, інтенсивність теплового випромінювання від вогнища 4 кВт/м² на відстані 30м від зовнішньої установки\n";
        //Категорія Дз
        text += "2.2 Лише важкогорючі рідини\n";
        return text;
    }
    public String getCharacteristicHighlyFlammableLiquidExternal(){
        return characteristicHighlyFlammableLiquidExternal();
    }
    // характеристика негорючих речовин, категорія зовнішньої установки
    private String characteristicNonCombustibleSubstancesExternal(){
        //Категорія Гз
        text = "2.1 Негорючі речовини у гарячому, розпеченому і/або розплавленому стані, процес який супроводжується з виділенням променистого тепла, утворенням іскор і/або полум'я\n";
        //Категорія Дз
        text += "2.2 Негорючі речовини в холодному стані\n";
        return text;
    }
    public String getCharacteristicNonCombustibleSubstancesExternal(){
        return characteristicNonCombustibleSubstancesExternal();
    }
}
