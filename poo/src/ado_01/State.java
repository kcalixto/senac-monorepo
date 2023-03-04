package ado_01;

import java.security.MessageDigest;
import java.text.Normalizer;

public class State {
    private String id;
    private String name;
    private Double pib;

    public State(String id, String name) {
        this.id = id;
        this.name = name;
        this.pib = 0.0;
    }

    public State(String id, String name, Double pib) {
        this.id = id;
        this.name = name;
        this.pib = pib;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPib() {
        return this.pib;
    }

    public void setPib(Double pib) {
        this.pib = pib;
    }

    /**
     * 
     * @param name
     * @return sha1 of the stateName to use as an ID
     * @throws Exception
     */
    public static String GenerateID(String name) throws Exception {
        // Generates a normalized String without ANY special character, in lowercase
        String normalized = Normalizer.normalize(name, Normalizer.Form.NFD).replaceAll("\\p{M}", "")
                .replaceAll("[^\\p{Alpha}]+", "").toLowerCase();

        // Generates the sha1 id
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(normalized.getBytes());
        byte[] hash = md.digest();

        // Build the string back
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }
}
