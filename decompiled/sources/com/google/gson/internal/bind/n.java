package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p108k7.H;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final com.google.gson.s f40852A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final com.google.gson.s f40853B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final com.google.gson.t f40854C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final com.google.gson.s f40855D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final com.google.gson.t f40856E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final com.google.gson.s f40857F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final com.google.gson.t f40858G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final com.google.gson.s f40859H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final com.google.gson.t f40860I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final com.google.gson.s f40861J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final com.google.gson.t f40862K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final com.google.gson.s f40863L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final com.google.gson.t f40864M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final com.google.gson.s f40865N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final com.google.gson.t f40866O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final com.google.gson.s f40867P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final com.google.gson.t f40868Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final com.google.gson.s f40869R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final com.google.gson.t f40870S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final com.google.gson.s f40871T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final com.google.gson.t f40872U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final com.google.gson.s f40873V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final com.google.gson.t f40874W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final com.google.gson.t f40875X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.gson.s f40876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.t f40877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final com.google.gson.s f40878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.gson.t f40879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.google.gson.s f40880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.google.gson.s f40881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.google.gson.t f40882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.google.gson.s f40883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.gson.t f40884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.google.gson.s f40885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.gson.t f40886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.gson.s f40887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.gson.t f40888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.gson.s f40889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.gson.t f40890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.gson.s f40891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.google.gson.t f40892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.gson.s f40893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.gson.t f40894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.gson.s f40895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.gson.s f40896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final com.google.gson.s f40897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.gson.s f40898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.gson.t f40899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final com.google.gson.s f40900y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final com.google.gson.s f40901z;

    class A extends com.google.gson.s {
        A() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return Boolean.valueOf(aVar.l1());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Boolean bool) throws IOException {
            cVar.p1(bool == null ? "null" : bool.toString());
        }
    }

    class B extends com.google.gson.s {
        B() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            try {
                int iX = aVar.X();
                if (iX <= 255 && iX >= -128) {
                    return Byte.valueOf((byte) iX);
                }
                throw new com.google.gson.m("Lossy conversion from " + iX + " to byte; at path " + aVar.M());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m(e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.m1(number.byteValue());
            }
        }
    }

    class C extends com.google.gson.s {
        C() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            try {
                int iX = aVar.X();
                if (iX <= 65535 && iX >= -32768) {
                    return Short.valueOf((short) iX);
                }
                throw new com.google.gson.m("Lossy conversion from " + iX + " to short; at path " + aVar.M());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m(e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.m1(number.shortValue());
            }
        }
    }

    class D extends com.google.gson.s {
        D() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.X());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m(e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.m1(number.intValue());
            }
        }
    }

    class E extends com.google.gson.s {
        E() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(p138n7.a aVar) {
            try {
                return new AtomicInteger(aVar.X());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m(e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, AtomicInteger atomicInteger) throws IOException {
            cVar.m1(atomicInteger.get());
        }
    }

    class F extends com.google.gson.s {
        F() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(p138n7.a aVar) {
            return new AtomicBoolean(aVar.V());
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, AtomicBoolean atomicBoolean) throws IOException {
            cVar.q1(atomicBoolean.get());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$a, reason: case insensitive filesystem */
    class C6737a extends com.google.gson.s {
        C6737a() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(p138n7.a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.Q()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.X()));
                } catch (NumberFormatException e10) {
                    throw new com.google.gson.m(e10);
                }
            }
            aVar.w();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            cVar.j();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.m1(atomicIntegerArray.get(i10));
            }
            cVar.w();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$b, reason: case insensitive filesystem */
    class C6738b extends com.google.gson.s {
        C6738b() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            try {
                return Long.valueOf(aVar.a0());
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m(e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.m1(number.longValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$c, reason: case insensitive filesystem */
    class C6739c extends com.google.gson.s {
        C6739c() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return Float.valueOf((float) aVar.W());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.o1(number);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$d, reason: case insensitive filesystem */
    class C6740d extends com.google.gson.s {
        C6740d() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return Double.valueOf(aVar.W());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.S();
            } else {
                cVar.l1(number.doubleValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$e, reason: case insensitive filesystem */
    class C6741e extends com.google.gson.s {
        C6741e() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            String strL1 = aVar.l1();
            if (strL1.length() == 1) {
                return Character.valueOf(strL1.charAt(0));
            }
            throw new com.google.gson.m("Expecting character, got: " + strL1 + "; at " + aVar.M());
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Character ch) throws IOException {
            cVar.p1(ch == null ? null : String.valueOf(ch));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$f, reason: case insensitive filesystem */
    class C6742f extends com.google.gson.s {
        C6742f() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(p138n7.a aVar) throws IOException {
            p138n7.b bVarN1 = aVar.n1();
            if (bVarN1 != p138n7.b.NULL) {
                return bVarN1 == p138n7.b.BOOLEAN ? Boolean.toString(aVar.V()) : aVar.l1();
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, String str) throws IOException {
            cVar.p1(str);
        }
    }

    class g extends com.google.gson.s {
        g() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            String strL1 = aVar.l1();
            try {
                return p108k7.B.b(strL1);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m("Failed parsing '" + strL1 + "' as BigDecimal; at path " + aVar.M(), e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.o1(bigDecimal);
        }
    }

    class h extends com.google.gson.s {
        h() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            String strL1 = aVar.l1();
            try {
                return p108k7.B.c(strL1);
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m("Failed parsing '" + strL1 + "' as BigInteger; at path " + aVar.M(), e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, BigInteger bigInteger) throws IOException {
            cVar.o1(bigInteger);
        }
    }

    class i extends com.google.gson.s {
        i() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public p108k7.z b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return new p108k7.z(aVar.l1());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, p108k7.z zVar) throws IOException {
            cVar.o1(zVar);
        }
    }

    class j extends com.google.gson.s {
        j() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return new StringBuilder(aVar.l1());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, StringBuilder sb) throws IOException {
            cVar.p1(sb == null ? null : sb.toString());
        }
    }

    class k extends com.google.gson.s {
        k() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(p138n7.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + H.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + H.a("java-lang-class-unsupported"));
        }
    }

    class l extends com.google.gson.s {
        l() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return new StringBuffer(aVar.l1());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, StringBuffer stringBuffer) throws IOException {
            cVar.p1(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    class m extends com.google.gson.s {
        m() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            String strL1 = aVar.l1();
            if (strL1.equals("null")) {
                return null;
            }
            return new URL(strL1);
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, URL url) throws IOException {
            cVar.p1(url == null ? null : url.toExternalForm());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.n$n, reason: collision with other inner class name */
    class C0379n extends com.google.gson.s {
        C0379n() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            try {
                String strL1 = aVar.l1();
                if (strL1.equals("null")) {
                    return null;
                }
                return new URI(strL1);
            } catch (URISyntaxException e10) {
                throw new com.google.gson.h(e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, URI uri) throws IOException {
            cVar.p1(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends com.google.gson.s {
        o() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(p138n7.a aVar) throws IOException {
            if (aVar.n1() != p138n7.b.NULL) {
                return InetAddress.getByName(aVar.l1());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, InetAddress inetAddress) throws IOException {
            cVar.p1(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends com.google.gson.s {
        p() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            String strL1 = aVar.l1();
            try {
                return UUID.fromString(strL1);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.m("Failed parsing '" + strL1 + "' as UUID; at path " + aVar.M(), e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, UUID uuid) throws IOException {
            cVar.p1(uuid == null ? null : uuid.toString());
        }
    }

    class q extends com.google.gson.s {
        q() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(p138n7.a aVar) throws IOException {
            String strL1 = aVar.l1();
            try {
                return Currency.getInstance(strL1);
            } catch (IllegalArgumentException e10) {
                throw new com.google.gson.m("Failed parsing '" + strL1 + "' as Currency; at path " + aVar.M(), e10);
            }
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Currency currency) throws IOException {
            cVar.p1(currency.getCurrencyCode());
        }
    }

    class r extends com.google.gson.s {
        r() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            aVar.h();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.n1() != p138n7.b.END_OBJECT) {
                String strI0 = aVar.I0();
                int iX = aVar.X();
                strI0.getClass();
                switch (strI0) {
                    case "dayOfMonth":
                        i12 = iX;
                        break;
                    case "minute":
                        i14 = iX;
                        break;
                    case "second":
                        i15 = iX;
                        break;
                    case "year":
                        i10 = iX;
                        break;
                    case "month":
                        i11 = iX;
                        break;
                    case "hourOfDay":
                        i13 = iX;
                        break;
                }
            }
            aVar.x();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                cVar.S();
                return;
            }
            cVar.n();
            cVar.Q("year");
            cVar.m1(calendar.get(1));
            cVar.Q("month");
            cVar.m1(calendar.get(2));
            cVar.Q("dayOfMonth");
            cVar.m1(calendar.get(5));
            cVar.Q("hourOfDay");
            cVar.m1(calendar.get(11));
            cVar.Q("minute");
            cVar.m1(calendar.get(12));
            cVar.Q("second");
            cVar.m1(calendar.get(13));
            cVar.x();
        }
    }

    class s extends com.google.gson.s {
        s() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(p138n7.a aVar) throws IOException {
            if (aVar.n1() == p138n7.b.NULL) {
                aVar.V0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.l1(), "_");
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            return strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Locale locale) throws IOException {
            cVar.p1(locale == null ? null : locale.toString());
        }
    }

    class t implements com.google.gson.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f40902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.s f40903b;

        t(Class cls, com.google.gson.s sVar) {
            this.f40902a = cls;
            this.f40903b = sVar;
        }

        @Override // com.google.gson.t
        public com.google.gson.s b(com.google.gson.e eVar, TypeToken typeToken) {
            if (typeToken.getRawType() == this.f40902a) {
                return this.f40903b;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f40902a.getName() + ",adapter=" + this.f40903b + "]";
        }
    }

    class u extends com.google.gson.s {
        u() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(p138n7.a aVar) throws IOException {
            BitSet bitSet = new BitSet();
            aVar.c();
            p138n7.b bVarN1 = aVar.n1();
            int i10 = 0;
            while (bVarN1 != p138n7.b.END_ARRAY) {
                int i11 = y.f40914a[bVarN1.ordinal()];
                boolean zV = true;
                if (i11 == 1 || i11 == 2) {
                    int iX = aVar.X();
                    if (iX == 0) {
                        zV = false;
                    } else if (iX != 1) {
                        throw new com.google.gson.m("Invalid bitset value " + iX + ", expected 0 or 1; at path " + aVar.M());
                    }
                } else {
                    if (i11 != 3) {
                        throw new com.google.gson.m("Invalid bitset value type: " + bVarN1 + "; at path " + aVar.Y());
                    }
                    zV = aVar.V();
                }
                if (zV) {
                    bitSet.set(i10);
                }
                i10++;
                bVarN1 = aVar.n1();
            }
            aVar.w();
            return bitSet;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, BitSet bitSet) throws IOException {
            cVar.j();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.m1(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.w();
        }
    }

    class v implements com.google.gson.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f40904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f40905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.s f40906c;

        v(Class cls, Class cls2, com.google.gson.s sVar) {
            this.f40904a = cls;
            this.f40905b = cls2;
            this.f40906c = sVar;
        }

        @Override // com.google.gson.t
        public com.google.gson.s b(com.google.gson.e eVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f40904a || rawType == this.f40905b) {
                return this.f40906c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f40905b.getName() + "+" + this.f40904a.getName() + ",adapter=" + this.f40906c + "]";
        }
    }

    class w implements com.google.gson.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f40907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f40908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.gson.s f40909c;

        w(Class cls, Class cls2, com.google.gson.s sVar) {
            this.f40907a = cls;
            this.f40908b = cls2;
            this.f40909c = sVar;
        }

        @Override // com.google.gson.t
        public com.google.gson.s b(com.google.gson.e eVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f40907a || rawType == this.f40908b) {
                return this.f40909c;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f40907a.getName() + "+" + this.f40908b.getName() + ",adapter=" + this.f40909c + "]";
        }
    }

    class x implements com.google.gson.t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f40910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.gson.s f40911b;

        class a extends com.google.gson.s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Class f40912a;

            a(Class cls) {
                this.f40912a = cls;
            }

            @Override // com.google.gson.s
            public Object b(p138n7.a aVar) {
                Object objB = x.this.f40911b.b(aVar);
                if (objB == null || this.f40912a.isInstance(objB)) {
                    return objB;
                }
                throw new com.google.gson.m("Expected a " + this.f40912a.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.M());
            }

            @Override // com.google.gson.s
            public void d(p138n7.c cVar, Object obj) {
                x.this.f40911b.d(cVar, obj);
            }
        }

        x(Class cls, com.google.gson.s sVar) {
            this.f40910a = cls;
            this.f40911b = sVar;
        }

        @Override // com.google.gson.t
        public com.google.gson.s b(com.google.gson.e eVar, TypeToken typeToken) {
            Class<?> rawType = typeToken.getRawType();
            if (this.f40910a.isAssignableFrom(rawType)) {
                return new a(rawType);
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f40910a.getName() + ",adapter=" + this.f40911b + "]";
        }
    }

    static /* synthetic */ class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40914a;

        static {
            int[] iArr = new int[p138n7.b.values().length];
            f40914a = iArr;
            try {
                iArr[p138n7.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40914a[p138n7.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40914a[p138n7.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class z extends com.google.gson.s {
        z() {
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(p138n7.a aVar) throws IOException {
            p138n7.b bVarN1 = aVar.n1();
            if (bVarN1 != p138n7.b.NULL) {
                return bVarN1 == p138n7.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.l1())) : Boolean.valueOf(aVar.V());
            }
            aVar.V0();
            return null;
        }

        @Override // com.google.gson.s
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(p138n7.c cVar, Boolean bool) throws IOException {
            cVar.n1(bool);
        }
    }

    static {
        com.google.gson.s sVarA = new k().a();
        f40876a = sVarA;
        f40877b = a(Class.class, sVarA);
        com.google.gson.s sVarA2 = new u().a();
        f40878c = sVarA2;
        f40879d = a(BitSet.class, sVarA2);
        z zVar = new z();
        f40880e = zVar;
        f40881f = new A();
        f40882g = b(Boolean.TYPE, Boolean.class, zVar);
        B b10 = new B();
        f40883h = b10;
        f40884i = b(Byte.TYPE, Byte.class, b10);
        C c10 = new C();
        f40885j = c10;
        f40886k = b(Short.TYPE, Short.class, c10);
        D d10 = new D();
        f40887l = d10;
        f40888m = b(Integer.TYPE, Integer.class, d10);
        com.google.gson.s sVarA3 = new E().a();
        f40889n = sVarA3;
        f40890o = a(AtomicInteger.class, sVarA3);
        com.google.gson.s sVarA4 = new F().a();
        f40891p = sVarA4;
        f40892q = a(AtomicBoolean.class, sVarA4);
        com.google.gson.s sVarA5 = new C6737a().a();
        f40893r = sVarA5;
        f40894s = a(AtomicIntegerArray.class, sVarA5);
        f40895t = new C6738b();
        f40896u = new C6739c();
        f40897v = new C6740d();
        C6741e c6741e = new C6741e();
        f40898w = c6741e;
        f40899x = b(Character.TYPE, Character.class, c6741e);
        C6742f c6742f = new C6742f();
        f40900y = c6742f;
        f40901z = new g();
        f40852A = new h();
        f40853B = new i();
        f40854C = a(String.class, c6742f);
        j jVar = new j();
        f40855D = jVar;
        f40856E = a(StringBuilder.class, jVar);
        l lVar = new l();
        f40857F = lVar;
        f40858G = a(StringBuffer.class, lVar);
        m mVar = new m();
        f40859H = mVar;
        f40860I = a(URL.class, mVar);
        C0379n c0379n = new C0379n();
        f40861J = c0379n;
        f40862K = a(URI.class, c0379n);
        o oVar = new o();
        f40863L = oVar;
        f40864M = d(InetAddress.class, oVar);
        p pVar = new p();
        f40865N = pVar;
        f40866O = a(UUID.class, pVar);
        com.google.gson.s sVarA6 = new q().a();
        f40867P = sVarA6;
        f40868Q = a(Currency.class, sVarA6);
        r rVar = new r();
        f40869R = rVar;
        f40870S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        f40871T = sVar;
        f40872U = a(Locale.class, sVar);
        f fVar = f.f40802a;
        f40873V = fVar;
        f40874W = d(com.google.gson.g.class, fVar);
        f40875X = d.f40794d;
    }

    public static com.google.gson.t a(Class cls, com.google.gson.s sVar) {
        return new t(cls, sVar);
    }

    public static com.google.gson.t b(Class cls, Class cls2, com.google.gson.s sVar) {
        return new v(cls, cls2, sVar);
    }

    public static com.google.gson.t c(Class cls, Class cls2, com.google.gson.s sVar) {
        return new w(cls, cls2, sVar);
    }

    public static com.google.gson.t d(Class cls, com.google.gson.s sVar) {
        return new x(cls, sVar);
    }
}
