package com.google.gson;

import java.io.IOException;
import java.math.BigDecimal;
import p108k7.B;
import p108k7.z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f40941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f40942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f40943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f40944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ q[] f40945e;

    final enum a extends q {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.r
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Double c(p138n7.a aVar) {
            return Double.valueOf(aVar.W());
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f40941a = aVar;
        q qVar = new q("LAZILY_PARSED_NUMBER", 1) { // from class: com.google.gson.q.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.r
            public Number c(p138n7.a aVar2) {
                return new z(aVar2.l1());
            }
        };
        f40942b = qVar;
        q qVar2 = new q("LONG_OR_DOUBLE", 2) { // from class: com.google.gson.q.c
            {
                a aVar2 = null;
            }

            private Number d(String str, p138n7.a aVar2) throws p138n7.d {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar2.R()) {
                            throw new p138n7.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar2.M());
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e10) {
                    throw new k("Cannot parse " + str + "; at path " + aVar2.M(), e10);
                }
            }

            @Override // com.google.gson.r
            public Number c(p138n7.a aVar2) throws IOException {
                String strL1 = aVar2.l1();
                if (strL1.indexOf(46) >= 0) {
                    return d(strL1, aVar2);
                }
                try {
                    return Long.valueOf(Long.parseLong(strL1));
                } catch (NumberFormatException unused) {
                    return d(strL1, aVar2);
                }
            }
        };
        f40943c = qVar2;
        q qVar3 = new q("BIG_DECIMAL", 3) { // from class: com.google.gson.q.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.r
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public BigDecimal c(p138n7.a aVar2) throws IOException {
                String strL1 = aVar2.l1();
                try {
                    return B.b(strL1);
                } catch (NumberFormatException e10) {
                    throw new k("Cannot parse " + strL1 + "; at path " + aVar2.M(), e10);
                }
            }
        };
        f40944d = qVar3;
        f40945e = new q[]{aVar, qVar, qVar2, qVar3};
    }

    private q(String str, int i10) {
        super(str, i10);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f40945e.clone();
    }

    /* synthetic */ q(String str, int i10, a aVar) {
        this(str, i10);
    }
}
