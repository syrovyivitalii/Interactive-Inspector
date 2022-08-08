package SV.FireSafety.services;

public class CategoryBuilding {
    Variables variables = new Variables();
    double volumeBuilding;
    double volumeRoomA;
    double volumeRoomБ;
    double volumeRoomВ;
    double volumeRoomГ;
    double result;

    private boolean buildingsCategoryA(){
        if (variables.getData().size() == 2) {
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomA = Double.parseDouble(variables.getData().get(1));
            result = (volumeRoomA / volumeBuilding) * 100;
            if (result >= 5) return true;
            else return false;
        }else if (variables.getData().size() == 3 ){
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomA = Double.parseDouble(variables.getData().get(1));
            volumeRoomБ = Double.parseDouble(variables.getData().get(2));
            result = (volumeRoomA + volumeRoomБ)/volumeBuilding * 100;
            if (result >=5) return true;
            else return false;
        }else if (variables.getData().size() == 4){
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomA = Double.parseDouble(variables.getData().get(1));
            volumeRoomБ = Double.parseDouble(variables.getData().get(2));
            volumeRoomВ = Double.parseDouble(variables.getData().get(3));
            result = (volumeRoomA + volumeRoomБ + volumeRoomВ)/volumeBuilding*100;
            if (result >= 5) return true;
            else return false;
        }else{
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomA = Double.parseDouble(variables.getData().get(1));
            volumeRoomБ = Double.parseDouble(variables.getData().get(2));
            volumeRoomВ = Double.parseDouble(variables.getData().get(3));
            volumeRoomГ = Double.parseDouble(variables.getData().get(4));
            result = (volumeRoomA + volumeRoomБ + volumeRoomВ + volumeRoomГ)/volumeBuilding*100;
            if (result >= 5) return true;
            else return false;
        }
    }
    public boolean getBuildingCategoryA(){
        return buildingsCategoryA();
    }
    private boolean buildingsCategoryБ(){
        if (variables.getData().size() == 2) {
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomБ = Double.parseDouble(variables.getData().get(1));
            result = (volumeRoomБ / volumeBuilding) * 100;
            if (result >= 5) return true;
            else return false;
        }else if (variables.getData().size() == 3 ){
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomБ = Double.parseDouble(variables.getData().get(1));
            volumeRoomВ = Double.parseDouble(variables.getData().get(2));
            result = (volumeRoomБ + volumeRoomВ)/volumeBuilding * 100;
            if (result >=5) return true;
            else return false;
        }else{
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomБ = Double.parseDouble(variables.getData().get(1));
            volumeRoomВ = Double.parseDouble(variables.getData().get(2));
            volumeRoomГ = Double.parseDouble(variables.getData().get(3));
            result = (volumeRoomБ + volumeRoomВ + volumeRoomГ)/volumeBuilding*100;
            if (result >= 5) return true;
            else return false;
        }
    }
    public boolean getBuildingCategoryБ(){
        return buildingsCategoryБ();
    }
    private boolean buildingsCategoryВ(){
        if (variables.getData().size() == 2) {
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomВ = Double.parseDouble(variables.getData().get(1));
            result = (volumeRoomВ / volumeBuilding) * 100;
            if (result >= 5) return true;
            else return false;
        }else{
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomВ = Double.parseDouble(variables.getData().get(1));
            volumeRoomГ = Double.parseDouble(variables.getData().get(2));
            result = (volumeRoomВ + volumeRoomГ)/volumeBuilding * 100;
            if (result >=5) return true;
            else return false;
        }
    }
    public boolean getBuildingCategoryВ(){
        return buildingsCategoryВ();
    }
    private boolean buildingsCategoryГ(){
            volumeBuilding = Double.parseDouble(variables.getData().get(0));
            volumeRoomГ = Double.parseDouble(variables.getData().get(1));
            result = (volumeRoomГ / volumeBuilding) * 100;
            if (result >= 5) return true;
            else return false;
    }
    public boolean getBuildingCategoryГ(){
        return buildingsCategoryГ();
    }

}
