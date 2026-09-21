package de.danoeh.antennapod.storage.database;


import androidx.annotation.NonNull;

import java.io.Serializable;

// kotlin pair class, converted to java for use here
public record Pair<A, B>(A first, B second) implements Serializable {

    @NonNull
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

}
