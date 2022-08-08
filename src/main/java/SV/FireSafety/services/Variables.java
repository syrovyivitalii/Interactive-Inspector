package SV.FireSafety.services;

import java.util.ArrayList;

public class Variables {
    //розрахункові змінні
    public  static ArrayList<String> data = new ArrayList<String>();
    private static String comandOfMenu; // зберігає тип обраної команди в меню
    private static String typePremises; // зберігається тип приміщення
    private static String categoryPremises; // зберігається категорія приміщення
    private static String classFire; // зберігається клас ймовірної пожежі
    private static String typeExtinguisher; // зберігається вогнегасник
    private static String typeSpacesBuild; // зберігається тип громадського приміщення
    private static boolean b1 = false; // враховує чи використовується оргтехніка
    private static boolean b2 = false;// враховує чи наявні технічні приміщення
    private static String kitchen;// зберігає тип побутового приміщення, чи це кухні чи це інші побутові
    // приміщення
    private static String characteristicsObject; // зберіє в себе характеристику об'єкту для визначення ступеня ризику
    // (проєктується/експлуатується)
    private static String typeObjectOfRisk; // зберігає тип об'єкту для визначення ступеня ризику (ОПН, держ.власності тощо)
    private static String typeStateOwnedObject; // зберігає об'єкти державної власності
    private static String typeCulturalObject; // зберігає тип об'єкта культурної спадщини
    private static String typeIndustrialStorageFacility; // зберігає промисловий чи складський об'єкт для визначення ступеня
    // ризику
    private static String levelEmergency; // зберігає рівень надзвичайних ситуацій, що траплялись на об'єкті

    private static String typeResultDegreeRisk; // зберігає значення класу наслідків під час будівництва об'єкту (крайнє значення)

    private static boolean usedIndoors; // зберігає чи використовується технологічна установка в приміщенні
    private static String categoryBuildings; // зберігає категорію будівлі

    public static ArrayList<String> getData() {
        return data;
    }

    public static void setData(ArrayList<String> data) {
        Variables.data = data;
    }

    public static String getComandOfMenu() {
        return comandOfMenu;
    }

    public static void setComandOfMenu(String comandOfMenu) {
        Variables.comandOfMenu = comandOfMenu;
    }

    public static String getTypePremises() {
        return typePremises;
    }

    public static void setTypePremises(String typePremises) {
        Variables.typePremises = typePremises;
    }

    public static String getCategoryPremises() {
        return categoryPremises;
    }

    public static void setCategoryPremises(String categoryPremises) {
        Variables.categoryPremises = categoryPremises;
    }

    public static String getClassFire() {
        return classFire;
    }

    public static void setClassFire(String classFire) {
        Variables.classFire = classFire;
    }

    public static String getTypeExtinguisher() {
        return typeExtinguisher;
    }

    public static void setTypeExtinguisher(String typeExtinguisher) {
        Variables.typeExtinguisher = typeExtinguisher;
    }

    public static String getTypeSpacesBuild() {
        return typeSpacesBuild;
    }

    public static void setTypeSpacesBuild(String typeSpacesBuild) {
        Variables.typeSpacesBuild = typeSpacesBuild;
    }

    public static boolean isB1() {
        return b1;
    }

    public static void setB1(boolean b1) {
        Variables.b1 = b1;
    }

    public static boolean isB2() {
        return b2;
    }

    public static void setB2(boolean b2) {
        Variables.b2 = b2;
    }

    public static String getKitchen() {
        return kitchen;
    }

    public static void setKitchen(String kitchen) {
        Variables.kitchen = kitchen;
    }

    public static String getCharacteristicsObject() {
        return characteristicsObject;
    }

    public static void setCharacteristicsObject(String characteristicsObject) {
        Variables.characteristicsObject = characteristicsObject;
    }

    public static String getTypeObjectOfRisk() {
        return typeObjectOfRisk;
    }

    public static void setTypeObjectOfRisk(String typeObjectOfRisk) {
        Variables.typeObjectOfRisk = typeObjectOfRisk;
    }

    public static String getTypeStateOwnedObject() {
        return typeStateOwnedObject;
    }

    public static void setTypeStateOwnedObject(String typeStateOwnedObject) {
        Variables.typeStateOwnedObject = typeStateOwnedObject;
    }

    public static String getTypeCulturalObject() {
        return typeCulturalObject;
    }

    public static void setTypeCulturalObject(String typeCulturalObject) {
        Variables.typeCulturalObject = typeCulturalObject;
    }

    public static String getTypeIndustrialStorageFacility() {
        return typeIndustrialStorageFacility;
    }

    public static void setTypeIndustrialStorageFacility(String typeIndustrialStorageFacility) {
        Variables.typeIndustrialStorageFacility = typeIndustrialStorageFacility;
    }

    public static String getLevelEmergency() {
        return levelEmergency;
    }

    public static void setLevelEmergency(String levelEmergency) {
        Variables.levelEmergency = levelEmergency;
    }

    public static String getTypeResultDegreeRisk() {
        return typeResultDegreeRisk;
    }

    public static void setTypeResultDegreeRisk(String typeResultDegreeRisk) {
        Variables.typeResultDegreeRisk = typeResultDegreeRisk;
    }

    public static boolean isUsedIndoors() {
        return usedIndoors;
    }

    public static void setUsedIndoors(boolean usedIndoors) {
        Variables.usedIndoors = usedIndoors;
    }

    public static String getCategoryBuildings() {
        return categoryBuildings;
    }

    public static void setCategoryBuildings(String categoryBuildings) {
        Variables.categoryBuildings = categoryBuildings;
    }

    public void setVariables(){
        data.clear();
        setTypePremises(null);
        setCategoryPremises(null);
        setClassFire(null);
        setTypeExtinguisher(null);
        setTypeSpacesBuild(null);
        setB1(false);
        setB2(false);
        setCharacteristicsObject(null);
        setTypeObjectOfRisk(null);
        setTypeStateOwnedObject(null);
        setTypeCulturalObject(null);
        setTypeIndustrialStorageFacility(null);
        setLevelEmergency(null);
        setTypeResultDegreeRisk(null);
        setUsedIndoors(false);
    }
}