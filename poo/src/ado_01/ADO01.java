package ado_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

/**
 * @author: kcalixto
 * @github github.com/kcalixto/poo
 */

public class ADO01 {
    static final String pwd = System.getProperty("user.dir") + "/src/ado_01/";

    public ADO01() {
        try {
            String pibText = readFile(pwd + "pib.txt");
            String regionsText = readFile(pwd + "regioes.txt");

            ArrayList<State> states = parsePibListIntoStates(pibText);
            ArrayList<Region> regions = parseRegionListIntoRegions(regionsText);

            for (Region region : regions) {
                region.fillStates(states);
            }

            writeFile(regionsToText(regions), pwd + "saida.txt");
        } catch (Exception e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    public String regionsToText(ArrayList<Region> regions) {
        String str = "";

        for (Region region : regions) {
            // EX B - Gerar um arquivo de saída (saida.txt) sumarizando (somando) o PIB por
            // regiões
            str += String.format("\n%s - %.2f\n", region.getName(), region.getRegionPib());
            for (State state : region.getStates()) {
                // EX A - Imprimir na tela a lista de PIB por estado em percentual em relação ao
                // total.
                String relativePercentage = String.format("%.2f", (100 * state.getPib()) / region.getRegionPib()) + "%";
                String stateInfo = String.format("%s: %s\n", state.getName(), relativePercentage);

                System.out.print(stateInfo);
                str += stateInfo;
            }
        }

        return str;
    }

    public ArrayList<Region> parseRegionListIntoRegions(String info) throws Exception {
        ArrayList<Region> regions = new ArrayList<Region>();

        // This creates a line break in the start, so the first region can fit our regex
        info = "\n" + info;

        String[] list = info.split(System.lineSeparator() + System.lineSeparator());

        // Removes first empty line break
        list = Arrays.copyOfRange(list, 1, list.length);

        for (String item : list) {

            // Makes item string cleaner to process
            item = item.replaceAll("\n", ";");
            if (item.startsWith(";")) {
                item = item.substring(1);
            }

            String[] regionWithStatesArray = item.split(";");

            // Removes the regionName from the array
            String regionName = regionWithStatesArray[0];
            String[] statesNames = Arrays.copyOfRange(regionWithStatesArray, 1, regionWithStatesArray.length);

            // Instantiate the region
            Region region = new Region(regionName);
            for (String stateName : statesNames) {
                String id = State.GenerateID(stateName);
                State state = new State(id, stateName);
                region.addState(state);
            }

            // saves the current region
            regions.add(region);
        }

        return regions;
    }

    public ArrayList<State> parsePibListIntoStates(String info) throws Exception {
        ArrayList<State> states = new ArrayList<State>();

        String[] list = info.split(System.lineSeparator());

        // Removes first empty line break
        list = Arrays.copyOfRange(list, 1, list.length);

        for (String item : list) {
            int NAME = 0;
            int PIB = 1;

            String[] content = item.split(";");

            Double pib = Double.parseDouble(content[PIB]);
            String id = State.GenerateID(content[NAME]);
            State state = new State(id, content[NAME], pib);

            states.add(state);
        }

        return states;
    }

    public void writeFile(String info, String fileName) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String[] lines = info.split("\n");
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // feche o arquivo
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Erro de escrita em '" + fileName + "'");
            throw ex;
        }
    }

    public String readFile(String fileName) throws IOException {
        String info = "";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // loop por cada linha do arquivo
            String tmp = "";
            while ((tmp = bufferedReader.readLine()) != null) {
                info += "\n" + tmp;
            }

            // feche o arquivo
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + fileName + "'");
            throw ex;
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + fileName + "'");
            throw ex;
        }

        return info;
    }

    public static void main(String[] args) {
        new ADO01();
    }

}