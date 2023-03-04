package ado_01;

import java.util.ArrayList;

public class Region {
    private String name;
    private Double pib;
    private ArrayList<State> states;

    public Region(String name) {
        this.name = name;
        this.states = new ArrayList<State>();
    }

    public void addState(State state) {
        this.states.add(state);
    }

    public ArrayList<State> getStates() {
        return this.states;
    }

    public String getName() {
        return this.name;
    }

    public void fillStates(ArrayList<State> states) {
        for (State regionState : this.states) {
            for (State state : states) {
                // id is a sha1 of the state name
                if (regionState.getID().equals(state.getID())) {
                    regionState.setPib(state.getPib());
                }
            }
        }
    }

    public Double getRegionPib() {
        Double pib = 0.0;
        for (State state : this.states) {
            pib += state.getPib();
        }

        return pib;
    }
}
