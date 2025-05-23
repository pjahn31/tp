package modmate.mod;

/**
 * Represents a condensed version of a module with a name and code.
 */
public class CondensedMod {

    /**
     * The name of the mod.
     */
    protected final String name;

    /**
     * The code of the mod (e.g., CS101).
     */
    protected final String code;

    /**
     * Constructs a new CondensedMod object with the specified name and code.
     *
     * @param name the name of the module
     * @param code the code of the module
     */
    public CondensedMod(String name, String code) {
        if (name == null) {
            throw new NullPointerException("Name is null");
        }
        if (code == null) {
            throw new NullPointerException("Code is null");
        }

        this.name = name;
        this.code = code;
    }

    /**
     * Returns a string representation of the mod.
     *
     * @return A string representation of the mod.
     */
    @Override
    public String toString() {
        return code + ": " + name;
    }

    /**
     * Returns the name of the mod.
     *
     * @return The name of the mod.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the code of the mod.
     *
     * @return The code of the mod.
     */
    public String getCode() {
        return code;
    }

}
