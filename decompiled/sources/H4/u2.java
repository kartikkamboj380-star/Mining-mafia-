package H4;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B4.f[] f1437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1438b;

    public u2(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, B4.s.f252a);
        String string = typedArrayObtainAttributes.getString(B4.s.f253b);
        String string2 = typedArrayObtainAttributes.getString(B4.s.f254c);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f1437a = c(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f1437a = c(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(B4.s.f255d);
        this.f1438b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static B4.f[] c(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        B4.f[] fVarArr = new B4.f[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String strTrim = strArrSplit[i10].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    String str2 = strArrSplit2[0];
                    int i11 = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = strArrSplit2[1];
                    fVarArr[i10] = new B4.f(i11, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                fVarArr[i10] = B4.f.f226i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                fVarArr[i10] = B4.f.f228k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                fVarArr[i10] = B4.f.f227j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                fVarArr[i10] = B4.f.f229l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                fVarArr[i10] = B4.f.f230m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                fVarArr[i10] = B4.f.f232o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                fVarArr[i10] = B4.f.f231n;
            } else if ("FLUID".equals(strTrim)) {
                fVarArr[i10] = B4.f.f233p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                fVarArr[i10] = B4.f.f235r;
            }
        }
        if (length != 0) {
            return fVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public final B4.f[] a(boolean z9) {
        if (z9 || this.f1437a.length == 1) {
            return this.f1437a;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String b() {
        return this.f1438b;
    }
}
