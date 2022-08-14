package SV.FireSafety.services;

public class DegreeRiskObject{
    String chatID;

    public DegreeRiskObject(String chatID) {
        this.chatID = chatID;
    }

    DBWorker dbWorker = new DBWorker();

    String s = null;
    int R1 = 0;
    int R2 = 0;
    int R3 = 0;
    int R31 = 0;
    int R32 = 0;
    int R4 = 0;
    int R5 = 0;
    int R51 = 0;
    int R52 = 0;
    int R53 = 0;
    int R54 = 0;
    int R6 = 0;
    int R61 = 0;
    int R62 = 0;
    int R7 = 0;

    public String degreeRiskObjectExploited() {
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт підвищеної небезпеки")) {
            R1 = 31;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт оборони")) {
            R1 = 33;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення")
                && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт енергетичного комплексу")) {
            R1 = 35;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт транспорту")) {
            R1 = 21;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт держрезерву")) {
            R1 = 30;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення")
                && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт аграрного комплексу")) {
            R1 = 25;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт зв'язку")) {
            R1 = 20;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт авіації")) {
            R1 = 30;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення")
                && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт машинобувної промисловості")) {
            R1 = 20;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт металургії")) {
            R1 = 22;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт хімпрому")) {
            R1 = 31;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт науки")) {
            R1 = 10;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт метрології")) {
            R1 = 12;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт гідрометеорології")) {
            R1 = 14;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт будматеріалів")) {
            R1 = 21;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення")
                && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт фінансово-бюджетний")) {
            R1 = 15;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт харчовий")) {
            R1 = 18;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення")
                && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт легкої промисловості")){
            R1 = 20;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення") && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт поліграфії")) {
            R1 = 16;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об'єкт стратегічного значення")
                && dbWorker.getTypeStateOwnedObject(chatID).equals("об’єкт геологорозвідувальний")) {
            R1 = 16;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("об’єкт метрополітену")) {
            R1 = 28;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("нерухома пам'ятка") && dbWorker.getTypeCulturalObject(chatID).equals("пам'ятка національного значення")) {
            R1 = 30;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("нерухома пам'ятка") && dbWorker.getTypeCulturalObject(chatID).equals("пам'ятка місцевого значення")) {
            R1 = 10;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("промисловий або складський об’єкт")
                && (dbWorker.getCategoryPremises(chatID).equals("Категорія А") || dbWorker.getCategoryPremises(chatID).equals("Категорія Б"))) {
            R1 = 36;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("промисловий або складський об’єкт") && dbWorker.getCategoryPremises(chatID).equals("Категорія В")
                && dbWorker.getTypeIndustrialStorageFacility(chatID).equals("промисловий об'єкт")) {
            if (Double.parseDouble(dbWorker.getSquare(chatID)) <= 1000) {
                R1 = 5;
            } else if (Double.parseDouble(dbWorker.getSquare(chatID)) > 1000 && (Double.parseDouble(dbWorker.getSquare(chatID)) <= 5000)) {
                R1 = 15;
            } else if (Double.parseDouble(dbWorker.getSquare(chatID)) > 5000)
                R1 = 36;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("промисловий або складський об’єкт") && dbWorker.getCategoryPremises(chatID).equals("Категорія В")
                && dbWorker.getTypeIndustrialStorageFacility(chatID).equals("складський об’єкт")) {
            if (Double.parseDouble(dbWorker.getSquare(chatID)) <= 5000) {
                R1 = 5;
            } else if (Double.parseDouble(dbWorker.getSquare(chatID)) > 5000 && (Double.parseDouble(dbWorker.getSquare(chatID)) <= 10000)) {
                R1 = 15;
            } else if (Double.parseDouble(dbWorker.getSquare(chatID)) > 10000)
                R1 = 36;
        }
        if (dbWorker.getTypeObjectOfRisk(chatID).equals("промисловий або складський об’єкт")
                && (dbWorker.getCategoryPremises(chatID).equals("Категорія Г") || dbWorker.getCategoryPremises(chatID).equals("Категорія Д"))) {
            R1 = 0;
        }
        if (Double.parseDouble(dbWorker.getSquare(chatID)) <= 300) {
            R2 = 1;
        }
        if (Double.parseDouble(dbWorker.getSquare(chatID)) > 300 && Double.parseDouble(dbWorker.getSquare(chatID)) <= 2000) {
            R2 = 13;
        }
        if (Double.parseDouble(dbWorker.getSquare(chatID)) > 2000 && Double.parseDouble(dbWorker.getSquare(chatID)) <= 7500) {
            R2 = 21;
        }
        if (Double.parseDouble(dbWorker.getSquare(chatID)) > 7500 && Double.parseDouble(dbWorker.getSquare(chatID)) <= 20000) {
            R2 = 26;
        }
        if (Double.parseDouble(dbWorker.getSquare(chatID)) > 20000) {
            R2 = 31;
        }
        if (Double.parseDouble(dbWorker.getConstantlyAtFacility(chatID)) <= 50) {
            R31 = 5;
        } else if (Double.parseDouble(dbWorker.getConstantlyAtFacility(chatID)) > 50 && Double.parseDouble(dbWorker.getConstantlyAtFacility(chatID)) <= 400) {
            R31 = 10;
        } else if (Double.parseDouble(dbWorker.getConstantlyAtFacility(chatID)) > 400) {
            R31 = 15;
        }
        if (Double.parseDouble(dbWorker.getPeriodicallyAtFacility(chatID)) <= 100) {
            R32 = 5;
        } else if (Double.parseDouble(dbWorker.getPeriodicallyAtFacility(chatID)) > 100 && Double.parseDouble(dbWorker.getPeriodicallyAtFacility(chatID)) <= 1000) {
            R32 = 10;
        } else if (Double.parseDouble(dbWorker.getPeriodicallyAtFacility(chatID)) > 1000) {
            R32 = 15;
        }
        R3 = Math.max(R31, R32);
        if (Double.parseDouble(dbWorker.getHeightObject(chatID)) <= 9) {
            R4 = 5;
        } else if (Double.parseDouble(dbWorker.getHeightObject(chatID)) > 9 && Double.parseDouble(dbWorker.getHeightObject(chatID)) <= 26.5) {
            R4 = 10;
        } else if (Double.parseDouble(dbWorker.getHeightObject(chatID)) > 26.5 && Double.parseDouble(dbWorker.getHeightObject(chatID)) <= 47) {
            R4 = 20;
        } else if (Double.parseDouble(dbWorker.getHeightObject(chatID)) > 47) {
            R4 = 30;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС державного рівня")) {
            R5 = 20;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС регіонального рівня") && Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
            R5 = 20;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС регіонального рівня") && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
            R5 = 15;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС місцевого рівня")) {
            if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
                R51 = 20;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
                R51 = 15;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) == 0) {
                R51 = 10;
            }
            if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 15;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) < (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 10;
            }
            R5 = Math.max(R51, R52);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС об’єктового рівня")) {
            if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
                R51 = 20;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
                R51 = 15;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) == 0) {
                R51 = 5;
            }
            if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 15;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))
                    && Double.parseDouble(dbWorker.getLosses(chatID)) < (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 10;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) < (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 5;
            }
            if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) >= 5) {
                R53 = 10;
            } else if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) < 5) {
                R53 = 5;
            }
            R5 = Math.max(R51, R52);
            R5 = Math.max(R5, R53);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("не класифікована НС")) {
            if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
                R51 = 20;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
                R51 = 15;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) == 0) {
                R51 = 0;
            }
            if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 15;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))
                    && Double.parseDouble(dbWorker.getLosses(chatID)) < (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 10;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) < (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 0;
            }
            if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) >= 5) {
                R53 = 10;
            } else if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getInjuredPeople(chatID)) < 5) {
                R53 = 5;
            } else if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) == 0) {
                R53 = 0;
            }
            R5 = Math.max(R51, R52);
            R5 = Math.max(R5, R53);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("без НС")) {
            R5 = 0;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("не класифікована НС") || dbWorker.getLevelEmergency(chatID).equals("НС об’єктового рівня")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);

        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС місцевого рівня")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС регіонального рівня")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС державного рівня") || dbWorker.getLevelEmergency(chatID).equals("без НС")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);
        }
        int R = R1 + R2 + R3 + R4 + R5 + R6;
        if (R <=20) {
            s = "Висновки:\n"
                    + "Суб’єкт господарювання – незначного ступеня ризику\n"
                    + "Планові заходи державного нагляду (контролю) у сфері техногенної та пожежної безпеки здійснюються не частіше одного разу на п’ять років";
        }
        if (R >20 && R <=40) {
            s = "Висновк:\n"
                    +"Суб’єкт господарювання – середнього ступеня ризику\n"
                    + "Планові заходи державного нагляду (контролю) у сфері техногенної та пожежної безпеки здійснюються не частіше одного разу на три роки";
        }
        if (R >40 && R <=100) {
            s = "Висновки:\n"
                    +"Суб’єкт господарювання – високого ступеня ризику\n"
                    + "Планові заходи державного нагляду (контролю) у сфері техногенної та пожежної безпеки здійснюються не частіше одного разу на два роки";
        }
        return s;
    }

    public String degreeRiskObjectProjected() {
        if (dbWorker.getLevelEmergency(chatID).equals("НС державного рівня")) {
            R5 = 20;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС регіонального рівня") && Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
            R5 = 20;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС регіонального рівня") && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
            R5 = 15;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС місцевого рівня")) {
            if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
                R51 = 20;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
                R51 = 15;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) == 0) {
                R51 = 10;
            }
            if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 15;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) < (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 10;
            }
            R5 = Math.max(R51, R52);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС об’єктового рівня")) {
            if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
                R51 = 20;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
                R51 = 15;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) == 0) {
                R51 = 5;
            }
            if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 15;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))
                    && Double.parseDouble(dbWorker.getLosses(chatID)) < (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 10;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) < (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 5;
            }
            if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) >= 5) {
                R53 = 10;
            } else if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) < 5) {
                R53 = 5;
            }
            R54 = Math.max(R51, R52);
            R5 = Math.max(R54, R53);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("не класифікована НС")) {
            if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 3) {
                R51 = 20;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getDeadPeople(chatID)) < 3) {
                R51 = 15;
            } else if (Double.parseDouble(dbWorker.getDeadPeople(chatID)) == 0) {
                R51 = 0;
            }
            if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 15;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) >= (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))
                    && Double.parseDouble(dbWorker.getLosses(chatID)) < (1000 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 10;
            } else if (Double.parseDouble(dbWorker.getLosses(chatID)) < (300 * Double.parseDouble(dbWorker.getTaxFreeIncome(chatID)))) {
                R52 = 0;
            }
            if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) >= 5) {
                R53 = 10;
            } else if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) >= 1 && Double.parseDouble(dbWorker.getInjuredPeople(chatID)) < 5) {
                R53 = 5;
            } else if (Double.parseDouble(dbWorker.getInjuredPeople(chatID)) == 0) {
                R53 = 0;
            }
            R54 = Math.max(R51, R52);
            R5 = Math.max(R54, R53);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("без НС")) {
            R5 = 0;
        }
        if (dbWorker.getLevelEmergency(chatID).equals("не класифікована НС") || dbWorker.getLevelEmergency(chatID).equals("НС об’єктового рівня")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);

        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС місцевого рівня")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС регіонального рівня")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);
        }
        if (dbWorker.getLevelEmergency(chatID).equals("НС державного рівня") || dbWorker.getLevelEmergency(chatID).equals("без НС")) {
            if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) > 10) {
                R62 = 5;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) <= 10) {
                R62 = 3;
            } else if (Double.parseDouble(dbWorker.getFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getFixedViolations(chatID)) < 3) {
                R62 = 1;
            }
            if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) > 10) {
                R61 = 25;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 3 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) <= 10) {
                R61 = 20;
            } else if (Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) >= 1 && Double.parseDouble(dbWorker.getNoFixedViolations(chatID)) < 3) {
                R61 = 10;
            }
            R6 = Math.max(R61, R62);
        }
        if (dbWorker.getTypeResultDegreeRisk(chatID).equals("об’єкт із значними наслідками")){
            R7=41;
        }
        if (dbWorker.getTypeResultDegreeRisk(chatID).equals("об’єкт із середніми наслідками")) {
            R7=21;
        }
        if (dbWorker.getTypeResultDegreeRisk(chatID).equals("об’єкт із незначними наслідками")) {
            R7=11;
        }
        int R = R1 + R2 + R3 + R4 + R5 + R6 + R7;
        if (R <=20) {
            s = "Висновки:\n"
                    + "Суб’єкт господарювання – незначного ступеня ризику\n"
                    + "Планові заходи державного нагляду (контролю) у сфері техногенної та пожежної безпеки здійснюються не частіше одного разу на п’ять років";
        }
        if (R >20 && R <=40) {
            s = "Висновк:\n"
                    +"Суб’єкт господарювання – середнього ступеня ризику\n"
                    + "Планові заходи державного нагляду (контролю) у сфері техногенної та пожежної безпеки здійснюються не частіше одного разу на три роки";
        }
        if (R >40 && R <=100) {
            s = "Висновки:\n"
                    +"Суб’єкт господарювання – високого ступеня ризику\n"
                    + "Планові заходи державного нагляду (контролю) у сфері техногенної та пожежної безпеки здійснюються не частіше одного разу на два роки";
        }
        return s;
    }
}
