package com.bytedance.adsdk.kq;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rjo implements dgq {
    @Override // com.bytedance.adsdk.kq.dgq
    /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
    public Number kq(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Number numberKq = kq(objArr[0]);
        int iKq = kq(objArr[1], 0);
        boolean zKq = kq(objArr[2], false);
        if (numberKq == null) {
            return null;
        }
        return kq(numberKq, iKq, zKq);
    }

    public Number kq(Number number, int i10, boolean z9) {
        if (number == null) {
            return null;
        }
        int iMax = Math.max(i10, 0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(number.doubleValue());
        BigDecimal scale = z9 ? bigDecimalValueOf.setScale(iMax, RoundingMode.HALF_UP) : bigDecimalValueOf.setScale(iMax, RoundingMode.DOWN);
        return (iMax == 0 || a.a(scale).scale() <= 0) ? Long.valueOf(scale.longValue()) : Double.valueOf(scale.doubleValue());
    }

    private Number kq(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private int kq(Object obj, int i10) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    private boolean kq(Object obj, boolean z9) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.parseBoolean((String) obj) : z9;
    }
}
