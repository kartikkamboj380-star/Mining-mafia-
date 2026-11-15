package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class SVGLength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f41418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final UnitType f41419b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41420a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f41420a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41420a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41420a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f41418a = 0.0d;
        this.f41419b = UnitType.UNKNOWN;
    }

    static ArrayList a(Dynamic dynamic) {
        int i10 = a.f41420a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i11 = 0;
        if (i10 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i11 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (i10 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i11 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i11)));
            i11++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i10 = a.f41420a[dynamic.getType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new SVGLength() : new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i10 = a.f41420a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i10 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    SVGLength(double d10) {
        this.f41418a = d10;
        this.f41419b = UnitType.NUMBER;
    }

    SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i10 = length - 1;
        if (length != 0 && !strTrim.equals("normal")) {
            if (strTrim.codePointAt(i10) == 37) {
                this.f41419b = UnitType.PERCENTAGE;
                this.f41418a = Double.valueOf(strTrim.substring(0, i10)).doubleValue();
                return;
            }
            int i11 = length - 2;
            if (i11 > 0) {
                String strSubstring = strTrim.substring(i11);
                strSubstring.getClass();
                switch (strSubstring) {
                    case "cm":
                        this.f41419b = UnitType.CM;
                        length = i11;
                        break;
                    case "em":
                        this.f41419b = UnitType.EMS;
                        length = i11;
                        break;
                    case "ex":
                        this.f41419b = UnitType.EXS;
                        length = i11;
                        break;
                    case "in":
                        this.f41419b = UnitType.IN;
                        length = i11;
                        break;
                    case "mm":
                        this.f41419b = UnitType.MM;
                        length = i11;
                        break;
                    case "pc":
                        this.f41419b = UnitType.PC;
                        length = i11;
                        break;
                    case "pt":
                        this.f41419b = UnitType.PT;
                        length = i11;
                        break;
                    case "px":
                        this.f41419b = UnitType.NUMBER;
                        length = i11;
                        break;
                    default:
                        this.f41419b = UnitType.NUMBER;
                        break;
                }
                this.f41418a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
                return;
            }
            this.f41419b = UnitType.NUMBER;
            this.f41418a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        this.f41419b = UnitType.UNKNOWN;
        this.f41418a = 0.0d;
    }
}
