package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class PositionType extends JobField {
    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return getValue();
    }
}
