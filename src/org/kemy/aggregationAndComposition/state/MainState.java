package org.kemy.aggregationAndComposition.state;

import java.util.Arrays;

public class MainState {
    public static void main(String[] args) {
        City city1 = new City("Hrodno", 54.33, false, true, true);
        City city2 = new City("Minsk", 154.33, true, true,true);
        City city3 = new City("Lida", 44.33, false,false,true);
        City city4 = new City("Rakov", 34.33, false,false,false);
        City city5 = new City("Svisloch", 24.33, false,false,false);

        District district1 = new District("Hrodnenski", Arrays.asList(city1, city5));
        District district2 = new District("Minski", Arrays.asList(city2, city4));
        District district3 = new District("Lidski", Arrays.asList(city3));

        Region region1 = new Region("Hrodnenskaja", Arrays.asList(district1, district3));
        Region region2 = new Region("Minskaja", Arrays.asList(district2));

        State state = new State(Arrays.asList(region1, region2));
        System.out.println(state.findCapital());
        System.out.println("Quantity of regions = " + state.getRegion().size());
        state.square();
        state.findRegionCenter();
    }
}
