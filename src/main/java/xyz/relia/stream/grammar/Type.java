package xyz.relia.stream.grammar;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Type {


    public enum InnerType {
        // Atomic and inner type
        BYTE, BYTE2, BYTE4, BYTE8, BYTE16,
        // Executive type
        EXECUTOR,
        // Combination type
        STRUCT,
        // Stream type
        STREAM,
        // Name type
        NAME,
    }

    private final InnerType type;
    private final Type unit;
    private final List<Type> iTypes;
    private final List<Type> oTypes;
    private final List<Type> struct;
    private final String name;

    private Type(InnerType type, String name) {
        this.type = type;
        this.unit = null;
        this.iTypes = null;
        this.oTypes = null;
        this.struct = null;
        this.name = name;
    }

    public Type(List<Type> iTypes, List<Type> oTypes) {
        this.type = InnerType.EXECUTOR;
        this.unit = null;
        this.iTypes = iTypes;
        this.oTypes = oTypes;
        this.struct = null;
        this.name = type.toString();
    }

    public Type(List<Type> types) {
        this.type = InnerType.STRUCT;
        this.unit = null;
        this.iTypes = null;
        this.oTypes = null;
        this.struct = types;
        this.name = type.toString();
    }

    public Type(Type type) {
        this.type = InnerType.STREAM;
        this.unit = type;
        this.iTypes = null;
        this.oTypes = null;
        this.struct = null;
        this.name = type.toString();
    }

    public Type(String name) {
        this.type = InnerType.NAME;
        this.unit = null;
        this.iTypes = null;
        this.oTypes = null;
        this.struct = null;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type1 = (Type) o;
        return type == type1.type && Objects.equals(iTypes, type1.iTypes) &&
                Objects.equals(oTypes, type1.oTypes) && Objects.equals(struct, type1.struct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, iTypes, oTypes, struct);
    }

    public InnerType getType() {
        return type;
    }

    public Type getUnit() {
        return unit;
    }

    public List<Type> getStruct() {
        return struct;
    }

    public List<Type> getITypes() {
        return iTypes;
    }

    public List<Type> getOTypes() {
        return oTypes;
    }

    public String getName() {
        return name;
    }

    public static final Type INT8 = new Type(InnerType.BYTE, "byte");
    public static final Type INT16 = new Type(InnerType.BYTE2, "short");
    public static final Type INT32 = new Type(InnerType.BYTE4, "int");
    public static final Type INT64 = new Type(InnerType.BYTE8, "int64");
    public static final Type INT128 = new Type(InnerType.BYTE16, "int128");
    public static final List<Type> originalTypes = new ArrayList<>();

    static {
        originalTypes.add(INT8);
        originalTypes.add(INT16);
        originalTypes.add(INT32);
        originalTypes.add(INT64);
        originalTypes.add(INT128);
    }

    public static final Supplier<Map<String, Type>> getTypeMap = () ->
        originalTypes.stream().collect(Collectors.toMap(Type::getName, Function.identity()))
    ;
}
