package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p136n5.InterfaceC7076l;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6562j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f38142b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f38143c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f38144d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7076l f38145a;

    public C6562j2(InterfaceC7076l interfaceC7076l) {
        this.f38145a = interfaceC7076l;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(String str) {
        if (str == null) {
            return null;
        }
        return !this.f38145a.zza() ? str : g(str, p136n5.w.f46903c, p136n5.w.f46901a, f38142b);
    }

    protected final String b(String str) {
        if (str == null) {
            return null;
        }
        return !this.f38145a.zza() ? str : g(str, p136n5.x.f46906b, p136n5.x.f46905a, f38143c);
    }

    protected final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f38145a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return g(str, p136n5.y.f46910b, p136n5.y.f46909a, f38144d);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String d(G g10) {
        String string;
        InterfaceC7076l interfaceC7076l = this.f38145a;
        if (!interfaceC7076l.zza()) {
            return g10.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(g10.f37529c);
        sb.append(",name=");
        sb.append(a(g10.f37527a));
        sb.append(",params=");
        E e10 = g10.f37528b;
        if (e10 == null) {
            string = null;
        } else {
            string = !interfaceC7076l.zza() ? e10.toString() : e(e10.N());
        }
        sb.append(string);
        return sb.toString();
    }

    protected final String e(Bundle bundle) {
        String strF;
        if (bundle == null) {
            return null;
        }
        if (!this.f38145a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(b(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strF = f(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strF = f((Object[]) obj);
            } else {
                strF = obj instanceof ArrayList ? f(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sb.append(strF);
        }
        sb.append("}]");
        return sb.toString();
    }

    protected final String f(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strE = obj instanceof Bundle ? e((Bundle) obj) : String.valueOf(obj);
            if (strE != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strE);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
